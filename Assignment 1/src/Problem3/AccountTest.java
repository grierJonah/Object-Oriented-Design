package Problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

  private Account testAccount;
  private Account testAccount2;

  @Before
  public void setUp() throws Exception {
    testAccount = new Account("Jonah", "Grier", 1500.0);
    testAccount2 = new Account("Test", "Me", 0.0);
  }

  @Test
  public void getCurrentBalance() {
    assertEquals(1500.0, testAccount.getCurrentBalance(), 0);
    assertEquals(0.0, testAccount2.getCurrentBalance(), 0);
  }

  @Test
  public void deposit() {
    Account depositAccountA = new Account("Jonah", "Grier", 1500.0);
    Account depositAccountB = new Account("Jonah", "Grier", 1554.65);

    Double depositAmount = 54.65;
    Account newAccount = depositAccountA.deposit(depositAmount);

    assertEquals(newAccount.getCurrentBalance(), depositAccountB.getCurrentBalance());
  }

  @Test
  public void withdraw() {
    // Test withdraw works when first account has sufficient funds

    Account withdrawAccountA = new Account("Jonah", "Grier", 1000.0);
    Account withdrawAccountB = new Account("Jonah", "Grier", 500.0);
    Double withdrawAmount = 500.0;
    Account newAccount = withdrawAccountA.withdraw(withdrawAmount);
    assertEquals(newAccount.getCurrentBalance(), withdrawAccountB.getCurrentBalance());

    // Test withdraw fails and returns original balance when there are not sufficient funds to withdraw
    Account insufficientWithdraw = new Account("Jonah", "Grier", 49.0);
    Account newInsufficientAccount = insufficientWithdraw.withdraw(withdrawAmount);
    assertEquals(newInsufficientAccount.getCurrentBalance(),
        insufficientWithdraw.getCurrentBalance());
    assertEquals(insufficientWithdraw.getCurrentBalance(), 49.0, 0);
  }
}