package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Shopping_cart;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

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
    public Shopping_cart row2object(ResultSet rs) throws LibraryException {
        return null;
    }

    @Override
    public Map<String, Object> object2row(Shopping_cart object) {
        return null;
    }

    @Override
    public List<Shopping_cart> getall() throws LibraryException {
        return null;
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
