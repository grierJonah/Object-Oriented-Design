package edu.neu.ccs.cs5004.household;

import edu.neu.ccs.cs5004.Products;

/**
 * A class for all Household products.
 */
public class Household extends Products {

  private Integer units;

  /**
   * Constructs a household product given the parameters.
   *
   * @param manufacturerName the name of the manufacturer
   * @param productName the name of the product
   * @param price the cost of the household product, represented as a Double
   * @param minimumAge the minimum age to buy the product
   * @param units the number of units each household product sells in
   */
  public Household(String manufacturerName, String productName,
      Double price, Integer minimumAge, Integer units) {
    super(manufacturerName, productName, price, minimumAge);
    this.units = units;
  }

  /**
   * Gets the quantity each household product is sold in (i.e. PaperTowels could have 2 in each
   * sleeve).
   *
   * @return the number of units within one purchase
   */
  public Integer getUnits() {
    return units;
  }
}
