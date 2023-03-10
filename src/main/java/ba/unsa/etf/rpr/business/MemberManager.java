package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.dao.BookDao;
import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.dao.MemberDao;
import ba.unsa.etf.rpr.domain.Book;
import ba.unsa.etf.rpr.domain.Member;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.util.List;

/**
 * MemberManager with add, getAll, getByName, getByEmail, update and delete methods
 * @author dbajramovi3
 */
public class MemberManager {
    /**
     * add method
     * @throws LibraryException izuzetak
     * @author dbajramovi3
     */
    public Member add(Member member) throws LibraryException {
        if (member.getId() != 0){
            throw new LibraryException("Can't add member with ID. ID is autogenerated");
        }
        try{
            return DaoFactory.membersDao().add(member);
        }catch (LibraryException e){
            throw e;
        }
    }
    /**
     * get all method
     * @throws LibraryException izuzetak
     * @author dbajramovi3
     */
    public List<Member> getAll() throws LibraryException{
        return DaoFactory.membersDao().getAll();
    }

    /**
     * get by name method
     * @throws LibraryException izuzetak
     * @author dbajramovi3
     */
    public List<Member> getByName(String name) throws LibraryException {
        return DaoFactory.membersDao().getByName(name);
    }

    /**
     * get by email method
     * @throws LibraryException izuzetak
     * @author dbajramovi3
     */
    public List<Member> getByEmail(String email) throws LibraryException {
        return DaoFactory.membersDao().getByEmail(email);
    }

    /**
     * update method
     * @throws LibraryException
     * @author dbajramovi3
     */
    public Member update(Member member) throws LibraryException {
        try {
            return DaoFactory.membersDao().update(member);
        } catch (LibraryException e) {
            throw e;
        }
    }
    /**
     * delete method
     * @throws LibraryException izuzetak
     * @author dbajramovi3
     */
    public void delete(int member) throws LibraryException {
        try {
            DaoFactory.membersDao().delete(member);
        } catch (LibraryException e) {
            throw e;
        }
    }


}
