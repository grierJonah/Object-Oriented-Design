package edu.neu.ccs.cs5004.problem3.seat;

import edu.neu.ccs.cs5004.problem3.exceptions.AlphabetOnly;
import java.util.Objects;

/**
 * A class representing a Seat object. The seat is what defines our Row array lists. The Seat
 * contains a seat letter to define where in the row it is, and an optional reserved status. If the
 * seat is reserved, than it will have a corresponding name, otherwise it will only contain a
 * seatLetter and null field for a reservation.
 */
public class Seat {

  private String seatLetter;
  private String reservedFor;

  /**
   * Constructs a new seat with a seat letter for finding the correct seat in the movie theater row
   * as well as a name indicating if the seat was reserved or not.
   *
   * @param seatLetter A letter between 'A-Z' indicating where in the movie theater row it is
   * @param reservedFor A name indicating whether the current seat has been marked for reservation
   */
  public Seat(String seatLetter, String reservedFor) throws AlphabetOnly {
    this.seatLetter = checkAlphabeticalLetter(seatLetter);
    this.reservedFor = reservedFor;
  }

  /**
   * Constructs a new seat with a seat letter for finding the correct seat in the movie theater.
   *
   * @param seatLetter A letter between 'A-Z' indicating where in the movie theater row it is
   */
  public Seat(String seatLetter) throws AlphabetOnly {
    this.seatLetter = checkAlphabeticalLetter(seatLetter);
    this.reservedFor = null;
  }

  /**
   * Helper function that checks whether the inputted seat letter is a letter between A-Z. Uses
   * regex pattern matching.
   *
   * @param seatLetter the seat letter provided
   * @return the seatLetter provided
   * @throws AlphabetOnly an exception that will be thrown if the entered seat letter is not a
   * letter.
   */
  private String checkAlphabeticalLetter(String seatLetter) throws AlphabetOnly {
    if (seatLetter.matches("[a-zA-Z]")) {
      return seatLetter;
    } else {
      throw new AlphabetOnly("seat Letter entered must be between 'A-Z'");
    }
  }

  /**
   * Gets the seat letter of the corresponding seat.
   *
   * @return an alphabetical seat letter
   */
  public String getSeatLetter() {
    return seatLetter;
  }

  /**
   * Sets the seat letter of the corresponding seat.
   *
   * @param seatLetter a letter between [a-zA-Z]
   */
  public void setSeatLetter(String seatLetter) {
    this.seatLetter = seatLetter;
  }

  /**
   * Gets the name corresponding to a reserved seat.
   *
   * @return a name
   */
  public String getReservedFor() {
    return reservedFor;
  }

  /**
   * Sets a name to a seat.
   *
   * @param reservedFor a name
   */
  public void setReservedFor(String reservedFor) {
    this.reservedFor = reservedFor;
  }

  @Override
  public String toString() {
    return "Seat{" +
        "seatLetter='" + seatLetter + '\'' +
        ", reservedFor='" + reservedFor + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Seat seat = (Seat) o;
    return Objects.equals(seatLetter, seat.seatLetter) &&
        Objects.equals(reservedFor, seat.reservedFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seatLetter, reservedFor);
  }
}
