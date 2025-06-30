package RepasoEv0707;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Ticket {
    private ClienteTicket cliente;
    private LocalDate fechaCreacion;
    private LocalDate fechaFinalizacion;
    private String descripcion;
    private ArrayList<String> listaComentarios;
    private EstadoTicket estado;
    private ArrayList<Desarrollador> desarrolladores;

    public Ticket(ClienteTicket cliente, LocalDate fechaCreacion, LocalDate fechaFinalizacion, String descripcion){
        this.cliente=cliente;
        this.fechaCreacion=fechaCreacion;
        this.fechaFinalizacion=fechaFinalizacion;
        this.descripcion=descripcion;
        this.listaComentarios=new ArrayList<>();
        this.estado=EstadoTicket.ABIERTO;
        this.desarrolladores=new ArrayList<>();
    }

    public ClienteTicket getCliente() {
        return cliente;
    }

    public void setCliente(ClienteTicket cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public ArrayList<String> getListaComentarios() {
        return listaComentarios;
    }

    public void setListaComentarios(ArrayList<String> listaComentarios) {
        this.listaComentarios = listaComentarios;
    }

    public EstadoTicket getEstado() {
        return estado;
    }

    public void setEstado(EstadoTicket estado) {
        this.estado = estado;
    }

    public void agregarDesarrollador(Desarrollador desarrollador){
        this.desarrolladores.add(desarrollador);
    }

    public abstract boolean resolucion();
}
