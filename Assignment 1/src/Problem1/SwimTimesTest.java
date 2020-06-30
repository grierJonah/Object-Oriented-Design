package Problem1;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwimTimesTest {

  private Swimmer newSwimmer;

  SwimTimes time1 = new SwimTimes(15.00, 20.00,
      25.00, 30.00);

  @Before
  public void setUp() throws Exception {
    newSwimmer = new Swimmer("Jonah", "Grier", time1);
  }

  @Test
  public void getBestBackstroke50mTime() {
    assertEquals(15.00, time1.getBestBackstroke50mTime(), 0);
  }

  @Test
  public void getBestBreaststroke50mTime() {
    assertEquals(20.00, time1.getBestBreaststroke50mTime(), 0);
  }

  @Test
  public void getBestButterfly50mTime() {
    assertEquals(25.00, time1.getBestButterfly50mTime(), 0);
  }

  @Test
  public void getBestFreestyle50mTime() {
    assertEquals(30, time1.getBestFreestyle50mTime(), 0);
  }

  @Test
  public void setBestBackstroke50mTime() throws Exception {
    Double newBestBackstrokeTime = 13.33;
    time1.setBestBackstroke50mTime(newBestBackstrokeTime);
    assertEquals(13.33, time1.getBestBackstroke50mTime(), 0);
  }

  @Test
  public void setBestBreaststroke50mTime() throws Exception {
    Double newBestBreaststrokeTime = 15.99;
    time1.setBestBreaststroke50mTime(newBestBreaststrokeTime);
    assertEquals(15.99, time1.getBestBreaststroke50mTime(), 0);
  }

  @Test
  public void setBestButterfly50mTime() throws Exception {
    Double newBestButterflyTime = 13.95;
    time1.setBestButterfly50mTime(newBestButterflyTime);
    assertEquals(13.95, time1.getBestButterfly50mTime(), 0);
  }

  @Test
  public void setBestFreestyle50mTime() throws Exception {
    Double newBestFreestyleTime = 10.01;
    time1.setBestFreestyle50mTime(newBestFreestyleTime);
    assertEquals(10.01, time1.getBestFreestyle50mTime(), 0);
  }
}