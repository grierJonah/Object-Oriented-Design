package edu.neu.ccs.cs5004.problem1;

/**
 * A class representing a Name object. The name takes a first and last in order to be instantiated
 * correctly.
 */
public class Name {

  protected String firstName;
  protected String lastName;

  /**
   * Constructs a Name object with the given parameters.
   *
   * @param firstName the first name of the object.
   * @param lastName the last name of the object.
   */
  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * Gets the first name of the object.
   *
   * @return the first name
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Sets the first name of the object.
   *
   * @param firstName the first name of the object, represented as a String.
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Gets the last name of the object.
   *
   * @return the last name of the object.
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Sets the last name of the object.
   *
   * @param lastName the last name of the object, represented as a String.
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
