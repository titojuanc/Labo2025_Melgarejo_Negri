package LaboChef;

import ControlDeCalorías.Ingrediente;

import java.time.LocalDate;
import java.util.HashSet;

public class Principiante extends Participante implements PlatoEntradaInterface {
    private HashSet<Ingrediente> ingredientes_prohibidos;

    public Principiante(String nombre, String apellido, LocalDate fechaNacimiento, String localidad, Equipo equipo, HashSet<Ingrediente> ingredientes_prohibidos) {
        super(nombre, apellido, fechaNacimiento, localidad, equipo);
        this.ingredientes_prohibidos = ingredientes_prohibidos;
    }

    @Override
    public void prepararLugarDeTrabajo() {
        System.out.println("Ya guardé todos los elementos prohibidos");
        for(Ingrediente i : this.ingredientes_prohibidos){
            System.out.println("-" + i.getNombre());
        }
    }

    @Override
    public Plato cocinarEntrada(Plato pla) throws PlatoConIngredienteProhibidoException{
        for (Ingrediente i : pla.getIngredientes_necesarios().keySet()){
            if(this.ingredientes_prohibidos.contains(i)){
                throw new PlatoConIngredienteProhibidoException("Tenés ingredientes prohibidos");
            }
        }
        return servirEntrada(pla);
    }

    @Override
    public Plato servirEntrada(Plato pla) {
        return null;
    }
}
