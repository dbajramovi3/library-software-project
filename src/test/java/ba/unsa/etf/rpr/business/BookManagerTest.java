package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.dao.BookDao;
import ba.unsa.etf.rpr.dao.BookDaoImpl;
import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.domain.Book;
import ba.unsa.etf.rpr.exception.LibraryException;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookManagerTest {

    BookDao bookDao;

    private BookDaoImpl bookDaoImplMock = mock(BookDaoImpl.class);


    /**
     * Mocking test for add method
     * @throws LibraryException
     * @author dbajramovi3
     */
        @Test
        void add() throws LibraryException{
            Book book = new Book();
            book.setId(1);
            book.setTitle("Harry Potter");
            book.setAuthor("JK Rowling");
            book.setCurrent_book_hold(10);

            MockedStatic<DaoFactory> mockedFactory = Mockito.mockStatic(DaoFactory.class);
            mockedFactory.when(DaoFactory::booksDao).thenReturn(bookDaoImplMock);
            Book expected = new Book();
            when(bookDaoImplMock.add(Mockito.any(Book.class))).thenReturn(expected);
            Book actual = bookDaoImplMock.add(new Book());
            assertEquals(expected, actual);
            mockedFactory.close();
        }

    @Test
    void update() throws LibraryException {
        Book book = new Book();
        book.setId(1);
        book.setTitle("Harry Potter");
        book.setAuthor("JK Rowling");
        book.setCurrent_book_hold(10);

        Book expected = new Book();
        expected.setId(1);
        expected.setTitle("Harry Potter 2");
        expected.setAuthor("JK Rowling");
        expected.setCurrent_book_hold(5);

        // Create mock objects
        BookDao bookDaoMock = Mockito.mock(BookDao.class);
        DaoFactory daoFactoryMock = Mockito.mock(DaoFactory.class);

        // Set up the mock objects
        Mockito.when(daoFactoryMock.booksDao()).thenReturn(bookDaoMock);
        Mockito.when(bookDaoMock.update(book)).thenReturn(expected);

        // Call the method being tested
        BookDao bookDao = daoFactoryMock.booksDao();
        Book actual = bookDao.update(book);

        // Assert the result
        assertEquals(expected, actual);
    }


    }
