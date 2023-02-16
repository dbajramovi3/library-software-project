package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.ShoppingCart;
import ba.unsa.etf.rpr.exception.LibraryException;

public interface ShoppingCartDao extends Dao<ShoppingCart> {
    ShoppingCart get(int id) throws LibraryException;
}
