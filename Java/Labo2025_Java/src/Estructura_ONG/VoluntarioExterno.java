package Estructura_ONG;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;

public class VoluntarioExterno extends Integrante{
    private static HashSet<Barrio> barrios= definirBarrios();
    private Institucion institucion;

    public VoluntarioExterno(String nombre, String apellido, LocalDate f_nac, String direccion, int codigoPostal, boolean aporteMensualidad, Institucion institucion) {
        super(nombre, apellido, f_nac, direccion, codigoPostal, aporteMensualidad);
        this.institucion=institucion;
    }

    public static HashSet<Barrio> definirBarrios(){
        HashSet<Barrio> h = new HashSet<>();
        Collections.addAll(h, Barrio.COGHLAN, Barrio.PALERMO, Barrio.BARRACAS, Barrio.PARQUE_PATRICIOS, Barrio.RETIRO, Barrio.SAAVEDRA);
        return h;
    }
}
