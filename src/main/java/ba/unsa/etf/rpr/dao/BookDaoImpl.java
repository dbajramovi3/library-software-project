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

    /**
     * Constructor
     */
    private BookDaoImpl() {
        super("books");
    }

    /**
     * Returns instance, and if it does not exist then it makes it
     * @return instance
     * @author dbajramovi3
     */
    public static BookDaoImpl getInstance(){
        if(instance==null)
            instance = new BookDaoImpl();
        return instance;
    }
    /**
     * Removes instance
     */
    public static void removeInstance(){
        if(instance!=null)
            instance=null;
    }
    public BookDaoImpl(String tableName) {
        super(tableName);
    }

    /**
     * row to object method which is declared in AbstractDao
     * This is a Java method that takes a ResultSet object as input and converts
     * the data in the current row of the result set to a Book object.
     * @param rs - result set from database
     * @throws LibraryException
     */
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

    /**
     * object to row is a Java method that takes a Book object as input and converts
     * it to a Map object that represents a row of data that can be inserted into a database.
     * @param object - a bean object for specific table
     * @return
     */
    @Override
    public Map<String, Object> object2row(Book object) {
        Map<String, Object> row = new TreeMap<>();
        row.put("id", object.getId());
        row.put("title", object.getTitle());
        row.put("author", object.getAuthor());
        row.put("current_book_hold", object.getCurrent_book_hold());
        return row;
    }

    /**
     * getByName method, takes title from books table, also mentioned n BookDao interface
     * @author dbajramovi3
     * @throws LibraryException
     */
    @Override
    public List<Book> getByName(String name) throws LibraryException {
        return executeQuery("SELECT * FROM books WHERE title LIKE concat('%', ?, '%')", new Object[]{name});
    }
}
