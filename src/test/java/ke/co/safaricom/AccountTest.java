package ke.co.safaricom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Test class for user account model")
public class AccountTest {

    @Test
    @DisplayName("Test deposit logic for balance")
    public void testDepositIsWorking(){
        Account sampleAccount = new Account();
        sampleAccount.deposit(1000);
        double accBalance = sampleAccount.getAccountBalance();
        assertEquals(1000.00, accBalance);
    }

    @Test
    @DisplayName("Test withdrawal from account updates balance")
    public void testWithdrawFromAccountUpdatesTheBalance(){
        Account sampleAccount = new Account();
        sampleAccount.deposit(1000);
        boolean isSuccess = sampleAccount.withdraw(900);
        assertTrue(isSuccess);
        assertEquals(0.0, sampleAccount.getAccountBalance());
    }

    @Test
    @DisplayName("Test withdrawal invalid amount fails")
    public void testWithdrawalFromAccountInvalidAmount() {
        Account sampleAccount = new Account();
        sampleAccount.deposit(1000);
        boolean isSuccess = sampleAccount.withdraw(90);
        assertFalse(isSuccess);
    }

    @Test
    @DisplayName("Test withdrawal for amount greater than balance fails")
    public void testWithdrawalFromAccountAmountGreaterThanBalance() {
        Account sampleAccount = new Account();
        sampleAccount.deposit(1000);
        boolean isSuccess = sampleAccount.withdraw(1000);
        assertFalse(isSuccess);
    }
}
