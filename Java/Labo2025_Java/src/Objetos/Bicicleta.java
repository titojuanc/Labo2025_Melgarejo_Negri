package Objetos;

import Enumeraciones.Color;

public class Bicicleta extends Vehiculo{
    public Bicicleta(String marca, String modelo, Color color, int ruedas, int anio_f, String patente) {
        super(marca, modelo, color, ruedas, anio_f, patente);
    }

    public Bicicleta() {
        super("MW", "BMX-01", Color.ROJO, 2, 2000, "GLG 654");
    }


}
