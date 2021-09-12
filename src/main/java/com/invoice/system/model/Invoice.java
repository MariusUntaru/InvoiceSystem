package com.invoice.system.model;

import static com.invoice.system.common.Sizes.MAX_LENGTH_INVOICE_NUMBER;
import static com.invoice.system.common.Sizes.MAX_LENGTH_PO_NUMBER;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.Table;

//=================================================================================================
@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "invoices")
public class Invoice extends BaseEntity {

	//We set default value in case if the value is not set yet.
	@PrePersist
	public void prePersist() {
	    if(amountCents == null) 
	    	amountCents = (long) 0;
	    
	    if(dueDate == null) 
	    	dueDate = LocalDate.now();
	    
	    if(invoiceNumber == null) 
	    	invoiceNumber = "1";
	    
	    if(poNumber == null) 
	    	poNumber = "1";
	}
	
	@Column(name = "invoice_number", nullable = false, length = MAX_LENGTH_INVOICE_NUMBER)
	private String invoiceNumber;

	@Column(name = "po_number", nullable = false, length = MAX_LENGTH_PO_NUMBER)
	private String poNumber;
	
	@Column(name = "amount_cents", nullable = false)
	private Long amountCents;
	
	@Column(name = "due_date", nullable = false)
	private LocalDate dueDate;
	
	private OffsetDateTime createdAt;
	
	public void setCreatedAt(OffsetDateTime createdAt) {
		this.createdAt = createdAt;
	}

	
}