package Torneo;

import Entidades.Equipo;
import Enumeraciones.Disponibilidad;
import Utilidad.Fecha;

import java.time.LocalDate;

public class Partido {
    private LocalDate fechaPartido;
    private Disponibilidad turno;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    public Partido(){
        this.fechaPartido=LocalDate.now();
        this.turno=Disponibilidad.MANANA;
        this.equipoLocal=new Equipo();
        this.equipoVisitante=new Equipo();
    }

    public Partido(LocalDate fechaPartido, Disponibilidad turno, Equipo equipoLocal, Equipo equipoVisitante) {
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

    public Disponibilidad getTurno() {
        return turno;
    }

    public void setTurno(Disponibilidad turno) {
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
