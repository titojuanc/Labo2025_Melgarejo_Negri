package Estructura_ONG_Negri;

import java.time.LocalDate;
import java.util.HashSet;

public abstract class Participante {
    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;
    private String direccion;
    private int codigo_postal;
    private boolean contribucion;
    private Barrio barrio;
}
