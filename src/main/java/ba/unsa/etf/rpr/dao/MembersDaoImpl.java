package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Members;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

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
    public Members row2object(ResultSet rs) throws LibraryException {
        return null;
    }

    @Override
    public Map<String, Object> object2row(Members object) {
        return null;
    }

    @Override
    public List<Members> getAll() throws LibraryException {
        return null;
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
