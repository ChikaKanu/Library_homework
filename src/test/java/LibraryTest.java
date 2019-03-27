import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(500);
        book = new Book("Things Fall Apart", "Chinua Achebe", "Non Fiction");
    }

    @Test
    public void cancheckCapacity() {
        assertEquals(500, library.checkCapacity());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.bookCount());

    }

    @Test
    public void shouldCountBook() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }



}
