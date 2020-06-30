package edu.neu.ccs.cs5004.problem2.exterior;

import static org.junit.Assert.*;

import edu.neu.ccs.cs5004.problem2.PropertySizeEnum;
import edu.neu.ccs.cs5004.problem2.exceptions.TooManyFloorsException;
import org.junit.Before;
import org.junit.Test;

public class abstractExteriorTest {
  abstractExterior abstractExteriorTest;

  @Before
  public void setUp() throws Exception {
    abstractExteriorTest = new abstractExterior("invoiceId", "100 Florida",
        PropertySizeEnum.MEDIUM, Boolean.TRUE, 9, 3, 2) {
      @Override
      public Integer getNumberOfFloors() {
        return super.getNumberOfFloors();
      }
    };
  }

  @Test
  public void getNumberOfFloors() {
    assertEquals(abstractExteriorTest.getNumberOfFloors(), 3, 0);
  }

  @Test
  public void setNumberOfFloors() {
    abstractExteriorTest.setNumberOfFloors(2);
    assertEquals(abstractExteriorTest.getNumberOfFloors(), 2, 0);
  }

  @Test
  public void getMonth() {
    assertEquals(abstractExteriorTest.getMonth(), 2, 0);
  }

  @Test
  public void setMonth() {
    abstractExteriorTest.setMonth(10);
    assertEquals(abstractExteriorTest.getMonth(), 10, 0);
  }

  @Test
  public void calculatePrice() throws TooManyFloorsException {
    assertEquals(abstractExteriorTest.calculatePrice(), 80.0, 0);
  }

  @Test
  public void calculateExteriorServicingPrice() {
    assertEquals(abstractExteriorTest.calculateExteriorServicingPrice(), 160.0, 0);
  }
}