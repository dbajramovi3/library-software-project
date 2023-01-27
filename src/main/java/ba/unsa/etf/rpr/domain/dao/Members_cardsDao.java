package ba.unsa.etf.rpr.domain.dao;

import ba.unsa.etf.rpr.domain.Member_cards;
import ba.unsa.etf.rpr.exception.LibraryException;

public interface Members_cardsDao extends Dao<Member_cards> {
    Member_cards get(int id) throws LibraryException;
}
