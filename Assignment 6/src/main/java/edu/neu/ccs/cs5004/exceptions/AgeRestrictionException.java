package edu.neu.ccs.cs5004.exceptions;

/**
 * Thrown if the purchaser is under 21 when purchasing alcohol.
 */
public class AgeRestrictionException extends Exception {
  public AgeRestrictionException(String msg) {
    super(msg);
  }
}
