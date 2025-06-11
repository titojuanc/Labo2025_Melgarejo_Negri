package Ej_Recetas;

import Enumeraciones.Dificultad;

import java.util.ArrayList;

public abstract class Platillo {
    private String nombre;
    private Dificultad dificultad;
    private ArrayList<String> pasos;

    public Platillo(String nombre, Dificultad dificultad, ArrayList<String> receta){
        this.dificultad=dificultad;
        this.pasos=receta;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }

    abstract void pasos_a_seguir();

    public void mostrar_pasos(){
        for (String paso : this.pasos){
            System.out.println(paso);
        }
    }

    abstract String tipo();
}
