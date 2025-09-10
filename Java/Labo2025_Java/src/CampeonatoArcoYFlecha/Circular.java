package CampeonatoArcoYFlecha;

import java.util.HashSet;

public class Circular extends Diana{
    private static int radio=13;

    public Circular(String nombre, int id, Dificultad dificultad, HashSet<FranjaColor> puntajes) {
        super(nombre, id, dificultad, puntajes);
    }

    public static int getRadio() {
        return radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }
}
