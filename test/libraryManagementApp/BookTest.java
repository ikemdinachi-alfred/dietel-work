package libraryManagementApp;

import LibrarayManagementApplication.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    Book book;
    @BeforeEach
    public void testThisFirst(){
        book = new Book("0001","title","author");
    }
    @Test
    public void testThatIdIsValid(){
        String id = "0001";
        book = new Book(id,"title","author");
        assertEquals("0001",book.getId());
    }
    @Test
    public void testForTitle(){
        String title = "title";
        book = new Book("0001","title",title);
        assertEquals(title,book.getTitle());
    }
    @Test
    public void testForAuthor(){
        String author = "author";
        book = new Book("0001","title",author);
        assertEquals(author,book.getAuthor());
    }
    @Test
    public void testThatBookIsAvailable(){
       book.setIsAvailable(true);
       assertTrue(book.isAvalaible());
    }
    @Test
    public void testThatBookNotAvailable(){
        book.setIsAvailable(false);
        assertFalse(book.isAvalaible());
    }



}