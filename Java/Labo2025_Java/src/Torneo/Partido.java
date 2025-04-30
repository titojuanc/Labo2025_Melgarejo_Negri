package SinClasificar;

import Entidades.Equipo;
import Utilidad.Fecha;

import java.time.LocalDate;

public class Partido {
    private LocalDate fechaPartido;
    private String turno;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    public Partido(){
        this.fechaPartido=LocalDate.now();
        this.turno="";
        this.equipoLocal=new Equipo();
        this.equipoVisitante=new Equipo();
    }

    public Partido(LocalDate fechaPartido, String turno, Equipo equipoLocal, Equipo equipoVisitante) {
        this.fechaPartido = fechaPartido;
        this.turno = turno;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public LocalDate getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(LocalDate fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }
}
