package BankApp;

import java.util.Scanner;

public  class BankMain {
    static  Bank bank = new Bank();

    public static void main(String[] args) {
        bankMainMenu();
    }
    public static void bankMainMenu() {
        String main = """
                %%%%%%%%%%%%%%%%%%%%%%%%%%%%%
                1. -> Open Account    3. -> Transfers      
                2. -> Check Balance   4. -> Withdraw      
                5. -> Deposit                                                 
                %%%%%%%%%%%%%%%%%%%%%%%%%%%%%
                """;

        String response = input(main);
        bankoperation(response);
    }

    public static void bankoperation(String choice) {
        switch (choice) {
            case "1":
                openAccount();
            case "2" :
                checkBalance();
            case "3"  :
                transfer();
            case "4"  :
                withdraw();
            case "5"  :
                deposit();
            default:
                System.out.println("wrong input");
                bankMainMenu();
        }


    }

    private static void deposit() {
        String accountNumber =  input("Enter Account Number: ");
        long ammunt = Long.parseLong((input("Enter Amount: ")));
        try {
            bank.deposit( ammunt,accountNumber);
            BankApp.Account account = bank.findAccount(accountNumber);
            //Account account = bank.findAccount(accountNumber);
            System.out.println("deposit successful.... ");
            System.out.printf("""
                    %d.00 have been credited to
                    1002003***, by self
                    balance is %d.00 Naira
                    """, ammunt,account.checkBalance());
            bankMainMenu();

        }catch (Exception message){
            System.out.println(message.getMessage());
            bankMainMenu();
        }

    }

    private static void withdraw() {
        String accountNumber = input("Enter Account Number: ");
        int ammount = Integer.parseInt(input("Enter Amount: "));
        String pin = input("Enter pin: ");
        try {
            bank.withdraw(ammount,accountNumber,pin);
           // Account account = bank.findAccount(accountNumber);
            System.out.println("withdrawal was done successfully..");
            bankMainMenu();

        }
        catch (Exception message){
            System.out.println(message.getMessage());
            bankMainMenu();
        }
    }

    private static void transfer() {
        String sender = input("Enter senders Account number: ");
        String reciever = input("Enter Receivers Account Number: ");
        long amount = Long.parseLong((input("Enter Amount: ")));
        String pin = input("Enter your pin: ");
        try {
            bank.transfer(amount, sender, reciever, pin);
            System.out.println("Transfer processing ....");
            for (int count = 0; count < 15000; count++) {
            }
            System.out.println("transfer Successfully done..... \n" );
            for (int count = 0; count<20000;count+=1) {
            }
            BankApp.Account account = bank.findAccount(sender);
            System.out.println("Account with 102003*** Balance is: " +account.CheckBalance(pin));
            bankMainMenu();

        } catch (Exception message) {
            System.out.println(message.getMessage());
            bankMainMenu();
        }
    }
    private static void checkBalance() {
        String accountNumber = input("Enter Account Number: ");
        String pin = input("Enter your pin: ");
        try{
            BankApp.Account account = bank.findAccount(accountNumber);
            System.out.println("Account with the number 102003*** Balance is: " +account.CheckBalance(pin));
            bankMainMenu();
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            bankMainMenu();
        }
    }


    public static void openAccount() {
        String firstName = input("Enter your first Name: ");
        String lastName = input("Enter your last Name: ");
        String pin = input("Enter your pin");
        Account account = bank.creatAccount(firstName, lastName, pin);
        System.out.println("Account created successfully.......\n");
        System.out.println("your Account details are \n" + account);
        bankMainMenu();
    }

    public static String input(String words) {
        Scanner input = new Scanner(System.in);
        System.out.println(words);
        return input.nextLine();

    }
}
