package CampeonatoArcoYFlecha;

import java.util.HashSet;

public class Cuadrada extends Diana{
    private double lado;

    public Cuadrada(String nombre, int id, Dificultad dificultad, HashSet<FranjaColor> puntajes, double lado) {
        super(nombre, id, dificultad, puntajes);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return this.lado * this.lado;
    }
}
