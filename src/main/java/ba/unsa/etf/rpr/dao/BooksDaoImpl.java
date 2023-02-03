package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Books;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BooksDaoImpl extends AbstractDao<Books> implements BooksDao {
    private static  BooksDaoImpl instance = null;
    private BooksDaoImpl() {
        super("books");
    }
    public static BooksDaoImpl getInstance(){
        if(instance==null)
            instance = new BooksDaoImpl();
        return instance;
    }

    public static void removeInstance(){
        if(instance!=null)
            instance=null;
    }
    public BooksDaoImpl(String tableName) {
        super(tableName);
    }

    @Override
    public Books get(int id) throws LibraryException {
        return null;
    }
    @Override
    public List<Books> getAll() throws LibraryException {
        return null;
    }

    @Override
    public Books row2object(ResultSet rs) throws LibraryException {
        try {
            Books book = new Books();
            book.setId(rs.getInt("id"));
            book.setTitle(rs.getString("title"));
            book.setAuthor(rs.getString("author"));
            book.setCurrent_book_hold(rs.getInt("current_book_hold"));
            return book;
        } catch (SQLException e) {
            throw new LibraryException(e.getMessage(), e);
        }
    }

    @Override
    public Map<String, Object> object2row(Books object) {
        Map<String, Object> row = new TreeMap<>();
        row.put("id", object.getId());
        row.put("title", object.getTitle());
        row.put("author", object.getAuthor());
        row.put("current_book_hold", object.getCurrent_book_hold());
        return row;
    }









/*
    @Override
    public Books getById(int id) throws LibraryException {
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
    */
}
