package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Book;
import ba.unsa.etf.rpr.exception.LibraryException;

public interface BookDao extends Dao<Book>{
    Book get(int id) throws LibraryException;
}
