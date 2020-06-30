package problem1;

/**
 * A class representing a bedroom with a specific temperature
 */
public class Bedroom extends Room {

  private Integer temperature;

  /**
   * Constructs a new Bedroom object with the a temperature
   *
   * @param temperature - temperature of the bedroom, represented as an Integer
   */
  public Bedroom(Integer temperature) {
    super(temperature);
  }
}
