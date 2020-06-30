package edu.neu.ccs.cs5004.problem3.theater;

public interface ITheater {

  /**
   * The Theater is comprised of Row objects. The Theater contains two types of rows:
   * WheelChairAccessible rows and StandardRows. WheelChairAccessible rows are rows that are designated
   * for handicapped people, whereas StandardRows are rows with no designation. Additionally,
   * in order to create a Theater, the Theater must comprise of at least one WheelChair row.
   *
   * String name - name of the Theater
   * AbstractRow wheelChairAccessible - the rows that are wheelChairAccessible
   *
   * In the Theater class, we provide functionality to get the name, and get the designated
   * WheelChairAccessible rows. Lastly, there is a check before creating a theater that determines
   * if the Theater has at least one WheelChairAccessible row. If it does not, then an exception
   * with be thrown.
   */

}
