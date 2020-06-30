package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardNumberTest {
  private CardNumber cardNumber;

  @Before
  public void setUp() throws Exception {
    cardNumber = new CardNumber(12345678);
  }

  @Test
  public void getCardNumber() {
    assertEquals(cardNumber.getCardNumber(), Integer.valueOf(12345678));
  }
}