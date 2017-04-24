package zajecia.oop.bookstore;

/**
 * Created by RENT on 2017-04-24.
 */
public class Bookstore {
    public Book[] books;
    public int size;

public Bookstore() {
    this.books = new Book[100];
    this.size = 0;
}

public boolean add(Book book) {
    boolean valueToReturn = false;
    if (size < 100) {
        books[size] = book;
    size++;
    }
    return valueToReturn;
}
public void showBooks() {
    for (int i = 0; i < size; i++) {
        System.out.println(books[i].toString());


    }
}
public int getNumberOfBooks(String author) {
    for (int i = 0; i < size; i++) {
        
    }
}

public Book[] getBooks(String author) {

}


}
