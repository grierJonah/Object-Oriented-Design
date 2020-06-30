package edu.neu.ccs.cs5004.problem2.interior;

import edu.neu.ccs.cs5004.problem2.exceptions.TooManyFloorsException;
import edu.neu.ccs.cs5004.problem2.PropertySizeEnum;

/**
 * A Painting class for interior services. The painting class also keeps track of the number of pets
 * the property has in addition to the invoiceID, property address, property size, a check to see if
 * the property is a routinely servicing, and a track of the number of services.
 */
public class Painting extends abstractInterior {

  private Double finalPrice;

  /**
   * Constructs a new Painting service with the given parameters.
   *
   * @param invoiceID the invoiceID of the painting service
   * @param propertyAddress the property address of the property
   * @param propertySize the property size represented as an enum (SMALL, MEDIUM, LARGE)
   * @param scheduledMonthly a Boolean value checking if the service is monthly or a 1 time service
   * @param numberOfServices the number of services the property has had
   * @param numberOfPets the number of pets the property has
   */
  public Painting(String invoiceID, String propertyAddress, PropertySizeEnum propertySize,
      Boolean scheduledMonthly, Integer numberOfServices, Integer numberOfPets) {
    super(invoiceID, propertyAddress, propertySize,
        scheduledMonthly, numberOfServices, numberOfPets);
  }

  @Override
  public Double calculatePrice() {
    Double InteriorPaintingPrice = calculateInteriorPaintingPrice();
    Double petFee = calculatePetPrice();
    Double discountPrice = calculateDiscountHelper();
    Double withoutDiscountPrice = InteriorPaintingPrice + (InteriorPaintingPrice * petFee);
    return finalPrice = withoutDiscountPrice - (withoutDiscountPrice * discountPrice);
  }
}
