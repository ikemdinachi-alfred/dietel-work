package Tdd;

public class Account {
    private String name= "Arua Ikemdinachi";
    private int balance;
    public void deposit(int amount){
        if (amount>balance)
        this.balance=balance+amount;
    }
    public void withdraw(int amount){
        if(balance>0 && balance>amount )
        this.balance=balance-amount;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}