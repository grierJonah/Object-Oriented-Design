package problem1;

/**
 * A class representing a living room with a specific temperature
 */
public class LivingRoom extends Room {

  private Integer temperature;

  /**
   * Constructs a living room object with a given temperature
   *
   * @param temperature - temperature of living room, represented as an Integer
   */
  public LivingRoom(Integer temperature) {
    super(temperature);
  }

}
