package problem1;

/**
 * A class representing a Bathroom with a specific temperature
 */
public class Bathroom extends Room {

  private Integer temperature;

  /**
   * Constructs a new Bathroom object with a temperature
   *
   * @param temperature - the temperature of the bathroom, represented as an Integer
   */
  public Bathroom(Integer temperature) {
    super(temperature);
  }
}
