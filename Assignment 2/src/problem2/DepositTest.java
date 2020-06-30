package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DepositTest {
  private Deposit deposit;
  private Name name;
  private CardNumber cardNumber;

  @Before
  public void setUp() throws Exception {
    name = new Name("Jonah", "Grier");
    cardNumber = new CardNumber(12345678);
    deposit = new Deposit(100, 50, name, cardNumber);
  }

  @Test
  public void getDollarAmount() {
    assertEquals(deposit.getDollarAmount(), Integer.valueOf(100));
  }

  @Test
  public void getCentsAmount() {
    assertEquals(deposit.getCentsAmount(), Integer.valueOf(50));
  }

  @Test
  public void getFirstname() {
    assertEquals(deposit.getFirstname(), "Jonah");
  }

  @Test
  public void getLastname() {
    assertEquals(deposit.getLastname(), "Grier");
  }

  @Test
  public void getCardNumber() {
    assertEquals(deposit.getCardNumber(), Integer.valueOf(12345678));
  }
}