package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AddressTest {
  private Address address;

  @Before
  public void setUp() throws Exception {
    address = new Address("100 Florida St.");
  }

  @Test
  public void getAddress() {
    assertEquals(address.getAddress(), "100 Florida St.");
  }
}