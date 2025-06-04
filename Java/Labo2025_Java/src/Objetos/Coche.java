package Objetos;

import Enumeraciones.Colores;

public class Coche extends Vehiculo{
    private boolean descapotable;

    public Coche(String marca, String modelo, Colores color, int ruedas, int anio_f, String patente, boolean descapotable){
        super(marca, modelo, color, ruedas, anio_f, patente);
        this.descapotable = descapotable;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

}