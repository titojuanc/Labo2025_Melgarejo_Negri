package Estructura_ONG;

import Entidades.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public abstract class Integrante extends Persona {
    private int codigoPostal;
    private boolean aporteMensualidad;

    public Integrante(String nombre, String apellido, LocalDate f_nac, String direccion, int codigoPostal, boolean aporteMensualidad){
        super(nombre, apellido, f_nac, direccion);
        this.codigoPostal=codigoPostal;
        this.aporteMensualidad=aporteMensualidad;
    }

}
