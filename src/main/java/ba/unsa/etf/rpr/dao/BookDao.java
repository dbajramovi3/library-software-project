package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Book;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.util.List;
/**
 * abstract method defined in BookDaoImpl
 * @author dbajramovi3
 */
public interface BookDao extends Dao<Book>{


    public List<Book> getByName(String name) throws LibraryException;



}
