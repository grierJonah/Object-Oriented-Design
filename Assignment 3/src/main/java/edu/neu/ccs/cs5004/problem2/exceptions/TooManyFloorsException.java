package edu.neu.ccs.cs5004.problem2.exceptions;

/**
 * An exception that is thrown if the number of floors for a given property is greater than 3.
 */
public class TooManyFloorsException extends Exception {

  /**
   * Throws an exception if the number of floors for a given property is greater than 3. The ladders
   * for a window cleaning can only reach up to 3 floors. Anything higher is a flag and cannot be
   * processed.
   *
   * @param message the message of the error
   */
  public TooManyFloorsException(String message) {
    super(message);
  }
}
