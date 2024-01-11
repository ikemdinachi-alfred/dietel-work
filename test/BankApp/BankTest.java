package BankApp;

import BankApp.Exceptions.IncorrectPinExceptions;
import BankApp.Exceptions.InvalidAccountsException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    Bank bank = new Bank();
    @Test
    public void testThatUser_can_create_account_and_total_number_of_account_is_one(){
        Account acount1 = bank.creatAccount("Ikemdinachi","Arua","pin");
        assertEquals(1,bank.getTotalNumberOfAccount());
        assertEquals("1002003001",acount1.getAccountNumber());
    }
    @Test
    public void testThatUser_can_create_Two_account_and_total_number_of_account_is_two(){
        Account acount1 = bank.creatAccount("Ikemdinachi","Arua","pin");
        Account account2 = bank.creatAccount("joseph","smith","1234");
        assertEquals(2,bank.getTotalNumberOfAccount());
        assertEquals("1002003001",acount1.getAccountNumber());
        assertEquals("1002003002",account2.getAccountNumber());
    }

    @Test
    public void testThatUser_can_create_Two_account_and_total_number_of_account_is_two_and_can_find_correct_accountNumber(){
        Account acount1 = bank.creatAccount("Ikemdinachi","Arua","pin");
        Account account2 = bank.creatAccount("joseph","smith","1234");
        assertEquals(2,bank.getTotalNumberOfAccount());
        assertEquals("1002003001",acount1.getAccountNumber());
        assertEquals("1002003002",account2.getAccountNumber());
        Account account = bank.findAccount("1002003001");
        assertEquals("1002003001",account.getAccountNumber());

    }
    @Test
    public void testThatUser_can_create_account_and_cannot_find_incorrect_accountNumber(){
        Account acount1 = bank.creatAccount("Ikemdinachi","Arua","pin");
        assertEquals(1,bank.getTotalNumberOfAccount());
        assertEquals("1002003001",acount1.getAccountNumber());
        assertThrows(InvalidAccountsException.class, ()-> bank.findAccount("1002003005"));

    }
    @Test
    public void testThatUser_can_deposit_into_created_accountNumber(){
        Account acount1 = bank.creatAccount("Ikemdinachi","Arua","pin");
        assertEquals(1,bank.getTotalNumberOfAccount());
        assertEquals("1002003001",acount1.getAccountNumber());
        bank.deposit(5000,"1002003001");
        assertEquals(5000,acount1.CheckBalance("pin"));
    }

    @Test
    public void testThatUser_can_deposit_into_created_accountNumber_and_can_withdraw(){
        Account acount1 = bank.creatAccount("Ikemdinachi","Arua","pin");
        assertEquals(1,bank.getTotalNumberOfAccount());
        assertEquals("1002003001",acount1.getAccountNumber());
        bank.deposit(5000,"1002003001");
        bank.withdraw(3000,"1002003001","pin");
        assertEquals(2000,acount1.CheckBalance("pin"));
    }
    @Test
    public void testThatUser_can_deposit_into_created_accountNumber_and_cannot_withdraw_with_wrong_password(){
        Account acount1 = bank.creatAccount("Ikemdinachi","Arua","pin");
        assertEquals(1,bank.getTotalNumberOfAccount());
        assertEquals("1002003001",acount1.getAccountNumber());
        bank.deposit(5000,"1002003001");
        assertThrows(IncorrectPinExceptions.class, () -> bank.withdraw(3000,"1002003001","pins"));
    }
    @Test
    public void testThatUser_can_transfer_to_existing_account(){
        Account acount1 = bank.creatAccount("Ikemdinachi","Arua","pin");
        Account account2 = bank.creatAccount("Michael","smith","pin");
        assertEquals(2,bank.getTotalNumberOfAccount());
        assertEquals("1002003001",acount1.getAccountNumber());
        assertEquals("1002003002",account2.getAccountNumber());
        bank.deposit(5000,"1002003001");
        bank.transfer(3000,"1002003001","1002003002",acount1.pin);
        assertEquals(3000,account2.CheckBalance("pin"));
        assertEquals(2000,acount1.CheckBalance("pin"));
    }

}