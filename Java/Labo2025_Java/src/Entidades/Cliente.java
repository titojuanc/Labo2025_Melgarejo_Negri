package Entidades;

import Enumeraciones.MetodosDePago;

public class Cliente extends Persona {
    private int celular;
    private MetodosDePago metodo;

    public Cliente(String nombre, String apellido, int edad, MetodosDePago metodo, int celular) {
        super(nombre, apellido, edad);
        this.metodo = metodo;
        this.celular = celular;
    }

    public Cliente() {
        super("Carlos", "Jonte", 45);
        this.metodo = MetodosDePago.TARJETA;
        this.celular = 23548754;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public MetodosDePago getMetodo() {
        return metodo;
    }

    public void setMetodo(MetodosDePago metodo) {
        this.metodo = metodo;
    }
}

