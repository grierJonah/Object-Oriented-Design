package Problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest {

  private Time testTime;

  @Before
  public void setUp() throws Exception {
    testTime = new Time(10, 5, 33);
  }

  @Test
  public void getHours() {
    assertEquals(10, testTime.getHours(), 0);
  }

  @Test
  public void getMinutes() {
    assertEquals(5, testTime.getMinutes(), 0);
  }

  @Test
  public void getSeconds() {
    assertEquals(33, testTime.getSecond(), 0);
  }
}