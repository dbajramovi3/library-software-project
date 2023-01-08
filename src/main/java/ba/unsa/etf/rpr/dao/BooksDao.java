package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Books;

import java.sql.SQLException;

public interface BooksDao extends Dao<Books>{
    Books get(int id) throws SQLException;
}
