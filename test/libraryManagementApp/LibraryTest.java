package libraryManagementApp;

import LibrarayManagementApplication.Book;
import LibrarayManagementApplication.Users;
import LibrarayManagementApplication.exceptions.InvalidBookSearchException;
import LibrarayManagementApplication.exceptions.InvalidDetailsException;
import LibrarayManagementApplication.exceptions.UserExistException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library library = new Library();
    Book book;
    Users user;
    @BeforeEach
    public  void testThisFirst() {
        book = new Book("0001", "chike and The River", "Chinua Achebe");
        user = new Users("username","phoneNumber","id","address","password");
    }
    @Test
    public void testThatWhenBookIsAddedTotalNumberOfBooksIncreasesByOne(){
        library.addBooks("chike and The River", "Chinua Achebe","0001");
        assertEquals(1,library.getTotalNumberOfAvailableBooks());
    }
    @Test
    public void testThatWhenBookIsAdded_twice_TotalNumberOfBooksIsTwo(){
        library.addBooks("chike and The River", "Chinua Achebe","0001");
        library.addBooks("chike and The River", "Chinua Achebe","0002");
        assertEquals(2,library.getTotalNumberOfAvailableBooks());
    }
    @Test
    public void testThatWhenBookIsAdded_It_can_be_found_during_search(){
        library.addBooks("chike and The River", "Chinua Achebe","0001");
        library.findBook("chike and The River","0001");
        assertEquals("chike and The River",book.getTitle());
    }
    @Test
    public void testThatWhenBookIsAdded_when_user_search_with_a_wrong_id_it_will_throw_exception(){
        library.addBooks("chike and The River", "Chinua Achebe","0001");
        assertThrows(InvalidBookSearchException.class, ()->library.findBook("chike and The River","0002"));

    }
    @Test
    public void test_that_user_can_register(){
       Users register =  library.register("ikemsimple","090","yaba","id","0000");
        String userName= register.getUserName();
        String password = register.getPassword();
        String address = register.getAddress();
        String phoneNumber = register.getPhoneNumber();
        assertEquals(password, register.getPassword());
        assertEquals(address,register.getAddress());
        assertEquals(phoneNumber,register.getPhoneNumber());
       assertEquals(userName,register.getUserName());
    }
    @Test
    public void test_that_user_can_Not_register_twice(){
        Users register =  library.register("ikemsimple","090","yaba","id","0000");
        String userName= register.getUserName();
        String password = register.getPassword();
        String address = register.getAddress();
        String phoneNumber = register.getPhoneNumber();
        assertEquals(password, register.getPassword());
        assertEquals(address,register.getAddress());
        assertEquals(phoneNumber,register.getPhoneNumber());
        assertEquals(userName,register.getUserName());
        assertThrows(UserExistException.class,()->library.register("ikemsimple","090","yaba","id","0000"));
    }

    @Test
    public void test_that_registered_user_can_login_using_correct_password(){
        Users register =  library.register("ikemsimple","090","yaba","id","0000");
        String userName= register.getUserName();
        String password = register.getPassword();
        String address = register.getAddress();
        String phoneNumber = register.getPhoneNumber();
        assertEquals(password, register.getPassword());
        assertEquals(address,register.getAddress());
        assertEquals(phoneNumber,register.getPhoneNumber());
        assertEquals(userName,register.getUserName());
         String actual = library.login(userName,password);
        String expected = "login Successful..";
        assertEquals(expected,actual);
    }
    @Test
    public void test_that_registered_user_cannot_login_with_incorrect_password(){
        Users register =  library.register("ikemsimple","090","yaba","id","0000");
        String userName= register.getUserName();
        String password = register.getPassword();
        String address = register.getAddress();
        String phoneNumber = register.getPhoneNumber();
        assertEquals(password, register.getPassword());
        assertEquals(address,register.getAddress());
        assertEquals(phoneNumber,register.getPhoneNumber());
        assertEquals(userName,register.getUserName());
        assertThrows(InvalidDetailsException.class,()-> library.login(userName,"password"));
    }
    @Test
    public void testThatWhenBookIsAdded_twice_BookCanBeDisplayed(){
        Book firstBook =library.addBooks("chike and The River", "Chinua Achebe","0001");
        Book secondBook = library.addBooks("chike and The River", "Chinua Achebe","0002");
        ArrayList<Book> book = new ArrayList<>();
        book.add(firstBook);
        book.add(secondBook);
        assertEquals(book,library.displayBooks());
    }




}