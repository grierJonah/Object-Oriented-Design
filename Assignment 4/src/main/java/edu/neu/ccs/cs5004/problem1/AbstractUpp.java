package edu.neu.ccs.cs5004.problem1;

import edu.neu.ccs.cs5004.problem1.exceptions.InvalidUsernameException;
import edu.neu.ccs.cs5004.problem1.exceptions.PairAlreadyInitializedException;
import edu.neu.ccs.cs5004.problem1.exceptions.PairEmptyException;

/**
 * An abstract class for the UserPassPair.
 */
public abstract class AbstractUpp implements IUpp {

  IUpp newEmpty;

  /**
   * Creates and returns an empty UserPassPair.
   *
   * @return UserPassPair
   */
  @Override
  public IUpp createEmpty() {
    return newEmpty = new EmptyUpp();
  }

  /**
   * Checks whether or not the UserPassPair has a given userName, and password. Returns true if the
   * UserPassPair is empty and returns false if the UserPassPair is (u,p) non empty.
   *
   * @return true if the UserPassPair is empty, false if the UserPassPair is non-empty
   */
  @Override
  public abstract Boolean isEmpty();

  /**
   * Allows the user to add a userName and password to their UserPassPair. If the UserPassPair is
   * empty, the new userName and password will be accepted and the user will be returned their
   * UserPassPair. If the UserPassPair is already non-empty, and they try to use the add function it
   * will throw an exception PairAlreadyInitialized.
   *
   * @param userName the selected userName, represented as a String.
   * @param passWord the selected password, represented as a String.
   * @return a new UserPassPair with the userName and password
   * @throws PairAlreadyInitializedException exception used if the UserPassPair is non-empty
   */
  @Override
  public abstract IUpp add(String userName, String passWord) throws PairAlreadyInitializedException;

  /**
   * Allows the user to replace their existing UserPassPair. If the users UserPassPair is non-empty
   * (u,p) they can enter a new userName, password pair to replace the old. If the user tries to
   * replace an empty UserPassPair they will run into a PairEmptyException.
   *
   * @param userName the selected userName, represented as a String
   * @param passWord the selected password, represented as a String
   * @throws PairEmptyException an exception thrown if the user tries to use the replace function
   * on an empty UserPassPair
   */
  @Override
  public abstract void replace(String userName, String passWord) throws PairEmptyException;

  /**
   * The delete function allows a user to delete their UserPassPair. The delete function requires
   * that the user pass in their userName in order to verify credentials prior to deletion. If the
   * UserPassPair is empty then the method will return an empty UserPassPair. If the UserPassPair is
   * non-empty (u,p) and the provided userName (String x) matches the non-empty UserPassPair (u,p)
   * the method will delete the pair and return a new empty UserPassPair. If the UserPassPair is
   * non-empty, but the user provides the wrong userName (String x) then the method will throw a
   * InvalidUsernameException.
   *
   * @param userName the selected userName, represented as a String.
   * @return a new empty UserPassPair
   * @throws InvalidUsernameException an exception thrown if the user enters the wrong userName.
   */
  @Override
  public abstract IUpp delete(String userName) throws InvalidUsernameException;

  /**
   * Allows the user to get their password to their UserPassPair combination. To get the password,
   * the user must provide their userName. If the user uses the method on an empty UserPassPair then
   * an InvalidUsernameException will be thrown. If the UserPassPair is non-empty (u,p) and the user
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
  public abstract String getPassword(String userName) throws InvalidUsernameException;


}
