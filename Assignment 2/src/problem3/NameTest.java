package problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NameTest {
  private Name name;

  @Before
  public void setUp() throws Exception {
    name = new Name("Meat");
  }

  @Test
  public void getName() {
    assertEquals("Meat", name.getName());
  }
}