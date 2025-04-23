package SinClasificar;

import Entidades.Equipo;
import Utilidad.Fecha;

public class Partido {
    private Fecha fechaPartido;
    private String turno;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    public Partido(){
        this.fechaPartido=new Fecha();
        this.turno="";
        this.equipoLocal=new Equipo();
        this.equipoVisitante=new Equipo();
    }

    public Partido(Fecha fechaPartido, String turno, Equipo equipoLocal, Equipo equipoVisitante) {
        this.fechaPartido = fechaPartido;
        this.turno = turno;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public Fecha getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(Fecha fechaPartido) {
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
