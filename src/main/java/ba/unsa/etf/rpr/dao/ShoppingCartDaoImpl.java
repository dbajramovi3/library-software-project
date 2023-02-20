package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.ShoppingCart;
import ba.unsa.etf.rpr.exception.LibraryException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.TreeMap;

/**
 * ShoppingCartDaoImpl Class which contains implements ShoppingCartDao interface meaning it also contains DAO interface
 * Also extends AbstractDao abstract class meaning it has abstract methods from it.
 * We can see singleton pattern which means it has only one instance, and private constructor, and getInstance method,
 * as well as removeInstance method
 *
 * @author dbajramovi3
 */
public class ShoppingCartDaoImpl extends AbstractDao<ShoppingCart> implements ShoppingCartDao {
    private static ShoppingCartDaoImpl instance = null;

    /**
     * Constructor
     */
    private ShoppingCartDaoImpl() {
        super("shopping_cart");
    }
    /**
     * Returns instance, and if it does not exist then it makes it
     * @return instance
     * @author dbajramovi3
     */
    public static ShoppingCartDaoImpl getInstance(){
        if(instance==null)
            instance = new ShoppingCartDaoImpl();
        return instance;
    }

    /**
     * Removes instance
     */
    public static void removeInstance(){
        if(instance!=null)
            instance=null;
    }

    /**
     * shoppingCartDaoImpl constructor
     * @param tableName
     * @author dbajramovi3
     */
    public ShoppingCartDaoImpl(String tableName) {
        super(tableName);
    }

    /**
     * row to object method which is declared in AbstractDao
     * This is a Java method that takes a ResultSet object as input and converts
     * the data in the current row of the result set to a ShoppingCart object.
     * @param rs - result set from database
     */
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

    /**
     * object to row is a Java method that takes a ShoppingCart object as input and converts
     * it to a Map object that represents a row of data that can be inserted into a database.
     * @param object - a bean object for specific table
     */
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
