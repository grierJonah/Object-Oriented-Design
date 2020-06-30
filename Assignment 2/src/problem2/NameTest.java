package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NameTest {
  private Name name;

  @Before
  public void setUp() throws Exception {
    name = new Name("Firstname", "Lastname");
  }

  @Test
  public void getFirstName() {
    assertEquals(name.getFirstName(), "Firstname");
  }

  @Test
  public void getLastName() {
    assertEquals(name.getLastName(), "Lastname");
  }
}