package BibliotecaViirtual;

public class BookLoanLimitException extends RuntimeException {
    public BookLoanLimitException() {
        super("Se alcanzó el límite de préstamos para este libro.");
    }
}
