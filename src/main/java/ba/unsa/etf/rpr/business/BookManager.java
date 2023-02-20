package ba.unsa.etf.rpr.business;


import ba.unsa.etf.rpr.dao.BookDao;
import ba.unsa.etf.rpr.dao.DaoFactory;
import ba.unsa.etf.rpr.domain.Book;
import ba.unsa.etf.rpr.exception.LibraryException;

import java.util.List;

/**
 * BookManager with add, getAll, getByName, update, delete and other 2 methods explained
 * @author dbajramovi3
 */
public class BookManager {
    public Book add(Book book) throws LibraryException {
        if (book.getId() != 0){
            throw new LibraryException("Can't add book with ID. ID is autogenerated");
        }
        try{
            return DaoFactory.booksDao().add(book);
        }catch (LibraryException e){
            throw e;
        }
    }

    public List<Book> getAll() throws LibraryException{
        return DaoFactory.booksDao().getAll();
    }

    public List<Book> getByName(String name) throws LibraryException {
        return DaoFactory.booksDao().getByName(name);
    }

    public Book update(Book book) throws LibraryException {
        try {
            return DaoFactory.booksDao().update(book);
        } catch (LibraryException e) {
            throw e;
        }
    }

    /**
     * delete method
     * @param book
     * @throws LibraryException
     * @auth
     */
    public void delete(int book) throws LibraryException {
        try {
            DaoFactory.booksDao().delete(book);
        } catch (LibraryException e) {
            throw e;
        }
    }

    /**
     * Method used to decrese book count by 1, is used in SampleController in registerAction
     * @author dbajramovi3
     * @param book
     * @throws LibraryException
     */
    public void decreaseBookCount(Book book) throws LibraryException {
        System.out.println("KNJIGA: " + book);
        int bookCount = book.getCurrent_book_hold();
        System.out.println("book count: " + bookCount);
            book.setCurrent_book_hold(bookCount - 1);
            DaoFactory.booksDao().update(book);
        if (book.getCurrent_book_hold() <= 0) {
            System.out.println("izbrisi knjigu ");
            delete(book.getId());
    }
    }
    /**
     * method used in addBookController used to chek if the book already exists so it can throw alert if it does
     * @author dbajramovi3
     * @param title
     * @return
     * @throws LibraryException
     */
    public Book getBookByTitle(String title) throws LibraryException {
        try {
            BookDao bookDao = DaoFactory.booksDao();
            List<Book> books = bookDao.getAll();
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    return book;
                }
            }
            return null;
        } catch (LibraryException e) {
            throw e;
        }
    }


}
