package edu.neu.ccs.cs5004.problem1;

import edu.neu.ccs.cs5004.problem1.exceptions.AliasAlreadyExistsException;
import java.util.List;
import java.util.Set;

public class Media {

  private String alias;
  private Set<String> currentAliases;
  private String title;
  private Integer releaseDate;
  private List<String> directors;
  private List<String> mainActors;

  /**
   * Constructs a new piece of media with the given parameters.
   *
   * @param alias a separate name / title for the media
   * @param title the title of the media
   * @param releaseDate the release date it was published on
   * @param directors list of directors
   * @param mainActors list of actors
   */
  public Media(String alias, String title, Integer releaseDate, List<String> directors,
      List<String> mainActors) throws AliasAlreadyExistsException {
    addAlias(alias);
    this.alias = alias;
    this.title = title;
    this.releaseDate = releaseDate;
    this.directors = directors;
    this.mainActors = mainActors;
  }

  /**
   * Gets a list of directors who worked on the media.
   *
   * @return a list of directors
   */
  public List<String> getDirectors() {
    return directors;
  }

  /**
   * Gets the title of the media.
   *
   * @return the title of the media
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the title of the media.
   *
   * @param title the title
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Gets the date the media was released.
   *
   * @return the date the media was released
   */
  public Integer getReleaseDate() {
    return releaseDate;
  }

  /**
   * Sets the release date that the media was published.
   *
   * @param releaseDate the release date the media was published
   */
  public void setReleaseDate(Integer releaseDate) {
    this.releaseDate = releaseDate;
  }

  private void addAlias(String alias) throws AliasAlreadyExistsException {
    if (!currentAliases.contains(alias)) {
      currentAliases.add(alias);
    }
    throw new AliasAlreadyExistsException("Alias already exists! Try a new alias");
  }
}
