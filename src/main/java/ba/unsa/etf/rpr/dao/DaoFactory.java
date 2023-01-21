package ba.unsa.etf.rpr.dao;


 // Factory method for singleton implementation of DAOs

import ba.unsa.etf.rpr.domain.Members;
import ba.unsa.etf.rpr.domain.Shopping_cart;

public class DaoFactory {

    private static final BooksDao booksDao = BooksDao.getInstance();

    private static final MembersDao membersDao = MembersDao.getInstance();

    private static final Members_cardsDao members_cardsDao = Members_cardsDao.getInstance();

    private static final Shopping_CartDao shopping_cartDao = Shopping_CartDao.getInstance();

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


