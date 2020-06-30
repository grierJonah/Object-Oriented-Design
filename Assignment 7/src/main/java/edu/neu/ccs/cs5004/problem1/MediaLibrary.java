package edu.neu.ccs.cs5004.problem1;

import java.util.ArrayList;
import java.util.List;

public class MediaLibrary implements IMediaLibrary {

  protected List<Media> mediaLibrary;

  /**
   * Constructs a new Media Library with a piece of media.
   *
   * @param Media a television show or movie
   */
  public MediaLibrary(List<Media> Media) {
    this.mediaLibrary = Media;
  }

  /**
   * Method returns value regarding the number of times a certain movie or tv show has been streamed
   * by viewers.
   *
   * @param alias the name of the movie or tv show
   * @return an Integer value
   */
  @Override
  public Integer getNumberStreamed(String alias) {
    return null;
  }

  /**
   * Method returns the most streamed / viewed media that the company offers.
   *
   * @return the most streamed media
   */
  @Override
  public Media getMostStreamed() {
    return null;
  }

  /**
   * Method returns a sorted list of movies that are directed by a specific director's name. If
   * there are multiple movies found by a certain director than the list will be returned showcasing
   * the most recent movies at the front: Ordered by most recent release date.
   *
   * @param name the name of the Director to search for
   * @return a list of movies that are directed by the specific Director
   */
  public List<Media> getMoviesDirectedBy(String name) {
    List<Media> mediaList = new ArrayList<>();         // new list to return
    for (int i = 0; i < mediaLibrary.size(); i++) {
      if (mediaLibrary.get(i).getDirectors().contains(name)) {
        mediaList.add(mediaLibrary.get(i));
      }
    }
    mediaList.sort(new MediaReleaseDateSorter());  // use custom sorter to see organize by release
    return mediaList;
  }

  /**
   * Allows the company to add a new movie or tv show to the given list of
   */
  public void addMedia(Media media) {
    mediaLibrary.add(media);
  }
}

