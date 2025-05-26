package Objetos;

import java.time.LocalDate;

public class SensorTemperatura extends  Sensor{
    public SensorTemperatura() {
    super();
    }

    public SensorTemperatura(boolean estado, double medida, double umbral, LocalDate fecha_adquisicion) {
        super(estado, medida, umbral, fecha_adquisicion);
    }

    public String imprimirDeteccion(){
        if(isEstado()){
            return "¡Cuidado! La temperatura sube";
        }
        return "Sensor Apagado";
    }
}
