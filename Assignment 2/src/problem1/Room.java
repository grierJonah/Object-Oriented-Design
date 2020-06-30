package problem1;

/**
 * A class representing a Room with a temperature
 */
public class Room {

  protected Integer temperature;

  /**
   * Constructs a new room object with a new temperature
   *
   * @param temperature - temperature of the room
   */
  public Room(Integer temperature) {
    this.temperature = temperature;
  }

  /**
   * Returns the current temperature of the room
   *
   * @return - the current temperature of the room, represented as an Integer
   */
  public Integer getTemperature() {
    return this.temperature;
  }
}
