package zajecia.oop.bookstore;

import java.lang.reflect.Array;

/**
 * Created by RENT on 2017-04-24.
 */
public class Book {
public String title;
    public String description;
  public  String author;
  public  String relaseDate;
  public  int size;
   public String ISBN;
    public String[] content;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", relaseDate='" + relaseDate + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }

    public Book (String title, String author, String relaseDate, String ISBN) {
        this.title = title;
        this.author = author;
        this.relaseDate = relaseDate;
        this.ISBN = ISBN;
        this.description = "Ti be update";
    }



}
