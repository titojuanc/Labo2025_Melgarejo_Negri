package Entidades;

import Utilidad.Fecha;

public class Jugador {
    private String nombre;
    private Fecha fechaNacimiento;
    private int numeroCamiseta;
    private boolean capitan;

    public Jugador() {
        this.nombre="";
        this.fechaNacimiento= new Fecha();
        this.numeroCamiseta=0;
        this.capitan=false;
    }

    public Jugador(String nombre, Fecha fechaNacimiento, int numeroCamiseta, boolean capitan) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCamiseta = numeroCamiseta;
        this.capitan = capitan;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isCapitan() {
        return capitan;
    }

    public void setCapitan(boolean capitan) {
        this.capitan = capitan;
    }
}
