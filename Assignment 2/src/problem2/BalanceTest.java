package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BalanceTest {
  private Balance balance;

  @Before
  public void setUp() throws Exception {
    balance = new Balance(100, 50);
  }

  @Test
  public void getDollars() {
    assertEquals(balance.getDollars(), Integer.valueOf(100));
  }

  @Test
  public void getCents() {
    assertEquals(balance.getCents(), Integer.valueOf(50));
  }
}