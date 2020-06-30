package edu.neu.ccs.cs5004.problem1;

import edu.neu.ccs.cs5004.problem1.Media;
import java.util.Comparator;

/**
 * A custom sort class to help sort our final lists by release date.
 */
public class MediaReleaseDateSorter implements Comparator<Media> {

  /**
   * Custom sort function to help organize the companies media list by descending release dates.
   *
   * @param o1 first type of media object
   * @param o2 second type of media object
   * @return a sorted list by descending order of release dates
   */
  @Override
  public int compare(Media o1, Media o2) {
    return o1.getReleaseDate().compareTo(o2.getReleaseDate());
  }
}
