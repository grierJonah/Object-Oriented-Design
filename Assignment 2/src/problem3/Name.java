package problem3;

/**
 * A class representing a name of food. The name only takes 1 parameter */
public class Name {
  private String name;

  /**
   * Constructs a name and initializes it to the specified name
   * @param name the name of perishable or non perishable food
   */
  public Name(String name) {
    this.name = name;
  }

  /**
   * Gets the name of the food item
   * @return the name of the food item
   */
  public String getName() {
    return this.name;
  }
}
