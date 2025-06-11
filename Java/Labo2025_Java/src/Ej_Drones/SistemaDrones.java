package Ej_Drones;

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
                        }
                        else {
                            System.out.println("Error, el dron ya está en una misión.");
                        }
                    }
                    else {
                        System.out.println("Error, el dron no puede completar la misión debido a su carga, distancia o memoria.");
                    }
                }
                else {
                    System.out.println("Error, no se encontró el dron solicitado.");
                }
            }
    }

    public void finalizarMision(String modelo){
        for (Dron d : this.drones){
            if (d.getModelo().equals(modelo)){
                if (d.getEstado().equals(Estado.EN_VUELO)){
                    System.out.println("Misión terminada exitosamente");
                    d.setEstado(Estado.INACTIVO);
                }
                else {
                    System.out.println("Este dron no está en una misión");
                }
            }
            else {
                System.out.println("Error, no se encontró el dron solicitado.");
            }
        }
    }

    public static void main(String[] args) {
        SistemaDrones sistema= new SistemaDrones();

    }

}
