import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Library collection;
    private Book book;

    @Before
    public void before() {
        borrower = new Borrower("John");
        collection = new Library(20);
        book = new Book("Things Fall Apart", "Chinua Achebe", "Non Fiction");
    }

    @Test
    public void canGetName() {
        assertEquals("John", borrower.getName());
    }

    @Test
    public void canCountBook() {
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canAddBook() {
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }
//
//    @Test
//    public void canBorrowBookFromLibrary() {
//        borrower.borrowBook(book);
//        collection.removeBook();
//        assertEquals(1, borrower.bookCount());
//        assertEquals(19, collection.bookCount());
//    }


}
