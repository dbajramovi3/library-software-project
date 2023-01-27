package ba.unsa.etf.rpr.domain;

import java.util.Objects;

public class Books implements Idable {
    private int id;
    private String title;
    private String author;
    private int total_book_count;
    private int current_book_hold;

    public Books(int id, String title, String author, int total_book_count, int current_book_hold) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.total_book_count = total_book_count;
        this.current_book_hold = current_book_hold;
    }
    public Books(){ }

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

    public int getTotal_book_count() {
        return total_book_count;
    }

    public void setTotal_book_count(int total_book_count) {
        this.total_book_count = total_book_count;
    }

    public int getCurrent_book_hold() {
        return current_book_hold;
    }

    public void setCurrent_book_hold(int current_book_hold) {
        this.current_book_hold = current_book_hold;
    }

    @Override
    public String toString() {
        return "books{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", total_book_count=" + total_book_count +
                ", current_book_hold=" + current_book_hold +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Books)) return false;
        Books books = (Books) o;
        return getId() == books.getId() && getTotal_book_count() == books.getTotal_book_count() && getCurrent_book_hold() == books.getCurrent_book_hold() && Objects.equals(getTitle(), books.getTitle()) && Objects.equals(getAuthor(), books.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getAuthor(), getTotal_book_count(), getCurrent_book_hold());
    }
}
