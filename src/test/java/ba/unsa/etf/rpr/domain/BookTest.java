package ba.unsa.etf.rpr.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
Book book = new Book(1, "Harry Potter", "JK Rowling", 10);

    /**
     * getTitleTest
     * @author dbajramovi3
     */
    @Test
    void getTitle() {
        assertEquals("Harry Potter", book.getTitle());
    }

    @Test
    void getId() {
        assertEquals(1, book.getId());
    }

    @Test
    void setId() {
        Book book = new Book();
        book.setId(123);
        assertEquals(123, book.getId());
        book.setId(456);
        assertEquals(456, book.getId());
    }

    @Test
    void testGetTitle() {
    }

    @Test
    void setTitle() {
    }

    @Test
    void getAuthor() {
    }

    @Test
    void setAuthor() {
    }

    @Test
    void getCurrent_book_hold() {
    }

    @Test
    void setCurrent_book_hold() {
    }

    @Test
    void testToString() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }
}