package ba.unsa.etf.rpr.dao;


 // Factory method for singleton implementation of DAOs

/**
 * Is used so we don't have to make instances of BookDaoImpl or MemberDaoImpl..
 * We can just call DaoFactory
 */
public class DaoFactory {

    private static final BookDao booksDao = BookDaoImpl.getInstance();

    private static final MemberDao membersDao = MemberDaoImpl.getInstance();

    private static final MemberCardDao members_cardsDao = MemberCardDaoImpl.getInstance();

    private static final ShoppingCartDao shopping_cartDao = ShoppingCartDaoImpl.getInstance();

    private DaoFactory(){
    }

    public static BookDao booksDao(){
        return booksDao;
    }

    public static MemberDao membersDao(){
        return membersDao;
    }

    public static MemberCardDao members_cardsDao(){
        return members_cardsDao;
    }

    public static ShoppingCartDao shopping_cartDao(){
        return shopping_cartDao;
    }

}


