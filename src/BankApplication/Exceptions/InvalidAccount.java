package BankApplication.Exceptions;

public class InvalidAccount extends RuntimeException {
    public InvalidAccount(String messages) {
        super(messages);
    }
}
