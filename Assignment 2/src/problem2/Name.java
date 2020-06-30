package problem2;

/**
 * A class representing the name for the gift card given the first and last
 * name */
public class Name {
  private String firstName;
  private String lastName;

  /**
   * Constructs a new name object with the first and last name, represented as Strings
   * @param firstName the first name of the gift cardholder
   * @param lastName the last name of the gift cardholder
   */
  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * Returns the first name of the gift card holder
   * @return - the first name of the gift card holder, represented as a String
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Returns the gift card holder's last name
   * @return - gift card holder's last name, represented as a String
   */
  public String getLastName() {
    return this.lastName;
  }
}
