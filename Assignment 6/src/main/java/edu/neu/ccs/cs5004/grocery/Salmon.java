package edu.neu.ccs.cs5004.grocery;

/**
 * A class representing a Household product: Salmon.
 */
public class Salmon extends Grocery {

  /**
   * Constructs a Shampoo object given the parameters.
   *
   * @param manufacturerName the name of the manufacturer
   * @param productName the name of the product
   * @param price the cost of the product, represented as a Double
   * @param minimumAge the required age to purchase the product
   * @param weight the weight of the salmon in ounces
   */
  public Salmon(String manufacturerName, String productName,
      Double price, Integer minimumAge, Double weight) {
    super(manufacturerName, productName, price, minimumAge, weight);
  }
}