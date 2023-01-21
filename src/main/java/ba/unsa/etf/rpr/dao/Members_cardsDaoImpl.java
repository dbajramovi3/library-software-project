package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Member_cards;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Members_cardsDaoImpl extends AbstractDao<Member_cards> implements Members_cardsDao{
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
    public Member_cards getById(int id) throws LibraryException {
        return null;
    }

    @Override
    public List<Member_cards> getall() throws LibraryException {
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
}
