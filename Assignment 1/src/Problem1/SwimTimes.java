package Problem1;

public class SwimTimes {

  private Double bestBackstroke50mTime;
  private Double bestBreaststroke50mTime;
  private Double bestButterfly50mTime;
  private Double bestFreestyle50mTime;

  /**
   * Constructor that creates an object with the specified parameters: bestBackstroke,
   * bestBreaststroke, bestButterfly, bestFreestyle times.
   *
   * @param bestBackstroke50mTime - swimmer's best backstroke time
   * @param bestBreaststroke50mTime - swimmer's best breaststroke time
   * @param bestButterfly50mTime - swimmer's best butterfly time
   * @param bestFreestyle50mTime - swimmer's best freestyle time
   */
  public SwimTimes(Double bestBackstroke50mTime, Double bestBreaststroke50mTime,
      Double bestButterfly50mTime, Double bestFreestyle50mTime) {
    this.bestBackstroke50mTime = bestBackstroke50mTime;
    this.bestBreaststroke50mTime = bestBreaststroke50mTime;
    this.bestButterfly50mTime = bestButterfly50mTime;
    this.bestFreestyle50mTime = bestFreestyle50mTime;
  }

  /**
   * Returns the swimmers best backstroke time
   *
   * @return - swimmer's best backstroke time
   */
  public Double getBestBackstroke50mTime() {
    return this.bestBackstroke50mTime;
  }

  /**
   * Returns the swimmer's best breaststroke time
   *
   * @return - swimmer's best breaststroke time
   */
  public Double getBestBreaststroke50mTime() {
    return this.bestBreaststroke50mTime;
  }

  /**
   * Returns the swimmer's best butterfly time
   *
   * @return - swimmer's best butterfly time
   */
  public Double getBestButterfly50mTime() {
    return this.bestButterfly50mTime;
  }

  /**
   * Return's the swimmer's best freestyle time
   *
   * @return - swimmer's best freestyle time
   */
  public Double getBestFreestyle50mTime() {
    return this.bestFreestyle50mTime;
  }

  /**
   * Sets the swimmers best backstroke time
   *
   * @param time - swimmers best backstroke time
   */
  public void setBestBackstroke50mTime(Double time) {
    this.bestBackstroke50mTime = time;
  }

  /**
   * Sets the swimmers best breaststroke time
   *
   * @param time - swimmers best breaststroke time
   */
  public void setBestBreaststroke50mTime(Double time) {
    this.bestBreaststroke50mTime = time;
  }

  /**
   * Sets the swimmers best butterfly time
   *
   * @param time - swimmers best butterfly time
   */
  public void setBestButterfly50mTime(Double time) {
    this.bestButterfly50mTime = time;
  }

  /**
   * Sets the swimmers best freestyle time
   *
   * @param time - swimmers best freestyle time
   */
  public void setBestFreestyle50mTime(Double time) {
    this.bestFreestyle50mTime = time;
  }
}
