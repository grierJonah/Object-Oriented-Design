package problem2;

/**
 * A class representing depositing money into an account. The deposit is made up of a dollar amount
 * a cents amount, a name, and a cardnumber. The deposit must have these attributes in order to
 * correctly deposit.
 */
public class Deposit {
  private Integer dollarAmount;
  private Integer centsAmount;
  private Name name;
  private CardNumber cardNumber;

  /**
   * Construct a new deposit object with a dollar amount, cents amount, users name, and their
   * card number
   * @param dollarAmount the dollar amount to be deposited
   * @param centsAmount the cents amount to be deposited
   * @param name the name of the account
   * @param cardNumber the card number of the account
   */
  public Deposit(Integer dollarAmount, Integer centsAmount, Name name, CardNumber cardNumber) {
    this.dollarAmount = dollarAmount;
    this.centsAmount = centsAmount;
    this.name = name;
    this.cardNumber = cardNumber;
  }

  /**
   * Returns the dollar amount to be deposited
   * @return dollar amount to be deposited
   */
  public Integer getDollarAmount() {
    return this.dollarAmount;
  }

  /**
   * Returns the cents amount to be deposited
   * @return cents amount to be deposited
   */
  public Integer getCentsAmount() {
    return this.centsAmount;
  }

  /**
   * Returns the first name associated with the deposit
   * @return the first name associated with the deposit
   */
  public String getFirstname() {
    return name.getFirstName();
  }

  /**
   * Returns the last name associated with the deposit
   * @return the last name associated with the deposit
   */
  public String getLastname() {
    return name.getLastName();
  }

  /**
   * Returns the card number associated with the deposit
   * @return the card number associated with the deposit
   */
  public Integer getCardNumber() {
    return cardNumber.getCardNumber();
  }
}
