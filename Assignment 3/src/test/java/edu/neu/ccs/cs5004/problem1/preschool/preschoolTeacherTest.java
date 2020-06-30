package edu.neu.ccs.cs5004.problem1.preschool;

import static org.junit.Assert.*;

import edu.neu.ccs.cs5004.problem1.Name;
import org.junit.Before;
import org.junit.Test;

public class preschoolTeacherTest {

  private preschoolTeacher preschoolTeacherTest;
  private preschoolTeacher preschoolTeacherTest2;

  Name name = new Name("Jonah", "Grier");
  Name coteacher = new Name("Bob", "Martin");
  Boolean onVacationFalse = Boolean.FALSE;

  @Before
  public void setUp() throws Exception {
    preschoolTeacherTest = new preschoolTeacher(name, "classroom2", coteacher,
        45, 50,
        onVacationFalse, 5);
    preschoolTeacherTest2 = new preschoolTeacher(name, "classroom2", coteacher,
        45, 50,
        onVacationFalse, 5);
  }

  @Test
  public void getNumberOfChildrenAbleToRead() {
    assertEquals(preschoolTeacherTest.getNumberOfChildrenAbleToRead(), 5, 0);
  }

  @Test
  public void setNumberOfChildrenAbleToRead() {
    preschoolTeacherTest.setNumberOfChildrenAbleToRead(50);
    assertEquals(preschoolTeacherTest.getNumberOfChildrenAbleToRead(), 50, 0);
  }

  @Test
  public void convertSubstituteTeacher() {
  }

  @Test
  public void equals() {
    assertTrue(preschoolTeacherTest.equals(preschoolTeacherTest2) &&
        preschoolTeacherTest2.equals(preschoolTeacherTest));
    assertEquals(preschoolTeacherTest.hashCode(), preschoolTeacherTest2.hashCode());
  }

  @Test
  public void testToString() {
    String toString = preschoolTeacherTest.toString();
    System.out.println(toString);
    assertEquals(toString, "preschoolTeacher{, "
            + "name=" + preschoolTeacherTest.getName()
            + ", coteacher=" + preschoolTeacherTest.getCoteacher()
            + ", classroom='" + preschoolTeacherTest.getClassroom()
            + "', currentNumberOfChildren=" + preschoolTeacherTest.getCurrentNumberOfChildren()
            + ", maximumNumberOfChildren=" + preschoolTeacherTest.getMaximumNumberOfChildren()
            + ", vacationStatus="  + preschoolTeacherTest.getVacationStatus()
            + ", numberOfChildrenAbleToRead=" + preschoolTeacherTest.getNumberOfChildrenAbleToRead()
            + "}"
        );
  }
}