package edu.neu.ccs.cs5004.grocery;

import edu.neu.ccs.cs5004.exceptions.AgeRestrictionException;

/**
 * A class for a Grocery product: Beer.
 */
public class Beer extends Grocery {

  private static final Integer MINIMUM_AGE = 21;

  /**
   * Constructs a new Beer object given the parameters.
   *
   * @param manufacturerName the name of the manufacturer
   * @param productName the name of the product
   * @param price the price of the product
   * @param minimumAge the minimum age for the product (in this case it is 21 for alcohol)
   * @param weight the weight of the product in ounces
   * @throws AgeRestrictionException thrown if the purchaser is less than 21 years old
   */
  public Beer(String manufacturerName, String productName, Double price,
      Integer minimumAge, Double weight) throws AgeRestrictionException {
    super(manufacturerName, productName, price, minimumAge, weight);
    checkAge(minimumAge);
  }

  /**
   * Checks that the minimum age is satisfied.
   *
   * @param age the age of the purchaser
   * @return true if the age is greater than or equal to the minimum age (21)
   * @throws AgeRestrictionException thrown if the the purchaser is not the legal age
   */
  private Boolean checkAge(Integer age) throws AgeRestrictionException {
    if (age >= MINIMUM_AGE) {
      return true;
    } else {
      throw new AgeRestrictionException("To purchase alcohol you must be 21 or older!");
    }
  }
}
