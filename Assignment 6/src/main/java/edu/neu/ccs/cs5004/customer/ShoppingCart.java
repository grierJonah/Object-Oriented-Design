package edu.neu.ccs.cs5004.customer;

import edu.neu.ccs.cs5004.Products;
import edu.neu.ccs.cs5004.StockItem;
import edu.neu.ccs.cs5004.SubstitutionSystem;
import java.util.HashMap;

/**
 * A ShoppingCart class.
 */
public class ShoppingCart {

  private static final Integer DEFAULT_BUYING_QUANTITY = 1;
  private static final Integer ONE_AVAILABLE_IN_STOCK = 1;

  private StockItem stockItem;
  private static HashMap<Products, Integer> shoppingCart;
  private SubstitutionSystem substitutionSystem;


  public ShoppingCart() {
    shoppingCart = new HashMap<>();
  }

  /**
   * Allows a product to be added to the shopping cart. Checks to make sure that the product is not
   * already in the shopping cart. If it is, gets the products current quantity then adds +1 to it
   * to increase the shopping cart quantity of that product.
   *
   * @param product the product that is being added to the shopping cart
   */
  public void addProductToShoppingCart(Products product) {
    //if (checkAvailability(product)) {
      if (!shoppingCart.containsKey(product)) {
        shoppingCart.put(product, DEFAULT_BUYING_QUANTITY);
      } else {
        Integer currentQuantity = shoppingCart.get(product);
        shoppingCart.put(product, DEFAULT_BUYING_QUANTITY + currentQuantity);
      }
    }
  //}

  /**
   * Overloaded method that allows a shopper to specify the quantity of products they want to
   * purchase. Also checks if the product they are looking to buy is currently in the shopping cart.
   * If it is, then it gets the current quantity and adds it to the quantity they are looking to
   * purchase.
   *
   * @param product the product the customer wants to add to their shopping cart
   * @param quantity the quantity of the product they want to buy
   */
  public void addProductToShoppingCart(Products product, Integer quantity) {
    //if (checkAvailability(product, quantity)) {
      if (!shoppingCart.containsKey(product)) {
        shoppingCart.put(product, quantity);
      } else {
        Integer currentQuantity = shoppingCart.get(product);
        shoppingCart.put(product, currentQuantity + quantity);
      }
    }
  //}

  /**
   * Checks if the current inventory has enough product left to sell the requested quantity. If it
   * does not, the seller will be greeted with a message.
   *
   * @param product the product requested to purchase
   * @param quantity the quantity the customer wants to purchase
   * @return a true or false depending on availability
   */
  public Boolean checkAvailability(Products product, Integer quantity) {
    if (stockItem.getQuantity(product) >= quantity) {
      return true;
    } else {
      System.out.println("Cannot add amount specified to cart! Currently only have: " +
          stockItem.getQuantity(product) + " left in stock!");
      return false;
    }
  }

  /**
   * Checks if the current inventory has enough product left to sell at least one. Since the buyer
   * has the option to not specify an amount they want to purchase, this method helps check that
   * there is at least one of the current product. If the buyer does not add a quantity they want
   * by default they are requesting for only 1. If there is not at least 1 available, the buyer is
   * greeted with a message.
   *
   * @param product the product requested to purchase
   * @return a true or false depending on availability
   */
  private Boolean checkAvailability(Products product) {
    if (stockItem.getQuantity(product) >= ONE_AVAILABLE_IN_STOCK) {
      return true;
    } else {
      System.out.println("Cannot add amount specified to cart! Currently only have: " +
          stockItem.getQuantity(product) + " left in stock!");
      return false;
    }
  }

  /**
   * Checks the current availability of the specific grocery item.
   *
   * @param product the product to check for current inventory for
   * @return the quantity of the product in the shopping cart
   */
  public Integer checkCurrentAvailabilityOfGroceryItems(Products product) {
    return shoppingCart.get(product);
  }

  /**
   * Removes an item from the cart.
   *
   * @param groceryProduct a specific product to remove from the cart
   */
  public void removeItemFromCart(Products groceryProduct) {
    shoppingCart.remove(groceryProduct);
  }

  /**
   * Gets the current Shopping Cart.
   *
   * @return the shopping cart
   */
  public HashMap<Products, Integer> getShoppingCart() {
    return shoppingCart;
  }
}
