package Problem2;

import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.*;

public class BicyclistTest {

  private Bicyclist newBicyclist;
  private Time startTime;
  private Time endTime;


  @Before
  public void setUp() throws Exception {
    startTime = new Time(0, 10, 15);
    endTime = new Time(5, 35, 45);
    newBicyclist = new Bicyclist("Jonah", "Grier", "Align_Java",
        startTime, endTime);
  }

  @Test
  public void getFirstName() {
    assertEquals("Jonah", newBicyclist.getFirstName());
  }

  @Test
  public void getLastName() {
    assertEquals("Grier", newBicyclist.getLastName());
  }

  @Test
  public void getTeamName() {
    assertEquals("Align_Java", newBicyclist.getTeamName());
  }

  @Test
  public void getDuration() throws ParseException {
    assertEquals("05:25:30", newBicyclist.getDuration());
  }
}