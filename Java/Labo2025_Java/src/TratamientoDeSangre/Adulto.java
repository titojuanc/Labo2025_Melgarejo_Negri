package TratamientoDeSangre;

import java.time.LocalDate;

public class Adulto extends Paciente{

    public Adulto(String nombre, String apellido, LocalDate fecha, Genero genero, TipoSangre tipoSangre, boolean factorRH) {
        super(nombre, apellido, fecha, genero, tipoSangre, factorRH);
    }
}
