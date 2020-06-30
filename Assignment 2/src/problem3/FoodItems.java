package problem3;

/**
 * A class representing the food items of the food ordering service. This class
 */
public class FoodItems {
  private Name name;
  private Integer currentPricePerUnit;
  private Integer currentAvailableQuantity;
  private Integer maximumAllowedQuantity;

  public FoodItems(Name name, Integer currentPricePerUnit, Integer currentAvailableQuantity,
      Integer maximumAllowedQuantity) {
    this.name = name;
    this.currentPricePerUnit = currentPricePerUnit;
    this.currentAvailableQuantity = currentAvailableQuantity;
    this.maximumAllowedQuantity = maximumAllowedQuantity;
  }

  /**
   * Gets the name of the current food item
   * @return the name of the food item
   */
  public String getName() {
    return name.getName();
  }

  /**
   * Gets the current price per unit of the food item
   * @return the current price per unit of the food item
   */
  public Integer getCurrentPricePerUnit() {
    return this.currentPricePerUnit;
  }

  /**
   * Gets the current available quantity of the food item
   * @return the current available quantity of the food item
   */
  public Integer getCurrentAvailableQuantity() {
    return this.currentAvailableQuantity;
  }

  /**
   * Gets the maximum allowed quantity of the food item
   * @return the maximum allowed quantity
   */
  public Integer getMaximumAllowedQuantity() {
    return this.maximumAllowedQuantity;
  }
}
