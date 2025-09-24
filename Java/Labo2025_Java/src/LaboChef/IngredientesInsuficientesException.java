package LaboChef;

public class IngredientesInsuficientesException extends RuntimeException {
    public IngredientesInsuficientesException(String message) {
        System.out.println(message);
    }
}
