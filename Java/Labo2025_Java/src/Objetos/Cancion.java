package Objetos;

import Entidades.Director;
import Entidades.Persona;

public class Cancion {
    private String titulo;
    private Persona autor;

    public Cancion(){
        this.titulo="";
        this.autor= new Director();
    }
    public Cancion(String titulo, Persona persona){
        this.titulo=titulo;
        this.autor= persona;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombre() {
        return autor.getNombre();
    }

    public void setNombre(String nombre) {
        this.autor.setNombre(nombre);
    }

    public int getEdad() {
        return autor.getEdad();
    }

    public void setEdad(int edad) {
        this.autor.setEdad(edad);
    }
}
