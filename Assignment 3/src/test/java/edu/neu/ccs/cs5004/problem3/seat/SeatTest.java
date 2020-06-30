package edu.neu.ccs.cs5004.problem3.seat;

import static org.junit.Assert.*;

import edu.neu.ccs.cs5004.problem3.exceptions.AlphabetOnly;
import org.junit.Before;
import org.junit.Test;

public class SeatTest {
  Seat testSeat;
  Seat testSeat2;
  Seat failTestSeat3;

  @Before
  public void setUp() throws Exception {
    testSeat = new Seat("A", "Jonah");
    testSeat2 = new Seat("c");
  }

  @Test
  public void getSeatLetter() {
    assertEquals(testSeat.getSeatLetter(), "A");
  }

  @Test
  public void setSeatLetter() {
    testSeat.setSeatLetter("Z");
    assertEquals(testSeat.getSeatLetter(), "Z");
  }

  @Test
  public void getReservedFor() {
    assertEquals(testSeat.getReservedFor(), "Jonah");
    assertNull(testSeat2.getReservedFor());
  }

  @Test
  public void setReservedFor() {
    testSeat.setReservedFor("Bob");
    assertEquals(testSeat.getReservedFor(), "Bob");
  }

  @Test(expected = AlphabetOnly.class)
  public void passIncorrectLetterToSeat() throws AlphabetOnly {
    failTestSeat3 = new Seat("9");
  }
}