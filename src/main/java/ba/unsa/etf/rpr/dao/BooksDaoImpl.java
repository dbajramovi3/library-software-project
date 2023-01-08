package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Books;

import java.sql.SQLException;
import java.util.List;

public class BooksDaoImpl implements BooksDao {
    @Override
    public Books get(int id) throws SQLException {
        return null;
    }

    @Override
    public Books getById(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Books> getall() throws SQLException {
        return null;
    }

    @Override
    public int get(Books book) throws SQLException {
        return 0;
    }

    @Override
    public int update(Books book) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Books book) {
        return 0;
    }
}
