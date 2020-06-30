package edu.neu.ccs.cs5004.problem3.row;

import edu.neu.ccs.cs5004.problem3.seat.Seat;
import java.util.ArrayList;

/**
 * An abstract class for Rows. Provides functionality to both WheelChairRows and StandardRows
 */
public abstract class AbstractRow extends ArrayList<Seat> {

  protected ArrayList<Seat> Row = new ArrayList<>();
  protected Integer rowNumber = 0;


  public AbstractRow() {
  }

  /**
   * Adds a seat object to the row.
   *
   * @param seat a seat object
   */
  public void addSeat(Seat seat) {
    Row.add(seat);
  }

  /**
   * Gets the row number of the row. Gives both wheelchair and standard row accessibility to getting
   * their row number.
   *
   * @return the row number associated to their row
   */
  public Integer getRowNumber() {
    return rowNumber;
  }

  /**
   * Gets the entire row array list. Comprised of seat objects.
   *
   * @return the array list of seat objects. Returns either a wheelchair accessible or standard row
   */
  public ArrayList<Seat> getRow() {
    return Row;
  }




}
