package edu.neu.ccs.cs5004.problem3.row;

import edu.neu.ccs.cs5004.problem3.seat.Seat;
import java.util.ArrayList;
import java.util.Objects;

/**
 * A standard row is a regular movie theater row. It contains no wheelchair accessibility.
 */
public class StandardRow extends AbstractRow {

  protected Integer numberOfSeatsInRow;
  protected ArrayList<Seat> Row = new ArrayList<>();

  /**
   * Constructs a new row with the given parameters: A number of seats in each row, the row number,
   * and a Boolean value if the row is wheel chair accessible or not.
   * @param numberOfSeatsInRow the number of seats in the row
   * @param rowNumber the row number from the screen (1 being closest to screen)
   */
  public StandardRow(Integer numberOfSeatsInRow, Integer rowNumber) {
    this.numberOfSeatsInRow = numberOfSeatsInRow;
    this.rowNumber = rowNumber;
  }

  /**
   * Gets the number of seats in the row.
   *
   * @return the number of seats in the row, represented as an Integer
   */
  public Integer getNumberOfSeatsInRow() {
    return this.numberOfSeatsInRow;
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
    StandardRow seats = (StandardRow) o;
    return Objects.equals(numberOfSeatsInRow, seats.numberOfSeatsInRow) &&
        Objects.equals(Row, seats.Row);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), numberOfSeatsInRow, Row);
  }

  @Override
  public String toString() {
    return "StandardRow{" +
        "numberOfSeatsInRow=" + numberOfSeatsInRow +
        ", Row=" + Row +
        '}';
  }
}
