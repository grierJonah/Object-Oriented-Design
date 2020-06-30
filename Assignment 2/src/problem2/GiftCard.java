package problem2;

/**
 * A class representing a gift card. A gift card is comprised of a name, address, email, and card
 * number as well as a current balance. The Gift Card class is the class that ties all the other
 * classes together
 */
public class GiftCard {

  private Name name;
  private Address address;
  private Email email;
  private CardNumber cardNumber;

  private Deposit newGift;

  private Integer minDeposit = 1;
  private Integer maxDeposit = 200;
  protected Balance currentBalance;

  /**
   * Constructs a new gift card given a name object, address object, email object, card number
   * object, and current balance object.
   * @param name the name that the gift card belongs too
   * @param address the address that the gift card is associated too
   * @param email the email that the gift card is associated too
   * @param cardNumber the card number on the gift card
   * @param currentBalance the current balance the gift card has
   */
  public GiftCard(Name name, Address address, Email email,
      CardNumber cardNumber, Balance currentBalance) {
    this.name = name;
    this.address = address;
    this.email = email;
    this.cardNumber = cardNumber;
    this.currentBalance = currentBalance;
  }

  /**
   * Deposits a new amount onto the gift card. Returns a new gift card to preserve immutability.
   * Additionally, it checks to make sure that the deposit has the current name (first and last),
   * and card number before depositing money to the specific card. If it does not, then it returns
   * the original gift card.
   *
   * @param newGift a deposit to be put on the gift card. Contains dollars/cents/name/card number
   * @return the new gift card after depositing an amount to it.
   */
  public GiftCard Deposit(Deposit newGift) {
    if (checkValidGiftCard(newGift)) {
      Integer finalDollar = this.currentBalance.getDollars() + newGift.getDollarAmount();
      Integer finalCents = this.currentBalance.getCents() + newGift.getCentsAmount();
      return new GiftCard(this.name, this.address, this.email, this.cardNumber,
          new Balance(finalDollar, finalCents));
    }
    return this;
  }


  /**
   * A helper function that validates if the gift card deposit has the same credentials
   * as the gift card being deposited too. This helper function returns a Boolean value
   * based on whether the gift card has the same first and last name, and if the card numbers
   * are the same
   *
   * @param checkDeposit the new deposit to be made to a gift card
   * @return a true or false value based on correctness
   */
  private Boolean checkValidGiftCard(Deposit checkDeposit) {
    if ((checkDeposit.getFirstname().equals(this.name.getFirstName()) &&
        (checkDeposit.getLastname().equals(this.name.getLastName())) &&
        (checkDeposit.getCardNumber().equals(this.cardNumber.getCardNumber())))) {
      return Boolean.TRUE;
    }
    return Boolean.FALSE;
  }
}