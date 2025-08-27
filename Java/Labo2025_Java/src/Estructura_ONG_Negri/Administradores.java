package Estructura_ONG_Negri;

import java.util.HashSet;

public class Administradores extends ParticipanteConSueldo{
    private String computadora;
    private String contrasenia;
    private static HashSet<Barrio> barrios = colocarBarrios();

    private static HashSet<Barrio> colocarBarrios(){
        HashSet<Barrio> barrios_aux = new HashSet<>();
        barrios_aux.add(Barrio.FLORES);
        barrios_aux.add(Barrio.FLORESTA);
        barrios_aux.add(Barrio.AGRONOMIA);
        barrios_aux.add(Barrio.COLEGIALES);
        barrios_aux.add(Barrio.PARQUE_CHAS);
        return barrios_aux;
    }
}
