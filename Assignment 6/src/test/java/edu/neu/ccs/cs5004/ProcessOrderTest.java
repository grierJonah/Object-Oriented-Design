package edu.neu.ccs.cs5004;

import static org.junit.Assert.*;

import edu.neu.ccs.cs5004.customer.Customer;
import edu.neu.ccs.cs5004.customer.ShoppingCart;
import edu.neu.ccs.cs5004.grocery.Beer;
import edu.neu.ccs.cs5004.grocery.Cheese;
import edu.neu.ccs.cs5004.grocery.Salmon;
import org.junit.Before;
import org.junit.Test;

public class ProcessOrderTest {
  Salmon salmon;
  Beer beer;
  Cheese cheese;
  ShoppingCart cart;
  ProcessOrder testProcessOrder;
  Customer customer;
  StockItem stockItem;

  @Before
  public void setUp() throws Exception {
    salmon = new Salmon("salmon", "salmonella", 1.50,
        0, 15.0);
    cheese = new Cheese("cut", "theCheese", 9.80,
        0, 14.0);
    beer = new Beer("beerboy", "BeerMe", 7.50, 21,
        1.50);
    cart.addProductToShoppingCart(salmon);
    cart.addProductToShoppingCart(cheese);

    customer = new Customer("Jonah", 18, cart);
    testProcessOrder = new ProcessOrder(cart, customer);
  }

  @Test
  public void removeUnderAgeProducts() {
    testProcessOrder.removeUnderAgeProducts();
    //assertFalse(testProcessOrder.getCurrentCart().getShoppingCart().containsValue(beer));
  }

  @Test
  public void updateStockQuantities() {
    //testProcessOrder.updateStockQuantities(cart);
    System.out.println(stockItem.getStock());
    //assertEquals();
  }

  @Test
  public void generateReceipt() {
  }

  @Test
  public void emptyCart() {
    testProcessOrder.emptyCart(cart);
    assertEquals(testProcessOrder.getCurrentCart().getShoppingCart().size(), 0, 0);
  }
}