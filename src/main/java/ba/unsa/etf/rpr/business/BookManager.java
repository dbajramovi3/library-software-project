package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.domain.Book;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.util.List;

public class BookManager {
    public Book add(Book book) throws LibraryException {
        if (book.getId() != 0){
            throw new LibraryException("Can't add book with ID. ID is autogenerated");
        }
        try{
            return DaoFactory.booksDao().add(book);
        }catch (LibraryException e){
            throw e;
        }
    }

    public List<Book> getAll() throws LibraryException{
        return DaoFactory.booksDao().getAll();
    }

    public List<Book> getByName(String name) throws LibraryException {
        return DaoFactory.booksDao().getByName(name);
    }
}
