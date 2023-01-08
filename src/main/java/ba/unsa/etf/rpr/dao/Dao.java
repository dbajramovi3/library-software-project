package ba.unsa.etf.rpr.dao;
import java.util.List;
import java.sql.SQLException;

public interface Dao<T> {

    /**
     * get one entity from database base on id
     * @return Entity from database
     */
    T getById(int id) throws SQLException;

    /**
     * Lists all entities from database
     * @return List of entities from database
     */
    List<T> getall() throws SQLException;

    int get(T t) throws SQLException;

    int update(T t) throws SQLException;

    /**
     * Delete of item from database with given id
     */
    int delete(T t) throws SQLException;
}

