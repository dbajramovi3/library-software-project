package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Member;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MemberDaoImpl extends AbstractDao<Member> implements MemberDao {
    private static MemberDaoImpl instance = null;
    private MemberDaoImpl() {
        super("categories");
    }

    public static MemberDaoImpl getInstance(){
        if(instance==null)
            instance = new MemberDaoImpl();
        return instance;
    }

    public static void removeInstance(){
        if(instance!=null)
            instance=null;
    }

    public MemberDaoImpl(String tableName) {
        super(tableName);
    }


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

    @Override
    public Map<String, Object> object2row(Member object) {
        Map<String, Object> row = new TreeMap<>();
        row.put("id", object.getId());
        row.put("name", object.getName());
        row.put("last_name", object.getLast_name());
        row.put("email", object.getEmail());
        return row;
    }

    @Override
    public List<Member> getByName(String name) throws LibraryException {
        return executeQuery("SELECT * FROM books WHERE title LIKE concat('%', ?, '%')", new Object[]{name});
    }
}
