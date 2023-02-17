package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Member;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.util.List;

public interface MemberDao extends Dao<Member> {

    public List<Member> getByName(String name) throws LibraryException;
}
