package edu.neu.ccs.cs5004.grocery;

import edu.neu.ccs.cs5004.exceptions.AgeRestrictionException;
import org.junit.Before;
import org.junit.Test;

public class BeerTest {
  Beer testBeer;
  Beer testBeer2;

  @Before
  public void setUp() throws Exception {
    testBeer = new Beer("San Miguel", "San Miguel", 2.45,
        21, 1.00);
  }

  @Test(expected = AgeRestrictionException.class)
  public void createUnderAgeBeer() throws AgeRestrictionException {
    testBeer2 = new Beer("Tester", "testi", 200.0,
        15, 5.9);
  }
}