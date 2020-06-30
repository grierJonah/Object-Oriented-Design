package edu.neu.ccs.cs5004.problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PolynomialTest {
  Polynomial polynomial;

  @Before
  public void setUp() throws Exception {
    polynomial = new Polynomial();
  }

  @Test
  public void addTerm() {
  }

  @Test
  public void removeTerm() {
  }

  @Test
  public void getDegree() {
    polynomial.addTerm(5, 3);
    assertEquals(polynomial.getDegree(), 3, 0);
  }

  @Test
  public void getCoefficient() {
    polynomial.addTerm(10, 15);
    assertEquals(polynomial.getCoefficient(15), 10, 0);
  }

  @Test
  public void isSame() {
  }

  @Test
  public void isEmpty() {
    assertEquals(polynomial.isEmpty(), Boolean.TRUE);
  }

  @Test
  public void evaluate() {
  }

  @Test
  public void add() {
  }

  @Test
  public void multiply() {
  }
}