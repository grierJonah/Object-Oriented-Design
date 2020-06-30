package edu.neu.ccs.cs5004.problem1.toddler;

import static org.junit.Assert.*;

import edu.neu.ccs.cs5004.problem1.Name;
import edu.neu.ccs.cs5004.problem1.abstractTeacher;
import org.junit.Before;
import org.junit.Test;

public class toddlerTeacherTest {

  private toddlerTeacher toddlerTeacherTest;
  private abstractTeacher substituteTeacher;
  private toddlerTeacher toddlerTeacherTest2;
  private toddlerTeacher convertedToddlerTeacher;

  Name name = new Name("Jonah", "Grier");
  Name coteacher = new Name("Bob", "Martin");
  Boolean onVacationFalse = Boolean.FALSE;
  Integer currentNumberOfChildren = 35;

  @Before
  public void setUp() throws Exception {
    toddlerTeacherTest = new toddlerTeacher(name, "classroom3", coteacher,
        35, 50, onVacationFalse,
        5, 10);
    toddlerTeacherTest2 = new toddlerTeacher(name, "classroom3", coteacher,
        35, 50, onVacationFalse,
        5, 10);
    substituteTeacher = new abstractTeacher(name, "classroom5", coteacher,
        45, 50, Boolean.FALSE) {
      @Override
      public abstractTeacher convertSubstituteTeacher(abstractTeacher substituteTeacher,
          String classroom, Name coteacher) {
        return convertedToddlerTeacher;
      }
    };
  }

  @Test
  public void getNumberOfChildrenWearingDiapers() {
    assertEquals(toddlerTeacherTest.getNumberOfChildrenWearingDiapers(), 5, 0);
  }

  @Test
  public void setNumberOfChildrenWearingDiapers() {
    toddlerTeacherTest.setNumberOfChildrenWearingDiapers(50);
    assertEquals(toddlerTeacherTest.getNumberOfChildrenWearingDiapers(), 50, 0);
  }

  @Test
  public void getNumberOfChildrenPottyTrained() {
    assertEquals(toddlerTeacherTest.getNumberOfChildrenPottyTrained(), 10, 0);
  }

  @Test
  public void setNumberOfChildrenPottyTrained() {
    toddlerTeacherTest.setNumberOfChildrenPottyTrained(30);
    assertEquals(toddlerTeacherTest.getNumberOfChildrenPottyTrained(), 30, 0);
  }

  @Test
  public void equals() {
    assertTrue(toddlerTeacherTest.equals(toddlerTeacherTest2) &&
        toddlerTeacherTest2.equals(toddlerTeacherTest));
  }


  @Test
  public void testHashCode() {
    boolean isEqual = toddlerTeacherTest.hashCode() == toddlerTeacherTest2.hashCode();
    assertTrue("Hashes are equal", isEqual);
  }

  @Test
  public void testToString() {
    String toString = toddlerTeacherTest.toString();
    System.out.println(toString);
    assertEquals(toString, "toddlerTeacher{, "
        + "name=" + toddlerTeacherTest.getName()
        + ", coteacher=" + toddlerTeacherTest.getCoteacher()
        + ", classroom='" + toddlerTeacherTest.getClassroom()
        + "', currentNumberOfChildren=" + toddlerTeacherTest.getCurrentNumberOfChildren()
        + ", maximumNumberOfChildren=" + toddlerTeacherTest.getMaximumNumberOfChildren()
        + ", vacationStatus=" + toddlerTeacherTest.getVacationStatus()
        + ", numberOfChildrenWearingDiapers=" + toddlerTeacherTest
        .getNumberOfChildrenWearingDiapers()
        + ", numberOfChildrenPottyTrained=" + toddlerTeacherTest.getNumberOfChildrenPottyTrained()
        + "}");
  }
}