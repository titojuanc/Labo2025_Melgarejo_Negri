package CampeonatoArcoYFlecha;

import java.util.HashSet;

public abstract class Diana {
    private String nombre;
    private int id;
    private Dificultad dificultad;
    private HashSet<FranjaColor> puntajes;

    public Diana(String nombre, int id, Dificultad dificultad, HashSet<FranjaColor> puntajes) {
        this.nombre = nombre;
        this.id = id;
        this.dificultad = dificultad;
        this.puntajes = puntajes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public HashSet<FranjaColor> getPuntajes() {
        return puntajes;
    }

    public void setPuntajes(HashSet<FranjaColor> puntajes) {
        this.puntajes = puntajes;
    }

    public double calcularArea(){return 0;}
}
