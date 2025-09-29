package LaboChef;

import ControlDeCalorías.Ingrediente;

import java.time.LocalDate;
import java.util.HashMap;

public class Intermedio extends Participante implements PlatoPrincipalInterface{
    private HashMap<Ingrediente, Integer> ingredientes;

    public Intermedio(String nombre, String apellido, LocalDate fechaNacimiento, String localidad, Equipo equipo, HashMap<Ingrediente, Integer> ingredientes) {
        super(nombre, apellido, fechaNacimiento, localidad, equipo);
        this.ingredientes = ingredientes;
    }

    public HashMap<Ingrediente, Integer> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashMap<Ingrediente, Integer> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public void prepararLugarDeTrabajo() {
        System.out.println("Mi stock a utilizar es de: ");
        for (Ingrediente i : this.ingredientes.keySet()){
            if(this.ingredientes.get(i) > 1){
                System.out.println("-" + i.getNombre());
            }
        }
    }

    @Override
    public Plato cocinarPrincipal(PlatoPrincipal pla) throws IngredientesInsuficientesException {
        for (Ingrediente i : pla.getIngredientes_necesarios().keySet()){
            if(!(this.ingredientes.containsKey(i) && this.ingredientes.get(i)>=pla.getIngredientes_necesarios().get(i))) {
                throw new IngredientesInsuficientesException("No te alcanza bestia");
            }
        }
        return servirPrincipal(pla);
    }

    @Override
    public Plato servirPrincipal(PlatoPrincipal pla) {
        return pla;
    }
}
