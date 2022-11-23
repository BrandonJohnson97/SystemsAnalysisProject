package AssignmentOne;

/**
 * A Class to test the LineItems class
 */
public class LineItemTester {
    public static void main(String[] args) {
        System.out.println("LineItem Tester");

        //TEST 1 : Create object
        LineItem lineItem = new LineItem(new Product(2, "Shower", -1299.99), -2);
        LineItemInfo(lineItem);

    }

    public static void LineItemInfo(LineItem lineItem) {
        System.out.printf("\nID: %d\t Description: %s\t Unit Price: $%.2f\t Quantity: %d\t Price: $%.2f", lineItem.getProduct().getId(), lineItem.getProduct().getDescription(),
                lineItem.getProduct().getPrice(),lineItem.getQuantity(),lineItem.getTotal());
    }
}
