package ba.unsa.etf.rpr.domain.dao;

import ba.unsa.etf.rpr.domain.Books;
import ba.unsa.etf.rpr.exception.LibraryException;

public interface BooksDao extends Dao<Books>{
    Books get(int id) throws LibraryException;
}
