package Objetos;

import Enumeraciones.Colores;

public class Bicicleta extends Vehiculo{
    public Bicicleta(String marca, String modelo, Colores color, int ruedas, int anio_f, String patente) {
        super(marca, modelo, color, ruedas, anio_f, patente);
    }

    public Bicicleta() {
        super("MW", "BMX-01", Colores.ROJO, 2, 2000, "GLG 654");
    }


}
