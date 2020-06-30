package edu.neu.ccs.cs5004;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProductsTest {
  Products newProduct;

    @Before
  public void setUp() throws Exception {
    newProduct = new Products("a", "b", 1.50, 5);
  }

  @Test
  public void getManufacturersName() {
      assertEquals(newProduct.getManufacturersName(), "a");
  }

  @Test
  public void getProductName() {
      assertEquals(newProduct.getProductName(), "b");
  }

  @Test
  public void getPrice() {
      assertEquals(newProduct.getPrice(), 1.50, 0);
  }

  @Test
  public void getMinimumAge() {
      assertEquals(newProduct.getMinimumAge(), 5, 0);
  }
}