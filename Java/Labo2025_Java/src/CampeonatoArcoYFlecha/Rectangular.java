package CampeonatoArcoYFlecha;

import java.util.HashSet;

public class Rectangular extends Diana{
    private double base;
    private double altura;

    public Rectangular(String nombre, int id, Dificultad dificultad, HashSet<FranjaColor> puntajes, double base, double altura) {
        super(nombre, id, dificultad, puntajes);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return this.base * this.altura;
    }
}
