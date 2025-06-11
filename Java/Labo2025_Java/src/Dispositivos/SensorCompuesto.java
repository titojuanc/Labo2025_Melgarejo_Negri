package Dispositivos;

import java.time.LocalDate;
import java.util.ArrayList;

public class SensorCompuesto extends Sensor{
    ArrayList<Sensor> sensorCompuesto;

    public SensorCompuesto(ArrayList<Sensor> sensorCompuesto) {
        super();
        this.sensorCompuesto = sensorCompuesto;
    }

    public SensorCompuesto(boolean estado, double medida, double umbral, LocalDate fecha_adquisicion, ArrayList<Sensor> sensorCompuesto) {
        super(estado, medida, umbral, fecha_adquisicion);
        this.sensorCompuesto = sensorCompuesto;
    }

    public ArrayList<Sensor> getSensorCompuesto() {
        return sensorCompuesto;
    }

    public void setSensorCompuesto(ArrayList<Sensor> sensorCompuesto) {
        this.sensorCompuesto = sensorCompuesto;
    }

    public void dispararAlarma(){
        boolean sensor_humo=true;
        boolean sensor_temperatura=true;
        boolean sensor_presion=true;
        double suma=0;
        for (Sensor se : sensorCompuesto){
            suma = se.getMedida();
        }
        suma=suma/3;
        if (suma > this.getUmbral()){
            for (Sensor s : sensorCompuesto){
                if (s instanceof DetectorHumo && sensor_humo){
                    s.imprimirDeteccion();
                    sensor_humo=false;
                } else if (s instanceof SensorTemperatura && sensor_temperatura) {
                    s.imprimirDeteccion();
                    sensor_temperatura=false;
                } else if (s instanceof SensorPresion && sensor_presion) {
                    s.imprimirDeteccion();
                    sensor_presion=false;
                }
            }
        }
    }
}
