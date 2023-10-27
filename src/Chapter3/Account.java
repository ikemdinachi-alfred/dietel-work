package Chapter3;

public class Account {


    private String name;
    private double balance;
    private String accountNumber;

    public void setName(String accountName) {
        name = accountName;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
}
