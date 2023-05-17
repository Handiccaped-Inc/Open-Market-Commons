package co.unicauca.openmarket.commons.domain;

/**
 *
 * @author Libardo Pantoja, Julio A. Hurtado
 */
public class Category {

    private Long categoryId;
    private String name;

    /**
     * Constructor of the class
     * 
     * @param categoryId id of the category
     * @param name       name of the category
     */
    public Category(Long categoryId, String name) {
        this.categoryId = categoryId;
        this.name = name;
    }

    /**
     * Default constructor of the class
     */
    public Category() {
    }

    /**
     * Returns the category id
     * 
     * @return the cathegory id
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the category id
     * 
     * @param categoryId
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * Returns the category name
     * 
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the category name
     * 
     * @param name the category name
     */
    public void setName(String name) {
        this.name = name;
    }

}
