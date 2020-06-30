package edu.neu.ccs.cs5004.customer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
  ShoppingCart testShoppingCart;
  Customer testCustomer;

  @Before
  public void setUp() throws Exception {
    testShoppingCart = new ShoppingCart();
    testCustomer = new Customer("Jonah", 23, testShoppingCart);
  }

  @Test
  public void getName() {
    assertEquals(testCustomer.getName(), "Jonah");
  }

  @Test
  public void getAge() {
    assertEquals(testCustomer.getAge(), 23, 0);
  }

  @Test
  public void getShoppingCart() {
    assertEquals(testCustomer.getShoppingCart(), testShoppingCart);
  }
}