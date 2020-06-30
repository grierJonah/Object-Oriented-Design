package edu.neu.ccs.cs5004;

import static org.junit.Assert.*;

import edu.neu.ccs.cs5004.problem1.Runner;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class RunnerTest {
  private Runner runnerOG;
  private Runner runnerOther;
  private Runner testSameRunner1;
  private Runner testSameRunner2;

  private List<Double> orgRunner5kTimes = Arrays.asList(17.51, 17.56, 18.03, 19.22);
  private List<Double> orgRunner10kTimes = Arrays.asList();
  private List<Double> orgRunnerHalfMarathonTimes = Arrays.asList();

  private List<Double> otherRunner5kTimes = Arrays.asList(6.55, 18.16, 17.56, 22.01, 21.13, 16.59);
  private List<Double> otherRunner10kTimes = Arrays.asList();
  private List<Double> otherRunnerHalfMarathonTimes = Arrays.asList();

  private List<Double> runner1fiveKTimes = Arrays.asList(17.00);
  private List<Double> runner2fiveKTimes = Arrays.asList(17.00);

  @Before
  public void setUp() throws Exception {
    runnerOG = new Runner("Jonah", orgRunner5kTimes, orgRunner10kTimes,
        orgRunnerHalfMarathonTimes);
    runnerOther = new Runner("Matt", otherRunner5kTimes, otherRunner10kTimes,
        otherRunnerHalfMarathonTimes);
    testSameRunner1 = new Runner("testSameTimes1", runner1fiveKTimes, orgRunner10kTimes,
        orgRunnerHalfMarathonTimes);
    testSameRunner2 = new Runner("testSameTimes2", runner2fiveKTimes, orgRunner10kTimes,
        orgRunnerHalfMarathonTimes);
  }

  @Test
  public void getName() {
    assertEquals(runnerOG.getName(), "Jonah");
    assertEquals(runnerOther.getName(), "Matt");
  }

  @Test
  public void getFiveKRaceTimes() {
    List<Double> compareArray = Arrays.asList(17.51, 17.56, 18.03, 19.22);
    assertEquals(compareArray, runnerOG.getFiveKRaceTimes());
  }

  @Test
  public void getTenKRaceTimes() {
    List<Double> compareArray = Arrays.asList();
    assertEquals(compareArray, runnerOG.getTenKRaceTimes());
    assertEquals(compareArray, runnerOther.getTenKRaceTimes());
  }

  @Test
  public void getHalfMarathonTimes() {
    List<Double> compareArray = Arrays.asList();
    assertEquals(compareArray, runnerOG.getHalfMarathonTimes());
    assertEquals(compareArray, runnerOther.getHalfMarathonTimes());

  }

  @Test
  public void compareTo() {
    assertEquals(1, runnerOG.compareTo(runnerOther));
    assertEquals(-1, runnerOther.compareTo(runnerOG));
    assertEquals(0, testSameRunner1.compareTo(testSameRunner2));
  }
}