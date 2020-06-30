package edu.neu.ccs.cs5004.problem1.exceptions;

/**
 * An exception thrown if the UserPassPair is already initialized when trying to use the add
 * method.
 */
public class PairAlreadyInitializedException extends Exception {

  public PairAlreadyInitializedException(String message) {
    super(message);
  }
}
