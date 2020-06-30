package edu.neu.ccs.cs5004;

import edu.neu.ccs.cs5004.customer.Customer;
import edu.neu.ccs.cs5004.customer.ShoppingCart;
import edu.neu.ccs.cs5004.grocery.Beer;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for processing the final order.
 */
public class ProcessOrder {

  private Beer beer;
  private ShoppingCart currentCart;
  private Customer customer;
  private StockItem stockItem;

  /**
   * End goal for a shopper: buy out the shopping cart. This method initializes the shoppers cart.
   *
   * @param cart the shoppers cart
   */
  public ProcessOrder(ShoppingCart cart, Customer customer) {
    this.customer = customer;
    this.currentCart = cart;
//    removeUnderAgeProducts();
//    updateStockQuantities(currentCart);
//    generateReceipt(currentCart);
//    emptyCart(currentCart);
  }

  /**
   * Method helps check and remove any underage items from a shoppers cart. If the customer is buying
   * alcohol, it checks their current age. If the current age is below 21, then the alcohol is removed
   * from their cart.
   */
  public void removeUnderAgeProducts() {
    if (currentCart.getShoppingCart().containsKey(beer) && customer.getAge() < 21) {
      currentCart.removeItemFromCart(beer);
    }
  }

  /**
   * This method helps update the stock quantities after we process an order. Once a cart purchase
   * successfully goes through, it updates the stock with the new current amounts by subtracting the
   * item purchased from the exisiting supply.
   *
   * @param cart the shoppers shopping cart
   */
  public void updateStockQuantities(ShoppingCart cart) {
    for (Products products : cart.getShoppingCart().keySet()) {
      Integer currentProductQuantity = stockItem.getQuantity(products);
      stockItem.reduceInventory(products, currentProductQuantity);
    }
  }

  /**
   * This method generates a list of strings that acts as a receipt. For each item in the final cart
   * it gets the product's name followed by a colon and the price.
   *
   * @param cart the shoppers shopping cart
   * @return a receipt, represented as a list of strings
   */
  public List<String> generateReceipt(ShoppingCart cart) {
    List<String> receipt = new ArrayList<>();
    for (Products products : cart.getShoppingCart().keySet()) {
      receipt.add(products.getProductName() + " : " + products.getPrice());
    }
    return receipt;
  }

  /**
   * This method removes all products from the cart. When a shopper has succesfully finished their
   * shopping spree, and purchased all the items, this function goes through their cart 1 by 1 removing
   * each product.
   *
   * @param cart the shoppers shopping cart
   * @return an empty shopping cart
   */
  public ShoppingCart emptyCart(ShoppingCart cart) {
    for (Products products : cart.getShoppingCart().keySet()) {
      cart.removeItemFromCart(products);
    }
    return cart;
  }

  /**
   * Gets the current cart.
   *
   * @return the current shopping cart
   */
  public ShoppingCart getCurrentCart() {
    return currentCart;
  }
}
