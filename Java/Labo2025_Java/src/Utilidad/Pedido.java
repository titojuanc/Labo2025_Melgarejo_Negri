package Utilidad;

import Entidades.Persona;
import Objetos.Plato;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido {
    private LocalDate fecha;
    private Plato plato;
    private Persona solicitante;
    private LocalTime hora;
    private String estado;

    public Pedido(LocalDate fecha, Plato plato, Persona solicitante, LocalTime hora, String estado) {
        this.fecha = fecha;
        this.plato = plato;
        this.solicitante = solicitante;
        this.hora = hora;
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Persona getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Persona solicitante) {
        this.solicitante = solicitante;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
