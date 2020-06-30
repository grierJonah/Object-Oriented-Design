package edu.neu.ccs.cs5004.problem1.infant;

import edu.neu.ccs.cs5004.problem1.Name;
import edu.neu.ccs.cs5004.problem1.abstractTeacher;
import java.util.Objects;

/**
 * A subclass of abstractTeacher representing an Infant Teacher. The Infant Teacher has all the same
 * parameters of any other teacher with the addition of, a current number of crawling children, and
 * current number of walking children.
 */
public class infantTeacher extends abstractTeacher {

  private Integer currentNumberOfCrawlers;
  private Integer currentNumberOfWalkers;
  protected infantTeacher newInfantTeacher;

  /**
   * Constructs a new Infant Teacher with the given parameters.
   *
   * @param name the Infant Teacher's name
   * @param classroom the Infant Teacher's classroom, represented as a String
   * @param coteacher the Infant Teacher's Co-Teacher
   * @param currentNumberOfChildren the current number of children in the classroom
   * @param maximumNumberOfChildren the maximum number of children in the classroom
   * @param vacationStatus the teacher's current vacation status, represented as a Boolean
   * @param currentNumberOfCrawlers the current number of children who are crawling in the
   * classroom
   * @param currentNumberOfWalkers the current number of children who are walking in the classroom
   */
  public infantTeacher(Name name, String classroom, Name coteacher,
      Integer currentNumberOfChildren, Integer maximumNumberOfChildren, Boolean vacationStatus,
      Integer currentNumberOfCrawlers, Integer currentNumberOfWalkers) {
    super(name, classroom, coteacher,
        currentNumberOfChildren, maximumNumberOfChildren, vacationStatus);
    this.currentNumberOfCrawlers = currentNumberOfCrawlers;
    this.currentNumberOfWalkers = currentNumberOfWalkers;
  }

  /**
   * Gets the current number of children who are crawling in the classroom.
   *
   * @return the current number of children who are crawling in the classroom.
   */
  public Integer getCurrentNumberOfCrawlers() {
    return currentNumberOfCrawlers;
  }

  /**
   * Sets the current number of children who are crawling in the classroom.
   *
   * @param currentNumberOfCrawlers the current number of children who are crawling in the
   * classroom.
   */
  public void setCurrentNumberOfCrawlers(Integer currentNumberOfCrawlers) {
    this.currentNumberOfCrawlers = currentNumberOfCrawlers;
  }

  /**
   * Gets the current number of children who are walking in the classroom.
   *
   * @return the current number of children who are walking in the classroom.
   */
  public Integer getCurrentNumberOfWalkers() {
    return currentNumberOfWalkers;
  }

  /**
   * Sets the current number of children who are walking in the classroom.
   *
   * @param currentNumberOfWalkers the current number of children who are walking in the classroom.
   */
  public void setCurrentNumberOfWalkers(Integer currentNumberOfWalkers) {
    this.currentNumberOfWalkers = currentNumberOfWalkers;
  }

  /**
   * Converts a substitute teacher into a full time infant teacher by using the abstract class
   * to help.
   *
   * @param substitute the substitute teacher wishing to be converted to full time
   * @param classroom the classroom she wants to be a full time teacher for
   * @param coteacher the co-teacher she will be teaching with
   * @return a new infant teacher
   */
  public abstractTeacher convertSubstituteTeacher(abstractTeacher substitute, String classroom, Name coteacher) {
    newInfantTeacher.setName(substitute.getName());
    newInfantTeacher.setClassroom(classroom);
    newInfantTeacher.setCoteacher(coteacher);
    return newInfantTeacher;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    infantTeacher that = (infantTeacher) o;
    return Objects.equals(currentNumberOfCrawlers, that.currentNumberOfCrawlers) &&
        Objects.equals(currentNumberOfWalkers, that.currentNumberOfWalkers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentNumberOfCrawlers, currentNumberOfWalkers);
  }

  @Override
  public String toString() {
    return "infant{" +
        ", name=" + name +
        ", coteacher=" + coteacher +
        ", classroom='" + classroom + '\'' +
        ", currentNumberOfChildren=" + currentNumberOfChildren +
        ", maximumNumberOfChildren=" + maximumNumberOfChildren +
        ", vacationStatus=" + vacationStatus +
        ", currentNumberOfCrawlers=" + currentNumberOfCrawlers +
        ", currentNumberOfWalkers=" + currentNumberOfWalkers +
        '}';
  }
}
