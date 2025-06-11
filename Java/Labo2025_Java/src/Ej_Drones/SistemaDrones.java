package Ej_Drones;

import java.time.LocalDate;
import java.util.ArrayList;

public class SistemaDrones {
    private ArrayList<Dron> drones;

    public SistemaDrones(){
        this.drones=new ArrayList<>();
    }

    public void agregarDron(Dron d){
        this.drones.add(d);
        Dron.setCantidadOperativa(Dron.getCantidadOperativa()+1);
    }

    public void eliminarDron(Dron d){
        this.drones.remove(d);
        Dron.setCantidadOperativa(Dron.getCantidadOperativa()-1);
    }

    public void modificarDron(Dron d1, Dron d2){
        this.drones.set(drones.indexOf(d1), d2);
    }

    public void empezarMision(String modelo, double latitud, double longuitud){
            for (Dron d : this.drones){
                if (d.getModelo().equals(modelo)){
                    if (d.ejecutarMision(latitud, longuitud)){
                        if (d.getEstado().equals(Estado.INACTIVO)){
                            System.out.println("Mision del dron "+modelo+" iniciada correctamente.");
                            d.setEstado(Estado.EN_VUELO);
                            return;
                        }
                        else {
                            System.out.println("Error, el dron ya está en una misión o en mantenimiento.");
                            return;
                        }
                    }
                    else {
                        System.out.println("Error, el dron no puede completar la misión debido a su carga, distancia o memoria.");
                        return;
                    }
                }
            }
        System.out.println("Error, no se encontró el dron solicitado.");
    }

    public void finalizarMision(String modelo){
        for (Dron d : this.drones){
            if (d.getModelo().equals(modelo)){
                if (d.getEstado().equals(Estado.EN_VUELO)){
                    System.out.println("Misión terminada exitosamente");
                    d.setEstado(Estado.INACTIVO);
                    return;
                }
                else {
                    System.out.println("Este dron no está en una misión");
                    return;
                }
            }
        }
        System.out.println("Error, no se encontró el dron solicitado.");
    }

    public void rastrearDron(String modelo){
        for (Dron d: this.drones){
            if (d.getModelo().equals(modelo)){
                if (d.getEstado().equals(Estado.EN_VUELO)){
                    System.out.println("El dron "+modelo+" se encuentra en una misión.");
                } else {
                    System.out.println("No se puede rastrear al dron. (Inactivo o mantenimiento)");
                }
            }
        }
    }

    public void iniciarMantenimiento(String modelo){
        for (Dron d: this.drones){
            if (d.getModelo().equals(modelo)){
                if (d.getEstado().equals(Estado.INACTIVO)){
                    System.out.println("Mantenimiento de "+modelo+" iniciado.");
                    d.setEstado(Estado.MANTENIMIENTO);
                    return;
                }
                else {
                    System.out.println("Error, este dron está en una misión o ya está en mantenimiento");
                    return;
                }
            }
        }
        System.out.println("No se encontró el dron solicitado");
    }

    public void terminarMantenimiento(String modelo){
        for (Dron d: this.drones){
            if (d.getModelo().equals(modelo)){
                if (d.getEstado().equals(Estado.MANTENIMIENTO)){
                    System.out.println("Mantenimiento de "+modelo+" terminado.");
                    d.setEstado(Estado.INACTIVO);
                    return;
                }
                else {
                    System.out.println("Error, este dron está en una misión o no está en mantenimiento");
                    return;
                }
            }
        }
        System.out.println("No se encontró el dron solicitado");
    }


    public static void main(String[] args) {
        SistemaDrones sistema= new SistemaDrones();
        DronSeguridad vigilante1 = new DronSeguridad(
                "DJI-Mavic-Vigilante",
                LocalDate.of(2023, 5, 15),
                128 // GB de memoria SD
        );

        DronSeguridad vigilante2 = new DronSeguridad(
                "Autel-EVO-II-Surveillance",
                LocalDate.of(2022, 11, 30),
                256
        );

        DronSeguridad vigilante3 = new DronSeguridad(
                "Parrot-Anafi-Tactical",
                LocalDate.of(2024, 1, 10),
                64
        );

        DronCarga transportador1 = new DronCarga(
                "DJI-Matrice-600-Pro",
                LocalDate.of(2021, 8, 22),
                5 // kg de carga máxima
        );

        DronCarga transportador2 = new DronCarga(
                "Freefly-Alta-X",
                LocalDate.of(2023, 3, 5),
                15
        );

        DronCarga transportador3 = new DronCarga(
                "Volocopter-VC200",
                LocalDate.of(2022, 7, 18),
                25
        );

        DronCarga transportador4 = new DronCarga(
                "Draganflyer-X8",
                LocalDate.of(2024, 2, 14),
                8
        );

        DronSeguridad vigilante4 = new DronSeguridad(
                "Skydio-X2-Enterprise",
                LocalDate.of(2023, 9, 3),
                512
        );

        DronCarga transportador5 = new DronCarga(
                "Wingcopter-198",
                LocalDate.of(2021, 12, 9),
                12
        );

        DronSeguridad vigilante5 = new DronSeguridad(
                "Yuneec-H520-RTK",
                LocalDate.of(2022, 4, 27),
                200
        );

        sistema.agregarDron(vigilante1);
        sistema.agregarDron(vigilante2);
        sistema.agregarDron(vigilante3);
        System.out.println(Dron.getCantidadOperativa());
        sistema.agregarDron(transportador1);
        sistema.agregarDron(transportador2);
        sistema.agregarDron(transportador3);
        sistema.agregarDron(transportador4);
        sistema.agregarDron(vigilante4);
        sistema.agregarDron(transportador5);
        sistema.agregarDron(vigilante5);
        System.out.println(Dron.getCantidadOperativa());
        sistema.eliminarDron(transportador5);
        sistema.eliminarDron(vigilante5);
        System.out.println(Dron.getCantidadOperativa());

        sistema.empezarMision("DJI-Matrice-600-Pro", -34.577820256882376, -58.502860049406415);
        sistema.finalizarMision("DJI-Matrice-600-Pro");
        sistema.empezarMision("DJI-Matrice-600-Pro", -34.577820256882376, -58.502860049406415);
        sistema.finalizarMision("DJI-Matrice-600-Pro");
        sistema.empezarMision("DJI-Matrice-600-Pro", -34.577820256882376, -58.502860049406415);
        transportador1.recargarBateria();
        sistema.empezarMision("DJI-Matrice-600-Pro", -34.577820256882376, -58.502860049406415);
        sistema.finalizarMision("DJI-Matrice-600-Pro");
        sistema.iniciarMantenimiento("DJI-Matrice-600-Pro");
        sistema.terminarMantenimiento("DJI-Matrice-600-Pro");

        sistema.empezarMision("DJI-Mavic-Vigilante", -34.577820256882376, -58.502860049406415);
        sistema.rastrearDron("DJI-Mavic-Vigilante");
        sistema.finalizarMision("DJI-Mavic-Vigilante");
    }

}
