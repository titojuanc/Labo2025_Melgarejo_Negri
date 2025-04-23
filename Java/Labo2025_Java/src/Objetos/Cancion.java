package Objetos;

import Entidades.Persona;

public class Cancion {
    private String titulo;
    private Persona autor;

    public Cancion(){
        this.titulo="";
        this.autor= new Persona();
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

    public String getDireccion() {
        return autor.getDireccion();
    }

    public void setDireccion(String direccion) {
        this.autor.setDireccion(direccion);
    }

    public int getEdad() {
        return autor.getEdad();
    }

    public void setEdad(int edad) {
        this.autor.setEdad(edad);
    }
}
