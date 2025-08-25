package BibliotecaViirtual;

public class BookAlreadyBorrowedException extends RuntimeException {
    public BookAlreadyBorrowedException() {
        super("Error: este libro ya fue prestado a este usuario.");
    }
}
