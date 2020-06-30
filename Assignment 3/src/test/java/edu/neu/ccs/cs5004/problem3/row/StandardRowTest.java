package edu.neu.ccs.cs5004.problem3.row;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StandardRowTest {

  StandardRow rowTest;

  @Before
  public void setUp() throws Exception {
    rowTest = new StandardRow(34, 10);
  }

  @Test
  public void getNumberOfSeatsInRow() {
    assertEquals(rowTest.getNumberOfSeatsInRow(),
        34, 0);
  }
}