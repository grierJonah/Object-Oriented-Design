package edu.neu.ccs.cs5004.problem2.interior;

import static org.junit.Assert.*;

import edu.neu.ccs.cs5004.problem2.exceptions.TooManyFloorsException;
import edu.neu.ccs.cs5004.problem2.PropertySizeEnum;
import org.junit.Before;
import org.junit.Test;

public class CleaningTest {

  Cleaning testCleaning;
  Cleaning testCleaning2;

  String invoiceID = "InvoiceID";
  String propertyAddress = "Address";
  PropertySizeEnum small = PropertySizeEnum.SMALL;
  PropertySizeEnum medium = PropertySizeEnum.MEDIUM;
  PropertySizeEnum large = PropertySizeEnum.LARGE;
  Boolean scheduledMonthlyTrue = Boolean.TRUE;
  Boolean scheduledMonthlyFalse = Boolean.FALSE;
  Integer tenthService = 9;
  Integer under10Services = 8;
  Integer numberOfPets = 3;
  Integer numberOfPets2 = 1;

  @Before
  public void setUp() throws Exception {
    // Tests 10th service discount, monthly buyer, and 3 pets
    testCleaning = new Cleaning(invoiceID, propertyAddress,
        medium, scheduledMonthlyTrue, tenthService, numberOfPets);

    // Tests no service discount, non monthly purchaser, 1 pet
    testCleaning2 = new Cleaning(invoiceID, propertyAddress,
        large, scheduledMonthlyFalse, under10Services, numberOfPets2);
  }

  @Test
  public void calculatePrice() throws TooManyFloorsException {
    assertEquals(testCleaning.calculatePrice(), 85.6, 0.0);
    assertEquals(testCleaning2.calculatePrice(), 336.0, 0.0);
  }
}