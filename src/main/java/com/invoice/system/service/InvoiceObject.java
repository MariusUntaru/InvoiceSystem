package com.invoice.system.service;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//=================================================================================================
@Getter @Setter @NoArgsConstructor
public class InvoiceObject {

	private Long id;
	private String invoiceNumber;
	private String poNumber;
	private LocalDate dueDate;
	private Long amountCents;
	private OffsetDateTime createdAt;
}