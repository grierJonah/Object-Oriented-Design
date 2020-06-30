package problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PerishableTest {
  Perishable perishable;
  Name name;

  @Before
  public void setUp() throws Exception {
    name = new Name("Meat");
    perishable = new Perishable(name, 50, 100,
        100, 25, 50);
  }

  @Test
  public void getOrderDate() {
    assertEquals(Integer.valueOf(25), perishable.getOrderDate());
  }

  @Test
  public void getExpirationDate() {
    assertEquals(Integer.valueOf(50), perishable.getExpirationDate());
  }
}