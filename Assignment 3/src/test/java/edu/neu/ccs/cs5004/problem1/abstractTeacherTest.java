package edu.neu.ccs.cs5004.problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class abstractTeacherTest {

  abstractTeacher abstractTeacherTest;
  abstractTeacher abstractTeacherTest2;
  Name name = new Name("Jonah", "Grier");
  Name coteacher = new Name("Bob", "Martin");


  @Before
  public void setUp() throws Exception {

    abstractTeacherTest = new abstractTeacher(name, "classroom1", coteacher,
        35, 50, Boolean.TRUE) {
      @Override
      public abstractTeacher convertSubstituteTeacher(abstractTeacher substituteTeacher,
          String classroom, Name coteacher) {
        return null;
      }
    };

    abstractTeacherTest2 = new abstractTeacher(name, "classroom1", coteacher,
        35, 50, Boolean.TRUE) {
      @Override
      public abstractTeacher convertSubstituteTeacher(abstractTeacher substituteTeacher,
          String classroom, Name coteacher) {
        return null;
      }
    };
  }

  @Test
  public void getName() {
    assertEquals(abstractTeacherTest.getName().getFirstName(), name.getFirstName());
    assertEquals(abstractTeacherTest.getName().getLastName(), name.getLastName());
  }

  @Test
  public void setName() {
    abstractTeacherTest.setName(coteacher);
    assertEquals(abstractTeacherTest.getName().getFirstName(), "Bob");
    assertEquals(abstractTeacherTest.getName().getLastName(), "Martin");
  }

  @Test
  public void getClassroom() {
    assertEquals(abstractTeacherTest.getClassroom(), "classroom1");
  }

  @Test
  public void setClassroom() {
    abstractTeacherTest.setClassroom("classroom2");
    assertEquals(abstractTeacherTest.getClassroom(), "classroom2");
  }

  @Test
  public void getCoteacher() {
    assertEquals(abstractTeacherTest.getCoteacher().getFirstName(), coteacher.getFirstName());
    assertEquals(abstractTeacherTest.getCoteacher().getLastName(), coteacher.getLastName());
  }

  @Test
  public void setCoteacher() {
    abstractTeacherTest.setCoteacher(name);
    assertEquals(abstractTeacherTest.getCoteacher().getFirstName(), name.getFirstName());
    assertEquals(abstractTeacherTest.getCoteacher().getLastName(), name.getLastName());
  }

  @Test
  public void getCurrentNumberOfChildren() {
    assertEquals(abstractTeacherTest.getCurrentNumberOfChildren(), 35, 0);
  }

  @Test
  public void setCurrentNumberOfChildren() {
    abstractTeacherTest.setCurrentNumberOfChildren(50);
    assertEquals(abstractTeacherTest.getCurrentNumberOfChildren(), 50, 0);
  }

  @Test
  public void getMaximumNumberOfChildren() {
    assertEquals(abstractTeacherTest.getMaximumNumberOfChildren(), 50, 0);
  }

  @Test
  public void setMaximumNumberOfChildren() {
    abstractTeacherTest.setMaximumNumberOfChildren(100);
    assertEquals(abstractTeacherTest.getMaximumNumberOfChildren(), 100, 0);
  }

  @Test
  public void getVacationStatus() {
    assertEquals(abstractTeacherTest.getVacationStatus(), Boolean.TRUE);
  }

  @Test
  public void setVacationStatus() {
    abstractTeacherTest.setVacationStatus(Boolean.FALSE);
    assertEquals(abstractTeacherTest.getVacationStatus(), Boolean.FALSE);
  }

  @Test
  public void equals() {
    assertEquals(abstractTeacherTest.equals(abstractTeacherTest2),
        abstractTeacherTest2.equals(abstractTeacherTest));
  }

  @Test
  public void equalsName() {
    assertEquals(abstractTeacherTest.getName().equals(abstractTeacherTest2.getName()),
        abstractTeacherTest2.getName().equals(abstractTeacherTest.getName()));
  }

  @Test
  public void equalsCoTeacher() {
    assertEquals(abstractTeacherTest.getCoteacher().equals(abstractTeacherTest2.getCoteacher()),
        abstractTeacherTest2.getCoteacher().equals(abstractTeacherTest.getCoteacher()));
  }

  @Test
  public void equalsCurrentNumberOfChildren() {
    assertEquals(abstractTeacherTest.getCurrentNumberOfChildren()
            .equals(abstractTeacherTest2.getCurrentNumberOfChildren()),
        abstractTeacherTest2.getCurrentNumberOfChildren()
            .equals(abstractTeacherTest.getCurrentNumberOfChildren()));
  }

  @Test
  public void equalsMaxNumberOfChildren() {
    assertEquals(abstractTeacherTest.getMaximumNumberOfChildren()
            .equals(abstractTeacherTest2.getMaximumNumberOfChildren()),
        abstractTeacherTest2.getMaximumNumberOfChildren()
            .equals(abstractTeacherTest.getMaximumNumberOfChildren()));
  }

  @Test
  public void equalsVacationStatus() {
    assertEquals(
        abstractTeacherTest.getVacationStatus().equals(abstractTeacherTest2.getVacationStatus()),
        abstractTeacherTest2.getVacationStatus().equals(abstractTeacherTest.getVacationStatus()));
  }


  @Test
  public void testHashCode() {
    boolean isEqual = abstractTeacherTest.hashCode() == abstractTeacherTest2.hashCode();
    assertTrue("Hashes are equal", isEqual);
  }

  @Test
  public void testToString() {
    String toString = abstractTeacherTest.toString();
    System.out.println(toString);
    assertEquals(abstractTeacherTest.toString(), "abstractTeacher{"
        + "name=" + abstractTeacherTest.getName()
        + ", classroom='" + abstractTeacherTest.getClassroom()
        + "', coteacher=" + abstractTeacherTest.getCoteacher()
        + ", currentNumberOfChildren=" + abstractTeacherTest.getCurrentNumberOfChildren()
        + ", maximumNumberOfChildren=" + abstractTeacherTest.getMaximumNumberOfChildren()
        + ", vacationStatus=" + abstractTeacherTest.getVacationStatus()
        + "}");
  }
}