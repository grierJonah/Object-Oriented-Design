package Problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwimmerTest {

  private Swimmer newSwimmer;
  private Swimmer newSwimmer2;

  SwimTimes swimmerTime1 = new SwimTimes(10.0, 15.0,
      20.0, 25.0);
  SwimTimes swimmerTime2 = new SwimTimes(30.0, 35.0,
      40.0, 45.0);

  @Before
  public void setUp() throws Exception {
    newSwimmer = new Swimmer("Jonah", "Grier", swimmerTime1);
    newSwimmer2 = new Swimmer("Next", "Guy", swimmerTime2);
  }

  @Test
  public void getFirstName() {
    assertEquals("Jonah", newSwimmer.getFirstName());
    assertNotEquals("NULL", newSwimmer2.getFirstName());
  }

  @Test
  public void getLastName() {
    assertEquals("Grier", newSwimmer.getLastName());
    assertNotEquals("NULL", newSwimmer2.getLastName());
  }

  @Test
  public void getFullName() {
    assertEquals("Jonah Grier", newSwimmer.getFullName());
    assertNotEquals("NULL", newSwimmer2.getFullName());
  }


  @Test
  public void getSwimTimes() {
    assertEquals("Backstroke: 10.0 Breaststroke: 15.0 Butterfly: 20.0 Freestyle: 25.0",
        newSwimmer.getSwimTimes());
    assertNotEquals("NULL", newSwimmer2.getSwimTimes());
  }
}