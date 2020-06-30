package edu.neu.ccs.cs5004.problem1.toddler;

import edu.neu.ccs.cs5004.problem1.Name;
import edu.neu.ccs.cs5004.problem1.abstractTeacher;
import java.util.Objects;

/**
 * A class representing a Toddler Teacher. A Toddler Teacher has all the same parameters of any
 * other teacher with the addition of having a counting ability to keep track of children wearing
 * diapers, and children who are potty trained.
 */
public class toddlerTeacher extends abstractTeacher {

  private Integer numberOfChildrenWearingDiapers;
  private Integer numberOfChildrenPottyTrained;
  protected abstractTeacher newTeacher;

  /**
   * Constructs a new Toddler Teacher object with the given parameters.
   *
   * @param name the name of the Toddler Teacher
   * @param coteacher the name of the Co Teacher of the Toddler Teacher
   * @param classroom the classroom of the Toddler Teacher
   * @param currentNumberOfChildren the current number of students in the classroom
   * @param maximumNumberOfChildren the maximum number of students in the classroom
   * @param vacationStatus the vacation status of the teacher
   * @param numberOfChildrenWearingDiapers the number of children wearing diapers in the classroom
   * @param numberOfChildrenPottyTrained the number of children potty trained in the classroom
   */
  public toddlerTeacher(Name name, String classroom, Name coteacher,
      Integer currentNumberOfChildren, Integer maximumNumberOfChildren, Boolean vacationStatus,
      Integer numberOfChildrenWearingDiapers, Integer numberOfChildrenPottyTrained) {
    super(name, classroom, coteacher, currentNumberOfChildren,
        maximumNumberOfChildren, vacationStatus);
    this.numberOfChildrenWearingDiapers = numberOfChildrenWearingDiapers;
    this.numberOfChildrenPottyTrained = numberOfChildrenPottyTrained;
  }

  /**
   * Gets the current number of children wearing diapers in the classroom.
   *
   * @return the number of children wearing diapers in the classroom.
   */
  public Integer getNumberOfChildrenWearingDiapers() {
    return numberOfChildrenWearingDiapers;
  }

  /**
   * Sets the number of children wearing diapers in the classroom.
   *
   * @param numberOfChildrenWearingDiapers the number of students wearing diapers in the classroom,
   * represented as an Integer
   */
  public void setNumberOfChildrenWearingDiapers(Integer numberOfChildrenWearingDiapers) {
    this.numberOfChildrenWearingDiapers = numberOfChildrenWearingDiapers;
  }

  /**
   * Gets the number of children potty trained in the classroom.
   *
   * @return the number of children potty trained in the classroom
   */
  public Integer getNumberOfChildrenPottyTrained() {
    return numberOfChildrenPottyTrained;
  }

  /**
   * Sets the number of children potty trained in the classroom.
   *
   * @param numberOfChildrenPottyTrained the number of children potty trained.
   */
  public void setNumberOfChildrenPottyTrained(Integer numberOfChildrenPottyTrained) {
    this.numberOfChildrenPottyTrained = numberOfChildrenPottyTrained;
  }

  /**
   * Converts a substitute teacher into a full time toddler teacher by using the abstract class
   * to help.
   *
   * @param substitute the substitute teacher wishing to be converted to full time
   * @param classroom the classroom she wants to be a full time teacher for
   * @param coteacher the co-teacher she will be teaching with
   * @return a new toddler teacher
   */
  public abstractTeacher convertSubstituteTeacher(abstractTeacher substitute,
      String classroom, Name coteacher) {
    newTeacher.setName(substitute.getName());
    newTeacher.setClassroom(classroom);
    newTeacher.setCoteacher(coteacher);
    return (toddlerTeacher) newTeacher;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    toddlerTeacher that = (toddlerTeacher) o;
    return
        Objects.equals(numberOfChildrenWearingDiapers, that.numberOfChildrenWearingDiapers)
            &&
            Objects.equals(numberOfChildrenPottyTrained, that.numberOfChildrenPottyTrained);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfChildrenWearingDiapers, numberOfChildrenPottyTrained);
  }

  @Override
  public String toString() {
    return "toddlerTeacher{" +
        ", name=" + name +
        ", coteacher=" + coteacher +
        ", classroom='" + classroom + '\'' +
        ", currentNumberOfChildren=" + currentNumberOfChildren +
        ", maximumNumberOfChildren=" + maximumNumberOfChildren +
        ", vacationStatus=" + vacationStatus +
        ", numberOfChildrenWearingDiapers=" + numberOfChildrenWearingDiapers +
        ", numberOfChildrenPottyTrained=" + numberOfChildrenPottyTrained +
        '}';
  }
}
