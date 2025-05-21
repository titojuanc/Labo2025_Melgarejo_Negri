package Utilidad;

import Entidades.Empleado;

import java.time.LocalDate;
import java.util.Locale;

public class Llamada {
    private Empleado empleado_origen;
    private Empleado empleado_destino;
    private LocalDate fecha;
    private int duracion;
    private boolean exterior;

    public Llamada(Empleado empleado_origen, Empleado empleado_destino, LocalDate fecha, int duracion, boolean exterior) {
        this.empleado_origen = empleado_origen;
        this.empleado_destino = empleado_destino;
        this.fecha = fecha;
        this.duracion = duracion;
        this.exterior=exterior;
    }

    public Empleado getEmpleado_origen() {
        return empleado_origen;
    }

    public void setEmpleado_origen(Empleado empleado_origen) {
        this.empleado_origen = empleado_origen;
    }

    public Empleado getEmpleado_destino() {
        return empleado_destino;
    }

    public void setEmpleado_destino(Empleado empleado_destino) {
        this.empleado_destino = empleado_destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


}
