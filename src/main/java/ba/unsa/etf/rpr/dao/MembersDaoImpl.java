package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Member_cards;
import ba.unsa.etf.rpr.domain.Members;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MembersDaoImpl extends AbstractDao<Members> implements MembersDao{
    private static  MembersDaoImpl instance = null;
    private MembersDaoImpl() {
        super("categories");
    }

    public static MembersDaoImpl getInstance(){
        if(instance==null)
            instance = new MembersDaoImpl();
        return instance;
    }

    public static void removeInstance(){
        if(instance!=null)
            instance=null;
    }

    public MembersDaoImpl(String tableName) {
        super(tableName);
    }

    @Override
    public Members get(int id) throws LibraryException {
        return null;
    }

    @Override
    public List<Members> getAll() throws LibraryException {
        return null;
    }

    @Override
    public Members row2object(ResultSet rs) throws LibraryException {
        try {
            Members members = new Members();
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
    public Map<String, Object> object2row(Members object) {
        Map<String, Object> row = new TreeMap<>();
        row.put("id", object.getId());
        row.put("name", object.getName());
        row.put("last_name", object.getLast_name());
        row.put("email", object.getEmail());
        return row;
    }



    /*
    @Override
    public Members getById(int id) throws LibraryException {
        return null;
    }


    @Override
    public Members add(Members members) throws LibraryException {
        return null;
    }

    @Override
    public Members update(Members members) throws LibraryException {
        return null;
    }

    @Override
    public void delete(int id) {

    }

     */
}
