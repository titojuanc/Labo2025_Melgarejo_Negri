package Objetos;

import java.time.LocalDate;

public class SensorPresion extends Sensor{
    public SensorPresion() {
        super();
    }

    public SensorPresion(boolean estado, double medida, double umbral, LocalDate fecha_adquisicion) {
        super(estado, medida, umbral, fecha_adquisicion);
    }

    public String imprimirDeteccion(){
        return "Sensor de presión activado";
    }
}
