package LibrarayManagementApplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library library = new Library();
    Book book = new Book("0001","chike and The River", "Chinua Achebe");

    @Test
    public void testThatwhenBookisAddedTotalNumberOfBooksIncreadByOne(){
        library.addBooks("chike and The River", "Chinua Achebe","0001");
        assertEquals(1,library.getTotalNumberOfAvailableBooks());
    }
    @Test
    public void testThatwhenBookisAdded_twice_TotalNumberOfBooksIsTwo(){
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




}