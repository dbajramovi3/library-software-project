package ba.unsa.etf.rpr.dao;
import ba.unsa.etf.rpr.domain.Book;
import ba.unsa.etf.rpr.exception.LibraryException;
import java.util.List;


public interface Dao<T> {

    /**
     * add one entity from database base on id
     * @return Entity from database
     */
    T getById(int id) throws LibraryException;

    /**
     * Lists all entities from database
     * @return List of entities from database
     */
    List<T> getAll() throws LibraryException;

    /**
     * Saves entity into database
     * @return saved item with id field populated
     */
    T add(T item) throws LibraryException;

    /**
     * Fully updates entity in database based on id (primary) match.
     * @return updated version of bean
     */
    T update(T item) throws LibraryException;

    /**
     * Delete of item from database with given id
     */
    void delete(int id) throws LibraryException;
}

