package Entidades;

import Enumeraciones.MetodoDePago;

public class Cliente extends Persona {
    private int celular;
    private MetodoDePago metodo;

    public Cliente(String nombre, String apellido, int edad, MetodoDePago metodo, int celular) {
        super(nombre, apellido, edad);
        this.metodo = metodo;
        this.celular = celular;
    }

    public Cliente() {
        super("Carlos", "Jonte", 45);
        this.metodo = MetodoDePago.TARJETA;
        this.celular = 23548754;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public MetodoDePago getMetodo() {
        return metodo;
    }

    public void setMetodo(MetodoDePago metodo) {
        this.metodo = metodo;
    }
}

