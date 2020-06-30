package edu.neu.ccs.cs5004.household;

/**
 * A class representing a Household product: Shampoo.
 */
public class Shampoo extends Household {

  /**
   * Constructs a Shampoo object given the parameters.
   *
   * @param manufacturerName the name of the manufacturer
   * @param productName the name of the product
   * @param price the cost of the product, represented as a Double
   * @param minimumAge the required age to purchase the product
   * @param units the amount of items per package (i.e. 2 Shampoo products per purchase)
   */
  public Shampoo(String manufacturerName, String productName,
      Double price, Integer minimumAge, Integer units) {
    super(manufacturerName, productName, price, minimumAge, units);
  }
}
