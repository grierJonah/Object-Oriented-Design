package edu.neu.ccs.cs5004.problem1.infant;

import static org.junit.Assert.*;

import edu.neu.ccs.cs5004.problem1.Name;
import org.junit.Before;
import org.junit.Test;

public class infantTeacherTest {
  private infantTeacher infantTeacherTest;
  private infantTeacher infantTeacherTest2;
  Name name = new Name("Jonah", "Grier");
  Name coteacher = new Name("Bob", "Martin");
  Boolean onVacation = Boolean.TRUE;


  @Before
  public void setUp() throws Exception {
    infantTeacherTest = new infantTeacher(name, "Class1", coteacher,
        25, 30, onVacation,
        15, 10);

    infantTeacherTest2 = new infantTeacher(name, "Class1", coteacher,
        25, 30, onVacation,
        15, 10);
  }

  @Test
  public void getCurrentNumberOfCrawlers() {
    assertEquals(infantTeacherTest.getCurrentNumberOfCrawlers(), 15, 0);
  }

  @Test
  public void setCurrentNumberOfCrawlers() {
    infantTeacherTest.setCurrentNumberOfCrawlers(10);
    assertEquals(infantTeacherTest.getCurrentNumberOfCrawlers(), 10, 0);
  }

  @Test
  public void getCurrentNumberOfWalkers() {
    assertEquals(infantTeacherTest.getCurrentNumberOfWalkers(), 10, 0);
  }

  @Test
  public void setCurrentNumberOfWalkers() {
    infantTeacherTest.setCurrentNumberOfWalkers(15);
    assertEquals(infantTeacherTest.getCurrentNumberOfWalkers(), 15, 0);
  }

  @Test
  public void convertSubstituteTeacher() {
  }

  @Test
  public void equals() {
    assertTrue(infantTeacherTest.equals(infantTeacherTest2) &&
        infantTeacherTest2.equals(infantTeacherTest));
    assertTrue(infantTeacherTest.hashCode() == infantTeacherTest2.hashCode());
  }

  @Test
  public void testToString() {
    String toString = infantTeacherTest.toString();
    System.out.println(toString);
    assertEquals(infantTeacherTest.toString(), "infant{, "
        + "name=" + infantTeacherTest.getName()
        + ", coteacher=" + infantTeacherTest.getCoteacher()
        + ", classroom='" + infantTeacherTest.getClassroom()
        + "', currentNumberOfChildren=" + infantTeacherTest.getCurrentNumberOfChildren()
        + ", maximumNumberOfChildren=" + infantTeacherTest.getMaximumNumberOfChildren()
        + ", vacationStatus=" + infantTeacherTest.getVacationStatus()
        + ", currentNumberOfCrawlers=" + infantTeacherTest.getCurrentNumberOfCrawlers()
        + ", currentNumberOfWalkers=" + infantTeacherTest.getCurrentNumberOfWalkers()
        + "}");
  }

}