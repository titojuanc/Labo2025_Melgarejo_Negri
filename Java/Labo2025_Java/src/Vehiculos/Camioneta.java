package Vehiculos;

import Enumeraciones.Color;

public class Camioneta extends Vehiculo{
    private int cargaMax;
    private int carga;

    public Camioneta(String marca, String modelo, Color color, int ruedas, int anio_f, String patente, int cargaMax){
        super(marca, modelo, color, ruedas, anio_f, patente);
        this.cargaMax = cargaMax;
        this.carga =0;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int carga) {
        this.cargaMax = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void anadirCarga(int carga){
        if (this.cargaMax<this.carga+carga){
            System.out.println("Error, supera la carga máxima");
        }
        else{
            this.carga = this.carga+carga;
        }

    }
}
