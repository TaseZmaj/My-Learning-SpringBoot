package mk.ukim.finki.wp.lab3.model.exceptions;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(long id) {
        super("Book with id " + id + " does not exist.");
    }
}
