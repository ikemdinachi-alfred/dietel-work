package BankApp;

import BankApp.Exceptions.IncorrectPinExceptions;
import BankApp.Exceptions.InvalidAmountException;
public class Account {
    String name;
    String pin;
    long balance;
    String accountNumber;

   Account(String name,String accountNumber,String pin){
       this.name = name;
       this.accountNumber = accountNumber;
       this.pin = pin;
   }



    public String getName(){
       return  name;
   }

    public void deposit(long amount) {
       updateDeposit(amount);
       balance = balance + amount ;
    }

    private void updateDeposit(long amount) {
       if (amount< 0 && amount < balance) throw new InvalidAmountException("deposit amount must be above zero");
    }

    public long CheckBalance(String pin) {
       return balance;
    }
    public long checkBalance(){
       return balance;
    }

    public void withdraw(long amount, String pin) {
        updatewithdraw(amount);
       updatePin(pin);
       this.balance = balance - amount;
       this.pin = pin;
    }


    private void updatewithdraw(long amount) {
        if (amount< 0) throw new InvalidAmountException(" withdrawal amount must be above zero");
        if (amount > balance) throw new InvalidAmountException("insufficient fund");
    }

    private void updatePin(String pin) {
       if (!pin.equals(this.pin)) throw new IncorrectPinExceptions("wrong pin");
    }
    public String toString(){
        return String.format("""
               ===============================
               Account Name: %s
               Account Pin: "%s", please keep it secret.
               Account Number: %s
               Account Balance %s
               ===============================
               """,name,pin,accountNumber,balance);
    }

    public String getAccountNumber() {
       return accountNumber;
    }
}
