package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Member_cards;

import java.sql.SQLException;

public interface Members_cardsDao extends Dao<Member_cards> {
    Member_cards get(int id) throws SQLException;
}
