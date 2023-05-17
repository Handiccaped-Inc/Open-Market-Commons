package co.unicauca.openmarket.commons.domain;

/**
 *
 * @author Libardo, Julio
 */
public class Product {

    private Long productId;

    private String name;

    private String description;

    private double price;

    private Category category;

    private Location location;

    private User user;

    /**
     * Constructor of the class
     * 
     * @param productId   the id of the product
     * @param name        the name of the product
     * @param description the description of the product
     * @param price       the price of the product
     */
    public Product(Long productId, String name, String description, double price) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Default constructor
     */
    public Product() {
    }

    /**
     * Returns the id
     * 
     * @return the product id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the id
     * 
     * @param productId the product id
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * Returns the name
     * 
     * @return the name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name
     * 
     * @param name the name of the product
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the description
     * 
     * @return the description of the product
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description
     * 
     * @param description the description of the product
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The getPrice function returns the price of a given item.
     * 
     *
     *
     * @return The price of the item
     *
     */
    public double getPrice() {
        return price;
    }

    /**
     * The setPrice function sets the price of a product.
     * 
     *
     * @param double price Set the price of the item
     *
     * @return Nothing
     *
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * The getCategory function returns the category of a product.
     * 
     *
     *
     * @return The category object
     *
     */
    public Category getCategory() {
        return category;
    }

    /**
     * The setCategory function sets the category of a product.
     * 
     *
     * @param Category category Set the category of a product
     *
     * @return Void, so it returns nothing
     *
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * The getLocation function returns the location of the object.
     * 
     *
     *
     * @return The location of the object
     *
     */
    public Location getLocation() {
        return location;
    }

    /**
     * The setLocation function sets the location of a given object.
     * 
     *
     * @param Location location Set the location of the object
     *
     * @return A void, so it doesn't return anything
     *
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Returns the user
     * 
     * @return the user of the product
     */
    public User getUser() {
        return user;
    }

    /**
     * The setUser function sets the user variable to a new User object.
     * 
     *
     * @param User user Set the user object
     *
     * @return Void, so it doesn't return anything
     *
     */
    public void setUser(User user) {
        this.user = user;
    }

}
