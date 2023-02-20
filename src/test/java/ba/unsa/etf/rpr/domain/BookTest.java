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
}