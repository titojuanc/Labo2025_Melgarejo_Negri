package LaboChef;

import Entidades.Persona;

import java.time.LocalDate;

public abstract class Participante extends Persona {
    private String localidad;
    private Equipo equipo;

    public Participante(String nombre, String apellido, LocalDate fechaNacimiento, String localidad, Equipo equipo) {
        super(nombre, apellido, fechaNacimiento);
        this.localidad = localidad;
        this.equipo = equipo;
    }

    public abstract void prepararLugarDeTrabajo();
}
