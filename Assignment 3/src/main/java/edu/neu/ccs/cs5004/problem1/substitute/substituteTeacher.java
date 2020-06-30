package edu.neu.ccs.cs5004.problem1.substitute;

import edu.neu.ccs.cs5004.problem1.Name;
import java.util.Objects;

/**
 * A class representing a Substitute Teacher. A Substitute Teacher has all the same parameters of
 * any other teacher with the addition of having a counting ability to keep track of the amount of
 * days they have worked in a given classroom.
 */
public class substituteTeacher extends abstractSubstituteTeacher {

  protected Integer numberOfDaysInAGivenClassroom;

  /**
   * Constructs a new Substitute Teacher with the given parameters.
   *
   * @param name the name of the Substitute Teacher
   * @param classroom the name of the classroom
   * @param coteacher the name of the Co Teacher
   * @param vacationStatus the vacation status of the Substitute Teacher, represented as a Boolean
   * @param numberOfDaysInAGivenClassroom the number of days a Substitute Teacher has worked in a
   * given classroom
   */
  public substituteTeacher(Name name, String classroom,
      Name coteacher, Integer numberOfDaysInAGivenClassroom, Boolean vacationStatus) {
    super(name, classroom, coteacher, numberOfDaysInAGivenClassroom, vacationStatus);
    this.numberOfDaysInAGivenClassroom = numberOfDaysInAGivenClassroom;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    substituteTeacher that = (substituteTeacher) o;
    return Objects
        .equals(numberOfDaysInAGivenClassroom, that.numberOfDaysInAGivenClassroom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfDaysInAGivenClassroom);
  }

  @Override
  public String toString() {
    return "substituteTeacher{" +
        ", name=" + name +
        ", classroom='" + classroom + '\'' +
        ", coteacher=" + coteacher +
        ", vacationStatus=" + vacationStatus +
        ", numberOfDaysInGivenClassroom=" + numberOfDaysInGivenClassroom +
        '}';
  }
}
