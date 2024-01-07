package Tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void deposit(){
    Account firstAccount= new Account();
    firstAccount.deposit(5_000);
    assertEquals(5_000,firstAccount.getBalance());
    System.out.println(firstAccount.getName()+ " Deposit Amount is: "+ firstAccount.getBalance());
    }
    @Test
public void withdraw(){
        Account zenithAccount= new Account();
        zenithAccount.deposit(10_000);
        zenithAccount.withdraw(5_000);
        assertEquals(5_000,zenithAccount.getBalance());
    System.out.println(zenithAccount.getBalance());
    }
    @Test
public void canNotWithdrawMoreThanBalance(){
        Account wemaAccount= new Account();
        wemaAccount.deposit(10_000);
        wemaAccount.withdraw(20_000);
        assertEquals(10_000,wemaAccount.getBalance());
    System.out.println(wemaAccount.getBalance());
}
@Test
public void canNotDepositNegativeValue(){
        Account microFinance= new Account();
        microFinance.deposit(20_000);
        microFinance.deposit(-10_000);
        assertEquals(20_000,microFinance.getBalance());
    System.out.println(microFinance.getBalance());
}
}