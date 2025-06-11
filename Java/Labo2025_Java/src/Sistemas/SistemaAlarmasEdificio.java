package Sistemas;

import Dispositivos.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class SistemaAlarmasEdificio {
    ArrayList<Sensor> sensores;

    public SistemaAlarmasEdificio(){
        this.sensores = new ArrayList<>();
    }

    public SistemaAlarmasEdificio(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }

    public int Medir(){
        int cont=0;
        for(Sensor s : this.sensores){
            if (s.getMedida()>s.getUmbral() && s.isEstado()){
                if (s instanceof SensorCompuesto){
                    for (Sensor se : ((SensorCompuesto) s).getSensorCompuesto()){
                        if (se.getMedida()>se.getUmbral() && se.isEstado()){
                            System.out.println(se.imprimirDeteccion());
                            cont+=1;
                        }
                    }
                }
                System.out.println(s.imprimirDeteccion());
                cont+=1;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        DetectorHumo h1=new DetectorHumo(true,120,100, LocalDate.now());
        DetectorHumo h2=new DetectorHumo(true,20,100,LocalDate.now());
        DetectorHumo h3=new DetectorHumo(false,120,100,LocalDate.now());

        SensorTemperatura t1=new SensorTemperatura(true,120,100,LocalDate.now());
        SensorTemperatura t2=new SensorTemperatura(true,20,100,LocalDate.now());
        SensorTemperatura t3=new SensorTemperatura(true,140,100,LocalDate.now());

        SensorPresion p1=new SensorPresion(true,120,100,LocalDate.now());
        SensorPresion p2=new SensorPresion(true,20,100,LocalDate.now());
        SensorPresion p3=new SensorPresion(true, 120, 100, LocalDate.now());

        ArrayList<Sensor> sensores1 = new ArrayList<>();
        Collections.addAll(sensores1, h3,t3,p3,h2);

        SensorCompuesto c1=new SensorCompuesto(true,120,100,LocalDate.now(),sensores1);

        ArrayList<Sensor> sistema_s=new ArrayList<>();

        Collections.addAll(sistema_s,h1,t1,p1,t2,p2,c1);

        SistemaAlarmasEdificio sistema1=new SistemaAlarmasEdificio(sistema_s);

        sistema1.Medir();
    }
}
