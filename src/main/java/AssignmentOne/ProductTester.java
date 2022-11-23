package AssignmentOne;

/**
 * A class to test the Products Class
 */
public class ProductTester {
    public static void main(String[] args) {
        System.out.println("PRODUCT TESTER");

        //TEST 1 : Create object
        Product product = new Product(1, "bag", 99.99);
        ProductTesterInfo(product);

        product.setPrice(-109.64);
        ProductTesterInfo(product);
    }

    public static void ProductTesterInfo(Product product) {
        System.out.printf("\nID: %d \t%s \t$%.2f", product.getId(), product.getDescription(), product.getPrice());
    }
}
