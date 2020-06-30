package edu.neu.ccs.cs5004.problem1.substitute;

import edu.neu.ccs.cs5004.problem1.ITeacher;
import edu.neu.ccs.cs5004.problem1.Name;
import edu.neu.ccs.cs5004.problem1.abstractTeacher;

/**
 * An abstract class representing a Substitute Teacher. The substitute teacher does not have any
 * track of students so this abstract class helps reduce repeat code.
 */
public abstract class abstractSubstituteTeacher implements ITeacher {

  protected Name name;
  protected String classroom;
  protected Name coteacher;
  protected Boolean vacationStatus;
  protected Integer numberOfDaysInGivenClassroom;
  protected abstractTeacher newTeacher;

  /**
   * Constructs a new Substitute Teacher given the parameters.
   *
   * @param name the name of the Substitute Teacher
   * @param classroom the name of the classroom, represented as a String
   * @param coteacher the name of the Co-Teacher
   * @param numberOfDaysInGivenClassroom the number of days worked in a specific classroom
   * @param vacationStatus the vacation status of the Substitute Teacher
   */
  public abstractSubstituteTeacher(Name name, String classroom, Name coteacher,
      Integer numberOfDaysInGivenClassroom, Boolean vacationStatus) {
    this.name = name;
    this.coteacher = coteacher;
    this.classroom = classroom;
    this.numberOfDaysInGivenClassroom = numberOfDaysInGivenClassroom;
    this.vacationStatus = vacationStatus;
  }

  /**
   * Gets the teachers name.
   *
   * @return the teachers name.
   */
  public Name getName() {
    return name;
  }

  /**
   * Sets the teachers name.
   *
   * @param name the teachers name.
   */
  public void setName(Name name) {
    this.name = name;
  }

  /**
   * Gets the current teacher's classroom.
   *
   * @return the teacher's classroom.
   */
  public String getClassroom() {
    return classroom;
  }

  /**
   * Sets the current teacher's classroom.
   *
   * @param classroom the current teacher's classroom.
   */
  public void setClassroom(String classroom) {
    this.classroom = classroom;
  }

  /**
   * Gets the Co-Teacher's name.
   *
   * @return the Co-Teacher's name.
   */
  public Name getCoteacher() {
    return coteacher;
  }

  /**
   * Sets the Co-Teacher's name.
   *
   * @param coteacher the Co-Teacher's name
   */
  public void setCoteacher(Name coteacher) {
    this.coteacher = coteacher;
  }

  /**
   * Gets the number of days in a given classroom.
   *
   * @return the number of days in a given classroom
   */
  public Integer getNumberOfDaysInGivenClassroom() {
    return numberOfDaysInGivenClassroom;
  }

  /**
   * Sets the number of days in a given classroom.
   *
   * @param numberOfDaysInGivenClassroom the number of days in a given classroom
   */
  public void setNumberOfDaysInGivenClassroom(Integer numberOfDaysInGivenClassroom) {
    this.numberOfDaysInGivenClassroom = numberOfDaysInGivenClassroom;
  }

  /**
   * Gets Boolean value of the teacher vacation status.
   *
   * @return the vacation status (true or false)
   */
  public Boolean getVacationStatus() {
    return vacationStatus;
  }

  /**
   * Sets Boolean value of the teacher vacation status.
   *
   * @param vacationStatus the vacation status (true or false)
   */
  public void setVacationStatus(Boolean vacationStatus) {
    this.vacationStatus = vacationStatus;
  }

  /**
   * Converts a substitute teacher into a full time teacher.
   *
   * @param newTeacher a new teacher
   * @param classroom the classroom
   * @param coteacher the coteacher
   * @return
   */
  public abstractTeacher convertSubstituteTeacher(abstractTeacher newTeacher,
      String classroom, Name coteacher) {
    newTeacher.setName(name);
    newTeacher.setClassroom(classroom);
    newTeacher.setCoteacher(coteacher);
    return newTeacher;
  }
}
