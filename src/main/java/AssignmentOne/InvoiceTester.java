package AssignmentOne;

/**
 * A class to test the Invoice system
 * <pre>
 * Invoice System
 * Build three objects (Product, LineItem and Invoice) to represent a simple invoice. Create an Invoice
 * Tester application which can be used to play with invoices. In the test class create products and print out
 * their values – test for edge cases with negative numbers. Create LineItem and an Invoice and print out
 * the details of each. The details for each class are outlined in the following sections.
 * </pre>
 */
public class InvoiceTester {
    public static void main(String[] args) {
        System.out.println("Invoice System!");

        //TEST 1: Create objects for Product, LineItem and Invoice
        LineItem lineItem1 = new LineItem(new Product(1, "Laptop", 799.99), 2);
        LineItem lineItem2 = new LineItem(new Product(2, "Soup", 9.99), 6);
        LineItem lineItem3 = new LineItem(new Product(3, "Monitor", 249.56), 3);

        Invoice invoice = new Invoice(lineItem1, lineItem2, lineItem3);

        //TEST 2: print out an invoice
        LineItemTester.LineItemInfo(invoice.getLineItem(1));
        LineItemTester.LineItemInfo(invoice.getLineItem(2));
        LineItemTester.LineItemInfo(invoice.getLineItem(3));
        System.out.printf("\nInvoice total: %.2f", invoice.getInvoiceTotal());

        //SET
        invoice.setLineItem(1, lineItem2);
        LineItemTester.LineItemInfo(invoice.getLineItem(1));
        LineItemTester.LineItemInfo(invoice.getLineItem(2));
        LineItemTester.LineItemInfo(invoice.getLineItem(3));


    }
}
