package RepasoEv1205;

import Entidades.Persona;

import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private String genero;
    private int duracion;
    private Persona director;
    private Persona actor;
    private ArrayList<String> idiomas;

    public Pelicula() {
        this.nombre="Harry Potter";
        this.genero="Fantastico";
        this.duracion=210;
        this.director=new Persona("Yo", 10, "aca");
        this.actor=new Persona("Nico", 17, "Poli");
        this.idiomas=new ArrayList<>();
        idiomas.add("ingles");
    }

    public Pelicula(String nombre, String genero, int duracion, Persona director, Persona actor, ArrayList<String> idiomas) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.director = director;
        this.actor = actor;
        this.idiomas = idiomas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Persona getDirector() {
        return director;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }

    public Persona getActor() {
        return actor;
    }

    public void setActor(Persona actor) {
        this.actor = actor;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }
}
