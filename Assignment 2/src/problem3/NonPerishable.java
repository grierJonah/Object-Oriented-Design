package problem3;

/**
 * A class representing NonPerishable foods. This class inherits from Food Items since it has a
 * "is-a" relationship. */
public class NonPerishable extends FoodItems {
  private static final Integer MAX_ALLOWED_NONPERISHABLE_QUANTITY = 250;

  /**
   * Constructs a new NonPerishable food object and initializes it given the name,
   * current price per unit, current available quantity, maximum allowed quantity,
   * order date, and expiration date.
   * @param name the name of this non perishable food item
   * @param currentPricePerUnit the current price per unit of the non perishable food item
   * @param currentAvailableQuantity the current available quantity of the non perishable food
   * @param MAX_ALLOWED_NONPERISHABLE_QUANTITY the maximum allowed quantity for non perishable food
   */
  public NonPerishable(Name name, Integer currentPricePerUnit, Integer currentAvailableQuantity,
      Integer MAX_ALLOWED_NONPERISHABLE_QUANTITY) {
    super(name, currentPricePerUnit, currentAvailableQuantity, MAX_ALLOWED_NONPERISHABLE_QUANTITY);
  }
}
