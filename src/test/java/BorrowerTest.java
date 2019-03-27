import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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

    @Test
    public void canRemoveBook() {
        borrower.addBook(book);
        borrower.addBook(book);
        borrower.removeBook(book);
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void canBorrowBookFromLibrary() {
        collection.addBook(book);
        borrower.borrowBook(collection);
        assertEquals(1, borrower.bookCount());
        assertEquals(0, collection.bookCount());
    }

//    @Test
//    public void canReturnBookToLibrary() {
//        collection.addBook(book);
//        collection.addBook(book);
//        borrower.borrowBook(collection);
//        assertEquals(1, collection.bookCount());
//        assertEquals(1, borrower.bookCount());
//        borrower.returnBook(collection);
//        assertEquals(2, collection.bookCount());
//        assertEquals(0, borrower.bookCount());
//    }


}
