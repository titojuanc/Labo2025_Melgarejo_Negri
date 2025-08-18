package Sistema_de_bebidas;

public class NoHayStockException extends RuntimeException {
    public NoHayStockException(String message) {
        super(message);
    }
}
