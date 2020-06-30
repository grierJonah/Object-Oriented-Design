package edu.neu.ccs.cs5004.grocery;

/**
 * A class for a Grocery product: Cheese.
 */
public class Cheese extends Grocery {

  /**
   * Constructs a Shampoo object given the parameters.
   *
   * @param manufacturerName the name of the manufacturer
   * @param productName the name of the product
   * @param price the cost of the product, represented as a Double
   * @param minimumAge the required age to purchase the product
   * @param weight the weight of the product in ounces
   */
  public Cheese(String manufacturerName, String productName,
      Double price, Integer minimumAge, Double weight) {
    super(manufacturerName, productName, price, minimumAge, weight);
  }
}
