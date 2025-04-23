package Entidades;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String barrioProcedencia;
    private ArrayList<Jugador> jugadores;
    private String disponibilidad;

    public Equipo() {
        this.nombre="";
        this.barrioProcedencia="";
        this.jugadores=new ArrayList<>();
        this.disponibilidad="mañana";
    }

    public Equipo(String nombre, String barrioProcedencia, ArrayList<Jugador> jugadores, String disponibilidad) {
        this.nombre = nombre;
        this.barrioProcedencia = barrioProcedencia;
        this.jugadores = jugadores;
        this.disponibilidad = disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarrioProcedencia() {
        return barrioProcedencia;
    }

    public void setBarrioProcedencia(String barrioProcedencia) {
        this.barrioProcedencia = barrioProcedencia;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
