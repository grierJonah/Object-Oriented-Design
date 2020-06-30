package edu.neu.ccs.cs5004;

import static org.junit.Assert.*;

import edu.neu.ccs.cs5004.grocery.Cheese;
import edu.neu.ccs.cs5004.household.Shampoo;
import org.junit.Before;
import org.junit.Test;

public class InventoryTest {
  Products groceryItem;
  Products householdItem;
  Inventory testInventory;
  Inventory testInventory2;
  StockItem testStockItem;

  @Before
  public void setUp() throws Exception {
    groceryItem = new Cheese("Cottage", "Cheese",
        12.80, 0, 3.50);
    householdItem = new Shampoo("Squirt", "Bottle",
        6.99, 0, 1);
    testStockItem = new StockItem();

    testInventory = new Inventory();
    testInventory2 = new Inventory();
  }

  @Test
  public void addGroceryItem() {
    testStockItem.addToStock(groceryItem, 10);
    assertEquals(testStockItem.getStock(), 1, 0);
    assertEquals(testStockItem.getQuantity(groceryItem), 10, 0);
  }

  @Test
  public void addHouseholdItem() {
    testStockItem.addToStock(householdItem, 10);
    assertEquals(testStockItem.getStock(), 1, 0);
    assertEquals(testStockItem.getQuantity(householdItem), 10, 0);
  }

  @Test
  public void getTotalRetailValue() {
    testInventory.addGroceryItem(groceryItem, 10);
    testInventory.addHouseholdItem(householdItem, 10);
    assertEquals(testInventory.getTotalRetailValue(), 197.9,0);
  }
}