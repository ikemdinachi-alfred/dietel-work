package Chapter3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class AccountTest {
    @Test
    public void testAccountIsFunctional() {
        Account myAccount = new Account();
        myAccount.setAccountNumber("2371222526");
        myAccount.setName("Alfred Ikemdinachi");
        Assertions.assertEquals("2371222526", myAccount.getAccountNumber());
        Assertions.assertEquals("Alfred Ikemdinachi", myAccount.getName());
    }
    @Test
    public void testThatBalanceIsSet(){
        Account myAccount = new Account();
        myAccount.setBalance(45_500.00);

        Assertions.assertEquals(45_500, myAccount.getBalance(), 00);


        }


    }

