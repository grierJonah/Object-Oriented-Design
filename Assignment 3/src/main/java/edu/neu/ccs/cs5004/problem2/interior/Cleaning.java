package edu.neu.ccs.cs5004.problem2.interior;

import edu.neu.ccs.cs5004.problem2.PropertySizeEnum;
import edu.neu.ccs.cs5004.problem2.exceptions.TooManyFloorsException;

/**
 * A Cleaning class for interior servicing. The cleaning class tracks the number of pets a property
 * owner has in addition to the invoiceID, property address, property size, a monthly servicing
 * check, and a track to see how many services the property has had in the past.
 */
public class Cleaning extends abstractInterior {
  protected Double finalPrice;

  /**
   * Constructs a new Cleaning service with the given parameters.
   *
   * @param invoiceID the invoiceID of the Cleaning service
   * @param propertyAddress the property address of the property
   * @param propertySize the property size represented as an enum (SMALL, MEDIUM, LARGE)
   * @param monthlyService a Boolean value checking if the service is monthly or a 1 time service
   * @param numberOfServices the number of services a property has had
   * @param numberOfPets the number of pets a property owner has
   */
  public Cleaning(String invoiceID, String propertyAddress, PropertySizeEnum propertySize,
      Boolean monthlyService, Integer numberOfServices, Integer numberOfPets) {
    super(invoiceID, propertyAddress, propertySize,
        monthlyService, numberOfServices, numberOfPets);
  }

  @Override
  public Double calculatePrice() {
    Double InteriorCleaningPrice = calculateInteriorCleaningPrice();
    Double petFee = calculatePetPrice();
    Double discountPrice = calculateDiscountHelper();
    Double withoutDiscountPrice = InteriorCleaningPrice + (InteriorCleaningPrice * petFee);
    return finalPrice = withoutDiscountPrice - (withoutDiscountPrice * discountPrice);
  }
}
