package edu.neu.ccs.cs5004.problem1;

import edu.neu.ccs.cs5004.problem1.exceptions.InvalidUsernameException;
import edu.neu.ccs.cs5004.problem1.exceptions.PairAlreadyInitializedException;

/**
 * A non-empty UserPassPair denoted as: (u,p). The non-empty contains both a username, and password
 */
public class NonEmptyUpp extends AbstractUpp {

  private String username;
  private String password;

  private NonEmptyUpp nonEmptyUpp;
  private EmptyUpp newEmptyUpp;

  public NonEmptyUpp(String userName, String passWord) {
    this.username = userName;
    this.password = passWord;
  }

  /**
   * Checks whether or not the UserPassPair has a given userName, and password. Returns true if the
   * UserPassPair is empty and returns false if the UserPassPair is (u,p) non empty.
   *
   * @return true if the UserPassPair is empty, false if the UserPassPair is non-empty
   */
  @Override
  public Boolean isEmpty() {
    return false;
  }

  /**
   * Allows the user to add a userName and password to their UserPassPair. If the UserPassPair is
   * non-empty, and they try to use the add function it will throw an exception
   * PairAlreadyInitialized.
   *
   * @param userName the selected userName, represented as a String.
   * @param passWord the selected password, represented as a String.
   * @return a new UserPassPair with the userName and password
   * @throws PairAlreadyInitializedException exception used if the UserPassPair is non-empty
   */
  @Override
  public IUpp add(String userName, String passWord) throws PairAlreadyInitializedException {
    throw new PairAlreadyInitializedException(
        "Pair has already been initialized! Cannot add a new UserPassPair");
  }

  /**
   * Allows the user to replace their existing UserPassPair. If the users UserPassPair is non-empty
   * (u,p) they can enter a new userName, password pair to replace the old.
   *
   * @param userName the selected userName, represented as a String
   * @param passWord the selected password, represented as a String an empty UserPassPair
   */
  @Override
  public void replace(String userName, String passWord) {
    this.username = userName;
    this.password = passWord;
  }

  /**
   * The delete function allows a user to delete their UserPassPair. The delete function requires
   * that the user pass in their userName in order to verify credentials prior to deletion. If the
   * UserPassPair is non-empty (u,p) and the provided userName (String x) matches the non-empty
   * UserPassPair (u,p) the method will delete the pair and return a new empty UserPassPair.
   * If the UserPassPair is non-empty, but the user provides the wrong userName (String x) then the
   * method will throw a InvalidUsernameException.
   *
   * @param userName the selected userName, represented as a String.
   * @return a new empty UserPassPair
   * @throws InvalidUsernameException an exception thrown if the user enters the wrong userName.
   */
  @Override
  public EmptyUpp delete(String userName) throws InvalidUsernameException {
    if (nonEmptyUpp.getUsername().equals(userName)) {
      return newEmptyUpp = new EmptyUpp().createEmpty();
    } else {
      throw new InvalidUsernameException(
          "Error: Provided username does not match username on file");
    }
  }

  /**
   * Allows the user to get their password to their UserPassPair combination. To get the password,
   * the user must provide their userName. If the UserPassPair is non-empty (u,p) and the user
   * matches the userName on file, the user will get their password, represented as a String.
   * Lastly, if the UserPassPair is non-empty (u, p) but the user fails to match the userName on
   * file, then an InvalidUsernameException is thrown.
   *
   * @param userName the selected userName, represented as a String
   * @return the UserPassPair password, represented as a String
   * @throws InvalidUsernameException an exception thrown if the user enters the wrong userName or
   * enters a userName on an empty UserPassPair.
   */
  @Override
  public String getPassword(String userName) throws InvalidUsernameException {
    if (nonEmptyUpp.getUsername().equals(userName)) {
      return this.password;
    } else {
      throw new InvalidUsernameException(
          "Error: Provided username does not match username on file");
    }
  }

  /**
   * Gets the username of the UserPassPair.
   *
   * @return the username of the UserPassPair
   */
  public String getUsername() {
    return username;
  }

  /**
   * Gets the password of the UserPassPair.
   *
   * @return the password of the UserPassPair
  */
  public String passwordGetter() {
    return password;
  }
}
