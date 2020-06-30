package edu.neu.ccs.cs5004.problem2.interior;

import edu.neu.ccs.cs5004.problem2.PropertySizeEnum;
import edu.neu.ccs.cs5004.problem2.service.abstractService;

/**
 * An abstract class for interior service.
 */
public abstract class abstractInterior extends abstractService {

  private static final Integer TWO_HOURS = 2;
  private static final Integer FOUR_HOURS = 4;
  private static final Integer TWO_DAYS = 16;
  private static final Integer THREE_DAYS = 24;
  private static final Double FIVE_PERCENT = 0.05;
  private static final Double SEVEN_PERCENT = 0.07;
  private static final Double NO_COST = 0.0;

  private Integer numberOfPets;
  protected Double finalPrice;

  protected PropertySizeEnum small = PropertySizeEnum.SMALL;
  protected PropertySizeEnum medium = PropertySizeEnum.MEDIUM;


  /**
   * Constructs a new abstractInterior with the given parameters.
   *
   * @param invoiceID the invoiceID of the interior service
   * @param propertyAddress the property address of the interior service
   * @param propertySize the property size of the interior service, represented as an Enum
   * @param scheduledMonthly a Boolean value checking if the service is monthly or a 1 time service
   * @param numberOfServices the number of services the property has had, represented as an Integer
   */
  public abstractInterior(String invoiceID, String propertyAddress, PropertySizeEnum propertySize,
      Boolean scheduledMonthly, Integer numberOfServices, Integer numberOfPets) {
    super(invoiceID, propertyAddress, propertySize, scheduledMonthly, numberOfServices);
    this.numberOfPets = numberOfPets;
  }

  /**
   * Gets the number of pets a property has.
   *
   * @return the number of pets a property has.
   */
  public Integer getNumberOfPets() {
    return this.numberOfPets;
  }

  /**
   * Sets the number of pets a property has.
   *
   * @param numberOfPets the number of pets a property has.
   */
  public void setNumberOfPets(Integer numberOfPets) {
    this.numberOfPets = numberOfPets;
  }


  /*@Override
  public Double calculatePrice() throws TooManyFloorsException {
    Double InteriorCleaningPrice = calculateInteriorCleaningPrice();
    Double petFee = calculatePetPrice();
    Double discountPrice = calculateDiscountHelper();
    Double withoutDiscountPrice = InteriorCleaningPrice + (InteriorCleaningPrice * petFee);
    return finalPrice = withoutDiscountPrice - (withoutDiscountPrice * discountPrice);
  } */

  /**
   * Depending on attributes assigned to creating a new cleaning service, this method will help give
   * accurate prices with the size of the property. There is a base rate for each hour of cleaning
   * to be $80. A SMALL property takes exactly 1 hour, so there property cleaning fee is $80.00. If
   * it is a medium house it takes 2 hours, so the property cleaning fee will be $160.00. If the
   * property is a LARGE property, then it will take roughly 4 hours to complete. For a large
   * property the cost will be $320.00.
   *
   * @return the rate that the property owner will pay based on the size of the property
   */
  public Double calculateInteriorCleaningPrice() {
    if (this.propertySize == small) {
      return BASE_RATE;
    } else if (this.propertySize == medium) {
      return (BASE_RATE * TWO_HOURS);
    } else {
      return (BASE_RATE * FOUR_HOURS);
    }
  }

  /**
   * Depending on attributes assigned to creating a new painting service, this method will help
   * provide accurate prices with the size of the property. There is a base rate per hour of
   * painting at $80.0. Additionally, painters calculate hours worked in terms of days. One day is
   * equal to eight hours of working. For SMALL property's painting takes two days to complete. That
   * means that a property owner will expect to pay for 16 hours of work. Like SMALL property's,
   * MEDIUM sized property's also take two days to complete. Purchasers will be expected to also pay
   * for 16 hours of work. For LARGE property's it takes three days to complete. This means
   * purchasers will be expected to pay for 24 hours worth of work.
   *
   * @return the rate that the property owner will pay based on the size of the property
   */
  public Double calculateInteriorPaintingPrice() {
    if (this.propertySize == small) {
      return (BASE_RATE * TWO_DAYS);
    } else if (this.propertySize == medium) {
      return (BASE_RATE * TWO_DAYS);
    } else {
      return (BASE_RATE * THREE_DAYS);
    }
  }

  /**
   * Depending on attributes assigned to creating a new cleaning or painting service. This method
   * will help provide accurate prices if the property has any pets. There is a 5% increase in final
   * price if the property owner has 1 or 2 pets. There is a 7% increase in final price if the
   * property owner has 3 or more pets.
   *
   * @return the percentage increase that the property owner will be required to pay if they have
   * any pets.
   */
  public Double calculatePetPrice() {
    if (numberOfPets >= 1 && numberOfPets <= 2) {
      return FIVE_PERCENT;
    } else if (numberOfPets >= 3) {
      return SEVEN_PERCENT;
    } else {
      return NO_COST;
    }
  }
}
