package ba.unsa.etf.rpr.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 * Book class which implements Serializable interface, empty constructor, getters and setters
 * Meaning it follows javabeans specification
 * Book class also contains a constuctor with 4 atributes, toString, equals and hashcode method
 * @author dbajramovi3
 */
public class Book implements Idable, Serializable {

    private int id;
    private String title;
    private String author;
    private int current_book_hold;

    /**
     * Book constructor
     * @param id id
     * @param title title
     * @param author author
     * @param current_book_hold cbc
     */
    public Book(int id, String title, String author, int current_book_hold) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.current_book_hold = current_book_hold;
    }

    /**
     * Empty Book constructor
     * @author dbajramovi3
     */
    public Book(){ }

    /**
     * getId method
     * @return id
     * @author dbajramovi3
     */
    public int getId() {
        return id;
    }

    /**
     * setId method
     * @param id id
     * @author dbajramovi3
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getTitle method
     * @return title
     * @author dbajramovi3
     */
    public String getTitle() {
        return title;
    }

    /**
     * setTitle method
     * @param title title
     * @author dbajramovi3
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * getAuthor method
     * @return author
     * @author dbajramovi3
     */
    public String getAuthor() {
        return author;
    }

    /**
     * setAuthor method
     * @param author author
     * @author dbajramovi3
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * getCurrent_book_hold method
     * @return current book hold
     * @author dbajramovi3
     */
    public int getCurrent_book_hold() {
        return current_book_hold;
    }

    /**
     * setCurrent_book_hold
     * @param current_book_hold cbh
     * @author dbajramovi3
     */
    public void setCurrent_book_hold(int current_book_hold) {
        this.current_book_hold = current_book_hold;
    }

    /**
     * toString method
     * @return ispis
     * @author dbajramovi3
     */
    @Override
    public String toString() {
             return "  " + id + "   "
                     + title + "   " + current_book_hold;
    }

    /**
     * equals method
     * @param o o
     * @return comparison
     * @author dbajramovi3
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book books = (Book) o;
        return getId() == books.getId() && getCurrent_book_hold() == books.getCurrent_book_hold() && Objects.equals(getTitle(), books.getTitle()) && Objects.equals(getAuthor(), books.getAuthor());
    }

    /**
     * hashCode method
     * @return int
     * @author dbajramovi3
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getAuthor(), getCurrent_book_hold());
    }

}
