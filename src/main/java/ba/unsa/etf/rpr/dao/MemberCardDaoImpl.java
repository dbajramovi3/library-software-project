package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.MemberCard;
import ba.unsa.etf.rpr.exception.LibraryException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.TreeMap;

public class MemberCardDaoImpl extends AbstractDao<MemberCard> implements MemberCardDao {
    private static MemberCardDaoImpl instance = null;

    /**
     * Constructor
     */
    private MemberCardDaoImpl() {super("member_cards");
    }
    /**
     * Returns instance, and if it does not exist then it makes it
     * @return instance
     * @author dbajramovi3
     */
    public static MemberCardDaoImpl getInstance(){
        if(instance==null)
            instance = new MemberCardDaoImpl();
        return instance;
    }
    /**
     * Removes instance
     */
    public static void removeInstance(){
        if(instance!=null)
            instance=null;
    }

    public MemberCardDaoImpl(String tableName) {
        super(tableName);
    }

    /**
     * row to object method which is declared in AbstractDao
     * This is a Java method that takes a ResultSet object as input and converts
     * the data in the current row of the result set to a MemberCard object.
     * @param rs - result set from database
     *
     * @throws LibraryException
     */
    @Override
    public MemberCard row2object(ResultSet rs) throws LibraryException {
        try {
            MemberCard member_cards = new MemberCard();
            member_cards.setId(rs.getInt("id"));
            member_cards.setMember_id(rs.getInt("member_id"));
            member_cards.setActivation_date(rs.getDate("activation_date").toLocalDate());
            return member_cards;
        } catch (SQLException e) {
            throw new LibraryException(e.getMessage(), e);
        }
    }
    /**
     * object to row is a Java method that takes a MemberCard object as input and converts
     * it to a Map object that represents a row of data that can be inserted into a database.
     * @param object - a bean object for specific table
     *
     */
    @Override
    public Map<String, Object> object2row(MemberCard object) {
        Map<String, Object> row = new TreeMap<>();
        row.put("id", object.getId());
        row.put("member_id", object.getMember_id());
        row.put("activation_date", object.getActivation_date());
        return row;
    }


}
