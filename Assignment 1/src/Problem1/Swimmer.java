package Problem1;

public class Swimmer {

  private String firstName;
  private String lastName;
  private SwimTimes swimTimes;

  /**
   * Constructor that creates a new swimmer object with the specified first name, last name, and
   * swimTimes.
   *
   * @param firstName - swimmer's first name
   * @param lastName - swimmer's last name
   * @param swimTimes - swimmer's four best times
   */
  public Swimmer(String firstName, String lastName, SwimTimes swimTimes) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.swimTimes = swimTimes;
  }

  /**
   * Returns the swimmers first name
   *
   * @return - swimmer's first name
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Returns the swimmer's last name
   *
   * @return - swimmer's last name
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * Return's the swimmer's full name
   *
   * @return - swimmer's first and last name
   */
  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }

  /**
   * Returns all four swimmer's times
   *
   * @return - all four swimmer's times
   */
  public String getSwimTimes() {
    return ("Backstroke: " + swimTimes.getBestBackstroke50mTime()
        + " Breaststroke: " + swimTimes.getBestBreaststroke50mTime()
        + " Butterfly: " + swimTimes.getBestButterfly50mTime()
        + " Freestyle: " + swimTimes.getBestFreestyle50mTime());
  }

}
