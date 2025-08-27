package Estructura_ONG_Negri;

import java.util.HashMap;
import java.util.HashSet;

public class VoluntarioExterno extends Participante{
    private Institucion institucion;
    private static HashSet<Barrio> barrios = colocarBarrios();

    private static HashSet<Barrio> colocarBarrios(){
        HashSet<Barrio> barrios_aux = new HashSet<>();
        barrios_aux.add(Barrio.COGHLAN);
        barrios_aux.add(Barrio.PALERMO);
        barrios_aux.add(Barrio.BARRACAS);
        barrios_aux.add(Barrio.PARQUE_PATRICIOS);
        barrios_aux.add(Barrio.RETIRO);
        barrios_aux.add(Barrio.SAAVEDRA);
        return barrios_aux;
    }
}
