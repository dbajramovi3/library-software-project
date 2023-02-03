package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Member_cards;
import ba.unsa.etf.rpr.domain.Shopping_cart;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Shopping_CartDaoImpl extends AbstractDao<Shopping_cart> implements Shopping_CartDao{
    private static  Shopping_CartDaoImpl instance = null;
    private Shopping_CartDaoImpl() {
        super("categories");
    }

    public static Shopping_CartDaoImpl getInstance(){
        if(instance==null)
            instance = new Shopping_CartDaoImpl();
        return instance;
    }

    public static void removeInstance(){
        if(instance!=null)
            instance=null;
    }

    public Shopping_CartDaoImpl(String tableName) {
        super(tableName);
    }

    @Override
    public Shopping_cart get(int id) throws LibraryException {
        return null;
    }

    @Override
    public List<Shopping_cart> getAll() throws LibraryException {
        return null;
    }

    @Override
    public Shopping_cart row2object(ResultSet rs) throws LibraryException {
        try {
            Shopping_cart shopping_cart = new Shopping_cart();
            shopping_cart.setId(rs.getInt("id"));
            shopping_cart.setMember_card_id(rs.getString("member_card_id"));
            shopping_cart.setBook_id(rs.getString("book_id"));
            shopping_cart.setBuy_date(rs.getDate("buy_date"));
            return shopping_cart;
        } catch (SQLException e) {
            throw new LibraryException(e.getMessage(), e);
        }
    }

    @Override
    public Map<String, Object> object2row(Shopping_cart object) {
        Map<String, Object> row = new TreeMap<>();
        row.put("id", object.getId());
        row.put("member_card_id", object.getMember_card_id());
        row.put("book_id", object.getBook_id());
        row.put("buy_date", object.getBuy_date());
        return row;
    }



/*
    @Override
    public Shopping_cart getById(int id) throws LibraryException {
        return null;
    }


    @Override
    public Shopping_cart add(Shopping_cart shopping_cart) throws LibraryException {
        return null;
    }

    @Override
    public Shopping_cart update(Shopping_cart shopping_cart) throws LibraryException {
        return null;
    }

    @Override
    public void delete(int id) {
    }
    */
}
