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

    /**
     * getIdTest
     * @author dbajramovi3
     */
    @Test
    void getId() {
        assertEquals(1, book.getId());
    }
    /**
     * setIdTest
     * @author dbajramovi3
     */
    @Test
    void setId() {
        Book book = new Book();
        book.setId(123);
        assertEquals(123, book.getId());
        book.setId(456);
        assertEquals(456, book.getId());
    }
    /**
     * getTitleTest
     * @author dbajramovi3
     */
    @Test
    void testGetTitle() {
        Book knjiga = new Book(1,"Hobbit", "amar", 12);
        assertEquals("Hobbit", knjiga.getTitle());

    }
    /**
     * setTitletest
     * @author dbajramovi3
     */
    @Test
    void setTitle() {
        Book book = new Book();
        book.setTitle("Avatar");
        assertEquals("Avatar", book.getTitle());
    }
    /**
     * getAuthorTest
     * @author dbajramovi3
     */
    @Test
    void getAuthor() {
        Book knjiga = new Book(1,"Hobbit", "amar", 12);
        assertEquals("amar", knjiga.getAuthor());
    }
    /**
     * setAuthorTest
     * @author dbajramovi3
     */
    @Test
    void setAuthor() {
        Book book = new Book();
        book.setAuthor("JK Rowling");
        assertEquals("JK Rowling", book.getAuthor());
    }
    /**
     * getCurrentBookHoldTest
     * @author dbajramovi3
     */
    @Test
    void getCurrent_book_hold() {
        Book book = new Book();
        book.setCurrent_book_hold(12);
        assertEquals(12,book.getCurrent_book_hold());
    }
    /**
     * setCurrentBookHoldTest
     * @author dbajramovi3
     */
    @Test
    void setCurrent_book_hold() {
        Book book = new Book(1,"adad","adad", 13);
        assertEquals(13, book.getCurrent_book_hold());
    }
    /**
     * toStringTest
     * @author dbajramovi3
     */
    @Test
    void testToString() {
        Book book = new Book(1, "Hobbit", "Dinotelo", 0);
        String result = book.toString();
        assertEquals("  1   Hobbit   0", result);
    }
    /**
     * EqualsTest
     * @author dbajramovi3
     */
    @Test
    void testEquals() {
        Book book1 = new Book(1, "Hobbit", "Dinotelo", 0);
        Book book2 = new Book(1, "Hobbit", "Dinotelo", 0);
        Book book3 = new Book(2, "To Kill a Mockingbird", "Harper Lee", 0);

        assertTrue(book1.equals(book2));
        assertTrue(book2.equals(book1));
        assertFalse(book1.equals(book3));
        assertFalse(book3.equals(book1));
        assertFalse(book2.equals(null));
        assertFalse(book2.equals("not a book"));
    }
    /**
     * hashCodeTest
     * @author dbajramovi3
     */
    @Test
    void testHashCode() {
        Book book1 = new Book(1, "Title 1", "Author 1", 0);
        Book book2 = new Book(1, "Title 1", "Author 1", 0);
        Book book3 = new Book(2, "Title 2", "Author 2", 1);
        assertEquals(book1.hashCode(), book2.hashCode());
        assertNotEquals(book1.hashCode(), book3.hashCode());
    }
}