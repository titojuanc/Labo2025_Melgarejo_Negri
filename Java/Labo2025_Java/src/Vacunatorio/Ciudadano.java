package Vacunatorio;

import Entidades.Persona;

public class Ciudadano extends Persona {
    private String mail;
    private Provincia provincia;
    public Ciudadano(String nombre, String apellido, String direccion, int dni, String mail, Provincia provincia) {
        super(nombre, apellido, direccion, dni);
        this.mail = mail;
        this.provincia = provincia;
    }

    public Provincia getProvincia() {
        return provincia;
    }
}
