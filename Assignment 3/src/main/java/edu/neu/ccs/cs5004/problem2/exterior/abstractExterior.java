package edu.neu.ccs.cs5004.problem2.exterior;

import edu.neu.ccs.cs5004.problem2.exceptions.TooManyFloorsException;
import edu.neu.ccs.cs5004.problem2.PropertySizeEnum;
import edu.neu.ccs.cs5004.problem2.service.abstractService;

/**
 * An abstract class for Exterior services.
 */
public abstract class abstractExterior extends abstractService {

  public static final Integer TWO_HOURS = 2;
  public static final Integer FOUR_HOURS = 4;
  public static final Double FIVE_PERCENT = 0.05;
  public static final Double NO_COST = 0.0;

  protected Integer numberOfFloors;
  protected Integer month;
  protected PropertySizeEnum small = PropertySizeEnum.SMALL;
  protected PropertySizeEnum medium = PropertySizeEnum.MEDIUM;

  private Double exteriorPrice;
  protected Double finalPrice;


  /**
   * Constructs a new abstractExterior with the given parameters.
   *
   * @param invoiceID the invoiceID of the exterior service
   * @param propertyAddress the property address of the exterior service
   * @param propertySize the property size of the exterior service, represented as an Enum
   * @param scheduledMonthly a Boolean value checking if the service is monthly or a 1 time service
   * @param numberOfServices the number of services the property has had, represented as an Integer
   */
  public abstractExterior(String invoiceID, String propertyAddress, PropertySizeEnum propertySize,
      Boolean scheduledMonthly, Integer numberOfServices, Integer numberOfFloors, Integer month) {
    super(invoiceID, propertyAddress, propertySize, scheduledMonthly, numberOfServices);
    this.numberOfFloors = numberOfFloors;
    this.month = month;
  }

  /**
   * Gets the number of floors a property has.
   *
   * @return the number of floors a property has.
   */
  public Integer getNumberOfFloors() {
    return numberOfFloors;
  }

  /**
   * Sets the number of floors a property has.
   *
   * @param numberOfFloors the number of floors a property has.
   */
  public void setNumberOfFloors(Integer numberOfFloors) {
    this.numberOfFloors = numberOfFloors;
  }

  /**
   * Gets the month of the scheduled exterior cleaning.
   *
   * @return the month, represented as an Integer.
   */
  public Integer getMonth() {
    return month;
  }

  /**
   * Sets the month that the exterior cleaning will happen.
   *
   * @param month the month that the scheduled servicing will happen, represented as an Integer.
   */
  public void setMonth(Integer month) {
    this.month = month;
  }


  @Override
  public Double calculatePrice() throws TooManyFloorsException {
    Double withoutDiscountPrice = calculateExteriorServicingPrice();
    Double discountPrice = calculateDiscountHelper();
    return finalPrice = withoutDiscountPrice - (withoutDiscountPrice * discountPrice);
  }

  /**
   * Depending on attributes assigned to creating a new exterior service, this method will help give
   * accurate prices with the size of the property. There is a base rate for each hour of exterior
   * work to be $80. A SMALL property takes exactly 2 hours, so there property gardening fee is
   * $160.00. If it is a medium house it also takes 2 hours, so the property cleaning fee will be
   * $160.00. If the property is a LARGE property, then it will take roughly 4 hours to complete.
   * For a large property the cost will be $320.00.
   *
   * @return the dollar rate that the property owner will pay based on the size of the property.
   */

  protected Double calculateExteriorServicingPrice() {
    if (this.propertySize == small) {
      return (BASE_RATE * TWO_HOURS);
    } else if (propertySize == medium) {
      return (BASE_RATE * TWO_HOURS);
    } else {
      return (BASE_RATE * FOUR_HOURS);
    }
  }
}
