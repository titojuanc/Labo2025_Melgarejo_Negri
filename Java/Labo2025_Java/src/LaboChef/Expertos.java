package LaboChef;

import java.time.LocalDate;

public class Expertos extends Participante{
    private static int limite_tiempo=80;
    private int tiempo_restante;

    public Expertos(String nombre, String apellido, LocalDate fechaNacimiento, String localidad, Equipo equipo) {
        super(nombre, apellido, fechaNacimiento, localidad, equipo);
        this.tiempo_restante=limite_tiempo;
    }

    @Override
    public void prepararLugarDeTrabajo(){
        System.out.println("Perdi 5 minutos preparando la mesa por lo que mi tiempo restante es: " + (this.tiempo_restante-5));
    }
}
