package edu.neu.ccs.cs5004.problem1;

public interface ITeacher {

  /**
   * Converts a substitute teacher into a full time teacher given the parameters.
   *
   * @param substituteTeacher the substitute teacher object
   * @param classroom the classroom
   * @param coteacher the coteacher
   * @return a new full time teacher
   */
  abstractTeacher convertSubstituteTeacher(abstractTeacher substituteTeacher,
      String classroom, Name coteacher);

}
