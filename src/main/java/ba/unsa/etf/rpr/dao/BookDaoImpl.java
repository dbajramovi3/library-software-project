package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Book;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BookDaoImpl extends AbstractDao<Book> implements BookDao {
    private static BookDaoImpl instance = null;
    private BookDaoImpl() {
        super("books");
    }
    public static BookDaoImpl getInstance(){
        if(instance==null)
            instance = new BookDaoImpl();
        return instance;
    }

    public static void removeInstance(){
        if(instance!=null)
            instance=null;
    }
    public BookDaoImpl(String tableName) {
        super(tableName);
    }

    @Override
    public Book row2object(ResultSet rs) throws LibraryException {
        try {
            Book book = new Book();
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
    public Map<String, Object> object2row(Book object) {
        Map<String, Object> row = new TreeMap<>();
        row.put("id", object.getId());
        row.put("title", object.getTitle());
        row.put("author", object.getAuthor());
        row.put("current_book_hold", object.getCurrent_book_hold());
        return row;
    }

    @Override
    public List<Book> getByName(String name) throws LibraryException {
        return executeQuery("SELECT * FROM books WHERE title LIKE concat('%', ?, '%')", new Object[]{name});
    }
}
