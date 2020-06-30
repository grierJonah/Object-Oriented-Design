package problem2;

import static org.junit.Assert.*;

import com.sun.org.apache.xerces.internal.dom.DeepNodeListImpl;
import org.junit.Before;
import org.junit.Test;

public class GiftCardTest {
  private Name name;
  private Address address;
  private Email email;
  private CardNumber cardNumber;
  private Balance balance;
  private Balance newBalance;
  private Deposit newDeposit;
  private GiftCard giftCard;
  private GiftCard giftCardTest;

  @Before
  public void setUp() throws Exception {
    name = new Name("Jonah", "Grier");
    address = new Address("100 Florida St.");
    email = new Email("jjg");
    cardNumber = new CardNumber(12345678);
    balance = new Balance(100, 50);
    newBalance = new Balance(150, 100);
    giftCard = new GiftCard(name, address, email, cardNumber, balance);
    giftCardTest = new GiftCard(name, address, email, cardNumber, newBalance);

  }

  @Test
  public void deposit() {
    newDeposit = new Deposit(50, 50, name, cardNumber);
    assertNotEquals(giftCard.Deposit(newDeposit).currentBalance, giftCardTest.currentBalance);
  }
}