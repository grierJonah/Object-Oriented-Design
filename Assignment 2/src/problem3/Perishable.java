package problem3;

/**
 * A class representing Perishable foods. This class inherits from Food Items since it has a
 * "is-a" relationship. Additionally, Perishable foods have their own order and expiration date,
 * represented as Integer's from the day of purchase (May 15th, 2019). For example, if the
 * expiration date says 92, it means that in 92 days from May 15th the perishable food item will
 * expire. */
public class Perishable extends FoodItems {
  private Integer orderDate;
  private Integer expirationDate;
  private static final Integer MAX_ALLOWED_PERISHABLE_QUANTITY = 100;

  /**
   * Constructs a new perishable food object and initializes it given the name,
   * current price per unit, current available quantity, maximum allowed quantity,
   * order date, and expiration date.
   * @param name the name of this perishable food item
   * @param currentPricePerUnit the current price per unit of the perishable food item
   * @param currentAvailableQuantity the current available quantity of the perishable food
   * @param MAX_ALLOWED_PERISHABLE_QUANTITY the maximum allowed quantity of the perishable food
   * @param orderDate the order date of the perishable food
   * @param expirationDate the expiration date of the perishable food
   */
  public Perishable(Name name, Integer currentPricePerUnit, Integer currentAvailableQuantity,
      Integer MAX_ALLOWED_PERISHABLE_QUANTITY, Integer orderDate, Integer expirationDate) {
    super(name, currentPricePerUnit, currentAvailableQuantity, MAX_ALLOWED_PERISHABLE_QUANTITY);
    this.orderDate = orderDate;
    this.expirationDate = expirationDate;
  }

  /**
   * Gets the order date of the perishable food
   * @return the order date of the perishable food
   */
  public Integer getOrderDate() {
    return this.orderDate;
  }

  /**
   * Gets the expiration date of the perishable food
   * @return the expiration date of the perishable food
   */
  public Integer getExpirationDate() {
    return this.expirationDate;
  }
}
