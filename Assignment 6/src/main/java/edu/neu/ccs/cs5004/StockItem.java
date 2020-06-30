package edu.neu.ccs.cs5004;

import java.util.HashMap;
import java.util.Set;

/**
 * A class representing a StockItem.
 */
public class StockItem {

  private HashMap<Products, Integer> stockItemMap;

  /**
   * Constructs a new StockItem as a HashMap. Each StockItem consists of a product as the key, along
   * with a quantity of that product as the value. This allows a company to easily keep track of
   * stock inventory levels, as the look up times for each product is O(1) time.
   */
  public StockItem() {
    stockItemMap = new HashMap<>();
  }

  /**
   * Adds a product into the stockItemMap if it is not already contained in the map.
   *
   * @param product the product to put in the map
   * @param quantity the quantity to put in the map
   */
  public void addToStock(Products product, Integer quantity) {
    if (!stockItemMap.containsKey(product)) {
      stockItemMap.put(product, quantity);
    }
  }

  /**
   * Checks if the product is in the StockItemMap as well as checks if there is a sufficient
   * quantity of that item to be purchased. If the purchaser enters an amount that is greater than
   * than current value stored in the HashMap, then the method will return false.
   *
   * @param product the product to search for
   * @param numQuantity the quantity to check the current value against
   * @return a true or false indicating if the current stock inventory is sufficient or lacking
   */
  public Boolean checkStockInventory(Products product, Integer numQuantity) {
    return (stockItemMap.containsKey(product) && stockItemMap.get(product) >= numQuantity);
  }

  /**
   * Reduces the stock inventory level by the amount specified. This method must be used alongside
   * the checkStockInventory level otherwise the stockItemMap value could run into a negative value.
   * Example) If we do not first use 'checkStockInventory' levels, we could reduce Shampoo current
   * inventory from 0 to -100 if the user wanted to purchase 100 shampoo's.
   *
   * @param product the product to reduce the inventory on
   * @param numQuantity the amount to reduce the product's current quantity by
   */
  public void reduceInventory(Products product, Integer numQuantity) {
    Integer currentStockLevel = stockItemMap.get(product);
    stockItemMap.put(product, currentStockLevel - numQuantity);
  }

  /**
   * Gets the quantity associated with the key in the stockItemMap. Helps in inventory class.
   *
   * @param product the product to search for
   * @return the quantity
   */
  public Integer getQuantity(Products product) {
    return stockItemMap.get(product);
  }

  /**
   * Gets the size of the stockItemMap keys. Is used mainly in inventory class.
   *
   * @return the number of keys in the stockItemMap
   */
  public Integer getStock() {
    return stockItemMap.keySet().size();
  }

  /**
   * Gets the set of all products in the stockItemMap. Is used mainly in inventory class.
   *
   * @return the keys in the stockItemMap
   */
  public Set<Products> getKeys() {
    return stockItemMap.keySet();
  }


}
