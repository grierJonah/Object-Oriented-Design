package edu.neu.ccs.cs5004.problem3.exceptions;

/**
 * Exception thrown when input is not an alphabetical character.
 */
public class AlphabetOnly extends Exception {

  public AlphabetOnly(String message) {
    super(message);
  }

}
