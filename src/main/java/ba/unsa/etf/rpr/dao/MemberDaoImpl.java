package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Member;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * MemberDaoImpl Class which contains implements MemberDao interface meaning it also contains DAO interface
 * Also extends AbstractDao abstract class meaning it has abstract methods from it
 * We can see singleton pattern which means it has only one instance, and private constructor, and getInstance method,
 * as well as removeInstance method
 *
 * @author dbajramovi3
 */

public class MemberDaoImpl extends AbstractDao<Member> implements MemberDao {
    private static MemberDaoImpl instance = null;

    /**
     * Constructor
     */
    private MemberDaoImpl() {
        super("members");
    }
    /**
     * Returns instance, and if it does not exist then it makes it
     * @return instance
     * @author dbajramovi3
     */
    public static MemberDaoImpl getInstance(){
        if(instance==null)
            instance = new MemberDaoImpl();
        return instance;
    }
    /**
     * Removes instance
     */
    public static void removeInstance(){
        if(instance!=null)
            instance=null;
    }

    public MemberDaoImpl(String tableName) {
        super(tableName);
    }

    /**
     * row to object method which is declared in AbstractDao
     * This is a Java method that takes a ResultSet object as input and converts
     * the data in the current row of the result set to a Member object.
     * @param rs - result set from database
     */
    @Override
    public Member row2object(ResultSet rs) throws LibraryException {
        try {
            Member members = new Member();
            members.setId(rs.getInt("id"));
            members.setName(rs.getString("name"));
            members.setLast_name(rs.getString("last_name"));
            members.setEmail(rs.getString("email"));
            return members;
        } catch (SQLException e) {
            throw new LibraryException(e.getMessage(), e);
        }
    }
    /**
     * object to row is a Java method that takes a Member object as input and converts
     * it to a Map object that represents a row of data that can be inserted into a database.
     * @param object - a bean object for specific table
     */
    @Override
    public Map<String, Object> object2row(Member object) {
        Map<String, Object> row = new TreeMap<>();
        row.put("id", object.getId());
        row.put("name", object.getName());
        row.put("last_name", object.getLast_name());
        row.put("email", object.getEmail());
        return row;
    }


    /**
     * Take member name out of database impl
     * @param name
     * @return
     * @throws LibraryException
     */
    @Override
    public List<Member> getByName(String name) throws LibraryException {
        return executeQuery("SELECT * FROM members WHERE name LIKE concat('%', ?, '%')", new Object[]{name});
    }


    /**
     * Take member email out of database impl
     * @param email
     * @return
     * @throws LibraryException
     */
    @Override
    public List<Member> getByEmail(String email) throws LibraryException {
        return executeQuery("SELECT * FROM members WHERE email LIKE concat('%', ?, '%')", new Object[]{email});
    }


}
