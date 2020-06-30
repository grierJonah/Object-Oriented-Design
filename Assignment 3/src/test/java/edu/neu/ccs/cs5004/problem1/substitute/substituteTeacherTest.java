package edu.neu.ccs.cs5004.problem1.substitute;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import edu.neu.ccs.cs5004.problem1.Name;
import org.junit.Before;
import org.junit.Test;

public class substituteTeacherTest {

  private substituteTeacher substituteTeacherTest;
  private substituteTeacher substituteTeacherTest2;

  Name name = new Name("Jonah", "Grier");
  Name coteacher = new Name("Bob", "Martin");
  Boolean onVacationFalse = Boolean.FALSE;

  @Before
  public void setUp() throws Exception {
    substituteTeacherTest = new substituteTeacher(name, "classroom4", coteacher,
        10, onVacationFalse);
    substituteTeacherTest2 = new substituteTeacher(name, "classroom4", coteacher,
        10, onVacationFalse);
  }

  @Test
  public void getNumberOfDaysInAGivenClassroom() {
    assertEquals(substituteTeacherTest.getNumberOfDaysInGivenClassroom(), 10, 0);
  }

  @Test
  public void setNumberOfDaysInGivenClassroom() {
    substituteTeacherTest.setNumberOfDaysInGivenClassroom(55);
    assertEquals(substituteTeacherTest.getNumberOfDaysInGivenClassroom(), 55, 0);
  }

  @Test
  public void equals() {
    assertEquals(true, substituteTeacherTest.equals(substituteTeacherTest2) &&
        substituteTeacherTest2.equals(substituteTeacherTest));
  }


  @Test
  public void testHashcode() {
    boolean isEqual = substituteTeacherTest.hashCode() == substituteTeacherTest2.hashCode();
    assertTrue("Hashes are equal", isEqual);
  }

  @Test
  public void testToString() {
    String toString = substituteTeacherTest.toString();
    System.out.println(toString);
    assertEquals(substituteTeacherTest.toString(), "substituteTeacher{"
        + ", name=" + substituteTeacherTest.getName()
        + ", classroom='" + substituteTeacherTest.getClassroom()
        + "', coteacher=" + substituteTeacherTest.getCoteacher()
        + ", vacationStatus=" + substituteTeacherTest.getVacationStatus()
        + ", numberOfDaysInGivenClassroom=" + substituteTeacherTest
        .getNumberOfDaysInGivenClassroom()
        + "}");
  }

}