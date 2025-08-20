package SistemaAlarmasU7;

import Dispositivos.*;
import Sistemas.SistemaAlarmasEdificio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DetectorHumo h1 = new DetectorHumo(true, 120, 100, LocalDate.now());
        DetectorHumo h2 = new DetectorHumo(true, 20, 100, LocalDate.now());
        DetectorHumo h3 = new DetectorHumo(false, 120, 100, LocalDate.now());

        SensorTemperatura t1 = new SensorTemperatura(true, 120, 100, LocalDate.now());
        SensorTemperatura t2 = new SensorTemperatura(true, 20, 100, LocalDate.now());
        SensorTemperatura t3 = new SensorTemperatura(true, 140, 100, LocalDate.now());

        SensorPresion p1 = new SensorPresion(true, 120, 100, LocalDate.now());
        SensorPresion p2 = new SensorPresion(true, 20, 100, LocalDate.now());
        SensorPresion p3 = new SensorPresion(true, 120, 100, LocalDate.now());

        ArrayList<Sensor> sensores1 = new ArrayList<>();
        Collections.addAll(sensores1, h3,t3,p3,h2);

        SensorCompuesto c1 = new SensorCompuesto(true, 120, 100, LocalDate.now(), sensores1);

        ArrayList<Sensor> sistema_s = new ArrayList<>();
        Collections.addAll(sistema_s, h1, t1, p1, t2, p2, c1);

        SistemaAlarmasEdificio sistema1 = new SistemaAlarmasEdificio(sistema_s);
        boolean check = true;
        while(check){
            Scanner scanner=new Scanner(System.in);
            TimeUnit.MILLISECONDS.sleep(30);
            System.out.print("Ingrese Num: ");
            try{
                int elec = scanner.nextInt();
                System.out.println(sistema1.getSensores().get(elec).getFecha_adquisicion());
                System.out.println(sistema1.getSensores().get(elec).getUmbral());
                System.out.println(sistema1.getSensores().get(elec).getMedida());
                check = false;
            }
            catch (IndexOutOfBoundsException exc){
                System.err.println("No se encontró el elemento");
            }
            catch (InputMismatchException exc){
                System.err.println("Ingresar un int");
            }
        }
    }
}