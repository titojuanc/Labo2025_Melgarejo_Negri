package Objetos;

import java.net.ServerSocket;
import java.time.LocalDate;

public class DetectorHumo extends Sensor {
    public DetectorHumo(){
        super();
    }

    public DetectorHumo(boolean estado, double medida, double umbral, LocalDate fecha_adquisicion) {
        super(estado, medida, umbral, fecha_adquisicion);
    }

    public String imprimirDeteccion(){
        return "Llamando a los Bomberos";
    }
}
