import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book books;

    @Before
    public void before() {
        library = new Library(500);
        books = new Book("Things Fall Apart", "Chinua Achebe", "Non Fiction");
    }

    @Test
    public void cancheckCapacity() {
        assertEquals(500, library.checkCapacity());
    }



}
