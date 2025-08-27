package Estructura_ONG_Negri;

import java.util.HashMap;
import java.util.HashSet;

public class Profesores extends ParticipanteConSueldo{
    HashMap<Materia, Double> materias;
    private static HashSet<Barrio> barrios = colocarBarrios();

    private static HashSet<Barrio> colocarBarrios(){
        HashSet<Barrio> barrios_aux = new HashSet<>();
        barrios_aux.add(Barrio.PUERTO_MADERO);
        barrios_aux.add(Barrio.SAN_CRISTOBAL);
        barrios_aux.add(Barrio.PALERMO);
        barrios_aux.add(Barrio.MONTE_CASTRO);
        barrios_aux.add(Barrio.VERSALLES);
        barrios_aux.add(Barrio.VILLA_SANTA_RITA);
        barrios_aux.add(Barrio.COLEGIALES);
        return barrios_aux;
    }

}
