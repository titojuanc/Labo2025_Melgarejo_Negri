package Torneo;

import Entidades.Equipo;
import Entidades.Jugador;
import Enumeraciones.Disponibilidad;
import Utilidad.Fecha;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;


public class CurlingTest {
    Jugador j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11;
    Equipo e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13;
    Curling s1;
    ArrayList<Jugador> jugadores_main;
    @Before
    public void setUp(){
         s1 = new Curling();

        Jugador j1 = new Jugador("Lionel" ,"Messi", new Fecha(24, 6, 1987), 10, true);
        Jugador j2 = new Jugador("Emiliano" ,"Martínez", new Fecha(2, 9, 1992), 23, false);
        Jugador j3 = new Jugador("Cristian" ,"Romero", new Fecha(27, 4, 1998), 13, false);
        Jugador j4 = new Jugador("Nicolás" ,"Otamendi", new Fecha(12, 2, 1988), 19, false);
        Jugador j5 = new Jugador("Nahuel" ,"Molina", new Fecha(6, 4, 1998), 26, false);
        Jugador j6 = new Jugador("Marcos","Acuña", new Fecha(28, 10, 1991), 8, false);
        Jugador j7 = new Jugador("Rodrigo","De Paul", new Fecha(24, 5, 1994), 7, false);
        Jugador j8 = new Jugador("Leandro" ,"Paredes", new Fecha(29, 6, 1994), 5, false);
        Jugador j9 = new Jugador("Alexis" ,"Mac Allister", new Fecha(24, 12, 1998), 20, false);
        Jugador j10 = new Jugador("Ángel", "Di María", new Fecha(14, 2, 1988), 11, false);
        Jugador j11 = new Jugador("Julian", "Alvarez", new Fecha(31, 1, 2000), 9, false);

         jugadores_main= new ArrayList<Jugador>();

        Collections.addAll(jugadores_main,j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11);

         e1 = new Equipo("Poli", "barrio", jugadores_main, Disponibilidad.MANANA);
         e2 = new Equipo("Poli1", "barrio", jugadores_main, Disponibilidad.MANANA);
         e3 = new Equipo("Poli2", "barrio", jugadores_main, Disponibilidad.MANANA);
         e4 = new Equipo("Poli3", "barrio", jugadores_main, Disponibilidad.TARDE);
         e5 = new Equipo("Poli4", "barrio", jugadores_main, Disponibilidad.TARDE);
         e6 = new Equipo("Poli5", "barrio", jugadores_main, Disponibilidad.NOCHE);
         e7 = new Equipo("Poli6", "barrio", jugadores_main, Disponibilidad.NOCHE);
         e8 = new Equipo("Poli7", "barrio", jugadores_main, Disponibilidad.MANANA);
         e9 = new Equipo("Poli8", "barrio", jugadores_main, Disponibilidad.MANANA);
         e10 = new Equipo("Poli9", "barrio", jugadores_main, Disponibilidad.TARDE);
         e11 = new Equipo("Poli10", "barrio", jugadores_main, Disponibilidad.TARDE);
         e12 = new Equipo("Poli11", "barrio", jugadores_main, Disponibilidad.NOCHE);
         e13 = new Equipo("Poli12", "barrio", jugadores_main, Disponibilidad.NOCHE);

        Collections.addAll(s1.getEquipos(), e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13);
    }

    @Test
    public void testListaEquipos(){
        assertEquals(13, s1.getEquipos().size());
        assertEquals(e1, s1.getEquipos().get(0));
        assertEquals(e13, s1.getEquipos().get(12));
        for (Equipo equipo : s1.getEquipos()) {
            assertNotNull(equipo);
        }
        assertTrue(s1.getEquipos().contains(e1));
        assertTrue(s1.getEquipos().contains(e2));
        assertTrue(s1.getEquipos().contains(e3));
        assertTrue(s1.getEquipos().contains(e4));
        assertTrue(s1.getEquipos().contains(e5));
        assertTrue(s1.getEquipos().contains(e6));
        assertTrue(s1.getEquipos().contains(e7));
        assertTrue(s1.getEquipos().contains(e8));
        assertTrue(s1.getEquipos().contains(e9));
        assertTrue(s1.getEquipos().contains(e10));
        assertTrue(s1.getEquipos().contains(e11));
        assertTrue(s1.getEquipos().contains(e12));
        assertTrue(s1.getEquipos().contains(e13));
    }
    public void testJugadores_main(){
        assertEquals(11, jugadores_main.size());
        assertEquals(j1, jugadores_main.get(0));
        assertEquals(j11, jugadores_main.get(10));
        for (Jugador jugador : jugadores_main) {
            assertNotNull(jugador);
        }
        assertTrue(jugadores_main.contains(j1));
        assertTrue(jugadores_main.contains(j2));
        assertTrue(jugadores_main.contains(j3));
        assertTrue(jugadores_main.contains(j4));
        assertTrue(jugadores_main.contains(j5));
        assertTrue(jugadores_main.contains(j6));
        assertTrue(jugadores_main.contains(j7));
        assertTrue(jugadores_main.contains(j8));
        assertTrue(jugadores_main.contains(j9));
        assertTrue(jugadores_main.contains(j10));
        assertTrue(jugadores_main.contains(j11));
    }
}
