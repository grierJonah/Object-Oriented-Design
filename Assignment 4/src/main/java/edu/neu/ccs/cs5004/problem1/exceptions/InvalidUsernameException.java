package edu.neu.ccs.cs5004.problem1.exceptions;

/**
 * An exception thrown if the user provides the wrong Username when trying to delete their
 * UserPassPair.
 */
public class InvalidUsernameException extends Exception {

  public InvalidUsernameException(String message) {
    super(message);
  }
}
