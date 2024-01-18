package LibrarayManagementApplication;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> book = new ArrayList<>();
    ArrayList<Users> users = new ArrayList<>();
    int totalNumberOfAvailableBooks;

    public Book addBooks(String title, String author, String id){
        Book books = new Book(id,title,author);
        book.add(books);
        totalNumberOfAvailableBooks++;
        return books;
        }

    public int getTotalNumberOfAvailableBooks() {
        return totalNumberOfAvailableBooks;
    }

    public Book findBook(String title, String bookId) {
        for (Book book:book){
            if (book.getId().equals(bookId) && book.getTitle().equals(title))return book;
        }
        throw new InvalidBookSearchException ("book is not available");
    }
    public Users login(String name, String id){
        Users users1 = new Users(name,id);
        findUsers(name,id);
        return users1;
    }


    private Users findUsers(String name, String id){
        for (Users user:users){
            if (user.equals(name) && user.equals(id)) return user;
        }
        throw new InvalidDetailsException("wrong details try again");
    }



}

