package Objetos;

import Entidades.Persona;

import java.util.ArrayList;

public class CD {
    private ArrayList<Cancion>canciones;

    public CD(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public CD(){
        ArrayList<Cancion> cancionesaux= new ArrayList<Cancion>();
        Persona cerati = new Persona("Gustavo", 30, "X");
        cancionesaux.add(new Cancion("Bocanada", cerati));
        cancionesaux.add(new Cancion("Tabú", cerati));
        cancionesaux.add(new Cancion("Puente",cerati));
        this.canciones=cancionesaux;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int numeroCanciones(){
        return this.canciones.size();
    }

    public String verCancion(int posicion){
        if (posicion > this.numeroCanciones()-1){
            return "Index error";
        }
        else {
            return this.canciones.get(posicion).getTitulo();
        }

    }

    public void grabarCancion(int posicion, Cancion nuevaCancion){
        if (posicion > this.numeroCanciones()-1){
            System.out.println("Index error");;
        }
        else {
            this.canciones.set(posicion, nuevaCancion);
            System.out.println("Cancion actualizada");
        }

    }

    public void agregarCanciones(Cancion nuevaCancion){
        this.canciones.add(nuevaCancion);
        System.out.println("Canción agregada");
    }

    public void eliminarCancion(int posicion){
        if (posicion > this.numeroCanciones()-1){
            System.out.println("Index error");
        }
        else {
            this.canciones.remove(posicion);
            System.out.println("Última canción eliminada");
        }

    }

    public static void main(String[] args) {
        Persona artista1 = new Persona("Alberto", 40, "X");
        Cancion cancion1 = new Cancion("Bajan", artista1);
        Cancion cancion2 = new Cancion("Salir de la melanconía", artista1);

        CD cd1 = new CD(new ArrayList<Cancion>());
        cd1.agregarCanciones(cancion1);
        System.out.println(cd1.verCancion(0));


        CD bocanada = new CD();
        System.out.println(bocanada.verCancion(0));
        System.out.println(bocanada.verCancion(1));
        System.out.println(bocanada.verCancion(2));
        System.out.println(bocanada.numeroCanciones());

        cd1.agregarCanciones(cancion2);
        System.out.println(cd1.verCancion(1));
        cd1.grabarCancion(0, cancion2);
        System.out.println(cd1.verCancion(0));
        cd1.eliminarCancion(1);
        System.out.println(cd1.verCancion(1));
        System.out.println(cd1.verCancion(0));
    }
}
