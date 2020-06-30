package edu.neu.ccs.cs5004.problem1.preschool;

import edu.neu.ccs.cs5004.problem1.Name;
import edu.neu.ccs.cs5004.problem1.abstractTeacher;
import java.util.Objects;

/**
 * A class representing a Preschool Teacher. A Preschool Teacher has all the same parameters of any
 * other teacher with the addition of having a counting ability to keep track of children who can
 * read.
 */
public class preschoolTeacher extends abstractTeacher {

  protected Integer numberOfChildrenAbleToRead;
  protected preschoolTeacher newPreschoolTeacher;

  /**
   * Constructs a new Preschool Teacher with the given parameters.
   *
   * @param name the name of the Preschool Teacher
   * @param coteacher the name of the Co Teacher
   * @param classroom the classroom of the Preschool Teacher, represented as a String
   * @param currentNumberOfChildren the current number of children in the classroom
   * @param maximumNumberOfChildren the maximum number of children in the classroom
   * @param vacationStatus the vacation status of the teacher, represented as a Boolean
   * @param numberOfChildrenAbleToRead the current number of children who can read
   */
  public preschoolTeacher(Name name, String classroom, Name coteacher,
      Integer currentNumberOfChildren, Integer maximumNumberOfChildren, Boolean vacationStatus,
      Integer numberOfChildrenAbleToRead) {
    super(name, classroom, coteacher, currentNumberOfChildren,
        maximumNumberOfChildren, vacationStatus);
    this.numberOfChildrenAbleToRead = numberOfChildrenAbleToRead;
  }

  /**
   * Gets the number of children in the classroom who are able to read.
   *
   * @return the number of children who can read
   */
  public Integer getNumberOfChildrenAbleToRead() {
    return numberOfChildrenAbleToRead;
  }

  /**
   * Sets the number of children in the classroom who are able to read.
   *
   * @param numberOfChildrenAbleToRead the number of children in the classroom who can read
   */
  public void setNumberOfChildrenAbleToRead(Integer numberOfChildrenAbleToRead) {
    this.numberOfChildrenAbleToRead = numberOfChildrenAbleToRead;
  }

  /**
   * Converts a substitute teacher into a full time preschool teacher by using the abstract class
   * to help.
   *
   * @param substitute the substitute teacher wishing to be converted to full time
   * @param classroom the classroom she wants to be a full time teacher for
   * @param coteacher the co-teacher she will be teaching with
   * @return a new preschool teacher
   */
  public abstractTeacher convertSubstituteTeacher(abstractTeacher substitute,
      String classroom, Name coteacher) {
    newPreschoolTeacher.setName(substitute.getName());
    newPreschoolTeacher.setCoteacher(coteacher);
    newPreschoolTeacher.setClassroom(classroom);
    return newPreschoolTeacher;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    preschoolTeacher that = (preschoolTeacher) o;
    return Objects.equals(numberOfChildrenAbleToRead, that.numberOfChildrenAbleToRead);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfChildrenAbleToRead);
  }

  @Override
  public String toString() {
    return "preschoolTeacher{" +
        ", name=" + name +
        ", coteacher=" + coteacher +
        ", classroom='" + classroom + '\'' +
        ", currentNumberOfChildren=" + currentNumberOfChildren +
        ", maximumNumberOfChildren=" + maximumNumberOfChildren +
        ", vacationStatus=" + vacationStatus +
        ", numberOfChildrenAbleToRead=" + numberOfChildrenAbleToRead +
        '}';
  }
}
