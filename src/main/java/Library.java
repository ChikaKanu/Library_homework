import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> collection;

    public Library(int capacity) {
        this.capacity = capacity;
        this.collection = new ArrayList<>();
    }

    public int checkCapacity() {
        return this.capacity;
    }

    public int bookCount() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if (this.bookCount() < capacity) {
            this.collection.add(book);
        }
    }

    public Book removeBook() {
        return this.collection.remove(0);
    }




}
