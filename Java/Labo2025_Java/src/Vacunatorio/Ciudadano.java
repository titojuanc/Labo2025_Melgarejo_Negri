package Vacunatorio;

import Entidades.Persona;

public class Ciudadano extends Persona {
    private String dni;
    private String mail;
    private Provincia provincia;
    public Ciudadano(String nombre, String apellido, String direccion, String dni, String mail, Provincia provincia) {
        super(nombre, apellido, direccion);
        this.dni = dni;
        this.mail = mail;
        this.provincia = provincia;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public String getDni() {
        return dni;
    }
}
