package Ej_Drones;

import Enumeraciones.Estado;

import java.time.LocalDate;

public abstract class Dron {
    private String modelo;
    private LocalDate fechaAdquisicion;
    private int nivelCarga;
    private static int cantidadOperativa;
    private Estado estado;

    public Dron(String modelo, LocalDate fechaAdquisicion) {
        this.modelo = modelo;
        this.fechaAdquisicion = fechaAdquisicion;
        this.nivelCarga = 100;
        this.estado = Estado.INACTIVO;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNivelCarga() {
        return nivelCarga;
    }

    public void setNivelCarga(int nivelCarga) {
        this.nivelCarga = nivelCarga;
    }

    public static int getCantidadOperativa() {
        return cantidadOperativa;
    }

    public static void setCantidadOperativa(int cantidadOperativa) {
        Dron.cantidadOperativa = cantidadOperativa;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public void recargarBateria(){
        if (nivelCarga+10>100){
            nivelCarga=100;
            return;
        }

        if (nivelCarga>=20){
            nivelCarga=nivelCarga+10;
        }
        else {
            nivelCarga=100;
        }
    }

    public abstract boolean ejecutarMision(double latitud, double longitud);

    public double distanciaEnKm(double latitud, double longuitud){
        double lat1Rad = Math.toRadians(-34.573195);
        double lon1Rad = Math.toRadians(-58.504111);
        double lat2Rad = Math.toRadians(latitud);
        double lon2Rad = Math.toRadians(longuitud);
        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double radioTierraKm = 6371;
        return radioTierraKm * c;
    }
}
