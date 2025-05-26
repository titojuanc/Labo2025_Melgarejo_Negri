package Sistemas;

import Objetos.Bicicleta;
import Objetos.Camioneta;
import Objetos.Coche;
import Objetos.Vehiculo;

import java.util.ArrayList;
import  java.util.Collections;


public class FlotaSistema {
    private ArrayList<Vehiculo> vehiculos;

    public FlotaSistema(){
        this.vehiculos = new ArrayList<>();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public String vehiculoMasPresente() {
        int cantCoches = 0;
        int cantCamionetas = 0;
        int cantBicicletas = 0;
        for (Vehiculo vehiculo : this.vehiculos) {
            if (vehiculo instanceof Coche) {
                cantCoches++;
            } else if (vehiculo instanceof Camioneta) {
                cantCamionetas++;
            } else if (vehiculo instanceof Bicicleta) {
                cantBicicletas++;
            }
        }
        if (cantCamionetas > cantCoches && cantCamionetas > cantBicicletas) {
            return "Hay más camionetas. " + cantCamionetas;
        } else if (cantCoches > cantCamionetas && cantCoches > cantBicicletas) {
            return "Hay más coches. " + cantCoches;
        } else if (cantBicicletas > cantCamionetas && cantBicicletas > cantCoches) {
            return "Hay más bicicletas. " + cantBicicletas;
        } else if (cantBicicletas == cantCamionetas && cantBicicletas != cantCoches) {
            return "Hay igual cantidad de bicis que de camionetas";
        } else if (cantBicicletas == cantCoches && cantBicicletas != cantCamionetas) {
            return "Hay igual cantidad de bicis que de coches";
        } else if (cantCoches == cantCamionetas && cantBicicletas != cantCamionetas) {
            return "Hay igual cantidad de camionetas que de coches";
        } else {
            return "Hay igual cantidad de los tres vehículos";
        }
    }


    public double PorcentajeDescapotables(){
        double cantDescapotables=0;
        double cantCoches=0;
        for (Vehiculo vehiculo : this.vehiculos){
            if (vehiculo instanceof Coche){
                cantCoches++;
                if (((Coche) vehiculo).isDescapotable()){
                    cantDescapotables++;
                }
            }
        }
        return ((cantDescapotables/cantCoches)*100);
    }

    public static void main(String[] args) {
        FlotaSistema flota = new FlotaSistema();
        Coche c1 = new Coche("Volkswagen", "Virtus", "Gris", 4, 2007, "AD 054 PB", false);
        Coche c2 = new Coche("Toyota", "Corolla", "Blanco", 4, 2020, "XY 123 AB", false);
        Coche c3 = new Coche("Ford", "Mustang", "Rojo", 4, 2015, "MT 789 CD", true);  // Descapotable
        Coche c4 = new Coche("Tesla", "Model 3", "Negro", 4, 2023, "EL 456 TF", false);
        Coche c5 = new Coche("Fiat", "500", "Amarillo", 4, 2018, "FI 500 FI", true);  // Descapotable
        Coche c6 = new Coche("BMW", "Serie 5", "Azul", 4, 2019, "BM 007 WX", false);

        Camioneta cam1 = new Camioneta("Toyota", "Hilux", "Blanco", 4, 2022, "TR 202 HK", 1000);  // Carga máxima: 1000 kg
        Camioneta cam2 = new Camioneta("Ford", "Ranger", "Azul", 4, 2020, "FR 456 LD", 1200);
        Camioneta cam3 = new Camioneta("Chevrolet", "S10", "Negro", 4, 2021, "CS 789 SX", 950);
        Camioneta cam4 = new Camioneta("Nissan", "Frontier", "Gris", 4, 2019, "NF 321 PT", 1100);
        Camioneta cam5 = new Camioneta("Volkswagen", "Amarok", "Rojo", 4, 2023, "VA 555 RT", 1300);
        Camioneta cam6 = new Camioneta("Mitsubishi", "L200", "Verde", 4, 2018, "ML 200 ST", 800);

        Collections.addAll(flota.getVehiculos(), c1, c2, c3, c4, c5, c6, cam1, cam2, cam3, cam4, cam5, cam6);

        System.out.println(flota.vehiculoMasPresente());
        cam1.anadirCarga(500);
        System.out.println(cam1.getCarga());
        cam1.anadirCarga(9999);
        System.out.println(flota.PorcentajeDescapotables());

    }
}

