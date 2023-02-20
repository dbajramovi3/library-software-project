package ba.unsa.etf.rpr.domain;

import ba.unsa.etf.rpr.exception.LibraryException;

/**
 * Interface that forces all POJO beans to have ID field. Name is stupid but per standard
 * Every class form domain has an atribute named id, insted of BookId, MemberId...
 */
public interface Idable{

    void setId(int id) throws LibraryException;

    int getId() throws LibraryException;
}
