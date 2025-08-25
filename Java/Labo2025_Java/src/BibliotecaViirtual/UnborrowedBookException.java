package BibliotecaViirtual;

public class UnborrowedBookException extends RuntimeException {
    public UnborrowedBookException() {
        super("Error: ese libro no está prestado a este usuario");
    }
}
