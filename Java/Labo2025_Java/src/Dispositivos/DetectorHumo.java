package Dispositivos;

import java.time.LocalDate;

public class DetectorHumo extends Sensor {
    public DetectorHumo(){
        super();
    }

    public DetectorHumo(boolean estado, double medida, double umbral, LocalDate fecha_adquisicion) {
        super(estado, medida, umbral, fecha_adquisicion);
    }

    public String imprimirDeteccion(){
        if (isEstado()){
            return "Llamando a los Bomberos";
        }
        return "Sensor Apagado";
    }
}
