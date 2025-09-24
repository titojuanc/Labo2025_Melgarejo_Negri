package LaboChef;

import java.sql.SQLOutput;

public class PlatoConIngredienteProhibidoException extends Exception {
    public PlatoConIngredienteProhibidoException(String message) {
        System.out.println(message);
    }
}
