package edu.neu.ccs.cs5004.problem1;

import edu.neu.ccs.cs5004.problem1.exceptions.InvalidUsernameException;
import edu.neu.ccs.cs5004.problem1.exceptions.PairEmptyException;

/**
 * An empty UserPassPair. An empty UserPassPair contains no attributes.
 */
public class EmptyUpp extends AbstractUpp {

  EmptyUpp emptyUserPassPair;
  IUpp nonEmptyUpp;

  public EmptyUpp() {
  }

  @Override
  public EmptyUpp createEmpty() {
    return emptyUserPassPair = new EmptyUpp();
  }

  /**
   * Checks whether or not the UserPassPair has a given userName, and password. Returns true if the
   * UserPassPair is empty and returns false if the UserPassPair is (u,p) non empty.
   *
   * @return true if the UserPassPair is empty, false if the UserPassPair is non-empty
   */
  @Override
  public Boolean isEmpty() {
    return true;
  }

  /**
   * Allows the user to add a userName and password to their UserPassPair. If the UserPassPair is
   * empty, the new userName and password will be accepted and the user will be returned their
   * UserPassPair.
   *
   * @param userName the selected userName, represented as a String.
   * @param passWord the selected password, represented as a String.
   * @return a new UserPassPair with the userName and password
   */
  @Override
  public IUpp add(String userName, String passWord) {
    return nonEmptyUpp = new NonEmptyUpp(userName, passWord);
  }

  /**
   * Allows the user to replace their existing UserPassPair. If the user tries to replace an empty
   * UserPassPair they will run into a PairEmptyException.
   *
   * @param userName the selected userName, represented as a String
   * @param passWord the selected password, represented as a String
   * @throws PairEmptyException an exception thrown if the user tries to use the replace function on
   * an empty UserPassPair
   */
  @Override
  public void replace(String userName, String passWord) throws PairEmptyException {
    throw new PairEmptyException("Error: Cannot replace a UserPassPair that is already empty");
  }

  /**
   * The delete function allows a user to delete their UserPassPair. If the UserPassPair is empty
   * then the method will return an empty UserPassPair.
   *
   * @param userName the selected userName, represented as a String.
   * @return a new empty UserPassPair
   */
  @Override
  public IUpp delete(String userName) {
    return emptyUserPassPair = new EmptyUpp();
  }

  /**
   * Allows the user to get their password to their UserPassPair combination. To get the password,
   * the user must provide their userName. If the user uses the method on an empty UserPassPair
   * then an InvalidUsernameException will be thrown.
   *
   * @param userName the selected userName, represented as a String
   * @return the UserPassPair password, represented as a String
   * @throws InvalidUsernameException an exception thrown if the user enters the wrong userName or
   * enters a userName on an empty UserPassPair.
   */
  @Override
  public String getPassword(String userName) throws InvalidUsernameException {
    throw new InvalidUsernameException("Error: Cannot get password from an empty UserPassPair");
  }
}
