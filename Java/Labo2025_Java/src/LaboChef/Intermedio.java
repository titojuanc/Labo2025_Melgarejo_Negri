package LaboChef;

import ControlDeCalorías.Ingrediente;

import java.time.LocalDate;
import java.util.HashMap;

public class Intermedio extends Participante{
    private HashMap<Ingrediente, Integer> ingredientes;

    public Intermedio(String nombre, String apellido, LocalDate fechaNacimiento, String localidad, Equipo equipo, HashMap<Ingrediente, Integer> ingredientes) {
        super(nombre, apellido, fechaNacimiento, localidad, equipo);
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


}
