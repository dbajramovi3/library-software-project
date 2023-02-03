package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Members;
import ba.unsa.etf.rpr.exception.LibraryException;

public interface MembersDao extends Dao<Members> {
    Members get(int id) throws LibraryException;
}
