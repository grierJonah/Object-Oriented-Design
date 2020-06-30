package edu.neu.ccs.cs5004.problem2.exterior;

import static org.junit.Assert.*;

import edu.neu.ccs.cs5004.problem2.PropertySizeEnum;
import org.junit.Before;
import org.junit.Test;

public class GardeningTest{
  Gardening gardeningTest;
  Gardening tenthGardeningServiceTest;
  Gardening monthlyGardeningServiceTest;
  Gardening BothDiscountsGardeningServiceTest;
  String invoiceID = "InvoiceID";
  String propertyAddress = "Address";
  PropertySizeEnum small = PropertySizeEnum.SMALL;
  PropertySizeEnum medium = PropertySizeEnum.MEDIUM;
  PropertySizeEnum large = PropertySizeEnum.LARGE;
  Boolean scheduledMonthlyTrue = Boolean.TRUE;
  Boolean scheduledMonthlyFalse = Boolean.FALSE;
  Integer numberOfServices = 9;
  Integer free10Services = 9;
  Integer numberOfFloors = 2;
  Integer month = 10;


  @Before
  public void setUp() throws Exception {
    // Check monthly 10% discount works
    gardeningTest = new Gardening(invoiceID, propertyAddress, small,
        scheduledMonthlyTrue, numberOfServices, numberOfFloors, month);

    // Check 50% 10th service works
    tenthGardeningServiceTest = new Gardening(invoiceID, propertyAddress, large,
        scheduledMonthlyFalse, free10Services, numberOfFloors, month);

    // Check monthly 10% discount works as well as Medium enum
    monthlyGardeningServiceTest = new Gardening(invoiceID, propertyAddress, medium,
        scheduledMonthlyTrue, numberOfServices, numberOfFloors, month);

    // Check if BOTH discounts apply - only 50% is used
    BothDiscountsGardeningServiceTest = new Gardening(invoiceID, propertyAddress, large,
        scheduledMonthlyTrue, free10Services, numberOfFloors, month);
  }

  @Test
  public void gardeningWasteRemovalFee() {
    assertEquals(gardeningTest.wasteRemovalFee, 20.0, 0.0);
  }

  @Test
  public void calculatePrice() {
    assertEquals(gardeningTest.calculatePrice(), 90.0, 0.0);
    assertEquals(tenthGardeningServiceTest.calculatePrice(), 170.0, 0.0);
    assertEquals(monthlyGardeningServiceTest.calculatePrice(), 90.0, 0.0);
    assertEquals(BothDiscountsGardeningServiceTest.calculatePrice(), 170.0, 0.0);
  }

  @Test
  public void getInvoiceID() {
    assertEquals(gardeningTest.getInvoiceID(), "InvoiceID");
  }

  @Test
  public void getPropertyAddress() {
    assertEquals(gardeningTest.getPropertyAddress(), "Address");
  }

  @Test
  public void getPropertySize() {
    assertEquals(gardeningTest.getPropertySize(), PropertySizeEnum.SMALL);
  }

  @Test
  public void getScheduledMonthly() {
    assertEquals(gardeningTest.getMonthlyService(), scheduledMonthlyTrue);
  }

  @Test
  public void getNumberOfServices() {
    assertEquals(gardeningTest.getNumberOfServices(), 9, 0);
  }

  @Test
  public void getNumberOfFloors() {
    assertEquals(gardeningTest.getNumberOfFloors(), 2, 0);
  }

  @Test
  public void setNumberOfFloors() {
    gardeningTest.setNumberOfFloors(3);
    assertEquals(gardeningTest.getNumberOfFloors(), 3, 0);
  }

  @Test
  public void getMonth() {
    assertEquals(gardeningTest.getMonth(), 10, 0);
  }

  @Test
  public void setMonth() {
    gardeningTest.setMonth(5);
    assertEquals(gardeningTest.getMonth(), 5, 0);
  }

  @Test
  public void getGardeningWasteRemovalFee() {
    assertEquals(gardeningTest.gardeningWasteRemovalFee(), 20.0, 0.0);
  }
}