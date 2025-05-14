package Melgarejo_Repaso;

import Entidades.Persona;

import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private String genero;
    private double duracion;
    private ArrayList <Persona> directores;
    private ArrayList <Persona> actores;
    private ArrayList <String> idiomas;

    public Pelicula(String nombre, String genero, double duracion, ArrayList<Persona> directores, ArrayList<Persona> actores, ArrayList<String> idiomas) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.directores = directores;
        this.actores = actores;
        this.idiomas = idiomas;
    }

    public Pelicula(String nombre, String genero, int duracion) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.directores = new ArrayList<>();
        this.directores.add(new Persona("Gabriel", "Messina", 40, "X"));
        this.directores.add(new Persona("Salvador", 39, "X"));
        this.actores = new ArrayList<>();
        this.actores.add(new Persona("Albano", 38, "X"));
        this.actores.add(new Persona("Javier", 68, "X"));
        this.idiomas = new ArrayList<>();
        this.idiomas.add("Español");
    }

    public Pelicula() {
        this.nombre = "Default";
        this.genero = "Accion";
        this.duracion = 90;
        this.directores = new ArrayList<>();
        this.directores.add(new Persona("Gabriel", 40, "X"));
        this.directores.add(new Persona("Salvador", 39, "X"));
        this.actores = new ArrayList<>();
        this.actores.add(new Persona("Albano", 38, "X"));
        this.actores.add(new Persona("Javier", 68, "X"));
        this.idiomas = new ArrayList<>();
        this.idiomas.add("Español");



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

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Persona> getDirectores() {
        return directores;
    }

    public void setDirectores(ArrayList<Persona> directores) {
        this.directores = directores;
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

    public void detalles(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Género: "+this.genero);
        System.out.println("Duración: "+this.duracion);
        System.out.print("Director/es: ");
        for (Persona p : this.directores){
            System.out.print(p.getNombre()+" ");
        }
        System.out.println("");
        System.out.print("Actor/es: ");
        for (Persona p : this.actores){
            System.out.print(p.getNombre()+" ");
        }
        System.out.println("");
        System.out.print("Idioma/s: ");
        for (String i : this.idiomas){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
    public Persona actorMayorEdad(){
        Persona persona= this.actores.getFirst();
        for (Persona p : this.actores){
            if (p.getEdad()> persona.getEdad()){
                persona=p;
            }
        }
        return persona;
    }
}
