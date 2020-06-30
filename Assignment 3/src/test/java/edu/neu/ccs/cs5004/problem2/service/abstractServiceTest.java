package edu.neu.ccs.cs5004.problem2.service;

import static org.junit.Assert.*;

import edu.neu.ccs.cs5004.problem2.PropertySizeEnum;
import edu.neu.ccs.cs5004.problem2.exceptions.TooManyFloorsException;
import org.junit.Before;
import org.junit.Test;

public class abstractServiceTest {
  abstractService abstractServiceTest;

  @Before
  public void setUp() throws Exception {
    abstractServiceTest = new abstractService("invoiceID", "100 Florida",
        PropertySizeEnum.MEDIUM, Boolean.FALSE, 9) {
      @Override
      public Double calculatePrice() throws TooManyFloorsException {
        return null;
      }
    };
  }

  @Test
  public void checkMonthlyDiscountUser() {
    assertEquals(abstractServiceTest.checkMonthlyDiscountUser(), 0.0, 0);
  }

  @Test
  public void tenthServiceDiscount() {
    assertEquals(abstractServiceTest.tenthServiceDiscount(), 0.5, 0);
  }

  @Test
  public void calculateDiscountHelper() {
    assertEquals(abstractServiceTest.calculateDiscountHelper(), 0.5, 0);
  }

  @Test
  public void baseRate() {
    assertEquals(abstractServiceTest.baseRate(), 80.0, 0);
  }

  @Test
  public void getInvoiceID() {
    assertEquals(abstractServiceTest.getInvoiceID(), "invoiceID");
  }

  @Test
  public void setInvoiceID() {
    abstractServiceTest.setInvoiceID("newInvoice");
    assertEquals(abstractServiceTest.getInvoiceID(), "newInvoice");
  }

  @Test
  public void getPropertyAddress() {
    assertEquals(abstractServiceTest.getPropertyAddress(), "100 Florida");
  }

  @Test
  public void setPropertyAddress() {
    abstractServiceTest.setPropertyAddress("200");
    assertEquals(abstractServiceTest.getPropertyAddress(), "200");
  }

  @Test
  public void getPropertySize() {
    assertEquals(abstractServiceTest.getPropertySize(), PropertySizeEnum.MEDIUM);
  }

  @Test
  public void setPropertySize() {
    abstractServiceTest.setPropertySize(PropertySizeEnum.LARGE);
    assertEquals(abstractServiceTest.getPropertySize(), PropertySizeEnum.LARGE);
  }

  @Test
  public void getMonthlyService() {
    assertEquals(abstractServiceTest.getMonthlyService(), Boolean.FALSE);
  }

  @Test
  public void setMonthlyService() {
    abstractServiceTest.setMonthlyService(Boolean.TRUE);
    assertEquals(abstractServiceTest.getMonthlyService(), Boolean.TRUE);
  }

  @Test
  public void getNumberOfServices() {
    assertEquals(abstractServiceTest.getNumberOfServices(), 9, 0);
  }

  @Test
  public void testToString() {
    String toString = abstractServiceTest.toString();
    System.out.println(toString);
    assertEquals(toString, "abstractService{"
        + "invoiceID='" + abstractServiceTest.getInvoiceID()
        + "', propertyAddress='" + abstractServiceTest.getPropertyAddress()
        + "', propertySize=" + abstractServiceTest.getPropertySize()
        + ", scheduledMonthly=" + abstractServiceTest.scheduledMonthly
        + ", numberOfServices=" + abstractServiceTest.getNumberOfServices()
        + "}");
  }
}