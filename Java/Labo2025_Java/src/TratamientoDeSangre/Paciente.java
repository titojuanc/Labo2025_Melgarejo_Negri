package TratamientoDeSangre;

import Entidades.Persona;
import GestionDeSueldos.Tipo;

import java.time.LocalDate;
import java.time.Period;

public abstract class Paciente extends Persona {
    private Genero genero;
    private TipoSangre tipoSangre;
    private boolean factorRH;

    public Paciente(String nombre, String apellido, LocalDate fecha, Genero genero, TipoSangre tipoSangre, boolean factorRH) {
        super(nombre, apellido, fecha);
        this.genero = genero;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }

    public int calcularEdad(){
        Period edad = Period.between(LocalDate.now(), this.getFecha_nacimiento());
        return edad.getYears();
    }
}

