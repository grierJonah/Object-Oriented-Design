package edu.neu.ccs.cs5004;

import static org.junit.Assert.*;

import edu.neu.ccs.cs5004.grocery.Grocery;
import edu.neu.ccs.cs5004.grocery.Salmon;
import org.junit.Before;
import org.junit.Test;

public class StockItemTest {
  Grocery testSalmon;
  StockItem testStockItem;

  @Before
  public void setUp() throws Exception {
    testSalmon = new Salmon("SliceNDice", "Salmon",
        100.0, 0, 15.0);
    testStockItem = new StockItem();
  }
/*
  @Test
  public void checkStockInventory() {
    testStockItem.addToStock(testSalmon, 10);
    assertTrue(testStockItem.checkStockInventory(testSalmon, 10));
  }

  @Test
  public void checkEnoughStockInInventory() {
    testStockItem.addToStock(testSalmon, 10);
    assertTrue(testStockItem.getQuantity(testSalmon) > 0);
  } */

  @Test
  public void checkNonExistingStockInventory() {
    assertFalse(testStockItem.checkStockInventory(testSalmon, 1));
  }

  @Test
  public void reduceInventory() {
    testStockItem.addToStock(testSalmon, 15);
    testStockItem.reduceInventory(testSalmon, 10);
    assertTrue(testStockItem.checkStockInventory(testSalmon, 5));
  }
}