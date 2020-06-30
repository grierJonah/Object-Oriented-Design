package edu.neu.ccs.cs5004.problem2.interior;

import static org.junit.Assert.*;

import edu.neu.ccs.cs5004.problem2.exceptions.TooManyFloorsException;
import edu.neu.ccs.cs5004.problem2.PropertySizeEnum;
import org.junit.Before;
import org.junit.Test;

public class PaintingTest {

  Painting testPainting;
  Painting testPainting2;

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
    // Testing monthly payer, 50% 10th service discount and 7% pet fee
    testPainting = new Painting(invoiceID, propertyAddress, large,
        scheduledMonthlyTrue, tenthService, numberOfPets);

    // Testing monthly payer discount, no 10th service discount, and 5% pet fee
    testPainting2 = new Painting(invoiceID, propertyAddress, medium,
        scheduledMonthlyTrue, under10Services, numberOfPets2);
  }

  @Test
  public void calculatePrice() throws TooManyFloorsException {
    assertEquals(testPainting.calculatePrice(), 1027.2, 0.0);
    assertEquals(testPainting2.calculatePrice(), 1209.6, 0.0);
  }
}