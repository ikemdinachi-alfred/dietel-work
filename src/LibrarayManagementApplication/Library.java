package LibrarayManagementApplication;
import LibrarayManagementApplication.exceptions.InvalidBookSearchException;
import LibrarayManagementApplication.exceptions.InvalidDetailsException;
import LibrarayManagementApplication.exceptions.UserExistException;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Users> users = new ArrayList<>();
    Users user;
    int totalNumberOfAvailableBooks;

    public Book addBooks(String title, String author, String id) {
        Book book = new Book(id, title, author);
        books.add(book);
        book.setIsAvailable(true);
        totalNumberOfAvailableBooks++;
        return book;
    }


    public int getTotalNumberOfAvailableBooks() {
        return totalNumberOfAvailableBooks;
    }

    public Book findBook(String title, String bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId) && book.getTitle().equals(title)) return book;
        }
        throw new InvalidBookSearchException("book is not available");
    }

    public String login(String username, String password) {
         user = new Users(username, password);
         checkIfUserExist(username,password);
        findUserByPassword(password);
        return "login Successful..";
    }
    public Users register(String username,String phoneNumber,String address, String id, String password){
        user = new Users(username,phoneNumber,address,id,password);
        checkIfUserExist(id,password);
        users.add(user);
        return user;
    }

    private void checkIfUserExist(String username,String password) {
        for (Users users : users) {
            if (users!=null && username!= null && password!=null)
                throw new UserExistException(" sorry, your details already exist");
        }
    }


    private void findUserByPassword( String password) {
            if (!user.getPassword().equals(password))
                throw new InvalidDetailsException("wrong details try again");

        }
    }
    public ArrayList<Book> displayBooks(){
        return books;
    }

}




