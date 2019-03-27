import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {
    private Book books;

    @Before
    public void before() {
        books = new Book("Things Fall Apart", "Chinua Achebe", "Non Fiction");
    }

    @Test
    public void shouldHaveName() {
        assertEquals("Things Fall Apart", books.getTitle());
    }

    @Test
    public void shouldHaveAuthor() {
        assertEquals("Chinua Achebe", books.getAuthor());
    }

    @Test
    public void shouldHaveGenre() {
        assertEquals("Non Fiction", books.getGenre());
    }

}
