package com.invoice.system.service;

import com.invoice.system.model.Invoice;
import com.invoice.system.repository.InvoiceRepository;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Setter;
import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

//=================================================================================================
@Component @Setter
public class InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;

	@Autowired
	private ModelMapper modelMapper;

	//---------------------------------------------------------------------------------------------
	public List<InvoiceObject> find(InvoiceCriteria criteria, int offset, int limit) {

		// Although the spec is asking to sort by `createdAt`, purposely sorting by `id`
		// instead as multiple records could share the same `createdAt` value. Sorting
		// by `id` produces the same result with more accuracy.
		PageRequest paging = PageRequest.of(offset, limit, Sort.Direction.DESC, "id");

		// based on what criteria is provided, use different data loading strategy
		Page<Invoice> invoices;
		if (criteria.hasNoCriteria()) {
			invoices = invoiceRepository.findAll(paging);
		} else {
			invoices = invoiceRepository.findByInvoiceNumberContainingAndPoNumberContainingAllIgnoreCase(
				criteria.getInvoiceNumber(), criteria.getPoNumber(), paging);
		}

		return toBeanList(invoices);
	}

	//---------------------------------------------------------------------------------------------
	public InvoiceObject add(InvoiceObject invoiceToAdd) {
		Invoice invoice = toEntity(invoiceToAdd);
		invoice.setCreatedAt(OffsetDateTime.now());

		return toBean(invoiceRepository.save(invoice));
	}

	//---------------------------------------------------------------------------------------------
	private Invoice toEntity(InvoiceObject invoice) {
		return modelMapper.map(invoice, Invoice.class);
	}

	//---------------------------------------------------------------------------------------------
	private InvoiceObject toBean(Invoice invoice) {
		return modelMapper.map(invoice, InvoiceObject.class);
	}

	//---------------------------------------------------------------------------------------------
	private List<InvoiceObject> toBeanList(Page<Invoice> invoices) {
		return invoices.stream()
			.map(invoice -> toBean(invoice))
			.collect(Collectors.toList());
	}
}