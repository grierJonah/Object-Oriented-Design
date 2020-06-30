package edu.neu.ccs.cs5004;


/**
 * An inventory system that keeps track of a GroceryStock, and a HouseholdStock. These two stocks
 * keep track of all the products that are revolving in and out of the SuperMarket's system. It also
 * helps separate the grocery items from the household items by using two different HashMaps. Lastly,
 * the Inventory class gives the SuperMarket a cleaner and more organized way of accessing total
 * inventory levels as well as adding new items.
 */
public class Inventory {

  private StockItem groceryStock;
  private StockItem householdStock;

  /**
   * Constructs a new Inventory.
   */
  public Inventory() {
    groceryStock = new StockItem();
    householdStock = new StockItem();
  }

  /**
   * Method allows a SuperMarket to add a new product into the groceryStock.
   *
   * @param groceryProduct the new product being added to the groceryStock
   * @param quantity the quantity to add alongside the product
   */
  public void addGroceryItem(Products groceryProduct, Integer quantity) {
    groceryStock.addToStock(groceryProduct, quantity);
  }

  /**
   * Method allows a SuperMarket to add a new product into the householdStock.
   *
   * @param houseHoldProduct the new product being added to the householdStock
   * @param quantity the quantity to add alongside the product
   */
  public void addHouseholdItem(Products houseHoldProduct, Integer quantity) {
    householdStock.addToStock(houseHoldProduct, quantity);
  }

  /**
   * Gets the total inventory price that the SuperMarket currently has. Uses helper functions to
   * iterate through both the grocery and household products.
   *
   * @return the total inventory price, represented as a Double
   */
  public Double getTotalRetailValue() {
    Integer groceryQuantity = 0;
    Integer householdQuantity = 0;
    Double groceryTotal = 0.0;
    Double householdTotal = 0.0;
    Double currentGroceryRetailValue = 0.0;
    Double currentHouseholdRetailValue = 0.0;

    for (Products product : groceryStock.getKeys()) {
      // Gets the value (quantity associated with product in HashMap)
      groceryQuantity += groceryStock.getQuantity(product);
      currentGroceryRetailValue += product.getPrice();
      groceryTotal = currentGroceryRetailValue * groceryQuantity;
    }

    for (Products product : householdStock.getKeys()) {
      // Gets the value (quantity associated with product in HashMap)
      householdQuantity += householdStock.getQuantity(product);
      currentHouseholdRetailValue += product.getPrice();
      householdTotal = currentHouseholdRetailValue * householdQuantity;
    }

    return groceryTotal + householdTotal;
  }
}
