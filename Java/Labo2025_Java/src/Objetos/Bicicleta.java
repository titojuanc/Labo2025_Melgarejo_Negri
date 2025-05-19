package Objetos;

public class Bicicleta extends Vehiculo{
    public Bicicleta(String marca, String modelo, String color, int ruedas, int anio_f, String patente) {
        super(marca, modelo, color, ruedas, anio_f, patente);
    }

    public Bicicleta() {
        super("MW", "BMX-01", "Rojo", 2, 2000, "GLG 654");
    }


}
