package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Member;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.util.List;

public interface MemberDao extends Dao<Member> {
    /**
     * 2 abstract methods defined in MemberDaoImpl
     * @author dbajramovi3
     * @param name
     * @return
     * @throws LibraryException
     */
    public List<Member> getByName(String name) throws LibraryException;

    public List<Member> getByEmail(String email) throws LibraryException;
}
