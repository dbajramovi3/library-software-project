package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.MemberCard;
import ba.unsa.etf.rpr.exception.LibraryException;

public interface MemberCardDao extends Dao<MemberCard> {
    MemberCard get(int id) throws LibraryException;
}
