package edu.neu.ccs.cs5004.problem2;

import edu.neu.ccs.cs5004.problem2.exceptions.TooManyFloorsException;

public interface IService {

  /**
   * Returns a base rate of price per hour. This base rate will help factor larger prices
   * when services take multiple hours or even days to complete.
   *
   * @return the base rate for each type of service (Double 80.0)
   */
  Double baseRate();

  /**
   * Tracks and checks to see if a scheduled servicing is the property's 10th service order. If the
   * property hits the 10th servicing, it will apply a 50% discount to their final price.
   *
   * @return an adjusted servicing price
   */
  Double tenthServiceDiscount();


  Double calculatePrice() throws TooManyFloorsException;

}
