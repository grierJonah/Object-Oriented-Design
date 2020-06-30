package edu.neu.ccs.cs5004.problem2.exterior;

import edu.neu.ccs.cs5004.problem2.exceptions.TooManyFloorsException;
import edu.neu.ccs.cs5004.problem2.PropertySizeEnum;

/**
 * A window cleaning class that tracks the number of floors, and month of service.
 */
public class windowCleaning extends abstractExterior {

  protected Double exteriorServicingPrice;
  protected Double currentDiscount;
  protected Double finalPrice;

  /**
   * Constructs a new window cleaning service with the given parameters.
   *
   * @param invoiceID the invoiceID of the window cleaning
   * @param propertyAddress the property address of the scheduled window cleaning
   * @param propertySize the property size represented as an enum (SMALL, MEDIUM, LARGE)
   * @param monthlyService a Boolean value representing if the house is a recurrent buyer
   * @param numberOfServices the number of services the property has purchased
   * @param numberOfFloors the number of floors the house has
   * @param month the month of the scheduled service, represented as an Integer
   */
  public windowCleaning(String invoiceID, String propertyAddress, PropertySizeEnum propertySize,
      Boolean monthlyService, Integer numberOfServices, Integer numberOfFloors, Integer month) {
    super(invoiceID, propertyAddress, propertySize,
        monthlyService, numberOfServices, numberOfFloors, month);
  }

  /**
   * This method calculates the dollar amount that a property owner will have to pay based on the
   * attributes the property has. Additionally, in order for the property owner to have their
   * windows cleaned, they must have a property with less than 3 floors. If they have a property
   * with more than 3 floors, then an exception will be thrown and a cost will not be provided.
   * Also, the calculatePrice method also notes whether or not the property owner has any valid
   * discounts to be applied. Lastly, if the property does have more than 1 floor (and less than 3),
   * the property is subject to an additional 5% increase in price. The 5% will be added PRIOR to
   * the discount.
   *
   * @return the final price the property owner has to pay.
   */
  @Override
  public Double calculatePrice() throws TooManyFloorsException {
    Double multipleFloorsFee = checkLadderHeight();
    Double exteriorServiceFee = calculateExteriorServicingPrice();
    Double discountPrice = calculateDiscountHelper();
    Double priceBeforeDiscount = exteriorServiceFee + (exteriorServiceFee * multipleFloorsFee);
    return finalPrice = priceBeforeDiscount - (priceBeforeDiscount * discountPrice);
  }

  /**
   * This method is a helper function to properly instantiate a window cleaning service. The ladders
   * provided for the window cleaning service are only capable of reaching up to 3 stories. If the
   * property requesting service has a property with more than 3 floors, then a
   * TooManyFloorsException will be thrown.
   *
   * @return the percentage to be added to the final bill
   */
  private Double checkLadderHeight() throws TooManyFloorsException {
    if (numberOfFloors == 0) {
      return NO_COST;
    } else if (numberOfFloors > 1 && numberOfFloors <= 3) {
      return FIVE_PERCENT;
    } else {
      throw new TooManyFloorsException("Error: Cannot schedule window cleaning. "
          + "Ladder height is limited to 3 stories.");
    }
  }
}
