package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.MemberCard;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MemberCardDaoImpl extends AbstractDao<MemberCard> implements MemberCardDao {
    private static MemberCardDaoImpl instance = null;
    private MemberCardDaoImpl() {super("categories");
    }

    public static MemberCardDaoImpl getInstance(){
        if(instance==null)
            instance = new MemberCardDaoImpl();
        return instance;
    }

    public static void removeInstance(){
        if(instance!=null)
            instance=null;
    }

    public MemberCardDaoImpl(String tableName) {
        super(tableName);
    }

    @Override
    public List<MemberCard> getAll() throws LibraryException {
        return null;
    }

    @Override
    public MemberCard row2object(ResultSet rs) throws LibraryException {
        try {
            MemberCard member_cards = new MemberCard();
            member_cards.setId(rs.getInt("id"));
            member_cards.setMember_id(rs.getInt("member_id"));
            member_cards.setActivation_date(rs.getDate("activation_date"));
            member_cards.setExpiration_date(rs.getDate("expiration_date"));
            return member_cards;
        } catch (SQLException e) {
            throw new LibraryException(e.getMessage(), e);
        }
    }

    @Override
    public Map<String, Object> object2row(MemberCard object) {
        Map<String, Object> row = new TreeMap<>();
        row.put("id", object.getId());
        row.put("member_id", object.getMember_id());
        row.put("activation_date", object.getActivation_date());
        row.put("expiration_date", object.getExpiration_date());
        return row;
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
