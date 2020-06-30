package edu.neu.ccs.cs5004.problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NameTest {
  Name name;

  @Before
  public void setUp() throws Exception {
    name =  new Name("Jonah", "Grier");
  }

  @Test
  public void getFirstName() {
    assertEquals(name.getFirstName(), "Jonah");
  }

  @Test
  public void setFirstName() {
    name.setFirstName("Grier");
    assertEquals(name.getFirstName(), "Grier");
  }

  @Test
  public void getLastName() {
    assertEquals(name.getLastName(), "Grier");
  }

  @Test
  public void setLastName() {
    name.setLastName("Jonah");
    assertEquals(name.getLastName(), "Jonah");
  }
}