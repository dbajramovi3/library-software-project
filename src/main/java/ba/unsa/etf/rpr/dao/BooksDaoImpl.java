package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Books;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.awt.print.Book;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class BooksDaoImpl extends AbstractDao<Books> implements BooksDao {
    public BooksDaoImpl(String tableName) {
        super(tableName);
    }

    @Override
    public Books get(int id) throws LibraryException {
        return null;
    }

    @Override
    public Books row2object(ResultSet rs) throws LibraryException {
        return null;
    }

    @Override
    public Map<String, Object> object2row(Books object) {
        return null;
    }

    @Override
    public Books getById(int id) throws LibraryException {
        return null;
    }

    @Override
    public List<Books> getall() throws LibraryException {
       return null;
    }

    @Override
    public Books add(Books book) throws LibraryException {
        return null;
    }

    @Override
    public Books update(Books book) throws LibraryException {
        return null;
    }

    @Override
    public void delete(int id) {

    }
    
}
