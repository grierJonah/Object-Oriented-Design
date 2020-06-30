package edu.neu.ccs.cs5004.problem2.service;

import edu.neu.ccs.cs5004.problem2.IService;
import edu.neu.ccs.cs5004.problem2.PropertySizeEnum;


public abstract class abstractService implements IService {

  public static final Double MONTHLY_SERVICE_USER = 0.1;
  public static final Double TENTH_SERVICE_DISCOUNT = 0.5;
  public static final Double TEN_PERCENT_OFF = 0.1;
  public static final Double FIFTY_PERCENT_OFF = 0.5;

  public static final Double NO_DISCOUNT = 0.0;
  public static final Double BASE_RATE = 80.0;

  protected String invoiceID;
  protected String propertyAddress;
  protected PropertySizeEnum propertySize;
  protected Boolean scheduledMonthly;
  protected Integer numberOfServices;

  /**
   * Constructs a new abstractInterior with the given parameters.
   *
   * @param invoiceID the invoiceID of the interior service
   * @param propertyAddress the property address of the interior service
   * @param propertySize the property size of the interior service, represented as an Enum
   * @param scheduledMonthly a Boolean value checking if the service is monthly or a 1 time service
   * @param numberOfServices the number of services the property has had, represented as an Integer
   */
  public abstractService(String invoiceID, String propertyAddress, PropertySizeEnum propertySize,
      Boolean scheduledMonthly, Integer numberOfServices) {
    this.invoiceID = invoiceID;
    this.propertyAddress = propertyAddress;
    this.propertySize = propertySize;
    this.scheduledMonthly = scheduledMonthly;
    this.numberOfServices = numberOfServices;
  }

  /**
   * This method checks to see if the property scheduling a service is a monthly subscriber to the
   * servicing. If they are, each month they get a 10% discount to their final bill. However, if the
   * property has accumulated their 10th number of services they are given a 50% off discount. The
   * monthly 10% is then disregarded so they will not get a 60% discount. If the property has
   * neither the 10th accumulated servicing, and they are not monthly subscribers to the servicing,
   * no discount will be applied.
   *
   * @return the percentage to be discounted from the final bill.
   */
  public Double checkMonthlyDiscountUser() {
    if (scheduledMonthly == Boolean.TRUE) {
      return MONTHLY_SERVICE_USER;
    } else {
      return NO_DISCOUNT;
    }
  }

  /**
   * This method helps check if the property owner is at there tenth service. By checking if the
   * number of visits is divisible by 10, we can track if they are up for their 50% discount.
   *
   * @return a 50% discount or no discount, represented as a Double (0.5 or 0.0)
   */
  @Override
  public Double tenthServiceDiscount() {
    // Check if the number of services is the 10th, returns 0.50 to be multiplied to final bill
    if ((this.numberOfServices % 10) == 9) {
      return TENTH_SERVICE_DISCOUNT;
    } else {
      return NO_DISCOUNT;
    }
  }

  /**
   * Checks all likely scenarios of discounts being applied. There are two discounts: 10 percent
   * off, and 50 percent off. If the property owner is a monthly subscription payer, they get 10
   * percent off their final bill just for retaining service with the company. If the property owner
   * is purchasing their 10th service they get a 50% discount. However, if they are both a monthly
   * purchaser and they are getting their 10th 50% discount, then they only get the 50% discount
   * applied.
   *
   * @return the final discount (0.1, 0.5, or none, represented as a Double)
   */
  public Double calculateDiscountHelper() {
    Double monthlyDiscountCheck = checkMonthlyDiscountUser();
    Double tenthServiceCheck = tenthServiceDiscount();
    // If both discounts apply return 50%
    if (monthlyDiscountCheck.equals(TEN_PERCENT_OFF)
        && tenthServiceCheck.equals(FIFTY_PERCENT_OFF)) {
      return FIFTY_PERCENT_OFF;
    } else if (monthlyDiscountCheck.equals(TEN_PERCENT_OFF)) {
      return TEN_PERCENT_OFF;
    } else if (tenthServiceCheck.equals(FIFTY_PERCENT_OFF)) {
      return FIFTY_PERCENT_OFF;
    } else {
      return NO_DISCOUNT;
    }
  }

  @Override
  public Double baseRate() {
    return BASE_RATE;
  }


  /**
   * Gets the invoiceID of the service.
   *
   * @return the invoiceID as a String
   */
  public String getInvoiceID() {
    return invoiceID;
  }

  /**
   * Sets the invoiceID of the service.
   *
   * @param invoiceID the service invoiceID
   */
  public void setInvoiceID(String invoiceID) {
    this.invoiceID = invoiceID;
  }

  /**
   * Gets the property address of the service.
   *
   * @return the property address
   */
  public String getPropertyAddress() {
    return propertyAddress;
  }

  /**
   * Sets the property address of the service.
   *
   * @param propertyAddress the property address of the service
   */
  public void setPropertyAddress(String propertyAddress) {
    this.propertyAddress = propertyAddress;
  }

  /**
   * Gets the property size of the property.
   *
   * @return the property size of the house, represented as an enum
   */
  public PropertySizeEnum getPropertySize() {
    return propertySize;
  }

  /**
   * Sets the property size of the property.
   *
   * @param propertySize an enum (SMALL, MEDIUM, or LARGE)
   */
  public void setPropertySize(PropertySizeEnum propertySize) {
    this.propertySize = propertySize;
  }

  /**
   * A monthly service check to see if the property is scheduled on a monthly recurrence or if the
   * service is a one time thing.
   *
   * @return A True or False value
   */
  public Boolean getMonthlyService() {
    return scheduledMonthly;
  }

  /**
   * Sets the property to either have a one time service, or a monthly subscription to servicing.
   *
   * @param scheduledMonthly a True or False value
   */
  public void setMonthlyService(Boolean scheduledMonthly) {
    this.scheduledMonthly = scheduledMonthly;
  }

  /**
   * Gets the number of services that the property has had.
   *
   * @return the Integer value associated with how many services the property owner has had
   */
  public Integer getNumberOfServices() {
    return this.numberOfServices;
  }

  @Override
  public String toString() {
    return "abstractService{" +
        "invoiceID='" + invoiceID + '\'' +
        ", propertyAddress='" + propertyAddress + '\'' +
        ", propertySize=" + propertySize +
        ", scheduledMonthly=" + scheduledMonthly +
        ", numberOfServices=" + numberOfServices +
        '}';
  }
}
