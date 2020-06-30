package edu.neu.ccs.cs5004.customer;

import static org.junit.Assert.*;

import edu.neu.ccs.cs5004.Products;
import edu.neu.ccs.cs5004.grocery.Cheese;
import edu.neu.ccs.cs5004.grocery.Grocery;
import edu.neu.ccs.cs5004.grocery.Salmon;
import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class ShoppingCartTest {
  Salmon salmon;
  Cheese cheese;
  ShoppingCart cart;

  @Before
  public void setUp() throws Exception {
    salmon = new Salmon("salmon", "salmonella", 1.50,
        0, 15.0);
    cheese = new Cheese("cut", "theCheese", 9.80,
        0, 14.0);
    cart = new ShoppingCart();
  }

  @Test
  public void addProductToShoppingCart() {
    cart.addProductToShoppingCart(salmon);
    assertEquals(cart.getShoppingCart().size(), 1);
    //System.out.println(cart.getShoppingCart());
  }

  @Test
  public void addProductToShoppingCart1() {
    cart.addProductToShoppingCart(cheese, 2);
    assertEquals(cart.getShoppingCart().size(), 1);
  }

  @Test
  public void checkCurrentAvailabiltyOfGroceryItems() {
    cart.addProductToShoppingCart(salmon);
    assertEquals(cart.checkCurrentAvailabilityOfGroceryItems(salmon), 1, 0);
  }

  @Test
  public void removeItemFromCart() {
    cart.removeItemFromCart(salmon);
    assertEquals(cart.getShoppingCart().size(), 0);
  }

  @Test
  public void getShoppingCart() {
    cart.addProductToShoppingCart(salmon);
    cart.addProductToShoppingCart(cheese);

    Map<Products, Integer> testMap = new HashMap<>();
    testMap.put(salmon, 1);
    testMap.put(cheese, 1);

    assertEquals(cart.getShoppingCart(), testMap);
  }
}