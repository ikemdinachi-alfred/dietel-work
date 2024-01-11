package BankApp;

import BankApp.Exceptions.IncorrectPinExceptions;
import BankApp.Exceptions.InvalidAmountException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    Account account;

    @BeforeEach
    public void performThisActionFirst() {
        account = new Account("name", "number", "pin");
    }

    @Test
    public void TestAcountName() {
        assertEquals("name", account.getName());
    }

    @Test
    public void testThatAccountCanBeDepositOf1k_and_2k() {
        account.deposit(1000);
        assertEquals(1000, account.CheckBalance("pin"));
        account.deposit(2000);
        assertEquals(3000, account.CheckBalance("pin"));
    }
    @Test
    public void testThatUserCannotDepositAmountLessThanZero(){
        assertThrows(InvalidAmountException.class, () -> account.deposit(-300));
    }
    @Test
    public void testThatUserCanDeposit_and_Withdraw_with_Currect_Pin(){
       account.deposit( 10000);
       account.withdraw(5000,"pin");
       assertEquals(5000,account.CheckBalance("pin"));
    }
    @Test
    public void testThatUserCanDeposit_and_can_not_Withdraw_with_InCurrect_Pin(){
        account.deposit( 10000);
        assertThrows(IncorrectPinExceptions.class, () -> account.withdraw(5000,"4536"));
    }
    @Test
    public void testThatUserCanDeposit_and_can_not_WithdrawNegative_Balance_with_Currect_Pin(){
        account.deposit( 10000);
        assertThrows(InvalidAmountException.class, () -> account.withdraw(-15000,"pin"));
        assertEquals(10000,account.CheckBalance("pin"));
    }
    @Test
    public void testThatUserCanDeposit_and_can_not_Withdraw_MoreThanBalance_with_Currect_Pin(){
        account.deposit( 1000);
        assertThrows(InvalidAmountException.class, () -> account.withdraw(15000,"pin"));
        assertEquals(1000,account.CheckBalance("pin"));
    }


}