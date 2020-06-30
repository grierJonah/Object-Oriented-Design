package edu.neu.ccs.cs5004.problem2;

public interface IPolynomial {
  /**
   * IPolynomial is a polynomial expression consisting of variables and coefficients.
   * An example of a polynomial looks like: 5x^4 + 3x^3 + 2x + 3.
   * Each expression has a coefficient (such as 5), a variable (such as x) and a power (such as 4)
   * which raises a coefficient to that power.
   * Coefficient - Leading number before the 'x'
   * Variable - the alphabetic variable (x)
   * Power - the number that the variable is raised too.
   * Additionally, there is a degree of polynomial which can be classified as the highest degree of
   * the leading coefficient.
   */

  /**
   * Create the empty polynomial.
   *
   * @return the empty polynomial
   */
  static IPolynomial emptyPolynomial() {
    return null;
  }

  /**
   * AddTerm method allows the user to add a coefficient and power to a given polynomial.
   *
   * @param coefficient the coefficient to be added to the polynomial
   * @param power the power the coefficient will be raised to.
   */
  void addTerm(Integer coefficient, Integer power);

  /**
   * removeTerm method gives the user the ability to remove any, and all coefficients with that
   * specific power.
   *
   * @param power the power (exponent) that is used to search for the coefficient we want to remove
   */
  void removeTerm(Integer power);

  /**
   * Gets the highest degree of the polynomial.
   *
   * @return the highest degree of the polynomial, represented as an Integer.
   */
  Integer getDegree();

  /**
   * Gets the coefficient that has the specific power Integer attached to it.
   *
   * @param power the degree that a coefficient is raised to
   * @return a coefficient
   */
  Integer getCoefficient(Integer power);

  /**
   * Takes another polynomial object and returns true to check if they are the same. Two polynomials
   * are the same if they contain the same terms.
   *
   * @param object a polynomial
   * @return true or false
   */
  Boolean isSame(IPolynomial object);

  /**
   * Checks to see if the Polynomial expression contains no nodes (is empty - returns true if the
   * expression is empty, returns false if the expression contains nodes).
   *
   * @return true or false
   */
  Boolean isEmpty();

  /**
   * Method evaluates the polynomial by interchanging the variables with the inputted Double.
   *
   * @param number the number to interchange the variables with.
   * @return the result of the polynomial, when using the specific number
   */
  Double evaluate(Double number);

  /**
   * A method that takes another polynomial and adds it to the original.
   *
   * @param object a polynomial expression
   * @return a new polynomial
   */
  IPolynomial add(IPolynomial object);

  /**
   * A method that takes another polynomial and multiplies it to the original.
   *
   * @param object a polynomial expression
   * @return a new polynomial
   */
  IPolynomial multiply(IPolynomial object);
}

