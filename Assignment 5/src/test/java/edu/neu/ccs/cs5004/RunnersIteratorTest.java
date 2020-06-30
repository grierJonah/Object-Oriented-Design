package edu.neu.ccs.cs5004;

import static org.junit.Assert.*;

import edu.neu.ccs.cs5004.problem1.Runner;
import edu.neu.ccs.cs5004.problem2.RunnersIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class RunnersIteratorTest {

  private RunnersIterator iterator;
  private Runner testRunner;
  List<Double> fiveKTimes = Arrays.asList(17.51, 17.56, 18.03, 19.22);
  List<Double> tenKTimes = Arrays.asList(35.14, 34.01, 31.12, 29.99);
  List<Double> halfMarathonTimes = Arrays.asList(115.11, 108.0, 99.8, 92.00, 98.00, 93.02);
  List<Runner> newList = new ArrayList<>();

  @Before
  public void setUp() throws Exception {
    testRunner = new Runner("Jonah", fiveKTimes, tenKTimes, halfMarathonTimes);
    newList.add(testRunner);
    iterator = new RunnersIterator(newList);
  }

  @Test
  public void iterator() {
    assertEquals(iterator.iterator().hasNext(), true);
    assertEquals(iterator.iterator().next(), testRunner.getFiveKRaceTimes().get(0));
  }

  /*@Test
  public void getQualifiedRunners() {

  }*/
}