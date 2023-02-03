package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Shopping_cart;
import ba.unsa.etf.rpr.exception.LibraryException;

public interface Shopping_CartDao extends Dao<Shopping_cart> {
    Shopping_cart get(int id) throws LibraryException;
}
