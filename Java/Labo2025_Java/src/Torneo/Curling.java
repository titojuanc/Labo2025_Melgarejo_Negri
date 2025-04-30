package Torneo;

import Entidades.Equipo;
import SinClasificar.Partido;
import Entidades.Jugador;
import Utilidad.Fecha;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Curling {
    private ArrayList<Equipo> listaEquipos;
    private ArrayList<Partido> fixture;
    private LocalDate fechaHoy;

    public Curling(){
        this.listaEquipos=new ArrayList<Equipo>();
        this.fixture= new ArrayList<Partido>();
        this.fechaHoy=LocalDate.now();
    }

    public ArrayList<Equipo> getEquipos() {
        return listaEquipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.listaEquipos = equipos;
    }

    public void generarPartidos(Equipo equipo1, Equipo equipo2, String disponibilidad){
        Partido partido = new Partido(this.fechaHoy, disponibilidad, equipo1, equipo2);
        fixture.add(partido);
    }

    public void emparejarEquipos(ArrayList<Equipo> equipos){
        for (int i = 0; i < equipos.size(); i++) {
            for (int j = i+1; j < equipos.size(); j++) {
                if (j + 1 > equipos.size()) {
                    break;
                } else {
                    this.generarPartidos(equipos.get(i), equipos.get(j), equipos.get(i).getDisponibilidad());
                }
                this.fechaHoy=this.fechaHoy.plusDays(7);
            }
        }
        this.fechaHoy=LocalDate.now();
    }

    public void generarFixture(){
        ArrayList<Equipo> equiposManana = new ArrayList<Equipo>();
        ArrayList<Equipo> equiposTarde = new ArrayList<Equipo>();
        ArrayList<Equipo> equiposNoche = new ArrayList<Equipo>();

        if(listaEquipos.isEmpty()){
            System.out.println("Falta llenar equipos");
        }
        else{
            for (int i=0;i<this.listaEquipos.size();i++){
                switch (listaEquipos.get(i).getDisponibilidad().toLowerCase()) {
                    case "manana":
                        equiposManana.add(listaEquipos.get(i));
                        break;
                    case "tarde":
                        equiposTarde.add(listaEquipos.get(i));
                        break;
                    case "noche":
                        equiposNoche.add(listaEquipos.get(i));
                        break;
                }
            }
        }

        this.emparejarEquipos(equiposManana);
        this.emparejarEquipos(equiposTarde);
        this.emparejarEquipos(equiposNoche);
    }

    public void imprimirFixture(){
        for (int i = 0; i < this.fixture.size(); i++) {
            System.out.println("Partido " + i + "- Equipo Local: " + this.fixture.get(i).getEquipoLocal().getNombre() + " Equipo Visitante: " + this.fixture.get(i).getEquipoVisitante().getNombre() + " Fecha: " + this.fixture.get(i).getFechaPartido() + " Turno: " + this.fixture.get(i).getTurno());
        }
    }

    public static void main(String[] args) {
        Curling s1 = new Curling();

        Jugador j1 = new Jugador("Lionel Messi", new Fecha(24, 6, 1987), 10, true);
        Jugador j2 = new Jugador("Emiliano Martínez", new Fecha(2, 9, 1992), 23, false);
        Jugador j3 = new Jugador("Cristian Romero", new Fecha(27, 4, 1998), 13, false);
        Jugador j4 = new Jugador("Nicolás Otamendi", new Fecha(12, 2, 1988), 19, false);
        Jugador j5 = new Jugador("Nahuel Molina", new Fecha(6, 4, 1998), 26, false);
        Jugador j6 = new Jugador("Marcos Acuña", new Fecha(28, 10, 1991), 8, false);
        Jugador j7 = new Jugador("Rodrigo De Paul", new Fecha(24, 5, 1994), 7, false);
        Jugador j8 = new Jugador("Leandro Paredes", new Fecha(29, 6, 1994), 5, false);
        Jugador j9 = new Jugador("Alexis Mac Allister", new Fecha(24, 12, 1998), 20, false);
        Jugador j10 = new Jugador("Ángel Di María", new Fecha(14, 2, 1988), 11, false);
        Jugador j11 = new Jugador("Julián Álvarez", new Fecha(31, 1, 2000), 9, false);

        ArrayList<Jugador> jugadores_main= new ArrayList<Jugador>();

        Collections.addAll(jugadores_main,j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11);

        Equipo e1 = new Equipo("Poli", "barrio", jugadores_main, "manana");
        Equipo e2 = new Equipo("Poli1", "barrio", jugadores_main, "manana");
        Equipo e3 = new Equipo("Poli2", "barrio", jugadores_main, "manana");
        Equipo e4 = new Equipo("Poli3", "barrio", jugadores_main, "tarde");
        Equipo e5 = new Equipo("Poli4", "barrio", jugadores_main, "tarde");
        Equipo e6 = new Equipo("Poli5", "barrio", jugadores_main, "noche");
        Equipo e7 = new Equipo("Poli6", "barrio", jugadores_main, "noche");
        Equipo e8 = new Equipo("Poli7", "barrio", jugadores_main, "manana");
        Equipo e9 = new Equipo("Poli8", "barrio", jugadores_main, "manana");
        Equipo e10 = new Equipo("Poli9", "barrio", jugadores_main, "tarde");
        Equipo e11 = new Equipo("Poli10", "barrio", jugadores_main, "tarde");
        Equipo e12 = new Equipo("Poli11", "barrio", jugadores_main, "noche");
        Equipo e13 = new Equipo("Poli12", "barrio", jugadores_main, "noche");

        Collections.addAll(s1.listaEquipos, e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13);

        s1.generarFixture();

        s1.imprimirFixture();
    }
}


