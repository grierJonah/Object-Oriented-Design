package problem3;

/**
 * A class representing a vegetable of the perishable food item group. This class inherits from the
 * perishable food class since it has a "is-a" relationship. A vegetable "IS-A" perishable food, so
 * for that reason it inherits the traits. */
public class Vegetable extends Perishable {

  /**
   * Constructs a new vegetable object and initializes it given the name, current price per unit,
   * current available quantity, maximum allowed quantity, order date, and expiration date.
   * @param name the name of the perishable food
   * @param currentPricePerUnit the current price of the perishable food
   * @param currentAvailableQuantity the current available quantity to purchase
   * @param maximumAllowedQuantity the maximum allowed quantity to purchase at once
   * @param orderDate the order date of the purchase
   * @param expirationDate the expiration date the food expires
   */
  public Vegetable(Name name, Integer currentPricePerUnit, Integer currentAvailableQuantity,
      Integer maximumAllowedQuantity, Integer orderDate, Integer expirationDate) {
    super(name, currentPricePerUnit, currentAvailableQuantity, maximumAllowedQuantity, orderDate,
        expirationDate);
  }
}
