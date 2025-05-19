package Entidades;

import Utilidad.Fecha;

public class Jugador extends Persona{
    private Fecha fechaNacimiento;
    private int numeroCamiseta;
    private boolean capitan;

    public Jugador() {
        super();
        this.fechaNacimiento= new Fecha();
        this.numeroCamiseta=0;
        this.capitan=false;
    }

    public Jugador(String nombre, String apellido, int edad, Fecha fechaNacimiento, int numeroCamiseta, boolean capitan) {
        super(nombre, apellido, edad);
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCamiseta = numeroCamiseta;
        this.capitan = capitan;
    }

    public Jugador(String nombre, String apellido, Fecha fechaNacimiento ,int numeroCamiseta, boolean capitan) {
        super(nombre, apellido);
        this.fechaNacimiento=fechaNacimiento;
        this.numeroCamiseta = numeroCamiseta;
        this.capitan=capitan;
    }



    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
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
