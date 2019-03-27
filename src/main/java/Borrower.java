import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int bookCount() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        this.collection.add(book);
    }

    public void removeBook(Book book) {
        this.collection.remove(book);
    }

    public void borrowBook(Library collection) {
        Book book = collection.removeBook();
        addBook(book);
    }

//    public void returnBook(Library collection) {
//        collection.addBook();
//        removeBook(book);
//    }

}
