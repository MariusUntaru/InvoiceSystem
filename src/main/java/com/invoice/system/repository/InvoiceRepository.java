package com.invoice.system.repository;

import com.invoice.system.model.Invoice;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

//=================================================================================================
@Repository
public interface InvoiceRepository extends PagingAndSortingRepository<Invoice, Long> {

	//---------------------------------------------------------------------------------------------
	Page<Invoice> findByInvoiceNumberContainingAndPoNumberContainingAllIgnoreCase(
		String invoiceNumber, String poNumber, Pageable pageable);
}