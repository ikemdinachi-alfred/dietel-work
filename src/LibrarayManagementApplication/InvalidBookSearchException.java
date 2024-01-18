package LibrarayManagementApplication;

public class InvalidBookSearchException extends RuntimeException{
    public InvalidBookSearchException (String message){
        super(message);
    }

}
