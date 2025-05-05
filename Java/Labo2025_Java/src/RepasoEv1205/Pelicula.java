package RepasoEv1205;

import Entidades.Persona;

import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private String genero;
    private int duracion;
    private Persona director;
    private ArrayList<Persona> actores;
    private ArrayList<String> idiomas;

    public Pelicula() {
        this.nombre="Harry Potter";
        this.genero="Fantastico";
        this.duracion=0;
        this.director=new Persona("Yo", 10, "aca");
        this.actores=new ArrayList<>();
        this.idiomas=new ArrayList<>();
        idiomas.add("ingles");
    }

    public Pelicula(String nombre, String genero, int duracion, Persona director, ArrayList<Persona> actores, ArrayList<String> idiomas) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.director = new Persona(director.getNombre(), director.getEdad(), director.getDireccion());
        this.actores = actores;
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

    public ArrayList<Persona> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Persona> actores) {
        this.actores = actores;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }

    public ArrayList<Persona> peliculaActoresMayoresEdad(){
        ArrayList<Persona> persona_ret=new ArrayList<>();
        for (Persona persona_aux : this.getActores()){
            if (persona_aux.getEdad() > 18){
                persona_ret.add(persona_aux);
            }
        }
        return persona_ret;
    }
}
