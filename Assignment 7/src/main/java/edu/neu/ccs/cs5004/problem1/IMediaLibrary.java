package edu.neu.ccs.cs5004.problem1;

import java.util.List;

public interface IMediaLibrary {


  /**
   * Method returns a sorted list of movies or tv shows that are directed by a specific director's
   * name. If there are multiple movies found by a certain director than the list will be returned
   * showcasing the most recent movies at the front: Ordered by most recent release date.
   *
   * @param name the name of the Director to search for
   * @return a list of movies that are directed by the specific Director
   */
  List<Media> getMoviesDirectedBy(String name);


  /**
   * Allows the company to add a new movie or tv show to their given list of shows.
   *
   * @param media the type of media being added to the
   */
  void addMedia(Media media);

  /**
   * Method returns value regarding the number of times a certain movie or tv show has been streamed
   * by viewers.
   *
   * @param alias the name of the movie or tv show
   * @return an Integer value
   */
  Integer getNumberStreamed(String alias);

  /**
   * Method returns the most streamed / viewed media that the company offers.
   *
   * @return the most streamed media
   */
  Media getMostStreamed();


}
