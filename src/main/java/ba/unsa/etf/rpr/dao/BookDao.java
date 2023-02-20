package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Book;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.util.List;

public interface BookDao extends Dao<Book>{

    /**
     * abstract method defined in BookDaoImpl
     * @author dbajramovi3
     * @param name
     * @return
     * @throws LibraryException
     */
    public List<Book> getByName(String name) throws LibraryException;



}
