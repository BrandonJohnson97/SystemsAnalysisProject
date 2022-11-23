package AssignmentOne;

/**
 * A class that creates a Product object from an id, description and price
 * <pre>
 * Create a class called Product which has three attributes: id (int), description (String) and price (double).
 * Create a constructor that takes in all three attributes and create a getter and setter for each. Don’t let the id attribute or the price be negative.
 * </pre>
 *
 *  * @author 20168209
 */
public class Product {

    private int id;
    private String description;
    private double price;

    /**
     * Gets the product
     * @param id - Int, Gets the ID if greater than 0
     * @param description - String, Gets the description
     * @param price - double, Gets the price
     */
    public Product(int id, String description, double price) {
        this.description = description;
        if (id > 0 && price > 0) {
            this.id = id;
            this.price = price;
        }
    }

    /**
     * Get Products ID
     *
     * @return ID
     */
    public int getId() {
        return this.id;
    }

    /**
     * Set products ID
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get Description of Product
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the Description of the Product
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * If the price is greater than 0 return the price, if not return 0.00
     * @return Price
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Set the price of the Product
     *
     * @param newPrice
     */
    public void setPrice(double newPrice) {
        if (newPrice > 0) {
            price = newPrice;
        } else {
            price = 0.0;
        }
    }
}
