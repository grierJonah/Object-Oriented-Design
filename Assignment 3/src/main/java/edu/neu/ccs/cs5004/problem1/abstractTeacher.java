package edu.neu.ccs.cs5004.problem1;

import java.util.Objects;

/**
 * An abstract class representing a Teacher
 */
public abstract class abstractTeacher implements ITeacher {

  protected Name name;
  protected String classroom;
  protected Name coteacher;
  protected Integer currentNumberOfChildren;
  protected Integer maximumNumberOfChildren;
  protected Boolean vacationStatus;
  protected abstractTeacher newTeacher;

  /**
   * Constructs a new Teacher with the given parameters.
   *
   * @param name the teachers name
   * @param classroom the classroom the teacher teaches in, represented as a String
   * @param coteacher the teachers co-teacher, represented as a Name object
   * @param currentNumberOfChildren the current number of kids in the class
   * @param maximumNumberOfChildren the maximum number of kids allowed in the class
   * @param vacationStatus a Boolean check to see if the teacher is on vacation or not
   */
  public abstractTeacher(Name name, String classroom, Name coteacher,
      Integer currentNumberOfChildren, Integer maximumNumberOfChildren, Boolean vacationStatus) {
    this.name = name;
    this.coteacher = coteacher;
    this.classroom = classroom;
    this.currentNumberOfChildren = currentNumberOfChildren;
    this.maximumNumberOfChildren = maximumNumberOfChildren;
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
   * Gets the current number of kids in the classroom.
   *
   * @return the current number of kids in the classroom.
   */
  public Integer getCurrentNumberOfChildren() {
    return currentNumberOfChildren;
  }

  /**
   * Sets the current number of kids in the classroom.
   *
   * @param currentNumberOfChildren the current number of kids in the classroom.
   */
  public void setCurrentNumberOfChildren(Integer currentNumberOfChildren) {
    this.currentNumberOfChildren = currentNumberOfChildren;
  }

  /**
   * Gets the maximum number of kids to be in the classroom.
   *
   * @return the maximum number of kids to be in the classroom.
   */
  public Integer getMaximumNumberOfChildren() {
    return maximumNumberOfChildren;
  }

  /**
   * Sets the maximum number of kids to be in the classroom.
   *
   * @param maximumNumberOfChildren the maximum number of kids to be in the classroom.
   */
  public void setMaximumNumberOfChildren(Integer maximumNumberOfChildren) {
    this.maximumNumberOfChildren = maximumNumberOfChildren;
  }

  /**
   * Gets the vacation status of the teacher.
   *
   * @return the vacation status of the teacher, represented as a Boolean (True or False)
   */
  public Boolean getVacationStatus() {
    return vacationStatus;
  }

  /**
   * Sets the vacation status of the teacher.
   *
   * @param vacationStatus the vacation status of the teacher, represented as a Boolean (True or
   * False)
   */
  public void setVacationStatus(Boolean vacationStatus) {
    this.vacationStatus = vacationStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    abstractTeacher that = (abstractTeacher) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(classroom, that.classroom) &&
        Objects.equals(coteacher, that.coteacher) &&
        Objects.equals(currentNumberOfChildren, that.currentNumberOfChildren) &&
        Objects.equals(maximumNumberOfChildren, that.maximumNumberOfChildren) &&
        Objects.equals(vacationStatus, that.vacationStatus);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(name, classroom, coteacher, currentNumberOfChildren, maximumNumberOfChildren,
            vacationStatus);
  }

  @Override
  public String toString() {
    return "abstractTeacher{" +
        "name=" + name +
        ", classroom='" + classroom + '\'' +
        ", coteacher=" + coteacher +
        ", currentNumberOfChildren=" + currentNumberOfChildren +
        ", maximumNumberOfChildren=" + maximumNumberOfChildren +
        ", vacationStatus=" + vacationStatus +
        '}';
  }
}
