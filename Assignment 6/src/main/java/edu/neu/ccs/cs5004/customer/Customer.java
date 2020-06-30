package edu.neu.ccs.cs5004.customer;

/**
 * A class for a Customer.
 */
public class Customer {

  private String name;
  private Integer age;
  private ShoppingCart shoppingCart;

  /**
   * Constructs a new Customer object given the parameters.
   *
   * @param name the name of the customer
   * @param age the age of the customer
   * @param shoppingCart the customers shopping cart
   */
  public Customer(String name, Integer age, ShoppingCart shoppingCart) {
    this.name = name;
    this.age = age;
    this.shoppingCart = shoppingCart;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public ShoppingCart getShoppingCart() {
    return shoppingCart;
  }
}
