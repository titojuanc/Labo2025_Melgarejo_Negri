package Vehiculos;

import Enumeraciones.Color;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private Color color;
    private int ruedas;
    private int anio_f;
    private String patente;

    public Vehiculo(String marca, String modelo, Color color, int ruedas, int anio_f, String patente){
            this.marca = marca;
            this.modelo = modelo;
            this.color = color;
            this.ruedas = ruedas;
            this.anio_f = anio_f;
            this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getAnio_f() {
        return anio_f;
    }

    public void setAnio_f(int anio_f) {
        this.anio_f = anio_f;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
