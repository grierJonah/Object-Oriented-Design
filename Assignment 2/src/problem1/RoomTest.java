package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RoomTest {

  private Room room;

  @Before
  public void setUp() throws Exception {
    room = new Room(70);
  }

  @Test
  public void getTemperature() {
    assertEquals(room.getTemperature(), Integer.valueOf(70));
  }
}