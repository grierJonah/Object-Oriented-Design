package edu.neu.ccs.cs5004.problem2.exterior;

import static org.junit.Assert.*;

import edu.neu.ccs.cs5004.problem2.exceptions.TooManyFloorsException;
import edu.neu.ccs.cs5004.problem2.PropertySizeEnum;
import org.junit.Before;
import org.junit.Test;

public class windowCleaningTest {

  windowCleaning windowCleaningTest;
  windowCleaning windowCleaningTest2;

  String invoiceID = "InvoiceID";
  String propertyAddress = "Address";
  PropertySizeEnum small = PropertySizeEnum.SMALL;
  PropertySizeEnum medium = PropertySizeEnum.MEDIUM;
  PropertySizeEnum large = PropertySizeEnum.LARGE;
  Boolean scheduledMonthlyTrue = Boolean.TRUE;
  Boolean scheduledMonthlyFalse = Boolean.FALSE;
  Integer tenthService = 9;
  Integer numberOfFloors = 3;
  Integer tooHighFloors = 10;
  Integer under10Services = 8;
  Integer month;

  @Before
  public void setUp() throws Exception {
    windowCleaningTest = new windowCleaning(invoiceID, propertyAddress, medium,
        scheduledMonthlyFalse, tenthService, numberOfFloors, month);

    windowCleaningTest2 = new windowCleaning(invoiceID, propertyAddress, large,
        scheduledMonthlyTrue, under10Services, tooHighFloors, month);
  }

  @Test
  public void calculatePrice() throws TooManyFloorsException {
    assertEquals(windowCleaningTest.calculatePrice(), 84.0, 0.0);
  }

  @Test
  public void checkNumberOfFloors() throws TooManyFloorsException {
    assertEquals(windowCleaningTest.getNumberOfFloors(), 3, 0);
  }

  @Test(expected = TooManyFloorsException.class)
  public void calculatePrice2() throws TooManyFloorsException {
    assertEquals(windowCleaningTest2.calculatePrice(), null);
  }
}