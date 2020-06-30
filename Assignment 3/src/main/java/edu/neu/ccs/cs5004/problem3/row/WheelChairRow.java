package edu.neu.ccs.cs5004.problem3.row;

import edu.neu.ccs.cs5004.problem3.row.AbstractRow;
import edu.neu.ccs.cs5004.problem3.seat.Seat;
import java.util.ArrayList;
import java.util.Objects;

/**
 * A class representing a WheelChair accessible row. This class creates an entirely new row
 * that is specially designed for handicapped people. This way, instead of checking every row for a
 * field, we can check that a Theater contains an entire wheelchair row object.
 */
public class WheelChairRow extends AbstractRow {

  protected Integer numberOfSeatsInRow;
  protected ArrayList<Seat> wheelChairRow = new ArrayList<>();

  /**
   * Constructs a wheelchair row with a number of seats in the entire row, and a row number.
   *
   * @param numberOfSeatsInRow the number of seats in the row
   * @param rowNumber the number of the row (Integer distance from movie screen. 1 being closest)
   */
  public WheelChairRow(Integer numberOfSeatsInRow, Integer rowNumber) {
    this.numberOfSeatsInRow = numberOfSeatsInRow;
    this.rowNumber = rowNumber;
  }

  /**
   * Gets the number of seats in the WheelChairRow.
   *
   * @return the number of seats in the row, represented as an Integer.
   */
  public Integer getNumberOfSeatsInRow() {
    return numberOfSeatsInRow;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    WheelChairRow seats = (WheelChairRow) o;
    return Objects.equals(numberOfSeatsInRow, seats.numberOfSeatsInRow) &&
        Objects.equals(wheelChairRow, seats.wheelChairRow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), numberOfSeatsInRow, wheelChairRow);
  }

  @Override
  public String toString() {
    return "WheelChairRow{" +
        "numberOfSeatsInRow=" + numberOfSeatsInRow +
        ", wheelChairRow=" + wheelChairRow +
        '}';
  }
}
