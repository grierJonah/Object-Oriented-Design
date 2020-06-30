package edu.neu.ccs.cs5004.problem2;

import java.util.Objects;

/**
 * A Polynomial class that implements all the functionality.
 */
public class Polynomial implements IPolynomial {

  Node node;
  Double[] coefficients;
  Integer degree;

  /**
   * Immediately creates a polynomial consisting of nothing. Allows for the other methods to be
   * added and stacked on top of this one. Our first node will be set to null to indicate that it
   * stores no value. Additionally, it's next is set to null through our Node class.
   */
  public Polynomial() {
    this.node = null;
    coefficients = new Double[0];
  }

  /**
   * Constructs a polynomial with the given parameters. Creates a new node with the given parameters
   * and adds it to the expression.
   *
   * @param coefficient the coefficient of the equation (5x -- (5) is the coefficient)
   * @param power the power of the equation (5x^2 -- (2) is the power)
   */
  public Polynomial(Integer coefficient, Integer power) {
    this.node = new Node(coefficient, power, null);
    coefficients = new Double[power + 1];
    degree = power;
  }

  /**
   * AddTerm method allows the user to add a coefficient and power to a given polynomial. First
   * addTerm checks if the polynomial is empty, if it is, it creates a new Polynomial node with the
   * given parameters. If the polynomial is not null the while loop goes through each term checking
   * if its 'next' is null. Once it determines the the next is null it breaks out of the loop and
   * creates a new node with the given parameters in that spot and sets its' next to null.
   *
   * @param coefficient the coefficient to be added to the polynomial
   * @param power the power the coefficient will be raised to.
   */
  @Override
  public void addTerm(Integer coefficient, Integer power) {
    if (isEmpty()) {
      this.node = new Node(coefficient, power, null);
    } else {
      Node current = this.node;
      while (current != null) {
        current = current.getNext();
      }

      current.setNext(new Node(coefficient, power, null));
    }
  }

  /**
   * removeTerm method gives the user the ability to remove any, and all coefficients with that
   * specific power.
   */
  @Override
  public void removeTerm(Integer power) {
    Node current = this.node;
    while (current != null) {
      if (current.getPower().equals(power)) {
        current = current.getNext();
      }
    }
  }

  /**
   * Gets the highest degree of the polynomial by checking each nodes power.
   *
   * @return the highest degree of the polynomial, represented as an Integer.
   */
  @Override
  public Integer getDegree() {
    Integer highestPower = 0;
    Integer checkPower;
    if (isEmpty()) {
      highestPower = 0;
    } else {
      Node current = this.node;
      while (current != null) {
        checkPower = current.getPower();
        if (highestPower < checkPower) {
          highestPower = checkPower;
        }
        current = current.getNext();
      }
    }
    return highestPower;
  }

  /**
   * Gets the coefficient that has the specific power Integer attached to it.
   *
   * @param power the degree that a coefficient is raised to
   * @return a coefficient
   */
  @Override
  public Integer getCoefficient(Integer power) {
    if (isEmpty()) {
      return 0;
    } else {
      Node current = this.node;
      while (current != null) {
        if (current.getPower().equals(power)) {
          return current.getCoefficient();
        } else {
          current = current.getNext();
        }
      }
    }
    return 0;
  }

  /**
   * Takes another polynomial object and returns true to check if they are the same. Two polynomials
   * are the same if they contain the same terms.
   *
   * @param obj a polynomial
   * @return true or false
   */
  @Override
  public Boolean isSame(IPolynomial obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Polynomial that = (Polynomial) obj;
    return Objects.equals(node, that.node);
  }

  /**
   * Method checks to see if the polynomial expression is empty. If it is, then the node inside will
   * be null (true). Otherwise, the node will contain a node not equal to null and be evaluated as
   * false.
   */
  @Override
  public Boolean isEmpty() {
    return this.node == null;
  }

  /**
   * Method evaluates the polynomial by interchanging the variables with the inputted Double.
   *
   * @param number the number to interchange the variables with.
   * @return the result of the polynomial, when using the specific number
   */
  @Override
  public Double evaluate(Double number) {
    Double result = 0.0;
    for (int i = 0; i < degree + 1; i++) {
      result = result + (coefficients[i] * Math.pow(number, i));
    }
    return result;
  }

  /**
   * A method that takes another polynomial and adds it to the original.
   *
   * @param object a polynomial expression
   * @return a new polynomial
   */
  @Override
  public IPolynomial add(IPolynomial object) {
    if (object.isEmpty()) {
      return object;
    } else {
      Polynomial result;
      for (int i = 0; i < degree + 1; i++) {
        for (int j = 0; j < i; j++) {
          Node current = this.node;
          if (current.getCoefficient().equals(object.getCoefficient(current.getPower()))) {
            return null;
          }
        }
      }
    }
    return null;
  }

  /**
   * A method that takes another polynomial and multiplies it to the original.
   *
   * @param object a polynomial expression
   * @return a new polynomial
   */
  @Override
  public IPolynomial multiply(IPolynomial object) {
    return null;
  }
}
