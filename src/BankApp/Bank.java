package BankApp;

import BankApp.Exceptions.InvalidAccountsException;

import java.util.ArrayList;

public class Bank {
    ArrayList<Account> accounts = new ArrayList<>();
    int totalNumberOfAccount;

public Account creatAccount(String firstName, String lastName, String pin){
    totalNumberOfAccount++;
    String accountNumber = generateAccountNumber();
    String accountName = fullName(firstName,lastName);
    Account account = new Account(accountName,accountNumber,pin);
    accounts.add(account);
return account;
}

    private String generateAccountNumber() {
    return "100200300" + totalNumberOfAccount;
    }
    private String fullName(String firstname, String lastName){
    return firstname + " "+ lastName;
    }

    public Account findAccount(String number){
    for (Account account:accounts){
        if (account.getAccountNumber().equals(number)) return account;
    }
    throw  new InvalidAccountsException("account does not exist");
    }

    public int getTotalNumberOfAccount(){
    return totalNumberOfAccount;
    }
    public void deposit(long amount, String number){
    Account account = findAccount(number);
    account.deposit(amount);
    }
    public void withdraw(long amount, String number, String pin){
    Account account = findAccount(number);
    account.withdraw(amount,pin);
    }
    public void transfer(long amount, String senderAccount, String recieverAccount, String pin){
    Account sender = findAccount(senderAccount);
    Account reciever = findAccount(recieverAccount);
    sender.withdraw(amount,pin);
    reciever.deposit(amount);
    }
}
