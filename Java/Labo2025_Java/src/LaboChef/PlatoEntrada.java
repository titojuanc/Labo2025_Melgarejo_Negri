package LaboChef;

import ControlDeCalorías.Ingrediente;

import java.util.HashMap;

public class PlatoEntrada extends Plato{
    public PlatoEntrada(String nombre, HashMap<Ingrediente, Integer> ingredientes_necesarios, int tiempo_preparacion) {
        super(nombre, ingredientes_necesarios, tiempo_preparacion);
    }
}
