package edu.neu.ccs.cs5004.grocery;

import edu.neu.ccs.cs5004.Products;

/**
 * A class for all Grocery products.
 */
public class Grocery extends Products {

  private Double weight;

  /**
   * Constructs a Product object given the parameters.
   *
   * @param manufacturerName the name of the manufacturer
   * @param productName the name of the product
   * @param price the cost of the product, represented as a Double
   * @param minimumAge the required age to purchase the product
   * @param weight the weight of the grocery product in ounces
   */
  public Grocery(String manufacturerName, String productName,
      Double price, Integer minimumAge, Double weight) {
    super(manufacturerName, productName, price, minimumAge);
    this.weight = weight;
  }

  /**
   * Gets the weight of the grocery product.
   *
   * @return the weight
   */
  public Double getWeight() {
    return weight;
  }
}
