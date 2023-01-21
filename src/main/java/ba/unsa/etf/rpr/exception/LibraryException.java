package ba.unsa.etf.rpr.exception;


public class LibraryException extends Exception{


    public LibraryException(String message) {
        super(message);
    }

    public LibraryException(String message, Exception cause) {
        super(message, cause);
    }
}
