package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.ShoppingCart;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingCartDaoImpl extends AbstractDao<ShoppingCart> implements ShoppingCartDao {
    private static ShoppingCartDaoImpl instance = null;
    private ShoppingCartDaoImpl() {
        super("shopping_cart");
    }

    public static ShoppingCartDaoImpl getInstance(){
        if(instance==null)
            instance = new ShoppingCartDaoImpl();
        return instance;
    }

    public static void removeInstance(){
        if(instance!=null)
            instance=null;
    }

    public ShoppingCartDaoImpl(String tableName) {
        super(tableName);
    }


    @Override
    public ShoppingCart row2object(ResultSet rs) throws LibraryException {
        try {
            ShoppingCart shopping_cart = new ShoppingCart();
            shopping_cart.setId(rs.getInt("id"));
            shopping_cart.setMember_card_id(rs.getInt("member_card_id"));
            shopping_cart.setBook_id(rs.getInt("book_id"));
            shopping_cart.setBuy_date(rs.getDate("buy_date").toLocalDate());
            return shopping_cart;
        } catch (SQLException e) {
            throw new LibraryException(e.getMessage(), e);
        }
    }

    @Override
    public Map<String, Object> object2row(ShoppingCart object) {
        Map<String, Object> row = new TreeMap<>();
        row.put("id", object.getId());
        row.put("member_card_id", object.getMember_card_id());
        row.put("book_id", object.getBook_id());
        row.put("buy_date", object.getBuy_date());
        return row;
    }


}
