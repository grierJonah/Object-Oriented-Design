package edu.neu.ccs.cs5004.problem1.exceptions;

/**
 * An exception thrown if the UserPassPair is already empty when using the replace method.
 */
public class PairEmptyException extends Exception {

  public PairEmptyException(String message) {
    super(message);
  }
}
