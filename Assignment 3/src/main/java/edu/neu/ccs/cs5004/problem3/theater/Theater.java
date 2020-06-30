package edu.neu.ccs.cs5004.problem3.theater;

import com.sun.rowset.internal.Row;
import edu.neu.ccs.cs5004.problem3.exceptions.WheelChairAccessibility;
import edu.neu.ccs.cs5004.problem3.row.AbstractRow;
import java.util.ArrayList;
import java.util.Objects;


public class Theater extends ArrayList<Row> {
  protected String name;
  protected ArrayList<AbstractRow> Theater = new ArrayList<>();
  protected AbstractRow wheelChairAccessible;


  /**
   * Constructs a new theater with a name.
   *
   * @param name the name of the theater
   */
  public Theater(AbstractRow wheelChairAccessible, String name) throws WheelChairAccessibility {
    checkForAccessibleRows(wheelChairAccessible);
    this.wheelChairAccessible = wheelChairAccessible;
    this.name = name;
  }

  /**
   * Gets the theater row.
   *
   * @return the theater
   */
  public ArrayList<AbstractRow> getTheaterRow() {
    return Theater;
  }

  /**
   * Gets the wheel chair accessible row.
   *
   * @return the wheel chair accessible row
   */
  public AbstractRow getWheelChairAccessibleRow() {
    return wheelChairAccessible;
  }

  /**
   * Checks the accessible rows in the theater. If there are no accessible rows in the theater,
   * than we cannot create a theater.
   *
   * @param wheelChairAccessible a row that is wheel chair accessible
   * @exception WheelChairAccessibility throws exception if the size of the array list is 0
   * (AKA there are no wheelChairAccessible rows in the array list)
   */
  private void checkForAccessibleRows(AbstractRow wheelChairAccessible) throws
      WheelChairAccessibility  {
    if (wheelChairAccessible.size() == 0) {
      throw new WheelChairAccessibility("Cannot create theater, no wheel chair accessible rows");
    }
  }

  @Override
  public String toString() {
    return "Theater{" +
        "name='" + name + '\'' +
        ", Theater=" + Theater +
        ", wheelChairAccessible=" + wheelChairAccessible +
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
    if (!super.equals(o)) {
      return false;
    }
    Theater rows = (Theater) o;
    return Objects.equals(name, rows.name) &&
        Objects.equals(Theater, rows.Theater) &&
        Objects.equals(wheelChairAccessible, rows.wheelChairAccessible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), name, Theater, wheelChairAccessible);
  }
}
