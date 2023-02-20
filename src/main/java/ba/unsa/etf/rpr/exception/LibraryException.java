package ba.unsa.etf.rpr.exception;

public class LibraryException extends Exception{
    /**
     * LibraryException constructor
     * @param message
     */
    public LibraryException(String message) {
        super(message);
    }

    /**
     * LibraryException constructor
     * @param message
     * @param cause
     */
    public LibraryException(String message, Exception cause) {
        super(message, cause);
    }
}
