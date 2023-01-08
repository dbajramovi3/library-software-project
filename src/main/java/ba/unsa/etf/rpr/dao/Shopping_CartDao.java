package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Shopping_cart;

import java.sql.SQLException;

public interface Shopping_CartDao extends Dao<Shopping_cart> {
    Shopping_cart get(int id) throws SQLException;
}
