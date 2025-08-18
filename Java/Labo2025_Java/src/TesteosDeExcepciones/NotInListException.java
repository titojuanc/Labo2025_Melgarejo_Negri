package TesteosDeExcepciones;

public class NotInListException extends RuntimeException {
    public NotInListException() {
        super("Ese componente no está en la lista");
    }
}
