package Estructura_ONG_Negri;

import java.util.HashSet;

public class VoluntarioMiembro extends Participante{
    private double puntaje;
    private static HashSet<Barrio> barrios = colocarBarrios();

    private static HashSet<Barrio> colocarBarrios(){
        HashSet<Barrio> barrios_aux = new HashSet<>();
        barrios_aux.add(Barrio.MONSERRAT);
        barrios_aux.add(Barrio.NUEVA_POMPEYA);
        barrios_aux.add(Barrio.NUÑEZ);
        barrios_aux.add(Barrio.BELGRANO);
        barrios_aux.add(Barrio.CONSTITUCION);
        return barrios_aux;
    }
}
