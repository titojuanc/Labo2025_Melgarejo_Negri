package TesteosDeExcepciones;

public class OutOfStockException extends Exception{
    public OutOfStockException(){
        super("No hay stock disponible para ese producto.");
    }
}
