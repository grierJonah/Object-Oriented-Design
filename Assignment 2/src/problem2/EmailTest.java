package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmailTest {
  private Email email;

  @Before
  public void setUp() throws Exception {
    email = new Email("jjg8895@gmail.com");
  }

  @Test
  public void getEmail() {
    assertEquals(email.getEmail(), "jjg8895@gmail.com");
  }
}