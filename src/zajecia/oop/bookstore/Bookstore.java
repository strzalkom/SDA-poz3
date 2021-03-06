package zajecia.oop.bookstore;

/**
 * Created by RENT on 2017-04-24.
 */
public class Bookstore {
    private Book[] books;
    private int numberOfBooks;

    public Bookstore() {
        this.books = new Book[100];
        this.numberOfBooks = 0;
    }

    public boolean add(Book book) {
        boolean valueToReturn = false;
        if (numberOfBooks < 100) {
            books[numberOfBooks] = book;
            numberOfBooks++;
            valueToReturn = true;
        }
        return valueToReturn;
    }

    public void showBooks() {
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(books[i]);
        }
    }

    public int getNumberOfBooks(String author) {
        int counter = 0;
        for (int i = 0; i < this.numberOfBooks; i++) {
            if (books[i].author.equals(author)) {
                counter++;
            }
        }
        return counter;
    }

    public Book[] getBooks(String author) {
        Book[] booksToReturn = new Book[getNumberOfBooks(author)];
        int index = 0;
        for (int i = 0; i < this.numberOfBooks; i++) {
            if (books[i].author.equals(author)) {
                booksToReturn[index] = books[i];
                index++;
            }
        }
        return booksToReturn;
    }

    public Book getBook(String ISBN) {
        Book book = null;
        int i = 0;
        while (i < this.numberOfBooks && book == null) {
            if (books[i].ISBN.equals(ISBN)) {
                book = books[i];
            }
//            book = books[i].ISBN.equals(ISBN) ? books[i] : null;
            i++;
        }
        return book;
    }
}