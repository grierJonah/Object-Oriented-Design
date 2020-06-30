package edu.neu.ccs.cs5004;

import edu.neu.ccs.cs5004.customer.ShoppingCart;
import edu.neu.ccs.cs5004.grocery.Cheese;
import edu.neu.ccs.cs5004.grocery.Grocery;

public class SubstitutionSystem {

  private StockItem stockItem;
  private ShoppingCart currentItems;

  public SubstitutionSystem(ShoppingCart customersShoppingCart) {
    this.currentItems = customersShoppingCart;
  }

  /*public ShoppingCart substituteGroceryItem(Products groceryProduct) {
    // check if current shopping cart contains the groceryProduct
    if (currentItems.getShoppingCart().keySet().contains(groceryProduct) &&
    stockItem.getQuantity(groceryProduct).equals(0)) {
      currentItems
    }


    // same as HouseHold below


    // WEIGHT must be same or greater than original
    //
  }

  public ShoppingCart substituteHouseholdItem() {
    // cheese with cheese
    // must be in stock... quantity is greater than 0
    // same price or cheaper
    // if nothing is found, remove the item from the shoppers cart

    // Number of units must be same or greater than original
  } */

}
