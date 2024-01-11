package BankApp.Exceptions;

public class InvalidAccountsException extends RuntimeException{
    public InvalidAccountsException(String message){
        super(message);
    }
}
