package edu.neu.ccs.cs5004.problem2;

/**
 * A node class to help keep track of the current and next.
 */
public class Node {

  private Integer coefficient;
  private Integer power;
  private Node next;

  /**
   * Constructs a node with no parameters. The coefficient will be nothing, the power will be
   * nothing and the next will be null.
   */
  public Node() {
    this.coefficient = 0;
    this.power = 0;
    this.next = null;
  }

  /**
   * Constructs a new problem2 node with the given parameters.
   *
   * @param coefficient the leading value in front of the variable (i.e. 5x -- (5) is the
   * coefficient)
   * @param power the power (i.e. 5x^2 -- (2) is the power)
   * @param next the next node in the linked list (i.e. 5x^2 + 3x -- (3x) is the next)
   */
  public Node(Integer coefficient, Integer power, Node next) {
    this.coefficient = coefficient;
    this.power = power;
    this.next = next;
  }

  /**
   * Gets the coefficient.
   *
   * @return the coefficient
   */
  public Integer getCoefficient() {
    return coefficient;
  }

  /**
   * Sets the coefficient.
   *
   * @param coefficient the coefficient, represented as an Integer
   */
  public void setCoefficient(Integer coefficient) {
    this.coefficient = coefficient;
  }

  /**
   * Gets the exponent.
   *
   * @return the exponent, represented as an Integer
   */
  public Integer getPower() {
    return power;
  }

  /**
   * Sets the exponent.
   *
   * @param power the power, represented as an Integer
   */
  public void setPower(Integer power) {
    this.power = power;
  }

  /**
   * Gets the next node in the linked list.
   *
   * @return the next node, represented as a Node
   */
  public Node getNext() {
    return next;
  }

  /**
   * Sets the next node in the linked list.
   *
   * @param next the next node, represented as a Node
   */
  public void setNext(Node next) {
    this.next = next;
  }
}
