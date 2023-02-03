package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Member_cards;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public class Members_cardsDaoImpl extends AbstractDao<Member_cards> implements Members_cardsDao{
    private static  Members_cardsDaoImpl instance = null;
    private Members_cardsDaoImpl() {super("categories");
    }

    public static Members_cardsDaoImpl getInstance(){
        if(instance==null)
            instance = new Members_cardsDaoImpl();
        return instance;
    }

    public static void removeInstance(){
        if(instance!=null)
            instance=null;
    }

    public Members_cardsDaoImpl(String tableName) {
        super(tableName);
    }

    @Override
    public Member_cards get(int id) throws LibraryException {
        return null;
    }

    @Override
    public Member_cards row2object(ResultSet rs) throws LibraryException {
        return null;
    }

    @Override
    public Map<String, Object> object2row(Member_cards object) {
        return null;
    }

    @Override
    public List<Member_cards> getAll() throws LibraryException {
        return null;
    }

    /*

    @Override
    public Member_cards getById(int id) throws LibraryException {
        return null;
    }

    @Override
    public Member_cards add(Member_cards member_cards) throws LibraryException {
        return null;
    }

    @Override
    public Member_cards update(Member_cards member_cards) throws LibraryException {
        return null;
    }

    @Override
    public void delete(int id) {

    }
    */
}
