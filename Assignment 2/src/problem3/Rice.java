package problem3;

/**
 * A class representing Rice of the NonPerishable food item group. This class inherits from the
 * non perishable food class since it has a "is-a" relationship. Rice "IS-A" non-perishable food,
 * so for that reason it inherits the traits. */
public class Rice extends NonPerishable {

  /**
   * Constructs a new rice object and initializes it given the name, current price per unit,
   * current available quantity, maximum allowed quantity, order date, and expiration date.
   * @param name the name of the non perishable food
   * @param currentPricePerUnit the current price of the non perishable food
   * @param currentAvailableQuantity the current available quantity to purchase
   * @param maximumAllowedQuantity the maximum allowed quantity to purchase at once
   */
  public Rice(Name name, Integer currentPricePerUnit, Integer currentAvailableQuantity,
      Integer maximumAllowedQuantity) {
    super(name, currentPricePerUnit, currentAvailableQuantity, maximumAllowedQuantity);
  }
}
