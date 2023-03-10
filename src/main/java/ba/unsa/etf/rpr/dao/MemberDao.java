package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Member;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.util.List;
/**
 * 2 abstract methods defined in MemberDaoImpl
 * @author dbajramovi3
 */
public interface MemberDao extends Dao<Member> {
    /**
     * Take member name out of database
     * @param name
     * @return
     * @throws LibraryException
     */
    public List<Member> getByName(String name) throws LibraryException;

    /**
     * Take member email out of database
     * @param email
     * @return
     * @throws LibraryException
     */
    public List<Member> getByEmail(String email) throws LibraryException;
}
