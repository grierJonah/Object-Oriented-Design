package edu.neu.ccs.cs5004.problem2.exterior;

import edu.neu.ccs.cs5004.problem2.PropertySizeEnum;

/**
 * A class representing a Gardening service. The Gardening service tracks which month it will be
 * taking place.
 */
public class Gardening extends abstractExterior {

  protected Double wasteRemovalFee = 20.0;
  protected Double gardeningPrice;
  protected Double finalPrice;

  /**
   * Constructs a Gardening service with the give parameters.
   *
   * @param invoiceID the invoiceID of the gardening service
   * @param propertyAddress the property address of the house/place getting a Gardening service
   * @param propertySize the property size represented as an Enum (SMALL, MEDIUM, LARGE)
   * @param scheduledMonthly a Boolean value checking if the service is monthly or a 1 time service
   * @param numberOfFloors the number of floors the scheduled property has
   * @param numberOfServices the number of Gardening servies the property has had in the past
   * @param month the month scheduled for the Gardening service
   */
  public Gardening(String invoiceID, String propertyAddress, PropertySizeEnum propertySize,
      Boolean scheduledMonthly, Integer numberOfServices, Integer numberOfFloors, Integer month) {
    super(invoiceID, propertyAddress, propertySize,
        scheduledMonthly, numberOfServices, numberOfFloors, month);
  }

  /**
   * Gets the gardening waste removal fee.
   *
   * @return the gardening waste removal fee
   */
  public Double gardeningWasteRemovalFee() {
    return wasteRemovalFee;
  }

  @Override
  public Double calculatePrice() {
    Double withoutDiscountPrice = calculatePriceWithoutDiscountHelper();
    Double discountPrice = calculateDiscountHelper();
    return finalPrice = withoutDiscountPrice - (withoutDiscountPrice * discountPrice);
  }

  /**
   * Calculates the gardening price and the waste removal fee.
   *
   * @return the gardening price and waste removal fee added
   */
  private Double calculatePriceWithoutDiscountHelper() {
    gardeningPrice = calculateExteriorServicingPrice();
    return gardeningPrice + wasteRemovalFee;
  }
}