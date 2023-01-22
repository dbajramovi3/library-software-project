package ba.unsa.etf.rpr.dao;


 // Factory method for singleton implementation of DAOs

import ba.unsa.etf.rpr.domain.Members;
import ba.unsa.etf.rpr.domain.Shopping_cart;

public class DaoFactory {

    private static final BooksDao booksDao = BooksDaoImpl.getInstance();

    private static final MembersDao membersDao = MembersDaoImpl.getInstance();

    private static final Members_cardsDao members_cardsDao = Members_cardsDaoImpl.getInstance();

    private static final Shopping_CartDao shopping_cartDao = Shopping_CartDaoImpl.getInstance();

    private DaoFactory(){
    }

    public static BooksDao booksDao(){
        return booksDao;
    }

    public static MembersDao membersDao(){
        return membersDao;
    }

    public static Members_cardsDao members_cardsDao(){
        return members_cardsDao;
    }

    public static Shopping_CartDao shopping_cartDao(){
        return shopping_cartDao;
    }

}


