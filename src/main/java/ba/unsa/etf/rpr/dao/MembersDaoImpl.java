package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Members;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class MembersDaoImpl extends AbstractDao<Members> implements MembersDao{
    public MembersDaoImpl(String tableName) {
        super(tableName);
    }

    @Override
    public Members get(int id) throws LibraryException {
        return null;
    }

    @Override
    public Members row2object(ResultSet rs) throws LibraryException {
        return null;
    }

    @Override
    public Map<String, Object> object2row(Members object) {
        return null;
    }

    @Override
    public Members getById(int id) throws LibraryException {
        return null;
    }

    @Override
    public List<Members> getall() throws LibraryException {
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
}
