package problem2;

/**
 * A class representing an email for the cardholder */
public class Email {
  private String email;

  /**
   * Constructs a new email object for the cardholder
   * @param email - a new email represented as a String
   */
  public Email(String email) {
    this.email = email;
  }

  /**
   * Returns the email corresponding with the cardholder
   * @return - the email corresponding with the gift cardholder, represented as a String
   */
  public String getEmail() {
    return this.email;
  }
}
