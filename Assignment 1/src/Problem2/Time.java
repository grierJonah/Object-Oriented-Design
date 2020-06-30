package Problem2;


public class Time {

  private static final Integer MIN_TIME = 0;
  private static final Integer MAX_HOURS = 23;
  private static final Integer MAX_MIN_SEC = 59;
  private Integer hours;
  private Integer minutes;
  private Integer seconds;

  /**
   * Constructor that creates a new Time object with the specified hours, minutes, and seconds.
   *
   * @param hours - bicyclists hours rode
   * @param minutes - bicyclists minutes rode
   * @param seconds - bicyclists seconds rode
   */

  public Time(Integer hours, Integer minutes, Integer seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
  }

  /**
   * Returns the bicyclists hours rode
   *
   * @return - bicyclists hours rode
   */
  public Integer getHours() throws IllegalArgumentException {
    if (this.hours >= MIN_TIME && this.hours <= MAX_HOURS) {
      return this.hours;
    }
    throw new IllegalArgumentException("Error: Hours argument is either negative or over 23");
  }

  /**
   * Returns bicyclists minutes rode
   *
   * @return - bicyclists minutes rode
   */
  public Integer getMinutes() throws IllegalArgumentException {
    if (this.minutes >= MIN_TIME && this.minutes <= MAX_MIN_SEC) {
      return this.minutes;
    }
    throw new IllegalArgumentException("Error: Minutes argument is either negative or over 59");
  }

  /**
   * Returns the bicyclists seconds rode
   *
   * @return - bicyclists seconds rode
   */
  public Integer getSecond() throws IllegalArgumentException {
    if (this.seconds >= 0 && this.seconds <= MAX_MIN_SEC) {
      return this.seconds;
    }
    throw new IllegalArgumentException("Error: Seconds argument is either negative or over 59");
  }
}
