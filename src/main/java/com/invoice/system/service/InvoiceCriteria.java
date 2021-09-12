package com.invoice.system.service;

import org.apache.commons.lang3.StringUtils;


public class InvoiceCriteria {

	private String invoiceNumber;
	private String poNumber;
	
		 	
		 	private InvoiceCriteria(String invoiceNumber, String bar) {
		 		this.invoiceNumber = invoiceNumber;
		 		this.poNumber = poNumber;
		 	}
		 	
		 	public static <T> InvoiceCriteriaBuilder<T> builder() {
		 		return new InvoiceCriteriaBuilder<T>();
		 	}
		 	
		 	public static class InvoiceCriteriaBuilder<T> {
		 		private String invoiceNumber;
		 		private String poNumber;
		 		
		 		private InvoiceCriteriaBuilder() {}
		 		
		 		public InvoiceCriteriaBuilder invoiceNumber(String invoiceNumber) {
		 			this.invoiceNumber = invoiceNumber;
		 			return this;
		 		}
		 		
		 		public InvoiceCriteriaBuilder poNumber(String poNumber) {
		 			this.poNumber = poNumber;
		 			return this;
		 		}
		 		
		 		@java.lang.Override public String toString() {
		 			return "InvoiceCriteriaBuilder(invoiceNumber = " + invoiceNumber + ", poNumber = " + poNumber + ")";
		 		}
		 		
		 		public InvoiceCriteria build() {
		 			return new InvoiceCriteria(invoiceNumber, poNumber);
		 		}
		 	}
	


	public boolean hasInvoiceCriteria() {
		return StringUtils.isNotBlank(getInvoiceNumber());
	}

	public boolean hasPoNumberCriteria() {
		return StringUtils.isNotBlank(getPoNumber());
	}

	public boolean hasNoCriteria() {
		return !hasInvoiceCriteria() && !hasPoNumberCriteria();
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

}