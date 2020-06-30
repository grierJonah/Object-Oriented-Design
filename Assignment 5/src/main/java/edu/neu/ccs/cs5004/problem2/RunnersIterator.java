package edu.neu.ccs.cs5004.problem2;

import edu.neu.ccs.cs5004.problem1.Runner;
import java.util.*;

public class RunnersIterator implements Iterable {

  private List<Runner> runnerList;
  private Runner runner;
  private Integer currentElement = 0;

  public RunnersIterator(List<Runner> runners) {
    this.runnerList = runners;
  }

  /**
   * Returns an iterator over elements of type {@code T}.
   *
   * @return an Iterator.
   */
  @Override
  public Iterator iterator() {
    return new Iterator() {
      @Override
      public boolean hasNext() {
        if (runnerList.size() >= currentElement + 1) {
          return true;
        }
        return false;
      }

      @Override
      public Object next() {
        if (runnerList.size() >= currentElement + 1) {
          return runnerList.get(currentElement).getFiveKRaceTimes().get(currentElement++);
        }
        return null;
      }
    };
  }

  /**
   * Gets the qualified runners in a list of runner times. If the runners list has more than 5,
   * 5K races completed and at least 1 half marathon race time under 100.0 minutes than they are
   * qualified to be in the next upcoming half marathon race.
   *
   * @param runners the runners times
   * @return a qualified runner based on specifications
   */
  public List<Runner> getQualifiedRunners(List<Double> runners) {
    Double halfMarathonRaceTime = 100.0;
    List<Runner> newList = new ArrayList<>();
    if (runners.size() >= 5) {
      for (Double i : runner.getHalfMarathonTimes()) {
        if (i < halfMarathonRaceTime) {
          newList.add(runner);
        }
      }
      return newList;
    } else {
      return null;
    }
  }
}
