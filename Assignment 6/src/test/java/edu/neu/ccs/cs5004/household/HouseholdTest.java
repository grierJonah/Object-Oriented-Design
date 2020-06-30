package edu.neu.ccs.cs5004.household;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HouseholdTest {

  Household testHousehold;
  Household testHousehold2;

  @Before
  public void setUp() throws Exception {
    testHousehold = new Shampoo("White", "Stuff",
        9.99, 0, 2);
    testHousehold2 = new PaperTowels("WipeThatSchtuff", "up",
        5.49, 0, 6);
  }

  @Test
  public void getUnits() {
    assertEquals(testHousehold.getUnits(), 2, 0);
    assertEquals(testHousehold2.getUnits(), 6, 0);
  }
}