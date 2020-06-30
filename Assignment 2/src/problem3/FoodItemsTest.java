package problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FoodItemsTest {
  private FoodItems foodItems;
  private Name name;

  @Before
  public void setUp() throws Exception {
    name = new Name("Meat");
    foodItems = new FoodItems(name, 100,
        150, 100);
  }

  @Test
  public void getName() {
    assertEquals("Meat", foodItems.getName());
  }

  @Test
  public void getCurrentPricePerUnit() {
    assertEquals(Integer.valueOf(100), foodItems.getCurrentPricePerUnit());
  }

  @Test
  public void getCurrentAvailableQuantity() {
    assertEquals(Integer.valueOf(150), foodItems.getCurrentAvailableQuantity());
  }

  @Test
  public void getMaximumAllowedQuantity() {
    assertEquals(Integer.valueOf(100), foodItems.getMaximumAllowedQuantity());
  }
}