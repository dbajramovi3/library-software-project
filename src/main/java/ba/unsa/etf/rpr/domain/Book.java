package ba.unsa.etf.rpr.domain;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Idable, Serializable {
    private int id;
    private String title;
    private String author;
    private int current_book_hold;

    public Book(int id, String title, String author, int current_book_hold) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.current_book_hold = current_book_hold;
    }
    public Book(){ }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCurrent_book_hold() {
        return current_book_hold;
    }

    public void setCurrent_book_hold(int current_book_hold) {
        this.current_book_hold = current_book_hold;
    }

    @Override
    public String toString() {
             return "  " + id + "   "
                     + title + "   " + current_book_hold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book books = (Book) o;
        return getId() == books.getId() && getCurrent_book_hold() == books.getCurrent_book_hold() && Objects.equals(getTitle(), books.getTitle()) && Objects.equals(getAuthor(), books.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getAuthor(), getCurrent_book_hold());
    }

}
