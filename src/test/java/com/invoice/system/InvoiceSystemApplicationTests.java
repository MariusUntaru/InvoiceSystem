package com.invoice.system;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@SpringBootTest
class InvoiceSystemApplicationTests {

	 public static boolean debug = false;

	    @Test
	    public void test001() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test001");
	        java.lang.String str0 = com.invoice.system.common.Defaults.CRITERION;
	        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
	    }

	    @Test
	    public void test002() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test002");
	        java.lang.Object obj0 = new java.lang.Object();
	        java.lang.Class<?> wildcardClass1 = obj0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClass1);
	    }

	    @Test
	    public void test003() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test003");
	        int int0 = com.invoice.system.common.Sizes.MAX_LENGTH_PO_NUMBER;
	        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
	    }

	    @Test
	    public void test004() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test004");
	        java.lang.String str0 = com.invoice.system.common.Defaults.OFFSET;
	        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "0" + "'", str0, "0");
	    }

	    @Test
	    public void test005() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test005");
	        com.invoice.system.service.InvoiceObject invoiceObject0 = new com.invoice.system.service.InvoiceObject();
	    }

	    @Test
	    public void test006() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test006");
	        int int0 = com.invoice.system.common.Sizes.MIN_AMOUNT_CENTS;
	        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
	    }

	    @Test
	    public void test007() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test007");
	        int int0 = com.invoice.system.common.Sizes.MIN_LENGTH_PO_NUMBER;
	        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
	    }

	    @Test
	    public void test008() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test008");
	        java.lang.String str0 = com.invoice.system.common.Defaults.LIMIT;
	        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "10" + "'", str0, "10");
	    }

	    @Test
	    public void test009() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test009");
	        int int0 = com.invoice.system.common.Sizes.MAX_LENGTH_INVOICE_NUMBER;
	        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
	    }

	    @Test
	    public void test010() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test010");
	        com.invoice.system.api.v1.InvoiceResource invoiceResource0 = new com.invoice.system.api.v1.InvoiceResource();
	    }

	    @Test
	    public void test011() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test011");
	        int int0 = com.invoice.system.common.Sizes.MAX_AMOUNT_CENTS;
	        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 99999999 + "'", int0 == 99999999);
	    }

	    @Test
	    public void test012() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test012");
	        int int0 = com.invoice.system.common.Sizes.MIN_LENGTH_INVOICE_NUMBER;
	        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
	    }

	    @Test
	    public void test013() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test013");
	        com.invoice.system.common.Defaults defaults0 = new com.invoice.system.common.Defaults();
	        java.lang.Class<?> wildcardClass1 = defaults0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClass1);
	    }

	    @Test
	    public void test014() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test014");
	        com.invoice.system.InvoiceSystemApplication invoiceSystemApplication0 = new com.invoice.system.InvoiceSystemApplication();
	        java.lang.Class<?> wildcardClass1 = invoiceSystemApplication0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClass1);
	    }

	    @Test
	    public void test015() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test015");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        java.lang.Class<?> wildcardClass2 = typeDescriptorInvoiceCriteriaBuilder0.getClass();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(wildcardClass2);
	    }

	    @Test
	    public void test016() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test016");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.reflect.GenericDeclaration> genericDeclarationInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        org.junit.Assert.assertNotNull(genericDeclarationInvoiceCriteriaBuilder0);
	    }

	    @Test
	    public void test017() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test017");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("hi!");
	        invoiceCriteria1.setPoNumber("hi!");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	    }

	    @Test
	    public void test018() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test018");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.api.v1.InvoiceResource> invoiceResourceInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        org.junit.Assert.assertNotNull(invoiceResourceInvoiceCriteriaBuilder0);
	    }

	    @Test
	    public void test019() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test019");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("");
	        java.lang.String str4 = invoiceCriteria1.getPoNumber();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	    }

	    @Test
	    public void test020() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test020");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("hi!");
	        invoiceCriteria1.setInvoiceNumber("10");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	    }

	    @Test
	    public void test021() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test021");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.model.Invoice> invoiceInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.Class<?> wildcardClass1 = invoiceInvoiceCriteriaBuilder0.getClass();
	        org.junit.Assert.assertNotNull(invoiceInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(wildcardClass1);
	    }

	    @Test
	    public void test022() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test022");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        java.lang.Class<?> wildcardClass3 = invoiceObjectInvoiceCriteriaBuilder0.getClass();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(wildcardClass3);
	    }

	    @Test
	    public void test023() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test023");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        java.lang.Class<?> wildcardClass3 = invoiceObjectInvoiceCriteriaBuilder0.getClass();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(wildcardClass3);
	    }

	    @Test
	    public void test024() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test024");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str3 = invoiceCriteria2.getInvoiceNumber();
	        invoiceCriteria2.setInvoiceNumber("");
	        java.lang.String str6 = invoiceCriteria2.getPoNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNull(str3);
	        org.junit.Assert.assertNull(str6);
	    }

	    @Test
	    public void test025() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test025");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.constant.ConstantDesc> constantDescInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        org.junit.Assert.assertNotNull(constantDescInvoiceCriteriaBuilder0);
	    }

	    @Test
	    public void test026() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test026");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        java.lang.String str3 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)" + "'", str3, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	    }

	    @Test
	    public void test027() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test027");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        invoiceCriteria3.setInvoiceNumber("");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	    }

	    @Test
	    public void test028() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test028");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime4 = null;
	        invoice0.setCreatedAt(offsetDateTime4);
	        java.lang.Class<?> wildcardClass6 = invoice0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClass6);
	    }

	    @Test
	    public void test029() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test029");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = typeDescriptorInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	    }

	    @Test
	    public void test030() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test030");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	    }

	    @Test
	    public void test031() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test031");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("hi!");
	        invoiceCriteria1.setInvoiceNumber("hi!");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        java.lang.Class<?> wildcardClass8 = invoiceCriteria1.getClass();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(wildcardClass8);
	    }

	    @Test
	    public void test032() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test032");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.Class<?> wildcardClass2 = invoiceCriteria1.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(wildcardClass2);
	    }

	    @Test
	    public void test033() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test033");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.invoiceNumber("10");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	    }

	    @Test
	    public void test034() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test034");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	    }

	    @Test
	    public void test035() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test035");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("hi!");
	        invoiceCriteria1.setInvoiceNumber("hi!");
	        java.lang.String str6 = invoiceCriteria1.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
	    }

	    @Test
	    public void test036() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test036");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        java.lang.Class<?> wildcardClass8 = invoiceCriteriaBuilder4.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(wildcardClass8);
	    }

	    @Test
	    public void test037() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test037");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>>> wildcardClassInvoiceCriteriaBuilderInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.Class<?> wildcardClass1 = wildcardClassInvoiceCriteriaBuilderInvoiceCriteriaBuilder0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilderInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(wildcardClass1);
	    }

	    @Test
	    public void test038() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test038");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	    }

	    @Test
	    public void test039() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test039");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime2 = null;
	        invoice0.setCreatedAt(offsetDateTime2);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime5 = null;
	        invoice0.setCreatedAt(offsetDateTime5);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.lang.Class<?> wildcardClass9 = invoice0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClass9);
	    }

	    @Test
	    public void test040() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test040");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = typeDescriptorInvoiceCriteriaBuilder0.toString();
	        java.lang.Class<?> wildcardClass2 = typeDescriptorInvoiceCriteriaBuilder0.getClass();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClass2);
	    }

	    @Test
	    public void test041() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test041");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	    }

	    @Test
	    public void test042() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test042");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        java.lang.String str4 = invoiceCriteria3.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNull(str4);
	    }

	    @Test
	    public void test043() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test043");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = objInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria4 = objInvoiceCriteriaBuilder0.build();
	        java.lang.String str5 = invoiceCriteria4.getInvoiceNumber();
	        invoiceCriteria4.setInvoiceNumber("10");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNotNull(invoiceCriteria4);
	        org.junit.Assert.assertNull(str5);
	    }

	    @Test
	    public void test044() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test044");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("hi!");
	        java.lang.String str4 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	    }

	    @Test
	    public void test045() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test045");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria5.setPoNumber("hi!");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	    }

	    @Test
	    public void test046() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test046");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str5 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setInvoiceNumber("10");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        java.lang.String str10 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str11 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.Class<?> wildcardClass12 = invoiceCriteria1.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
	        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
	        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
	        org.junit.Assert.assertNotNull(wildcardClass12);
	    }

	    @Test
	    public void test047() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test047");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        java.lang.String str8 = invoiceCriteriaBuilder7.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	    }

	    @Test
	    public void test048() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test048");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.InvoiceSystemApplication> invoiceSystemApplicationInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        org.junit.Assert.assertNotNull(invoiceSystemApplicationInvoiceCriteriaBuilder0);
	    }

	    @Test
	    public void test049() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test049");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        invoiceCriteria3.setInvoiceNumber("0");
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        java.lang.String str8 = invoiceCriteria3.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
	    }

	    @Test
	    public void test050() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test050");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setInvoiceNumber("10");
	        invoiceCriteria1.setInvoiceNumber("0");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        invoiceCriteria1.setPoNumber("");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	    }

	    @Test
	    public void test051() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test051");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.CharSequence> charSequenceInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        org.junit.Assert.assertNotNull(charSequenceInvoiceCriteriaBuilder0);
	    }

	    @Test
	    public void test052() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test052");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime2 = null;
	        invoice0.setCreatedAt(offsetDateTime2);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime5 = null;
	        invoice0.setCreatedAt(offsetDateTime5);
	        java.time.OffsetDateTime offsetDateTime7 = null;
	        invoice0.setCreatedAt(offsetDateTime7);
	        java.time.OffsetDateTime offsetDateTime9 = null;
	        invoice0.setCreatedAt(offsetDateTime9);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime12 = null;
	        invoice0.setCreatedAt(offsetDateTime12);
	        java.time.OffsetDateTime offsetDateTime14 = null;
	        invoice0.setCreatedAt(offsetDateTime14);
	        invoice0.prePersist();
	    }

	    @Test
	    public void test053() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test053");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setPoNumber("0");
	        java.lang.String str5 = invoiceCriteria2.getPoNumber();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
	    }

	    @Test
	    public void test054() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test054");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setPoNumber("0");
	        java.lang.String str5 = invoiceCriteria2.getInvoiceNumber();
	        invoiceCriteria2.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        java.lang.Class<?> wildcardClass8 = invoiceCriteria2.getClass();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNull(str5);
	        org.junit.Assert.assertNotNull(wildcardClass8);
	    }

	    @Test
	    public void test055() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test055");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder3.poNumber("hi!");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	    }

	    @Test
	    public void test056() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test056");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        java.lang.Class<?> wildcardClass3 = wildcardClassInvoiceCriteriaBuilder0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(wildcardClass3);
	    }

	    @Test
	    public void test057() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test057");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder4.build();
	        java.lang.Class<?> wildcardClass6 = invoiceCriteria5.getClass();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(wildcardClass6);
	    }

	    @Test
	    public void test058() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test058");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.Class<?> wildcardClass3 = invoiceCriteria2.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(wildcardClass3);
	    }

	    @Test
	    public void test059() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test059");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder7.build();
	        java.lang.String str9 = invoiceCriteriaBuilder7.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder11 = invoiceCriteriaBuilder7.poNumber("10");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str9, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder11);
	    }

	    @Test
	    public void test060() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test060");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = objInvoiceCriteriaBuilder0.build();
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	    }

	    @Test
	    public void test061() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test061");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        java.lang.String str8 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria9 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria9.setInvoiceNumber("");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        org.junit.Assert.assertNotNull(invoiceCriteria9);
	    }

	    @Test
	    public void test062() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test062");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        java.lang.String str4 = invoiceCriteriaBuilder3.toString();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)" + "'", str4, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	    }

	    @Test
	    public void test063() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test063");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Comparable<java.lang.String>> strComparableInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        org.junit.Assert.assertNotNull(strComparableInvoiceCriteriaBuilder0);
	    }

	    @Test
	    public void test064() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test064");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	    }

	    @Test
	    public void test065() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test065");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setPoNumber("0");
	        java.lang.String str5 = invoiceCriteria2.getInvoiceNumber();
	        invoiceCriteria2.setPoNumber("0");
	        java.lang.String str8 = invoiceCriteria2.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNull(str5);
	        org.junit.Assert.assertNull(str8);
	    }

	    @Test
	    public void test066() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test066");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = wildcardClassInvoiceCriteriaBuilder0.build();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	    }

	    @Test
	    public void test067() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test067");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder3.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	    }

	    @Test
	    public void test068() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test068");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        java.lang.String str2 = invoiceObjectInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str2, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	    }

	    @Test
	    public void test069() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test069");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria9 = invoiceCriteriaBuilder7.build();
	        java.lang.String str10 = invoiceCriteriaBuilder7.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteria9);
	        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str10, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	    }

	    @Test
	    public void test070() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test070");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria5.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	    }

	    @Test
	    public void test071() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test071");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        invoiceCriteria3.setPoNumber("10");
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	    }

	    @Test
	    public void test072() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test072");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	    }

	    @Test
	    public void test073() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test073");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria6 = invoiceCriteriaBuilder5.build();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteria6);
	    }

	    @Test
	    public void test074() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test074");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime4 = null;
	        invoice0.setCreatedAt(offsetDateTime4);
	        java.time.OffsetDateTime offsetDateTime6 = null;
	        invoice0.setCreatedAt(offsetDateTime6);
	        java.time.OffsetDateTime offsetDateTime8 = null;
	        invoice0.setCreatedAt(offsetDateTime8);
	        java.time.OffsetDateTime offsetDateTime10 = null;
	        invoice0.setCreatedAt(offsetDateTime10);
	        java.time.OffsetDateTime offsetDateTime12 = null;
	        invoice0.setCreatedAt(offsetDateTime12);
	        java.time.OffsetDateTime offsetDateTime14 = null;
	        invoice0.setCreatedAt(offsetDateTime14);
	        invoice0.prePersist();
	    }

	    @Test
	    public void test075() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test075");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setPoNumber("0");
	        java.lang.String str5 = invoiceCriteria2.getInvoiceNumber();
	        java.lang.String str6 = invoiceCriteria2.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNull(str5);
	        org.junit.Assert.assertNull(str6);
	    }

	    @Test
	    public void test076() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test076");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria11 = invoiceCriteriaBuilder10.build();
	        java.lang.String str12 = invoiceCriteria11.getInvoiceNumber();
	        java.lang.Class<?> wildcardClass13 = invoiceCriteria11.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteria11);
	        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))" + "'", str12, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        org.junit.Assert.assertNotNull(wildcardClass13);
	    }

	    @Test
	    public void test077() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test077");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria9 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria10 = invoiceCriteriaBuilder7.build();
	        java.lang.String str11 = invoiceCriteria10.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteria9);
	        org.junit.Assert.assertNotNull(invoiceCriteria10);
	        org.junit.Assert.assertNull(str11);
	    }

	    @Test
	    public void test078() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test078");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        java.lang.String str9 = invoiceCriteriaBuilder4.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str9, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	    }

	    @Test
	    public void test079() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test079");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	    }

	    @Test
	    public void test080() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test080");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        invoiceCriteria3.setPoNumber("10");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	    }

	    @Test
	    public void test081() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test081");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        java.lang.Class<?> wildcardClass5 = invoiceCriteriaBuilder4.getClass();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(wildcardClass5);
	    }

	    @Test
	    public void test082() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test082");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria9 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria10 = invoiceCriteriaBuilder7.build();
	        java.lang.Class<?> wildcardClass11 = invoiceCriteria10.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteria9);
	        org.junit.Assert.assertNotNull(invoiceCriteria10);
	        org.junit.Assert.assertNotNull(wildcardClass11);
	    }

	    @Test
	    public void test083() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test083");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	    }

	    @Test
	    public void test084() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test084");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        java.lang.String str7 = invoiceCriteria1.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertNull(str7);
	    }

	    @Test
	    public void test085() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test085");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        invoiceCriteria3.setInvoiceNumber("0");
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	    }

	    @Test
	    public void test086() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test086");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        java.lang.String str4 = invoiceCriteriaBuilder2.toString();
	        java.lang.String str5 = invoiceCriteriaBuilder2.toString();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str4, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	    }

	    @Test
	    public void test087() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test087");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder7.poNumber("10");
	        java.lang.Class<?> wildcardClass11 = invoiceCriteriaBuilder10.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(wildcardClass11);
	    }

	    @Test
	    public void test088() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test088");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria9 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria10 = invoiceCriteriaBuilder7.build();
	        java.lang.String str11 = invoiceCriteria10.getPoNumber();
	        java.lang.Class<?> wildcardClass12 = invoiceCriteria10.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteria9);
	        org.junit.Assert.assertNotNull(invoiceCriteria10);
	        org.junit.Assert.assertNull(str11);
	        org.junit.Assert.assertNotNull(wildcardClass12);
	    }

	    @Test
	    public void test089() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test089");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria9 = invoiceCriteriaBuilder7.build();
	        java.lang.String str10 = invoiceCriteria9.getPoNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteria9);
	        org.junit.Assert.assertNull(str10);
	    }

	    @Test
	    public void test090() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test090");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setPoNumber("0");
	        java.lang.String str5 = invoiceCriteria2.getInvoiceNumber();
	        java.lang.Class<?> wildcardClass6 = invoiceCriteria2.getClass();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNull(str5);
	        org.junit.Assert.assertNotNull(wildcardClass6);
	    }

	    @Test
	    public void test091() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test091");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	    }

	    @Test
	    public void test092() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test092");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("hi!");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	    }

	    @Test
	    public void test093() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test093");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder7.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria10 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria11 = invoiceCriteriaBuilder7.build();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertNotNull(invoiceCriteria10);
	        org.junit.Assert.assertNotNull(invoiceCriteria11);
	    }

	    @Test
	    public void test094() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test094");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        java.lang.String str6 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        java.lang.String str11 = invoiceCriteriaBuilder10.toString();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))" + "'", str11, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))");
	    }

	    @Test
	    public void test095() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test095");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = objInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria4 = objInvoiceCriteriaBuilder0.build();
	        java.lang.String str5 = invoiceCriteria4.getInvoiceNumber();
	        invoiceCriteria4.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNotNull(invoiceCriteria4);
	        org.junit.Assert.assertNull(str5);
	    }

	    @Test
	    public void test096() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test096");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str2 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        java.lang.Class<?> wildcardClass3 = wildcardClassInvoiceCriteriaBuilder0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str2, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClass3);
	    }

	    @Test
	    public void test097() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test097");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setInvoiceNumber("10");
	        java.lang.Class<?> wildcardClass7 = invoiceCriteria1.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertNotNull(wildcardClass7);
	    }

	    @Test
	    public void test098() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test098");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("10");
	        java.lang.Class<?> wildcardClass8 = invoiceCriteriaBuilder7.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(wildcardClass8);
	    }

	    @Test
	    public void test099() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test099");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime3 = null;
	        invoice0.setCreatedAt(offsetDateTime3);
	        java.lang.Class<?> wildcardClass5 = invoice0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClass5);
	    }

	    @Test
	    public void test100() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test100");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.constant.Constable> constableInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        org.junit.Assert.assertNotNull(constableInvoiceCriteriaBuilder0);
	    }

	    @Test
	    public void test101() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test101");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria11 = invoiceCriteriaBuilder10.build();
	        java.lang.String str12 = invoiceCriteria11.getInvoiceNumber();
	        java.lang.String str13 = invoiceCriteria11.getPoNumber();
	        invoiceCriteria11.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        java.lang.Class<?> wildcardClass16 = invoiceCriteria11.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteria11);
	        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))" + "'", str12, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        org.junit.Assert.assertNull(str13);
	        org.junit.Assert.assertNotNull(wildcardClass16);
	    }

	    @Test
	    public void test102() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test102");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.poNumber("");
	        java.lang.Class<?> wildcardClass5 = invoiceCriteriaBuilder4.getClass();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(wildcardClass5);
	    }

	    @Test
	    public void test103() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test103");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        invoiceCriteria8.setPoNumber("hi!");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	    }

	    @Test
	    public void test104() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test104");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	    }

	    @Test
	    public void test105() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test105");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder2.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder5.poNumber("");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	    }

	    @Test
	    public void test106() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test106");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("hi!");
	        invoiceCriteria1.setInvoiceNumber("hi!");
	        java.lang.String str6 = invoiceCriteria1.getPoNumber();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str6);
	    }

	    @Test
	    public void test107() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test107");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime2 = null;
	        invoice0.setCreatedAt(offsetDateTime2);
	        java.time.OffsetDateTime offsetDateTime4 = null;
	        invoice0.setCreatedAt(offsetDateTime4);
	        invoice0.prePersist();
	        java.lang.Class<?> wildcardClass7 = invoice0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClass7);
	    }

	    @Test
	    public void test108() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test108");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	    }

	    @Test
	    public void test109() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test109");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("hi!");
	        java.lang.String str4 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	    }

	    @Test
	    public void test110() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test110");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        java.lang.String str6 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder12 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria13 = invoiceCriteriaBuilder12.build();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder12);
	        org.junit.Assert.assertNotNull(invoiceCriteria13);
	    }

	    @Test
	    public void test111() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test111");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        java.lang.String str6 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        java.lang.String str11 = invoiceCriteriaBuilder4.toString();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))" + "'", str11, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))");
	    }

	    @Test
	    public void test112() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test112");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        java.lang.String str6 = invoiceCriteriaBuilder4.toString();
	        java.lang.Class<?> wildcardClass7 = invoiceCriteriaBuilder4.getClass();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertNotNull(wildcardClass7);
	    }

	    @Test
	    public void test113() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test113");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria6 = invoiceCriteriaBuilder3.build();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteria6);
	    }

	    @Test
	    public void test114() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test114");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        invoiceCriteria3.setPoNumber("");
	        java.lang.String str6 = invoiceCriteria3.getPoNumber();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
	    }

	    @Test
	    public void test115() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test115");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	    }

	    @Test
	    public void test116() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test116");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	    }

	    @Test
	    public void test117() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test117");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("10");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria4 = invoiceCriteriaBuilder3.build();
	        java.lang.Class<?> wildcardClass5 = invoiceCriteria4.getClass();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteria4);
	        org.junit.Assert.assertNotNull(wildcardClass5);
	    }

	    @Test
	    public void test118() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test118");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder7.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder11 = invoiceCriteriaBuilder7.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        java.lang.Class<?> wildcardClass12 = invoiceCriteriaBuilder11.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder11);
	        org.junit.Assert.assertNotNull(wildcardClass12);
	    }

	    @Test
	    public void test119() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test119");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        java.lang.String str6 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder12 = invoiceCriteriaBuilder10.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        java.lang.String str13 = invoiceCriteriaBuilder10.toString();
	        java.lang.Class<?> wildcardClass14 = invoiceCriteriaBuilder10.getClass();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder12);
	        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))" + "'", str13, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))");
	        org.junit.Assert.assertNotNull(wildcardClass14);
	    }

	    @Test
	    public void test120() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test120");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder2.invoiceNumber("0");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder2.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	    }

	    @Test
	    public void test121() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test121");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str5 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setInvoiceNumber("10");
	        java.lang.String str8 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = )");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
	    }

	    @Test
	    public void test122() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test122");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder7.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder11 = invoiceCriteriaBuilder7.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        java.lang.String str12 = invoiceCriteriaBuilder11.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder11);
	        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = )" + "'", str12, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = )");
	    }

	    @Test
	    public void test123() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test123");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	    }

	    @Test
	    public void test124() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test124");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        java.lang.String str4 = invoiceCriteriaBuilder2.toString();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str4, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	    }

	    @Test
	    public void test125() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test125");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        invoiceCriteria3.setInvoiceNumber("0");
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)");
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        invoiceCriteria3.setPoNumber("");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	    }

	    @Test
	    public void test126() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test126");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	    }

	    @Test
	    public void test127() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test127");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder3.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        java.lang.Class<?> wildcardClass6 = invoiceCriteriaBuilder5.getClass();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(wildcardClass6);
	    }

	    @Test
	    public void test128() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test128");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder12 = invoiceCriteriaBuilder10.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder14 = invoiceCriteriaBuilder12.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder12);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder14);
	    }

	    @Test
	    public void test129() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test129");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = objInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = invoiceCriteriaBuilder4.invoiceNumber("");
	        java.lang.String str7 = invoiceCriteriaBuilder4.toString();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = , poNumber = hi!)" + "'", str7, "InvoiceCriteriaBuilder(invoiceNumber = , poNumber = hi!)");
	    }

	    @Test
	    public void test130() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test130");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("hi!");
	        java.lang.String str4 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        java.lang.Class<?> wildcardClass7 = invoiceCriteria1.getClass();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertNotNull(wildcardClass7);
	    }

	    @Test
	    public void test131() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test131");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = objInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = hi!)");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	    }

	    @Test
	    public void test132() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test132");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        java.lang.String str8 = invoiceCriteriaBuilder4.toString();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)))" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)))");
	    }

	    @Test
	    public void test133() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test133");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = objInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria4 = objInvoiceCriteriaBuilder0.build();
	        java.lang.Class<?> wildcardClass5 = objInvoiceCriteriaBuilder0.getClass();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNotNull(invoiceCriteria4);
	        org.junit.Assert.assertNotNull(wildcardClass5);
	    }

	    @Test
	    public void test134() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test134");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        java.lang.String str8 = invoiceCriteriaBuilder7.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	    }

	    @Test
	    public void test135() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test135");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        java.lang.String str8 = invoiceCriteriaBuilder7.toString();
	        java.lang.String str9 = invoiceCriteriaBuilder7.toString();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)");
	        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)" + "'", str9, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)");
	    }

	    @Test
	    public void test136() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test136");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str5 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str4, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	    }

	    @Test
	    public void test137() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test137");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str2 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        java.lang.String str9 = invoiceCriteriaBuilder8.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str2, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null), poNumber = hi!)" + "'", str9, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null), poNumber = hi!)");
	    }

	    @Test
	    public void test138() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test138");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime4 = null;
	        invoice0.setCreatedAt(offsetDateTime4);
	        java.time.OffsetDateTime offsetDateTime6 = null;
	        invoice0.setCreatedAt(offsetDateTime6);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime11 = null;
	        invoice0.setCreatedAt(offsetDateTime11);
	    }

	    @Test
	    public void test139() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test139");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder4.build();
	        invoiceCriteria5.setInvoiceNumber("hi!");
	        java.lang.String str8 = invoiceCriteria5.getPoNumber();
	        java.lang.String str9 = invoiceCriteria5.getPoNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNull(str8);
	        org.junit.Assert.assertNull(str9);
	    }

	    @Test
	    public void test140() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test140");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        invoiceCriteria2.setPoNumber("0");
	        invoiceCriteria2.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	    }

	    @Test
	    public void test141() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test141");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.invoiceNumber("");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	    }

	    @Test
	    public void test142() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test142");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria9 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria10 = invoiceCriteriaBuilder7.build();
	        invoiceCriteria10.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteria9);
	        org.junit.Assert.assertNotNull(invoiceCriteria10);
	    }

	    @Test
	    public void test143() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test143");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder2.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	    }

	    @Test
	    public void test144() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test144");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime2 = null;
	        invoice0.setCreatedAt(offsetDateTime2);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime5 = null;
	        invoice0.setCreatedAt(offsetDateTime5);
	        java.time.OffsetDateTime offsetDateTime7 = null;
	        invoice0.setCreatedAt(offsetDateTime7);
	        java.time.OffsetDateTime offsetDateTime9 = null;
	        invoice0.setCreatedAt(offsetDateTime9);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime12 = null;
	        invoice0.setCreatedAt(offsetDateTime12);
	        java.time.OffsetDateTime offsetDateTime14 = null;
	        invoice0.setCreatedAt(offsetDateTime14);
	        java.time.OffsetDateTime offsetDateTime16 = null;
	        invoice0.setCreatedAt(offsetDateTime16);
	    }

	    @Test
	    public void test145() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test145");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("hi!");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.invoiceNumber("");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	    }

	    @Test
	    public void test146() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test146");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.model.Invoice> invoiceInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = invoiceInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(invoiceInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	    }

	    @Test
	    public void test147() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test147");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str2 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder8.poNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = )");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str2, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	    }

	    @Test
	    public void test148() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test148");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = objInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)");
	        java.lang.Class<?> wildcardClass6 = invoiceCriteria1.getClass();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(wildcardClass6);
	    }

	    @Test
	    public void test149() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test149");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.common.Sizes> sizesInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = sizesInvoiceCriteriaBuilder0.poNumber("hi!");
	        org.junit.Assert.assertNotNull(sizesInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	    }

	    @Test
	    public void test150() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test150");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder7.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria10 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria11 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder13 = invoiceCriteriaBuilder7.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertNotNull(invoiceCriteria10);
	        org.junit.Assert.assertNotNull(invoiceCriteria11);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder13);
	    }

	    @Test
	    public void test151() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test151");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str2 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        java.lang.String str7 = invoiceCriteriaBuilder6.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str2, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null), poNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null))" + "'", str7, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null), poNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null))");
	    }

	    @Test
	    public void test152() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test152");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime2 = null;
	        invoice0.setCreatedAt(offsetDateTime2);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime5 = null;
	        invoice0.setCreatedAt(offsetDateTime5);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.lang.Class<?> wildcardClass10 = invoice0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClass10);
	    }

	    @Test
	    public void test153() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test153");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        java.lang.String str3 = invoiceCriteriaBuilder2.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria4 = invoiceCriteriaBuilder2.build();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)" + "'", str3, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteria4);
	    }

	    @Test
	    public void test154() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test154");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        java.lang.String str10 = invoiceCriteriaBuilder9.toString();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)" + "'", str10, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)");
	    }

	    @Test
	    public void test155() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test155");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime4 = null;
	        invoice0.setCreatedAt(offsetDateTime4);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	    }

	    @Test
	    public void test156() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test156");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder4.build();
	        invoiceCriteria5.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!), poNumber = 0)");
	        java.lang.Class<?> wildcardClass8 = invoiceCriteria5.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(wildcardClass8);
	    }

	    @Test
	    public void test157() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test157");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str2 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria9 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria9.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str2, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	        org.junit.Assert.assertNotNull(invoiceCriteria9);
	    }

	    @Test
	    public void test158() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test158");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.common.Sizes> sizesInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = sizesInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = sizesInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))");
	        org.junit.Assert.assertNotNull(sizesInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	    }

	    @Test
	    public void test159() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test159");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria6 = invoiceCriteriaBuilder4.build();
	        invoiceCriteria6.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(invoiceCriteria6);
	    }

	    @Test
	    public void test160() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test160");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime2 = null;
	        invoice0.setCreatedAt(offsetDateTime2);
	        java.time.OffsetDateTime offsetDateTime4 = null;
	        invoice0.setCreatedAt(offsetDateTime4);
	        java.time.OffsetDateTime offsetDateTime6 = null;
	        invoice0.setCreatedAt(offsetDateTime6);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime9 = null;
	        invoice0.setCreatedAt(offsetDateTime9);
	        java.lang.Class<?> wildcardClass11 = invoice0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClass11);
	    }

	    @Test
	    public void test161() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test161");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder12 = invoiceCriteriaBuilder10.invoiceNumber("");
	        java.lang.String str13 = invoiceCriteriaBuilder12.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder15 = invoiceCriteriaBuilder12.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder12);
	        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = , poNumber = )" + "'", str13, "InvoiceCriteriaBuilder(invoiceNumber = , poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder15);
	    }

	    @Test
	    public void test162() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test162");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = objInvoiceCriteriaBuilder0.build();
	        java.lang.String str4 = invoiceCriteria3.getInvoiceNumber();
	        java.lang.String str5 = invoiceCriteria3.getPoNumber();
	        java.lang.String str6 = invoiceCriteria3.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertNull(str5);
	        org.junit.Assert.assertNull(str6);
	    }

	    @Test
	    public void test163() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test163");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str2 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        java.lang.String str9 = invoiceCriteriaBuilder8.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str2, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null), poNumber = hi!)" + "'", str9, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null), poNumber = hi!)");
	    }

	    @Test
	    public void test164() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test164");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        java.lang.String str5 = typeDescriptorInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	    }

	    @Test
	    public void test165() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test165");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria6 = invoiceCriteriaBuilder4.build();
	        java.lang.String str7 = invoiceCriteriaBuilder4.toString();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(invoiceCriteria6);
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = )" + "'", str7, "InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = )");
	    }

	    @Test
	    public void test166() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test166");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        java.lang.String str4 = invoiceCriteriaBuilder2.toString();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str4, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	    }

	    @Test
	    public void test167() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test167");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        java.lang.String str8 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        java.lang.String str9 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))" + "'", str9, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	    }

	    @Test
	    public void test168() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test168");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria4 = invoiceCriteriaBuilder2.build();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNotNull(invoiceCriteria4);
	    }

	    @Test
	    public void test169() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test169");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setPoNumber("0");
	        java.lang.String str5 = invoiceCriteria2.getInvoiceNumber();
	        invoiceCriteria2.setPoNumber("0");
	        invoiceCriteria2.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null), poNumber = hi!)");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNull(str5);
	    }

	    @Test
	    public void test170() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test170");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = objInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = invoiceCriteriaBuilder4.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria7 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        java.lang.String str10 = invoiceCriteriaBuilder4.toString();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertNotNull(invoiceCriteria7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = , poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )))" + "'", str10, "InvoiceCriteriaBuilder(invoiceNumber = , poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )))");
	    }

	    @Test
	    public void test171() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test171");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder7.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = )");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	    }

	    @Test
	    public void test172() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test172");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        invoiceCriteria8.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        invoiceCriteria8.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        invoiceCriteria8.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        java.lang.String str15 = invoiceCriteria8.getPoNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str15, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	    }

	    @Test
	    public void test173() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test173");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria4 = invoiceCriteriaBuilder3.build();
	        invoiceCriteria4.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        invoiceCriteria4.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteria4);
	    }

	    @Test
	    public void test174() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test174");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	    }

	    @Test
	    public void test175() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test175");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria5.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)))");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	    }

	    @Test
	    public void test176() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test176");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        invoiceCriteria8.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        invoiceCriteria8.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null), poNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null))");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	    }

	    @Test
	    public void test177() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test177");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str2 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str3 = invoiceCriteria1.getPoNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str2);
	        org.junit.Assert.assertNull(str3);
	    }

	    @Test
	    public void test178() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test178");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        java.lang.Class<?> wildcardClass4 = invoiceCriteriaBuilder2.getClass();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNotNull(wildcardClass4);
	    }

	    @Test
	    public void test179() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test179");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        java.lang.String str3 = invoiceCriteriaBuilder2.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)" + "'", str3, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	    }

	    @Test
	    public void test180() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test180");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        java.lang.String str3 = invoiceCriteriaBuilder2.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)" + "'", str3, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	    }

	    @Test
	    public void test181() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test181");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        java.time.OffsetDateTime offsetDateTime1 = null;
	        invoice0.setCreatedAt(offsetDateTime1);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	    }

	    @Test
	    public void test182() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test182");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria5.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	    }

	    @Test
	    public void test183() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test183");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.io.Serializable> serializableInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = serializableInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(serializableInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	    }

	    @Test
	    public void test184() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test184");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = typeDescriptorInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	    }

	    @Test
	    public void test185() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test185");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        java.lang.String str7 = invoiceCriteria1.getPoNumber();
	        java.lang.String str8 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setPoNumber("0");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null), poNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null))");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))" + "'", str7, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	    }

	    @Test
	    public void test186() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test186");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	    }

	    @Test
	    public void test187() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test187");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        java.lang.String str6 = invoiceCriteria3.getPoNumber();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	    }

	    @Test
	    public void test188() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test188");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str4 = invoiceCriteria3.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNull(str4);
	    }

	    @Test
	    public void test189() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test189");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime3 = null;
	        invoice0.setCreatedAt(offsetDateTime3);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.lang.Class<?> wildcardClass9 = invoice0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClass9);
	    }

	    @Test
	    public void test190() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test190");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.common.Defaults> defaultsInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = defaultsInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = defaultsInvoiceCriteriaBuilder0.build();
	        java.lang.String str3 = defaultsInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(defaultsInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str3, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	    }

	    @Test
	    public void test191() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test191");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str4 = invoiceCriteria3.getInvoiceNumber();
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNull(str4);
	    }

	    @Test
	    public void test192() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test192");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder7.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder11 = invoiceCriteriaBuilder7.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder11);
	    }

	    @Test
	    public void test193() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test193");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria9 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria10 = invoiceCriteriaBuilder7.build();
	        java.lang.String str11 = invoiceCriteria10.getPoNumber();
	        invoiceCriteria10.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteria9);
	        org.junit.Assert.assertNotNull(invoiceCriteria10);
	        org.junit.Assert.assertNull(str11);
	    }

	    @Test
	    public void test194() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test194");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        invoiceCriteria2.setPoNumber("0");
	        java.lang.String str7 = invoiceCriteria2.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNull(str7);
	    }

	    @Test
	    public void test195() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test195");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        java.lang.String str8 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	    }

	    @Test
	    public void test196() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test196");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder4.invoiceNumber("0");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder11 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        java.lang.String str12 = invoiceCriteriaBuilder4.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder11);
	        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 0, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))" + "'", str12, "InvoiceCriteriaBuilder(invoiceNumber = 0, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	    }

	    @Test
	    public void test197() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test197");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        java.lang.Class<?> wildcardClass5 = wildcardClassInvoiceCriteriaBuilder0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(wildcardClass5);
	    }

	    @Test
	    public void test198() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test198");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder7.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria10 = invoiceCriteriaBuilder7.build();
	        java.lang.Class<?> wildcardClass11 = invoiceCriteriaBuilder7.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertNotNull(invoiceCriteria10);
	        org.junit.Assert.assertNotNull(wildcardClass11);
	    }

	    @Test
	    public void test199() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test199");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime2 = null;
	        invoice0.setCreatedAt(offsetDateTime2);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime5 = null;
	        invoice0.setCreatedAt(offsetDateTime5);
	        java.time.OffsetDateTime offsetDateTime7 = null;
	        invoice0.setCreatedAt(offsetDateTime7);
	        java.time.OffsetDateTime offsetDateTime9 = null;
	        invoice0.setCreatedAt(offsetDateTime9);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime12 = null;
	        invoice0.setCreatedAt(offsetDateTime12);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime15 = null;
	        invoice0.setCreatedAt(offsetDateTime15);
	        java.time.OffsetDateTime offsetDateTime17 = null;
	        invoice0.setCreatedAt(offsetDateTime17);
	        java.time.OffsetDateTime offsetDateTime19 = null;
	        invoice0.setCreatedAt(offsetDateTime19);
	        java.time.OffsetDateTime offsetDateTime21 = null;
	        invoice0.setCreatedAt(offsetDateTime21);
	        java.time.OffsetDateTime offsetDateTime23 = null;
	        invoice0.setCreatedAt(offsetDateTime23);
	    }

	    @Test
	    public void test200() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test200");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = invoiceCriteriaBuilder2.poNumber("");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	    }

	    @Test
	    public void test201() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test201");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder4.build();
	        invoiceCriteria5.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        java.lang.String str8 = invoiceCriteria5.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNull(str8);
	    }

	    @Test
	    public void test202() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test202");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria6 = wildcardClassInvoiceCriteriaBuilder0.build();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteria6);
	    }

	    @Test
	    public void test203() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test203");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        org.junit.Assert.assertNotNull(wildcardClassOfFieldInvoiceCriteriaBuilder0);
	    }

	    @Test
	    public void test204() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test204");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = objInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria4 = objInvoiceCriteriaBuilder0.build();
	        invoiceCriteria4.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNotNull(invoiceCriteria4);
	    }

	    @Test
	    public void test205() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test205");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        java.lang.String str9 = invoiceCriteria8.getInvoiceNumber();
	        invoiceCriteria8.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNull(str9);
	    }

	    @Test
	    public void test206() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test206");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str5 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setInvoiceNumber("10");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        java.lang.String str10 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))");
	        java.lang.String str13 = invoiceCriteria1.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
	        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
	        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
	    }

	    @Test
	    public void test207() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test207");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        java.lang.String str6 = invoiceCriteriaBuilder3.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = invoiceCriteriaBuilder3.invoiceNumber("");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null), poNumber = null)" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null), poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	    }

	    @Test
	    public void test208() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test208");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.String> strInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = strInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(strInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	    }

	    @Test
	    public void test209() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test209");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	    }

	    @Test
	    public void test210() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test210");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder2.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	    }

	    @Test
	    public void test211() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test211");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria6 = invoiceCriteriaBuilder3.build();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteria6);
	    }

	    @Test
	    public void test212() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test212");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        java.lang.String str3 = invoiceCriteriaBuilder2.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder2.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)" + "'", str3, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	    }

	    @Test
	    public void test213() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test213");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder4.build();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	    }

	    @Test
	    public void test214() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test214");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setPoNumber("0");
	        java.lang.String str5 = invoiceCriteria2.getInvoiceNumber();
	        invoiceCriteria2.setPoNumber("0");
	        java.lang.String str8 = invoiceCriteria2.getPoNumber();
	        java.lang.Class<?> wildcardClass9 = invoiceCriteria2.getClass();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNull(str5);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
	        org.junit.Assert.assertNotNull(wildcardClass9);
	    }

	    @Test
	    public void test215() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test215");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.common.Sizes> sizesInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = sizesInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null), poNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null))");
	        org.junit.Assert.assertNotNull(sizesInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	    }

	    @Test
	    public void test216() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test216");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        java.lang.String str3 = objInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = objInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = objInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )))");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str3, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	    }

	    @Test
	    public void test217() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test217");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        java.lang.String str4 = invoiceCriteria1.getPoNumber();
	        java.lang.Class<?> wildcardClass5 = invoiceCriteria1.getClass();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertNotNull(wildcardClass5);
	    }

	    @Test
	    public void test218() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test218");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime4 = null;
	        invoice0.setCreatedAt(offsetDateTime4);
	        java.time.OffsetDateTime offsetDateTime6 = null;
	        invoice0.setCreatedAt(offsetDateTime6);
	        java.time.OffsetDateTime offsetDateTime8 = null;
	        invoice0.setCreatedAt(offsetDateTime8);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	    }

	    @Test
	    public void test219() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test219");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime2 = null;
	        invoice0.setCreatedAt(offsetDateTime2);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime6 = null;
	        invoice0.setCreatedAt(offsetDateTime6);
	    }

	    @Test
	    public void test220() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test220");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder7.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder11 = invoiceCriteriaBuilder7.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder11);
	    }

	    @Test
	    public void test221() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test221");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = typeDescriptorInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	    }

	    @Test
	    public void test222() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test222");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null), poNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null))");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	    }

	    @Test
	    public void test223() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test223");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = objInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = )");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = )");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	    }

	    @Test
	    public void test224() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test224");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	    }

	    @Test
	    public void test225() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test225");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("hi!");
	        java.lang.String str4 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        java.lang.String str9 = invoiceCriteria1.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str9, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	    }

	    @Test
	    public void test226() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test226");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        java.lang.String str2 = invoiceCriteria1.getPoNumber();
	        java.lang.String str3 = invoiceCriteria1.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str2);
	        org.junit.Assert.assertNull(str3);
	    }

	    @Test
	    public void test227() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test227");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = objInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = objInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = objInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	    }

	    @Test
	    public void test228() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test228");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	    }

	    @Test
	    public void test229() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test229");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.model.Invoice> invoiceInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = invoiceInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = invoiceInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = )");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria4 = invoiceCriteriaBuilder3.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder3.build();
	        org.junit.Assert.assertNotNull(invoiceInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteria4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	    }

	    @Test
	    public void test230() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test230");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        java.lang.String str3 = objInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = objInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = objInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str3, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	    }

	    @Test
	    public void test231() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test231");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str5 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setInvoiceNumber("10");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        java.lang.String str10 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        java.lang.String str13 = invoiceCriteria1.getPoNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
	        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
	        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )" + "'", str13, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	    }

	    @Test
	    public void test232() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test232");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	    }

	    @Test
	    public void test233() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test233");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.common.Defaults> defaultsInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = defaultsInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = defaultsInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = defaultsInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        org.junit.Assert.assertNotNull(defaultsInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	    }

	    @Test
	    public void test234() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test234");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        invoiceCriteria3.setInvoiceNumber("0");
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)");
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        invoiceCriteria3.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null), poNumber = null)");
	        java.lang.String str12 = invoiceCriteria3.getPoNumber();
	        invoiceCriteria3.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = )");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str12, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	    }

	    @Test
	    public void test235() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test235");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = hi!)");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = )");
	        java.lang.String str6 = invoiceCriteria1.getPoNumber();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = , poNumber = )" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = , poNumber = )");
	    }

	    @Test
	    public void test236() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test236");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria6 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria7 = invoiceCriteriaBuilder4.build();
	        invoiceCriteria7.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = hi!)");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(invoiceCriteria6);
	        org.junit.Assert.assertNotNull(invoiceCriteria7);
	    }

	    @Test
	    public void test237() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test237");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str2 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = wildcardClassInvoiceCriteriaBuilder0.poNumber("10");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str2, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	    }

	    @Test
	    public void test238() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test238");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )))");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	    }

	    @Test
	    public void test239() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test239");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        java.lang.String str9 = invoiceCriteria8.getInvoiceNumber();
	        invoiceCriteria8.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNull(str9);
	    }

	    @Test
	    public void test240() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test240");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceCriteria> invoiceCriteriaInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceCriteriaInvoiceCriteriaBuilder0.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	    }

	    @Test
	    public void test241() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test241");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        invoiceCriteria8.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        invoiceCriteria8.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        java.lang.String str13 = invoiceCriteria8.getInvoiceNumber();
	        invoiceCriteria8.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNull(str13);
	    }

	    @Test
	    public void test242() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test242");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 0, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder5.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	    }

	    @Test
	    public void test243() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test243");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        invoiceCriteria3.setInvoiceNumber("0");
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        java.lang.String str8 = invoiceCriteria3.getPoNumber();
	        invoiceCriteria3.setInvoiceNumber("");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	    }

	    @Test
	    public void test244() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test244");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        invoiceCriteria8.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        java.lang.Class<?> wildcardClass11 = invoiceCriteria8.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(wildcardClass11);
	    }

	    @Test
	    public void test245() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test245");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = objInvoiceCriteriaBuilder0.build();
	        java.lang.String str4 = invoiceCriteria3.getInvoiceNumber();
	        java.lang.String str5 = invoiceCriteria3.getInvoiceNumber();
	        invoiceCriteria3.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertNull(str5);
	    }

	    @Test
	    public void test246() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test246");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.reflect.Type> typeInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertNotNull(typeInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	    }

	    @Test
	    public void test247() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test247");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        invoiceCriteria3.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        invoiceCriteria3.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	    }

	    @Test
	    public void test248() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test248");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder2.build();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	    }

	    @Test
	    public void test249() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test249");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.common.Sizes> sizesInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = sizesInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(sizesInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	    }

	    @Test
	    public void test250() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test250");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime2 = null;
	        invoice0.setCreatedAt(offsetDateTime2);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime5 = null;
	        invoice0.setCreatedAt(offsetDateTime5);
	        java.time.OffsetDateTime offsetDateTime7 = null;
	        invoice0.setCreatedAt(offsetDateTime7);
	        java.time.OffsetDateTime offsetDateTime9 = null;
	        invoice0.setCreatedAt(offsetDateTime9);
	        java.time.OffsetDateTime offsetDateTime11 = null;
	        invoice0.setCreatedAt(offsetDateTime11);
	    }

	    @Test
	    public void test251() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test251");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("hi!");
	        java.lang.String str4 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        java.lang.String str9 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str10 = invoiceCriteria1.getPoNumber();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)" + "'", str9, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str10, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	    }

	    @Test
	    public void test252() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test252");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime2 = null;
	        invoice0.setCreatedAt(offsetDateTime2);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	    }

	    @Test
	    public void test253() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test253");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria10 = invoiceCriteriaBuilder9.build();
	        java.lang.String str11 = invoiceCriteria10.getInvoiceNumber();
	        java.lang.String str12 = invoiceCriteria10.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertNotNull(invoiceCriteria10);
	        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )" + "'", str11, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )" + "'", str12, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	    }

	    @Test
	    public void test254() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test254");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder7.poNumber("0");
	        java.lang.String str10 = invoiceCriteriaBuilder7.toString();
	        java.lang.String str11 = invoiceCriteriaBuilder7.toString();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!), poNumber = 0)" + "'", str10, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!), poNumber = 0)");
	        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!), poNumber = 0)" + "'", str11, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!), poNumber = 0)");
	    }

	    @Test
	    public void test255() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test255");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str4 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)" + "'", str4, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	    }

	    @Test
	    public void test256() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test256");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime2 = null;
	        invoice0.setCreatedAt(offsetDateTime2);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime5 = null;
	        invoice0.setCreatedAt(offsetDateTime5);
	        java.time.OffsetDateTime offsetDateTime7 = null;
	        invoice0.setCreatedAt(offsetDateTime7);
	        java.time.OffsetDateTime offsetDateTime9 = null;
	        invoice0.setCreatedAt(offsetDateTime9);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime12 = null;
	        invoice0.setCreatedAt(offsetDateTime12);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime15 = null;
	        invoice0.setCreatedAt(offsetDateTime15);
	        java.time.OffsetDateTime offsetDateTime17 = null;
	        invoice0.setCreatedAt(offsetDateTime17);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime21 = null;
	        invoice0.setCreatedAt(offsetDateTime21);
	    }

	    @Test
	    public void test257() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test257");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        java.lang.String str4 = invoiceCriteria3.getPoNumber();
	        invoiceCriteria3.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )))");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNull(str4);
	    }

	    @Test
	    public void test258() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test258");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.common.Defaults> defaultsInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = defaultsInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = defaultsInvoiceCriteriaBuilder0.poNumber("");
	        org.junit.Assert.assertNotNull(defaultsInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	    }

	    @Test
	    public void test259() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test259");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        invoiceCriteria3.setInvoiceNumber("0");
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        java.lang.String str8 = invoiceCriteria3.getPoNumber();
	        java.lang.Class<?> wildcardClass9 = invoiceCriteria3.getClass();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        org.junit.Assert.assertNotNull(wildcardClass9);
	    }

	    @Test
	    public void test260() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test260");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = objInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria4 = objInvoiceCriteriaBuilder0.build();
	        java.lang.String str5 = invoiceCriteria4.getInvoiceNumber();
	        invoiceCriteria4.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        invoiceCriteria4.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 0, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNotNull(invoiceCriteria4);
	        org.junit.Assert.assertNull(str5);
	    }

	    @Test
	    public void test261() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test261");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        java.lang.Class<?> wildcardClass5 = invoiceCriteriaBuilder4.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(wildcardClass5);
	    }

	    @Test
	    public void test262() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test262");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = objInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)");
	        java.lang.String str6 = invoiceCriteria1.getPoNumber();
	        java.lang.String str7 = invoiceCriteria1.getPoNumber();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)");
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)" + "'", str7, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)");
	    }

	    @Test
	    public void test263() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test263");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = objInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = invoiceCriteriaBuilder4.invoiceNumber("");
	        java.lang.Class<?> wildcardClass7 = invoiceCriteriaBuilder4.getClass();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertNotNull(wildcardClass7);
	    }

	    @Test
	    public void test264() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test264");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        java.lang.Class<?> wildcardClass5 = invoiceCriteria2.getClass();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(wildcardClass5);
	    }

	    @Test
	    public void test265() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test265");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.model.Invoice> invoiceInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = invoiceInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = invoiceInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = )");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria4 = invoiceCriteriaBuilder3.build();
	        invoiceCriteria4.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteria4);
	    }

	    @Test
	    public void test266() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test266");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder2.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	    }

	    @Test
	    public void test267() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test267");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        java.lang.String str6 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria7 = wildcardClassInvoiceCriteriaBuilder0.build();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertNotNull(invoiceCriteria7);
	    }

	    @Test
	    public void test268() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test268");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        java.lang.String str8 = invoiceCriteria1.getPoNumber();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	    }

	    @Test
	    public void test269() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test269");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime2 = null;
	        invoice0.setCreatedAt(offsetDateTime2);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime5 = null;
	        invoice0.setCreatedAt(offsetDateTime5);
	        java.time.OffsetDateTime offsetDateTime7 = null;
	        invoice0.setCreatedAt(offsetDateTime7);
	        java.time.OffsetDateTime offsetDateTime9 = null;
	        invoice0.setCreatedAt(offsetDateTime9);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime13 = null;
	        invoice0.setCreatedAt(offsetDateTime13);
	        java.time.OffsetDateTime offsetDateTime15 = null;
	        invoice0.setCreatedAt(offsetDateTime15);
	        java.time.OffsetDateTime offsetDateTime17 = null;
	        invoice0.setCreatedAt(offsetDateTime17);
	    }

	    @Test
	    public void test270() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test270");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        java.lang.String str8 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria9 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria9.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        org.junit.Assert.assertNotNull(invoiceCriteria9);
	    }

	    @Test
	    public void test271() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test271");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder7.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = hi!)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	    }

	    @Test
	    public void test272() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test272");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = objInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)");
	        java.lang.String str6 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str7 = invoiceCriteria1.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))" + "'", str7, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	    }

	    @Test
	    public void test273() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test273");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setPoNumber("0");
	        invoiceCriteria2.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        invoiceCriteria2.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)))");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	    }

	    @Test
	    public void test274() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test274");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str5 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setInvoiceNumber("10");
	        java.lang.String str8 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str9 = invoiceCriteria1.getPoNumber();
	        java.lang.Class<?> wildcardClass10 = invoiceCriteria1.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
	        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
	        org.junit.Assert.assertNotNull(wildcardClass10);
	    }

	    @Test
	    public void test275() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test275");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.reflect.Type> typeInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = typeInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(typeInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	    }

	    @Test
	    public void test276() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test276");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime2 = null;
	        invoice0.setCreatedAt(offsetDateTime2);
	        java.time.OffsetDateTime offsetDateTime4 = null;
	        invoice0.setCreatedAt(offsetDateTime4);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime8 = null;
	        invoice0.setCreatedAt(offsetDateTime8);
	        java.lang.Class<?> wildcardClass10 = invoice0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClass10);
	    }

	    @Test
	    public void test277() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test277");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        invoiceCriteria2.setPoNumber("0");
	        invoiceCriteria2.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	    }

	    @Test
	    public void test278() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test278");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        java.lang.String str6 = invoiceCriteriaBuilder5.toString();
	        java.lang.String str7 = invoiceCriteriaBuilder5.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder5.build();
	        java.lang.Class<?> wildcardClass9 = invoiceCriteriaBuilder5.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))" + "'", str7, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(wildcardClass9);
	    }

	    @Test
	    public void test279() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test279");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria6 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria7 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder4.invoiceNumber("");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(invoiceCriteria6);
	        org.junit.Assert.assertNotNull(invoiceCriteria7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	    }

	    @Test
	    public void test280() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test280");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        invoiceCriteria2.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)");
	        java.lang.String str7 = invoiceCriteria2.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNull(str7);
	    }

	    @Test
	    public void test281() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test281");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder3.poNumber("10");
	        java.lang.String str8 = invoiceCriteriaBuilder3.toString();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null), poNumber = 10)" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null), poNumber = 10)");
	    }

	    @Test
	    public void test282() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test282");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str5 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)" + "'", str4, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	    }

	    @Test
	    public void test283() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test283");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        java.lang.String str6 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder12 = invoiceCriteriaBuilder10.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder14 = invoiceCriteriaBuilder12.invoiceNumber("");
	        java.lang.String str15 = invoiceCriteriaBuilder14.toString();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder12);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder14);
	        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = , poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))" + "'", str15, "InvoiceCriteriaBuilder(invoiceNumber = , poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))");
	    }

	    @Test
	    public void test284() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test284");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.io.Serializable> serializableInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = serializableInvoiceCriteriaBuilder0.toString();
	        java.lang.String str2 = serializableInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(serializableInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str2, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	    }

	    @Test
	    public void test285() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test285");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.reflect.AnnotatedElement> annotatedElementInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        org.junit.Assert.assertNotNull(annotatedElementInvoiceCriteriaBuilder0);
	    }

	    @Test
	    public void test286() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test286");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder12 = invoiceCriteriaBuilder10.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder14 = invoiceCriteriaBuilder12.poNumber("InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder16 = invoiceCriteriaBuilder12.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder12);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder14);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder16);
	    }

	    @Test
	    public void test287() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test287");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("hi!");
	        java.lang.String str4 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        java.lang.Class<?> wildcardClass9 = invoiceCriteria1.getClass();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertNotNull(wildcardClass9);
	    }

	    @Test
	    public void test288() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test288");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str4, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	    }

	    @Test
	    public void test289() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test289");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        java.lang.String str4 = invoiceCriteria3.getPoNumber();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNull(str4);
	    }

	    @Test
	    public void test290() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test290");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setInvoiceNumber("10");
	        invoiceCriteria1.setInvoiceNumber("0");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        invoiceCriteria1.setPoNumber("0");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	    }

	    @Test
	    public void test291() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test291");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))");
	        invoiceCriteria2.setInvoiceNumber("hi!");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	    }

	    @Test
	    public void test292() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test292");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.model.Invoice> invoiceInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = invoiceInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = invoiceInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))");
	        org.junit.Assert.assertNotNull(invoiceInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	    }

	    @Test
	    public void test293() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test293");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria4 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        java.lang.Class<?> wildcardClass5 = invoiceCriteria4.getClass();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteria4);
	        org.junit.Assert.assertNotNull(wildcardClass5);
	    }

	    @Test
	    public void test294() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test294");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = objInvoiceCriteriaBuilder0.poNumber("hi!");
	        java.lang.Class<?> wildcardClass5 = invoiceCriteriaBuilder4.getClass();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(wildcardClass5);
	    }

	    @Test
	    public void test295() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test295");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        java.lang.String str8 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria9 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria10 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.Class<?> wildcardClass11 = invoiceCriteria10.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        org.junit.Assert.assertNotNull(invoiceCriteria9);
	        org.junit.Assert.assertNotNull(invoiceCriteria10);
	        org.junit.Assert.assertNotNull(wildcardClass11);
	    }

	    @Test
	    public void test296() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test296");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!), poNumber = 0)");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	    }

	    @Test
	    public void test297() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test297");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 0, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria6 = invoiceCriteriaBuilder5.build();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteria6);
	    }

	    @Test
	    public void test298() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test298");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = objInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = )");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )))");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	    }

	    @Test
	    public void test299() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test299");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str2 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        java.lang.Class<?> wildcardClass3 = wildcardClassInvoiceCriteriaBuilder0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str2, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClass3);
	    }

	    @Test
	    public void test300() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test300");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null), poNumber = 10)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	    }

	    @Test
	    public void test301() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test301");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str4 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = null)" + "'", str4, "InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = null)");
	    }

	    @Test
	    public void test302() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test302");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        invoiceCriteria3.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )), poNumber = null)");
	        java.lang.String str6 = invoiceCriteria3.getPoNumber();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNull(str6);
	    }

	    @Test
	    public void test303() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test303");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setInvoiceNumber("10");
	        invoiceCriteria1.setInvoiceNumber("");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)");
	        java.lang.String str11 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)" + "'", str11, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)");
	    }

	    @Test
	    public void test304() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test304");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder3.poNumber("10");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder7.build();
	        invoiceCriteria8.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = )");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	    }

	    @Test
	    public void test305() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test305");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)");
	        java.lang.Class<?> wildcardClass4 = invoiceCriteria1.getClass();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(wildcardClass4);
	    }

	    @Test
	    public void test306() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test306");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder7.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder11 = invoiceCriteriaBuilder7.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder11);
	    }

	    @Test
	    public void test307() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test307");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        java.lang.Class<?> wildcardClass3 = objInvoiceCriteriaBuilder0.getClass();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(wildcardClass3);
	    }

	    @Test
	    public void test308() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test308");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        java.lang.String str11 = invoiceCriteriaBuilder4.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = )" + "'", str11, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = )");
	    }

	    @Test
	    public void test309() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test309");
	        com.invoice.system.common.Sizes sizes0 = new com.invoice.system.common.Sizes();
	        java.lang.Class<?> wildcardClass1 = sizes0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClass1);
	    }

	    @Test
	    public void test310() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test310");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null), poNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null))");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	    }

	    @Test
	    public void test311() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test311");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        java.lang.String str6 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder8.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria11 = invoiceCriteriaBuilder8.build();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteria11);
	    }

	    @Test
	    public void test312() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test312");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria6 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria7 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(invoiceCriteria6);
	        org.junit.Assert.assertNotNull(invoiceCriteria7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	    }

	    @Test
	    public void test313() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test313");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        java.lang.String str8 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        java.lang.Class<?> wildcardClass9 = wildcardClassInvoiceCriteriaBuilder0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        org.junit.Assert.assertNotNull(wildcardClass9);
	    }

	    @Test
	    public void test314() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test314");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime2 = null;
	        invoice0.setCreatedAt(offsetDateTime2);
	        java.time.OffsetDateTime offsetDateTime4 = null;
	        invoice0.setCreatedAt(offsetDateTime4);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime8 = null;
	        invoice0.setCreatedAt(offsetDateTime8);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime11 = null;
	        invoice0.setCreatedAt(offsetDateTime11);
	    }

	    @Test
	    public void test315() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test315");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        invoiceCriteria8.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        invoiceCriteria8.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = )");
	        invoiceCriteria8.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )))");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	    }

	    @Test
	    public void test316() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test316");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder5.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	    }

	    @Test
	    public void test317() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test317");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.common.Defaults> defaultsInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = defaultsInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 0, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        org.junit.Assert.assertNotNull(defaultsInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	    }

	    @Test
	    public void test318() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test318");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))");
	        java.lang.Class<?> wildcardClass5 = invoiceCriteria2.getClass();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(wildcardClass5);
	    }

	    @Test
	    public void test319() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test319");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder7.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder11 = invoiceCriteriaBuilder7.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        java.lang.String str12 = invoiceCriteriaBuilder7.toString();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder11);
	        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ))" + "'", str12, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ))");
	    }

	    @Test
	    public void test320() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test320");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        java.lang.String str6 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria7 = invoiceCriteriaBuilder4.build();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteria7);
	    }

	    @Test
	    public void test321() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test321");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        java.lang.String str4 = invoiceCriteria3.getPoNumber();
	        invoiceCriteria3.setInvoiceNumber("");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNull(str4);
	    }

	    @Test
	    public void test322() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test322");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("10");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria4 = invoiceCriteriaBuilder3.build();
	        java.lang.String str5 = invoiceCriteriaBuilder3.toString();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteria4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = 10)" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = 10)");
	    }

	    @Test
	    public void test323() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test323");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("10");
	        java.lang.String str8 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("hi!");
	        java.lang.Class<?> wildcardClass11 = invoiceCriteriaBuilder10.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(wildcardClass11);
	    }

	    @Test
	    public void test324() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test324");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder7.build();
	        invoiceCriteria8.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null), poNumber = 10)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	    }

	    @Test
	    public void test325() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test325");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        java.lang.String str6 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder12 = invoiceCriteriaBuilder10.invoiceNumber("");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder12);
	    }

	    @Test
	    public void test326() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test326");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        java.lang.String str9 = invoiceCriteria8.getPoNumber();
	        invoiceCriteria8.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!), poNumber = 0)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNull(str9);
	    }

	    @Test
	    public void test327() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test327");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = invoiceCriteriaBuilder6.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null), poNumber = 10)");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	    }

	    @Test
	    public void test328() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test328");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria7 = invoiceCriteriaBuilder6.build();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertNotNull(invoiceCriteria7);
	    }

	    @Test
	    public void test329() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test329");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setInvoiceNumber("10");
	        java.lang.String str7 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setInvoiceNumber("10");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
	    }

	    @Test
	    public void test330() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test330");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        java.lang.String str6 = invoiceCriteria5.getPoNumber();
	        java.lang.String str7 = invoiceCriteria5.getInvoiceNumber();
	        invoiceCriteria5.setPoNumber("");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNull(str6);
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
	    }

	    @Test
	    public void test331() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test331");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.String> strInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = strInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = strInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null), poNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null))");
	        org.junit.Assert.assertNotNull(strInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	    }

	    @Test
	    public void test332() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test332");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.model.BaseEntity> baseEntityInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = baseEntityInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(baseEntityInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	    }

	    @Test
	    public void test333() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test333");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)");
	        java.lang.String str7 = invoiceCriteriaBuilder4.toString();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null), poNumber = null)" + "'", str7, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null), poNumber = null)");
	    }

	    @Test
	    public void test334() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test334");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        java.time.OffsetDateTime offsetDateTime1 = null;
	        invoice0.setCreatedAt(offsetDateTime1);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime4 = null;
	        invoice0.setCreatedAt(offsetDateTime4);
	        invoice0.prePersist();
	    }

	    @Test
	    public void test335() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test335");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	    }

	    @Test
	    public void test336() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test336");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder2.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        java.lang.String str6 = invoiceCriteriaBuilder5.toString();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null), poNumber = )" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null), poNumber = )");
	    }

	    @Test
	    public void test337() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test337");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria11 = invoiceCriteriaBuilder10.build();
	        java.lang.String str12 = invoiceCriteria11.getInvoiceNumber();
	        java.lang.String str13 = invoiceCriteria11.getPoNumber();
	        invoiceCriteria11.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        invoiceCriteria11.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = )");
	        java.lang.String str18 = invoiceCriteria11.getPoNumber();
	        java.lang.String str19 = invoiceCriteria11.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteria11);
	        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))" + "'", str12, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        org.junit.Assert.assertNull(str13);
	        org.junit.Assert.assertNull(str18);
	        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = )" + "'", str19, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = )");
	    }

	    @Test
	    public void test338() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test338");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder12 = invoiceCriteriaBuilder10.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder14 = invoiceCriteriaBuilder12.poNumber("InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria15 = invoiceCriteriaBuilder14.build();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder12);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder14);
	        org.junit.Assert.assertNotNull(invoiceCriteria15);
	    }

	    @Test
	    public void test339() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test339");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria6 = invoiceCriteriaBuilder4.build();
	        invoiceCriteria6.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = null)");
	        java.lang.Class<?> wildcardClass9 = invoiceCriteria6.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteria6);
	        org.junit.Assert.assertNotNull(wildcardClass9);
	    }

	    @Test
	    public void test340() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test340");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setInvoiceNumber("10");
	        java.lang.String str7 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str8 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str9 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
	        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
	    }

	    @Test
	    public void test341() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test341");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = objInvoiceCriteriaBuilder0.build();
	        java.lang.String str4 = invoiceCriteria3.getInvoiceNumber();
	        java.lang.String str5 = invoiceCriteria3.getInvoiceNumber();
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        invoiceCriteria3.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        invoiceCriteria3.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 0, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertNull(str5);
	    }

	    @Test
	    public void test342() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test342");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str2 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = invoiceCriteriaBuilder6.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str2, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	    }

	    @Test
	    public void test343() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test343");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        invoiceCriteria8.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        invoiceCriteria8.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        invoiceCriteria8.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        java.lang.String str15 = invoiceCriteria8.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))" + "'", str15, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	    }

	    @Test
	    public void test344() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test344");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        invoiceCriteria8.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        invoiceCriteria8.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        java.lang.String str13 = invoiceCriteria8.getInvoiceNumber();
	        java.lang.String str14 = invoiceCriteria8.getPoNumber();
	        java.lang.String str15 = invoiceCriteria8.getInvoiceNumber();
	        java.lang.Class<?> wildcardClass16 = invoiceCriteria8.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNull(str13);
	        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str14, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNull(str15);
	        org.junit.Assert.assertNotNull(wildcardClass16);
	    }

	    @Test
	    public void test345() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test345");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setPoNumber("0");
	        java.lang.String str5 = invoiceCriteria2.getInvoiceNumber();
	        invoiceCriteria2.setPoNumber("0");
	        java.lang.String str8 = invoiceCriteria2.getPoNumber();
	        invoiceCriteria2.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null), poNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null))");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNull(str5);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
	    }

	    @Test
	    public void test346() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test346");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime2 = null;
	        invoice0.setCreatedAt(offsetDateTime2);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime5 = null;
	        invoice0.setCreatedAt(offsetDateTime5);
	        java.time.OffsetDateTime offsetDateTime7 = null;
	        invoice0.setCreatedAt(offsetDateTime7);
	        java.time.OffsetDateTime offsetDateTime9 = null;
	        invoice0.setCreatedAt(offsetDateTime9);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime12 = null;
	        invoice0.setCreatedAt(offsetDateTime12);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime15 = null;
	        invoice0.setCreatedAt(offsetDateTime15);
	        java.time.OffsetDateTime offsetDateTime17 = null;
	        invoice0.setCreatedAt(offsetDateTime17);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.lang.Class<?> wildcardClass21 = invoice0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClass21);
	    }

	    @Test
	    public void test347() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test347");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime4 = null;
	        invoice0.setCreatedAt(offsetDateTime4);
	        java.time.OffsetDateTime offsetDateTime6 = null;
	        invoice0.setCreatedAt(offsetDateTime6);
	        java.time.OffsetDateTime offsetDateTime8 = null;
	        invoice0.setCreatedAt(offsetDateTime8);
	        java.time.OffsetDateTime offsetDateTime10 = null;
	        invoice0.setCreatedAt(offsetDateTime10);
	        java.time.OffsetDateTime offsetDateTime12 = null;
	        invoice0.setCreatedAt(offsetDateTime12);
	        invoice0.prePersist();
	    }

	    @Test
	    public void test348() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test348");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str5 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setInvoiceNumber("10");
	        java.lang.String str8 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str9 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
	        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
	    }

	    @Test
	    public void test349() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test349");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        java.lang.String str6 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder12 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder14 = invoiceCriteriaBuilder4.poNumber("");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder12);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder14);
	    }

	    @Test
	    public void test350() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test350");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        java.time.OffsetDateTime offsetDateTime1 = null;
	        invoice0.setCreatedAt(offsetDateTime1);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime5 = null;
	        invoice0.setCreatedAt(offsetDateTime5);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime9 = null;
	        invoice0.setCreatedAt(offsetDateTime9);
	        java.time.OffsetDateTime offsetDateTime11 = null;
	        invoice0.setCreatedAt(offsetDateTime11);
	    }

	    @Test
	    public void test351() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test351");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        java.lang.String str7 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null), poNumber = )");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
	        org.junit.Assert.assertNull(str7);
	    }

	    @Test
	    public void test352() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test352");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))");
	        java.lang.String str7 = invoiceObjectInvoiceCriteriaBuilder0.toString();
	        java.lang.String str8 = invoiceObjectInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )), poNumber = null)" + "'", str7, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )), poNumber = null)");
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )), poNumber = null)" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )), poNumber = null)");
	    }

	    @Test
	    public void test353() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test353");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        java.lang.Class<?> wildcardClass6 = typeDescriptorInvoiceCriteriaBuilder0.getClass();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(wildcardClass6);
	    }

	    @Test
	    public void test354() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test354");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	    }

	    @Test
	    public void test355() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test355");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        java.lang.String str7 = invoiceCriteria1.getPoNumber();
	        java.lang.String str8 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))" + "'", str7, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	    }

	    @Test
	    public void test356() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test356");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        java.lang.String str4 = invoiceCriteriaBuilder2.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = invoiceCriteriaBuilder2.poNumber("10");
	        java.lang.String str7 = invoiceCriteriaBuilder2.toString();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str4, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = 10)" + "'", str7, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = 10)");
	    }

	    @Test
	    public void test357() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test357");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setInvoiceNumber("10");
	        invoiceCriteria1.setInvoiceNumber("0");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        java.lang.String str11 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str12 = invoiceCriteria1.getPoNumber();
	        java.lang.String str13 = invoiceCriteria1.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
	        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str12, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
	    }

	    @Test
	    public void test358() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test358");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        java.lang.String str3 = objInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria4 = objInvoiceCriteriaBuilder0.build();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str3, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteria4);
	    }

	    @Test
	    public void test359() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test359");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str5 = invoiceCriteria1.getPoNumber();
	        java.lang.String str6 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str7 = invoiceCriteria1.getPoNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
	        org.junit.Assert.assertNull(str6);
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
	    }

	    @Test
	    public void test360() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test360");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("");
	        java.lang.String str4 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str6 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str4, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	    }

	    @Test
	    public void test361() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test361");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setInvoiceNumber("10");
	        invoiceCriteria1.setInvoiceNumber("");
	        java.lang.String str9 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str10 = invoiceCriteria1.getPoNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
	        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
	    }

	    @Test
	    public void test362() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test362");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str3 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str3, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	    }

	    @Test
	    public void test363() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test363");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("10");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria4 = invoiceCriteriaBuilder3.build();
	        invoiceCriteria4.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteria4);
	    }

	    @Test
	    public void test364() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test364");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder7.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder11 = invoiceCriteriaBuilder7.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder11);
	    }

	    @Test
	    public void test365() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test365");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        java.lang.String str6 = invoiceCriteria5.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
	    }

	    @Test
	    public void test366() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test366");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	    }

	    @Test
	    public void test367() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test367");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria11 = invoiceCriteriaBuilder10.build();
	        java.lang.String str12 = invoiceCriteriaBuilder10.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder14 = invoiceCriteriaBuilder10.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))");
	        java.lang.String str15 = invoiceCriteriaBuilder14.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteria11);
	        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = )" + "'", str12, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder14);
	        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )), poNumber = )" + "'", str15, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )), poNumber = )");
	    }

	    @Test
	    public void test368() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test368");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria11 = invoiceCriteriaBuilder10.build();
	        java.lang.String str12 = invoiceCriteria11.getInvoiceNumber();
	        invoiceCriteria11.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null), poNumber = )");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteria11);
	        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))" + "'", str12, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	    }

	    @Test
	    public void test369() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test369");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime4 = null;
	        invoice0.setCreatedAt(offsetDateTime4);
	        java.time.OffsetDateTime offsetDateTime6 = null;
	        invoice0.setCreatedAt(offsetDateTime6);
	        java.time.OffsetDateTime offsetDateTime8 = null;
	        invoice0.setCreatedAt(offsetDateTime8);
	        java.time.OffsetDateTime offsetDateTime10 = null;
	        invoice0.setCreatedAt(offsetDateTime10);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime13 = null;
	        invoice0.setCreatedAt(offsetDateTime13);
	        java.time.OffsetDateTime offsetDateTime15 = null;
	        invoice0.setCreatedAt(offsetDateTime15);
	    }

	    @Test
	    public void test370() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test370");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str5 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str6 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str4, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	    }

	    @Test
	    public void test371() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test371");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder7.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder11 = invoiceCriteriaBuilder9.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = 10)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder11);
	    }

	    @Test
	    public void test372() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test372");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder4.invoiceNumber("0");
	        java.lang.Class<?> wildcardClass10 = invoiceCriteriaBuilder9.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertNotNull(wildcardClass10);
	    }

	    @Test
	    public void test373() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test373");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime3 = null;
	        invoice0.setCreatedAt(offsetDateTime3);
	        java.time.OffsetDateTime offsetDateTime5 = null;
	        invoice0.setCreatedAt(offsetDateTime5);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	    }

	    @Test
	    public void test374() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test374");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria10 = invoiceCriteriaBuilder9.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder12 = invoiceCriteriaBuilder9.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        java.lang.String str13 = invoiceCriteriaBuilder12.toString();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertNotNull(invoiceCriteria10);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder12);
	        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null), poNumber = null)" + "'", str13, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null), poNumber = null)");
	    }

	    @Test
	    public void test375() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test375");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("");
	        java.lang.String str4 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder7.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        java.lang.Class<?> wildcardClass10 = invoiceCriteriaBuilder7.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str4, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertNotNull(wildcardClass10);
	    }

	    @Test
	    public void test376() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test376");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.String str5 = invoiceCriteria1.getInvoiceNumber();
	        java.lang.Class<?> wildcardClass6 = invoiceCriteria1.getClass();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)" + "'", str4, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        org.junit.Assert.assertNotNull(wildcardClass6);
	    }

	    @Test
	    public void test377() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test377");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.common.Defaults> defaultsInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = defaultsInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = defaultsInvoiceCriteriaBuilder0.build();
	        java.lang.Class<?> wildcardClass3 = defaultsInvoiceCriteriaBuilder0.getClass();
	        org.junit.Assert.assertNotNull(defaultsInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(wildcardClass3);
	    }

	    @Test
	    public void test378() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test378");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        java.lang.String str5 = invoiceObjectInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	    }

	    @Test
	    public void test379() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test379");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setInvoiceNumber("10");
	        java.lang.String str7 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setInvoiceNumber("10");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        java.lang.String str12 = invoiceCriteria1.getPoNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
	        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str12, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	    }

	    @Test
	    public void test380() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test380");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        java.lang.String str9 = invoiceCriteria8.getInvoiceNumber();
	        invoiceCriteria8.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = )");
	        java.lang.String str12 = invoiceCriteria8.getPoNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNull(str9);
	        org.junit.Assert.assertNull(str12);
	    }

	    @Test
	    public void test381() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test381");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder7.poNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder12 = invoiceCriteriaBuilder7.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder12);
	    }

	    @Test
	    public void test382() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test382");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        java.lang.String str5 = invoiceObjectInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria6 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteria6);
	    }

	    @Test
	    public void test383() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test383");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	    }

	    @Test
	    public void test384() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test384");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        invoiceCriteria8.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	    }

	    @Test
	    public void test385() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test385");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str2 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = invoiceCriteriaBuilder6.invoiceNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder8.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria11 = invoiceCriteriaBuilder8.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder13 = invoiceCriteriaBuilder8.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null), poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str2, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteria11);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder13);
	    }

	    @Test
	    public void test386() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test386");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder4.build();
	        java.lang.String str6 = invoiceCriteria5.getInvoiceNumber();
	        invoiceCriteria5.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null), poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
	    }

	    @Test
	    public void test387() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test387");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = )");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	    }

	    @Test
	    public void test388() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test388");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = objInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = invoiceCriteriaBuilder4.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria7 = invoiceCriteriaBuilder4.build();
	        java.lang.String str8 = invoiceCriteria7.getInvoiceNumber();
	        invoiceCriteria7.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null), poNumber = hi!)");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertNotNull(invoiceCriteria7);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
	    }

	    @Test
	    public void test389() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test389");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        java.lang.String str3 = objInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = objInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria6 = invoiceCriteriaBuilder5.build();
	        java.lang.String str7 = invoiceCriteria6.getPoNumber();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str3, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteria6);
	        org.junit.Assert.assertNull(str7);
	    }

	    @Test
	    public void test390() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test390");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setPoNumber("0");
	        java.lang.String str5 = invoiceCriteria2.getInvoiceNumber();
	        invoiceCriteria2.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        invoiceCriteria2.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )), poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNull(str5);
	    }

	    @Test
	    public void test391() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test391");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("hi!");
	        java.lang.String str4 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        java.lang.String str9 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = null)");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)" + "'", str9, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	    }

	    @Test
	    public void test392() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test392");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = wildcardClassInvoiceCriteriaBuilder0.poNumber("");
	        java.lang.String str4 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria5.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        invoiceCriteria5.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)");
	        invoiceCriteria5.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        invoiceCriteria5.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )), poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str4, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	    }

	    @Test
	    public void test393() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test393");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        java.lang.String str4 = invoiceCriteria3.getPoNumber();
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ))");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNull(str4);
	    }

	    @Test
	    public void test394() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test394");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder7.poNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )))");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria10 = invoiceCriteriaBuilder9.build();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertNotNull(invoiceCriteria10);
	    }

	    @Test
	    public void test395() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test395");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria5.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )), poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	    }

	    @Test
	    public void test396() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test396");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        java.lang.String str6 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder8.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria11 = invoiceCriteriaBuilder10.build();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteria11);
	    }

	    @Test
	    public void test397() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test397");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime3 = null;
	        invoice0.setCreatedAt(offsetDateTime3);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime6 = null;
	        invoice0.setCreatedAt(offsetDateTime6);
	        java.time.OffsetDateTime offsetDateTime8 = null;
	        invoice0.setCreatedAt(offsetDateTime8);
	    }

	    @Test
	    public void test398() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test398");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!), poNumber = 0)");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	    }

	    @Test
	    public void test399() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test399");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.Class<?> wildcardClass1 = objInvoiceCriteriaBuilder0.getClass();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(wildcardClass1);
	    }

	    @Test
	    public void test400() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test400");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime4 = null;
	        invoice0.setCreatedAt(offsetDateTime4);
	        java.time.OffsetDateTime offsetDateTime6 = null;
	        invoice0.setCreatedAt(offsetDateTime6);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	    }

	    @Test
	    public void test401() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test401");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria6 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria7 = invoiceCriteriaBuilder4.build();
	        java.lang.String str8 = invoiceCriteria7.getPoNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(invoiceCriteria6);
	        org.junit.Assert.assertNotNull(invoiceCriteria7);
	        org.junit.Assert.assertNull(str8);
	    }

	    @Test
	    public void test402() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test402");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str3 = invoiceCriteria2.getInvoiceNumber();
	        invoiceCriteria2.setInvoiceNumber("");
	        invoiceCriteria2.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        java.lang.String str8 = invoiceCriteria2.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNull(str3);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
	    }

	    @Test
	    public void test403() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test403");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = hi!)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = invoiceCriteriaBuilder2.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null), poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	    }

	    @Test
	    public void test404() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test404");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.common.Sizes> sizesInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = sizesInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = sizesInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria4 = sizesInvoiceCriteriaBuilder0.build();
	        org.junit.Assert.assertNotNull(sizesInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteria4);
	    }

	    @Test
	    public void test405() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test405");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder12 = invoiceCriteriaBuilder10.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder14 = invoiceCriteriaBuilder12.poNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder12);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder14);
	    }

	    @Test
	    public void test406() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test406");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder7.invoiceNumber("0");
	        java.lang.String str11 = invoiceCriteriaBuilder7.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 0, poNumber = )" + "'", str11, "InvoiceCriteriaBuilder(invoiceNumber = 0, poNumber = )");
	    }

	    @Test
	    public void test407() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test407");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder12 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder12);
	    }

	    @Test
	    public void test408() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test408");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        invoiceCriteria8.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ))");
	        invoiceCriteria8.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	    }

	    @Test
	    public void test409() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test409");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder4.build();
	        invoiceCriteria5.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!), poNumber = 0)");
	        java.lang.String str8 = invoiceCriteria5.getPoNumber();
	        java.lang.String str9 = invoiceCriteria5.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!), poNumber = 0)" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!), poNumber = 0)");
	        org.junit.Assert.assertNull(str9);
	    }

	    @Test
	    public void test410() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test410");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str2 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria9 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria10 = wildcardClassInvoiceCriteriaBuilder0.build();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str2, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	        org.junit.Assert.assertNotNull(invoiceCriteria9);
	        org.junit.Assert.assertNotNull(invoiceCriteria10);
	    }

	    @Test
	    public void test411() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test411");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        java.lang.String str6 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder12 = invoiceCriteriaBuilder4.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria13 = invoiceCriteriaBuilder12.build();
	        java.lang.Class<?> wildcardClass14 = invoiceCriteriaBuilder12.getClass();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder12);
	        org.junit.Assert.assertNotNull(invoiceCriteria13);
	        org.junit.Assert.assertNotNull(wildcardClass14);
	    }

	    @Test
	    public void test412() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test412");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        java.lang.String str4 = invoiceCriteria3.getPoNumber();
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = null)");
	        java.lang.Class<?> wildcardClass7 = invoiceCriteria3.getClass();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertNotNull(wildcardClass7);
	    }

	    @Test
	    public void test413() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test413");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("10");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria4 = invoiceCriteriaBuilder3.build();
	        invoiceCriteria4.setPoNumber("10");
	        java.lang.String str7 = invoiceCriteria4.getPoNumber();
	        invoiceCriteria4.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = )");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteria4);
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
	    }

	    @Test
	    public void test414() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test414");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        java.lang.String str5 = invoiceObjectInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))");
	    }

	    @Test
	    public void test415() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test415");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str4 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)" + "'", str4, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	    }

	    @Test
	    public void test416() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test416");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = objInvoiceCriteriaBuilder0.build();
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ))");
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	    }

	    @Test
	    public void test417() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test417");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime4 = null;
	        invoice0.setCreatedAt(offsetDateTime4);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime7 = null;
	        invoice0.setCreatedAt(offsetDateTime7);
	    }

	    @Test
	    public void test418() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test418");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setInvoiceNumber("hi!");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	    }

	    @Test
	    public void test419() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test419");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder7.invoiceNumber("10");
	        java.lang.String str10 = invoiceCriteriaBuilder9.toString();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)" + "'", str10, "InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)");
	    }

	    @Test
	    public void test420() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test420");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        java.lang.String str4 = invoiceCriteria3.getPoNumber();
	        invoiceCriteria3.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = null)");
	        java.lang.String str7 = invoiceCriteria3.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertNull(str7);
	    }

	    @Test
	    public void test421() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test421");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setInvoiceNumber("10");
	        invoiceCriteria1.setInvoiceNumber("");
	        java.lang.String str9 = invoiceCriteria1.getPoNumber();
	        java.lang.String str10 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
	        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
	    }

	    @Test
	    public void test422() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test422");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder2.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria6 = invoiceCriteriaBuilder5.build();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteria6);
	    }

	    @Test
	    public void test423() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test423");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        java.lang.Class<?> wildcardClass9 = invoiceCriteria8.getClass();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(wildcardClass9);
	    }

	    @Test
	    public void test424() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test424");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceCriteriaBuilder4.build();
	        java.lang.Class<?> wildcardClass6 = invoiceCriteria5.getClass();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNotNull(wildcardClass6);
	    }

	    @Test
	    public void test425() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test425");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime2 = null;
	        invoice0.setCreatedAt(offsetDateTime2);
	        java.time.OffsetDateTime offsetDateTime4 = null;
	        invoice0.setCreatedAt(offsetDateTime4);
	        java.time.OffsetDateTime offsetDateTime6 = null;
	        invoice0.setCreatedAt(offsetDateTime6);
	        java.time.OffsetDateTime offsetDateTime8 = null;
	        invoice0.setCreatedAt(offsetDateTime8);
	        java.time.OffsetDateTime offsetDateTime10 = null;
	        invoice0.setCreatedAt(offsetDateTime10);
	        java.time.OffsetDateTime offsetDateTime12 = null;
	        invoice0.setCreatedAt(offsetDateTime12);
	        java.time.OffsetDateTime offsetDateTime14 = null;
	        invoice0.setCreatedAt(offsetDateTime14);
	    }

	    @Test
	    public void test426() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test426");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria6 = invoiceCriteriaBuilder4.build();
	        invoiceCriteria6.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = null)");
	        java.lang.String str9 = invoiceCriteria6.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteria6);
	        org.junit.Assert.assertNull(str9);
	    }

	    @Test
	    public void test427() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test427");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str2 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder8.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null), poNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null))");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str2, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	    }

	    @Test
	    public void test428() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test428");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder5.invoiceNumber("");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	    }

	    @Test
	    public void test429() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test429");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria9 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria10 = invoiceCriteriaBuilder7.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder12 = invoiceCriteriaBuilder7.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder14 = invoiceCriteriaBuilder12.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder16 = invoiceCriteriaBuilder12.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)");
	        java.lang.String str17 = invoiceCriteriaBuilder12.toString();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteria9);
	        org.junit.Assert.assertNotNull(invoiceCriteria10);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder12);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder14);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder16);
	        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null), poNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null))" + "'", str17, "InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null), poNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null))");
	    }

	    @Test
	    public void test430() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test430");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        java.lang.String str6 = invoiceCriteria5.getPoNumber();
	        java.lang.String str7 = invoiceCriteria5.getInvoiceNumber();
	        java.lang.String str8 = invoiceCriteria5.getInvoiceNumber();
	        java.lang.String str9 = invoiceCriteria5.getPoNumber();
	        java.lang.String str10 = invoiceCriteria5.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertNull(str6);
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
	        org.junit.Assert.assertNull(str9);
	        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
	    }

	    @Test
	    public void test431() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test431");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        invoiceCriteria3.setPoNumber("10");
	        java.lang.String str6 = invoiceCriteria3.getPoNumber();
	        invoiceCriteria3.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = null)");
	        java.lang.String str9 = invoiceCriteria3.getPoNumber();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
	        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
	    }

	    @Test
	    public void test432() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test432");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        java.lang.String str9 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder11 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder13 = invoiceCriteriaBuilder11.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = )");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str9, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder11);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder13);
	    }

	    @Test
	    public void test433() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test433");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        invoiceCriteria2.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = ), poNumber = null)");
	        invoiceCriteria2.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	    }

	    @Test
	    public void test434() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test434");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceCriteriaBuilder2.poNumber("");
	        java.lang.String str5 = invoiceCriteriaBuilder4.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder4.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria8 = invoiceCriteriaBuilder4.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder10 = invoiceCriteriaBuilder4.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder12 = invoiceCriteriaBuilder10.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder14 = invoiceCriteriaBuilder12.poNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )" + "'", str5, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteria8);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder10);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder12);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder14);
	    }

	    @Test
	    public void test435() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test435");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.model.Invoice> invoiceInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = invoiceInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = invoiceInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria4 = invoiceCriteriaBuilder3.build();
	        invoiceCriteria4.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = 10)");
	        org.junit.Assert.assertNotNull(invoiceInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteria4);
	    }

	    @Test
	    public void test436() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test436");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        invoiceCriteria3.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	    }

	    @Test
	    public void test437() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test437");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder7 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder9 = invoiceCriteriaBuilder3.invoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria10 = invoiceCriteriaBuilder9.build();
	        java.lang.Class<?> wildcardClass11 = invoiceCriteriaBuilder9.getClass();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder7);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder9);
	        org.junit.Assert.assertNotNull(invoiceCriteria10);
	        org.junit.Assert.assertNotNull(wildcardClass11);
	    }

	    @Test
	    public void test438() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test438");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = invoiceObjectInvoiceCriteriaBuilder0.invoiceNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria5 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        java.lang.String str6 = invoiceObjectInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder8 = invoiceObjectInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )))");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteria5);
	        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = , poNumber = null)" + "'", str6, "InvoiceCriteriaBuilder(invoiceNumber = , poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder8);
	    }

	    @Test
	    public void test439() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test439");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime3 = null;
	        invoice0.setCreatedAt(offsetDateTime3);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime10 = null;
	        invoice0.setCreatedAt(offsetDateTime10);
	    }

	    @Test
	    public void test440() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test440");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Object> objInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = objInvoiceCriteriaBuilder0.poNumber("");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = objInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria4 = objInvoiceCriteriaBuilder0.build();
	        java.lang.String str5 = invoiceCriteria4.getInvoiceNumber();
	        invoiceCriteria4.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 0, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        java.lang.String str8 = invoiceCriteria4.getInvoiceNumber();
	        java.lang.String str9 = invoiceCriteria4.getPoNumber();
	        org.junit.Assert.assertNotNull(objInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNotNull(invoiceCriteria4);
	        org.junit.Assert.assertNull(str5);
	        org.junit.Assert.assertNull(str8);
	        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = 0, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))" + "'", str9, "InvoiceCriteriaBuilder(invoiceNumber = 0, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	    }

	    @Test
	    public void test441() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test441");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        java.time.OffsetDateTime offsetDateTime1 = null;
	        invoice0.setCreatedAt(offsetDateTime1);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime5 = null;
	        invoice0.setCreatedAt(offsetDateTime5);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime9 = null;
	        invoice0.setCreatedAt(offsetDateTime9);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime12 = null;
	        invoice0.setCreatedAt(offsetDateTime12);
	        invoice0.prePersist();
	    }

	    @Test
	    public void test442() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test442");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("hi!");
	        java.lang.String str4 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	        java.lang.String str9 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = , poNumber = null)");
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)" + "'", str9, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)");
	    }

	    @Test
	    public void test443() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test443");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.common.Defaults> defaultsInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = defaultsInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = defaultsInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        org.junit.Assert.assertNotNull(defaultsInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	    }

	    @Test
	    public void test444() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test444");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("");
	        java.lang.Class<?> wildcardClass4 = invoiceCriteria1.getClass();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(wildcardClass4);
	    }

	    @Test
	    public void test445() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test445");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.reflect.Type> typeInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.Class<?> wildcardClass1 = typeInvoiceCriteriaBuilder0.getClass();
	        org.junit.Assert.assertNotNull(typeInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(wildcardClass1);
	    }

	    @Test
	    public void test446() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test446");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setInvoiceNumber("10");
	        java.lang.String str7 = invoiceCriteria1.getPoNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ), poNumber = )");
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
	    }

	    @Test
	    public void test447() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test447");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime2 = null;
	        invoice0.setCreatedAt(offsetDateTime2);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime5 = null;
	        invoice0.setCreatedAt(offsetDateTime5);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime10 = null;
	        invoice0.setCreatedAt(offsetDateTime10);
	        invoice0.prePersist();
	    }

	    @Test
	    public void test448() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test448");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.poNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = wildcardClassInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = wildcardClassInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = 0, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!))");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria6 = wildcardClassInvoiceCriteriaBuilder0.build();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteria6);
	    }

	    @Test
	    public void test449() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test449");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceCriteria> invoiceCriteriaInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        java.lang.String str1 = invoiceCriteriaInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = invoiceCriteriaInvoiceCriteriaBuilder0.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )), poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str1, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	    }

	    @Test
	    public void test450() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test450");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("");
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = null)");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = )), poNumber = null), poNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null))");
	        invoiceCriteria1.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = hi!, poNumber = null)");
	        java.lang.Class<?> wildcardClass10 = invoiceCriteria1.getClass();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(wildcardClass10);
	    }

	    @Test
	    public void test451() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test451");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setInvoiceNumber("");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
	    }

	    @Test
	    public void test452() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test452");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        java.lang.String str2 = wildcardClassInvoiceCriteriaBuilder0.toString();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder4 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder6 = invoiceCriteriaBuilder4.invoiceNumber("");
	        java.lang.String str7 = invoiceCriteriaBuilder6.toString();
	        java.lang.String str8 = invoiceCriteriaBuilder6.toString();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria9 = invoiceCriteriaBuilder6.build();
	        java.lang.String str10 = invoiceCriteria9.getPoNumber();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)" + "'", str2, "InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder4);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder6);
	        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = , poNumber = null)" + "'", str7, "InvoiceCriteriaBuilder(invoiceNumber = , poNumber = null)");
	        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InvoiceCriteriaBuilder(invoiceNumber = , poNumber = null)" + "'", str8, "InvoiceCriteriaBuilder(invoiceNumber = , poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceCriteria9);
	        org.junit.Assert.assertNull(str10);
	    }

	    @Test
	    public void test453() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test453");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime2 = null;
	        invoice0.setCreatedAt(offsetDateTime2);
	        java.time.OffsetDateTime offsetDateTime4 = null;
	        invoice0.setCreatedAt(offsetDateTime4);
	        invoice0.prePersist();
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime8 = null;
	        invoice0.setCreatedAt(offsetDateTime8);
	        java.time.OffsetDateTime offsetDateTime10 = null;
	        invoice0.setCreatedAt(offsetDateTime10);
	        java.lang.Class<?> wildcardClass12 = invoice0.getClass();
	        org.junit.Assert.assertNotNull(wildcardClass12);
	    }

	    @Test
	    public void test454() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test454");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder2 = wildcardClassInvoiceCriteriaBuilder0.invoiceNumber("hi!");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria3 = invoiceCriteriaBuilder2.build();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder2);
	        org.junit.Assert.assertNotNull(invoiceCriteria3);
	    }

	    @Test
	    public void test455() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test455");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.Class<?>> wildcardClassInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = wildcardClassInvoiceCriteriaBuilder0.build();
	        invoiceCriteria1.setPoNumber("10");
	        java.lang.String str4 = invoiceCriteria1.getInvoiceNumber();
	        invoiceCriteria1.setPoNumber("InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = ))");
	        java.lang.Class<?> wildcardClass7 = invoiceCriteria1.getClass();
	        org.junit.Assert.assertNotNull(wildcardClassInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNull(str4);
	        org.junit.Assert.assertNotNull(wildcardClass7);
	    }

	    @Test
	    public void test456() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test456");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<java.lang.invoke.TypeDescriptor> typeDescriptorInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = typeDescriptorInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder3 = typeDescriptorInvoiceCriteriaBuilder0.poNumber("10");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder invoiceCriteriaBuilder5 = invoiceCriteriaBuilder3.poNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = InvoiceCriteriaBuilder(invoiceNumber = null, poNumber = hi!)), poNumber = null)");
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria6 = invoiceCriteriaBuilder5.build();
	        java.lang.String str7 = invoiceCriteria6.getPoNumber();
	        org.junit.Assert.assertNotNull(typeDescriptorInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder3);
	        org.junit.Assert.assertNotNull(invoiceCriteriaBuilder5);
	        org.junit.Assert.assertNotNull(invoiceCriteria6);
	        org.junit.Assert.assertNull(str7);
	    }

	    @Test
	    public void test457() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test457");
	        com.invoice.system.model.Invoice invoice0 = new com.invoice.system.model.Invoice();
	        java.time.OffsetDateTime offsetDateTime1 = null;
	        invoice0.setCreatedAt(offsetDateTime1);
	        invoice0.prePersist();
	        java.time.OffsetDateTime offsetDateTime4 = null;
	        invoice0.setCreatedAt(offsetDateTime4);
	        java.time.OffsetDateTime offsetDateTime6 = null;
	        invoice0.setCreatedAt(offsetDateTime6);
	        java.time.OffsetDateTime offsetDateTime8 = null;
	        invoice0.setCreatedAt(offsetDateTime8);
	    }

	    @Test
	    public void test458() throws Throwable {
	        if (debug)
	            System.out.format("%n%s%n", "RegressionTest0.test458");
	        com.invoice.system.service.InvoiceCriteria.InvoiceCriteriaBuilder<com.invoice.system.service.InvoiceObject> invoiceObjectInvoiceCriteriaBuilder0 = com.invoice.system.service.InvoiceCriteria.builder();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria1 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        com.invoice.system.service.InvoiceCriteria invoiceCriteria2 = invoiceObjectInvoiceCriteriaBuilder0.build();
	        invoiceCriteria2.setPoNumber("0");
	        java.lang.String str5 = invoiceCriteria2.getInvoiceNumber();
	        invoiceCriteria2.setPoNumber("0");
	        invoiceCriteria2.setInvoiceNumber("InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = ), poNumber = InvoiceCriteriaBuilder(invoiceNumber = 10, poNumber = )), poNumber = null)");
	        org.junit.Assert.assertNotNull(invoiceObjectInvoiceCriteriaBuilder0);
	        org.junit.Assert.assertNotNull(invoiceCriteria1);
	        org.junit.Assert.assertNotNull(invoiceCriteria2);
	        org.junit.Assert.assertNull(str5);
	    }

}
