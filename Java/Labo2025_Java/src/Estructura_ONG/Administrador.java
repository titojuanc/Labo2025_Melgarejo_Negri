package Estructura_ONG;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;

public class Administrador extends IntegranteConSueldo{
    private static HashSet<Barrio> barrios = definirBarrios();
    public Administrador(String nombre, String apellido, LocalDate f_nac, String direccion, int codigoPostal, boolean aporteMensualidad, int sueldo, Banco banco, int diaDePago, LocalDate altaEnEmpresa) {
        super(nombre, apellido, f_nac, direccion, codigoPostal, aporteMensualidad, sueldo, banco, diaDePago, altaEnEmpresa);
    }

    public static HashSet<Barrio> definirBarrios(){
        HashSet<Barrio> h = new HashSet<>();
        Collections.addAll(h, Barrio.FLORES, Barrio.FLORESTA, Barrio.AGRONOMIA, Barrio.PARQUE_CHAS);
        return h;
    }
}
