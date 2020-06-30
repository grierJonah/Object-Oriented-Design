package edu.neu.ccs.cs5004.grocery;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GroceryTest {
  Grocery groceryTest;
  Grocery groceryTest2;
  Grocery groceryTest3;

  @Before
  public void setUp() throws Exception {
    groceryTest = new Salmon("Slippery", "Salmon",
        35.99, 0, 10.85);
    groceryTest2 = new Cheese("Cheesey", "Crust",
        10000.0, 0, 95.99);
    groceryTest3 = new Beer("BeerMe", "Bro", 6.50,
        21, 1.05);

  }

  @Test
  public void getWeight() {
    assertEquals(groceryTest.getWeight(), 10.85, 0);
    assertEquals(groceryTest2.getWeight(), 95.99,0);
    assertEquals(groceryTest3.getWeight(), 1.05, 0);
  }
}