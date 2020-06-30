package edu.neu.ccs.cs5004.problem2.interior;

import static org.junit.Assert.*;

import edu.neu.ccs.cs5004.problem2.PropertySizeEnum;
import edu.neu.ccs.cs5004.problem2.exceptions.TooManyFloorsException;
import org.junit.Before;
import org.junit.Test;

public class abstractInteriorTest {
  abstractInterior abstractInteriorTest;

  @Before
  public void setUp() throws Exception {
    abstractInteriorTest = new abstractInterior("invoiceID", "100 Florida",
        PropertySizeEnum.SMALL, Boolean.TRUE, 5, 3) {
      @Override
      public Double calculatePrice() throws TooManyFloorsException {
        return null;
      }
    };
  }

  @Test
  public void getNumberOfPets() {
    assertEquals(abstractInteriorTest.getNumberOfPets(), 3, 0);
  }

  @Test
  public void setNumberOfPets() {
    abstractInteriorTest.setNumberOfPets(10);
    assertEquals(abstractInteriorTest.getNumberOfPets(), 10, 0);
  }

  @Test
  public void calculateInteriorCleaningPrice() {
    assertEquals(abstractInteriorTest.calculateInteriorCleaningPrice(), 80.0, 0);
  }

  @Test
  public void calculateInteriorPaintingPrice() {
    assertEquals(abstractInteriorTest.calculateInteriorPaintingPrice(), 1280.0, 0);
  }

  @Test
  public void calculatePetPrice() {
    assertEquals(abstractInteriorTest.calculatePetPrice(), 0.07, 0);
  }
}