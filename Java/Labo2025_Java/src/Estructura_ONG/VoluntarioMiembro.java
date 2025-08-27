package Estructura_ONG;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;

public class VoluntarioMiembro extends Integrante{
    private int puntaje;
    private static HashSet<Barrio> barrios = definirBarrios();

    public VoluntarioMiembro(String nombre, String apellido, LocalDate f_nac, String direccion, int codigoPostal, boolean aporteMensualidad) {
        super(nombre, apellido, f_nac, direccion, codigoPostal, aporteMensualidad);
        this.puntaje=0;
    }

    public static HashSet<Barrio> definirBarrios(){
        HashSet<Barrio> h = new HashSet<>();
        Collections.addAll(h, Barrio.MONTSERRAT, Barrio.NUEVA_POMPEYA, Barrio.NUÑEZ, Barrio.BELGRANO, Barrio.CONSTITUCION);
        return h;
    }
}
