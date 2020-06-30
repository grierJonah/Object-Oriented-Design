package edu.neu.ccs.cs5004;

/**
 * A class for all products.
 */
public class Products {

  private String manufacturerName;
  private String productName;
  private Double price;
  private Integer minimumAge;

  /**
   * Constructs a Product object given the parameters.
   *
   * @param manufacturerName the name of the manufacturer
   * @param productName the name of the product
   * @param price the cost of the product, represented as a Double
   * @param minimumAge the required age to purchase the product
   */
  public Products(String manufacturerName, String productName, Double price, Integer minimumAge) {
    this.manufacturerName = manufacturerName;
    this.productName = productName;
    this.price = price;
    this.minimumAge = minimumAge;
  }

  /**
   * Gets the manufacturers name.
   *
   * @return the name of the manufacturer
   */
  public String getManufacturersName() {
    return manufacturerName;
  }


  /**
   * Gets the product name.
   *
   * @return the name of the product
   */
  public String getProductName() {
    return productName;
  }

  /**
   * Gets the price of the product.
   *
   * @return the price
   */
  public Double getPrice() {
    return price;
  }

  /**
   * Gets the minimum age to purchase the product.
   *
   * @return the minimum age
   */
  public Integer getMinimumAge() {
    return minimumAge;
  }
}
