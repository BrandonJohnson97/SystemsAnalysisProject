package AssignmentOne;

/**
 * A class that creates a LineItem object from a Product and quantity
 * <pre>
 * Create a class called LineItem that has two attributes: product (Product class above) and quantity (int).
 * Create getter and setters and a constructor. Create a method called getTotal() which calculates the total
 * based on product price and quantity. Don’t let quantity be negative.
 * College of the North Atlantic
 * CP2280 – Object Oriented Programming in Java
 * Assignment 1
 * </pre>
 *
 * @author 20168209
 */

public class LineItem {
    private Product product;
    private int quantity;

    /**
     * Gets the LineItem
     * @param product - Product, gets the product object
     * @param quantity - Int, gets the quantity if greater than 0
     */
    public LineItem(Product product, int quantity) {
        this.product = product;
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    /**
     * Get the Product Object from the product class
     *
     * @return product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Set a new product Object from the Product class
     *
     * @param product
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Get the quantity from LineItem
     *
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Set the LineItem quantity
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Get the total of the quantity of the product but multiply quantity by product price
     *
     * @return Price of product * quantity
     */
    public double getTotal() {
        return product.getPrice() * quantity;
    }
}
