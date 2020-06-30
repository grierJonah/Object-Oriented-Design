package problem2;

/**
 * A class representing the balance of the gift card */
public class Balance {
  private Integer dollars;
  private Integer cents;
  private Integer minDollars = 0;
  private Integer minCents = 0;
  private Integer maxCents = 99;
  private Balance Balance;

  /**
   * Constructs a new balance object with a dollars and cents amount. The dollar amount must be
   * greater than 0, and the cents amount must be greater than 0 but less than 99. If entered
   * incorrectly, user will get a message and no new balance object will be created.
   * @param dollars the amount of dollars
   * @param cents the amount of cents
   */
  public Balance(Integer dollars, Integer cents) {
    if (dollars > minDollars || cents >= minCents && cents <= maxCents) {
      this.dollars = dollars;
      this.cents = cents;
    } else {
      System.out.println("Incorrect entry, dollar amount must be greater than 0 " +
              "and cents amount must be between 0 and 99.");
    }
  }

  /**
   * Returns the dollars inside the balance
   * @return the dollars inside the balance
   */
  public Integer getDollars() {
    return this.dollars;
  }

  /**
   * Returns the cents inside the balance
   * @return the cents inside the balance
   */
  public Integer getCents() {
    return this.cents;
  }
}
