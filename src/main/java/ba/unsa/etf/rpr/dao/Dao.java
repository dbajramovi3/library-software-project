package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Books;
import java.util.List;
import java.sql.SQLException;

public interface Dao<B> {
    Books get(int id) throws SQLException;

    List<Books> getall() throws SQLException;

    int save(Books t) throws SQLException;

    int insert(Books t) throws SQLException;

    int update(Books t) throws SQLException;

    int delete(Books t);
}
