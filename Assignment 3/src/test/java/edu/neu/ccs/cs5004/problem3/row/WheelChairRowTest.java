package edu.neu.ccs.cs5004.problem3.row;

import static org.junit.Assert.*;

import edu.neu.ccs.cs5004.problem3.seat.Seat;
import org.junit.Before;
import org.junit.Test;

public class WheelChairRowTest {
  WheelChairRow testWheelChairRow;
  Seat seatTest;

  @Before
  public void setUp() throws Exception {
    testWheelChairRow = new WheelChairRow(15, 3);
  }

  @Test
  public void getNumberOfSeatsInRow() {
    assertEquals(testWheelChairRow.getNumberOfSeatsInRow(), 15, 0);
  }

  @Test
  public void getRowNumber() {
    assertEquals(testWheelChairRow.getRowNumber(), 3, 0);
  }

  @Test
  public void getRow() {
    assertEquals(testWheelChairRow.getRow(), testWheelChairRow.wheelChairRow);
  }

  @Test
  public void addSeat() {
    testWheelChairRow.addSeat(seatTest);
    assertEquals(testWheelChairRow.getRow().size(), 1.0, 0);
  }
}