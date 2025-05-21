package Objetos;

import java.time.LocalDate;

public class Sensor {
    private boolean estado;
    private double medida;
    private double umbral;
    private LocalDate fecha_adquisicion;

    public Sensor(){
        this.estado=false;
        this.medida=0;
        this.umbral=100;
        this.fecha_adquisicion=LocalDate.now();
    }

    public Sensor(boolean estado, double medida, double umbral, LocalDate fecha_adquisicion) {
        this.estado = estado;
        this.medida = medida;
        this.umbral = umbral;
        this.fecha_adquisicion = fecha_adquisicion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public double getUmbral() {
        return umbral;
    }

    public void setUmbral(double umbral) {
        this.umbral = umbral;
    }

    public LocalDate getFecha_adquisicion() {
        return fecha_adquisicion;
    }

    public void setFecha_adquisicion(LocalDate fecha_adquisicion) {
        this.fecha_adquisicion = fecha_adquisicion;
    }

    public String imprimirDeteccion(){
        return "Error";
    }
}
