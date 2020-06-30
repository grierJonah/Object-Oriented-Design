package edu.neu.ccs.cs5004.problem3.exceptions;

/**
 * Exception thrown if no rows are wheel chair accessible
 */
public class WheelChairAccessibility extends Exception {

  public WheelChairAccessibility(String message) {
    super(message);
  }
}
