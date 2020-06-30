package Problem3;

import java.util.Date;

public class Account {

  private String firstName;
  private String lastName;
  private Double accountBalance;
  private Account existingAccount;

  /**
   * Constructor that create's a new account object with the specified first name, last name, and
   * account balance
   *
   * @param firstName - first name of account holder
   * @param lastName - last name of account holder
   * @param accountBalance - current account balance
   */
  public Account(String firstName, String lastName, Double accountBalance) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.accountBalance = accountBalance;
  }

  /**
   * Returns current account balance
   *
   * @return - current account balance
   */
  public Double getCurrentBalance() {
    return this.accountBalance;
  }

  /**
   * Return's new account with new deposited amount
   *
   * @param depositAmount - value to deposit into account
   * @return - a new account with with a new value
   */
  public Account deposit(Double depositAmount) {
    Double currentAmount = getCurrentBalance();
    Double newAccountBalance =
        currentAmount + depositAmount;
    Account newAccount = new Account(this.firstName, this.lastName, newAccountBalance);
    return newAccount;
  }

  /**
   * Returns account balance after a withdrawal takes place, or returns null if withdrawal amount is
   * over account balance
   *
   * @param withdrawalAmount - amount to remove from current account balance
   * @return - new account balance after withdrawal takes place, or null
   */
  public Account withdraw(Double withdrawalAmount) {
    if (this.accountBalance - withdrawalAmount >= 0) {
      Double currentAmount = getCurrentBalance();
      Double newAccountBalance = currentAmount - withdrawalAmount;
      Account newAccount = new Account(this.firstName, this.lastName, newAccountBalance);
      return newAccount;
    }
    System.out.println("Amount withdrawn is too large. Returning last known account balance...");
    return existingAccount = new Account(this.firstName, this.lastName, this.accountBalance);
  }
}
