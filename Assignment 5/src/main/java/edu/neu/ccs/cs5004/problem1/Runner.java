package edu.neu.ccs.cs5004.problem1;

import java.util.List;

/**
 * A Runner class.
 */
public class Runner implements Comparable<Runner> {

  private String name;
  private List<Double> fiveKRaceTimes;
  private List<Double> tenKRaceTimes;
  private List<Double> halfMarathonTimes;

  /**
   * Constructs a new Runner given the parameters.
   *
   * @param name the name of the runner
   * @param fiveKRaceTimes the runners 5k race times
   * @param tenKRaceTimes the runners 10k race times
   * @param halfMarathonTimes the runners half marathon race times
   */
  public Runner(String name, List<Double> fiveKRaceTimes,
      List<Double> tenKRaceTimes,
      List<Double> halfMarathonTimes) {
    this.name = name;
    this.fiveKRaceTimes = fiveKRaceTimes;
    this.tenKRaceTimes = tenKRaceTimes;
    this.halfMarathonTimes = halfMarathonTimes;
  }

  /**
   * Gets the runners first name.
   *
   * @return the runners first name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the list of 5k race times.
   *
   * @return a list of 5k race times
   */
  public List<Double> getFiveKRaceTimes() {
    return fiveKRaceTimes;
  }

  /**
   * Gets the list of 10k race times.
   *
   * @return a list of 10k race times
   */
  public List<Double> getTenKRaceTimes() {
    return tenKRaceTimes;
  }

  /**
   * Gets the list of half marathon times.
   *
   * @return a list of half marathon times
   */
  public List<Double> getHalfMarathonTimes() {
    return halfMarathonTimes;
  }

  /**
   * Compares the 'otherRunner' object against another runner to see who is faster.
   * 0  - the two runners are equal
   * 1  - the original runner is faster (originalRunner greater than otherRunner)
   * -1 - the original runner is slower (originalRunner less than otherRunner)
   *
   * @param otherRunner the other runner to compare times against
   * @return an int dictating who is faster
   */
  @Override
  public int compareTo(Runner otherRunner) {
    Double originalTotalRunnerTime = sumRaceTimes(this);
    Double otherTotalRunnerTime = sumRaceTimes(otherRunner);

    Double avgOriginalRunnerTime = getAverageRaceTime(originalTotalRunnerTime, this);
    Double avgOtherRunnerTime = getAverageRaceTime(otherTotalRunnerTime, otherRunner);

    return avgOriginalRunnerTime.compareTo(avgOtherRunnerTime);
  }

  /**
   * Helper method sums the runners 5k race times and returns a Double.
   *
   * @param runner the runner
   * @return the runners summed time running each 5k
   */
  private Double sumRaceTimes(Runner runner) {
    Double raceTimes = 0.0;
    Integer numRacesRun = num5KRacesRun(runner);

    for (int i = 0; i < numRacesRun; i++) {
      raceTimes += runner.fiveKRaceTimes.get(i);
    }
    return raceTimes;
  }

  /**
   * Helper method to get the number of 5k races a runner has run.
   *
   * @param runner the runner
   * @return an Integer associated with how many race times they have done
   */
  private Integer num5KRacesRun(Runner runner) {
    return runner.getFiveKRaceTimes().size();
  }

  private Double getAverageRaceTime(Double time, Runner runner) {
    Double newTime = time / runner.num5KRacesRun(runner);
    return newTime;
  }

}