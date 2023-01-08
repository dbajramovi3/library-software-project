package ba.unsa.etf.rpr.dao;
import java.util.List;
import java.sql.SQLException;

public interface Dao<T> {

    /**
     * get one entity from database base on id
     * @return Entity from database
     */
    T getById(int id) throws SQLException;

    List<T> getall() throws SQLException;

    int get(T t) throws SQLException;

    int update(T t) throws SQLException;

    int delete(T t);
}

