package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.dao.BookDao;
import ba.unsa.etf.rpr.dao.BookDaoImpl;
import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.domain.Book;
import ba.unsa.etf.rpr.exception.LibraryException;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class BookManagerTest {

    BookDao bookDao;

    private BookDaoImpl bookDaoImplMock = Mockito.mock(BookDaoImpl.class);


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


    }
