package LaboChef;

import ControlDeCalorías.Ingrediente;

import java.util.HashMap;

public class PlatoPrincipal extends Plato{
    public PlatoPrincipal(String nombre, HashMap<Ingrediente, Integer> ingredientes_necesarios, int tiempo_preparacion) {
        super(nombre, ingredientes_necesarios, tiempo_preparacion);
    }
}
