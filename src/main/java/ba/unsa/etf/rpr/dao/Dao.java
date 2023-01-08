package ba.unsa.etf.rpr.dao;
import java.util.List;
import java.sql.SQLException;

public interface Dao<T> {

    /**
     * add one entity from database base on id
     * @return Entity from database
     */
    T getById(int id) throws SQLException;

    /**
     * Lists all entities from database
     * @return List of entities from database
     */
    List<T> getall() throws SQLException;

    /**
     * Saves entity into database
     * @return saved item with id field populated
     */
    int add(T item) throws SQLException;

    /**
     * Fully updates entity in database based on id (primary) match.
     * @return updated version of bean
     */
    int update(T item) throws SQLException;

    /**
     * Delete of item from database with given id
     */
    void delete(T t) throws SQLException;
}

