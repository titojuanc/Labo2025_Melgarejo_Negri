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

    public Cancion verCancion(int posicion){
            return this.canciones.get(posicion);
    }

    public void grabarCancion(int posicion, Cancion nuevaCancion){
            this.canciones.set(posicion-1, nuevaCancion);
            System.out.println("Cancion actualizada");
    }

    public void agregarCanciones(Cancion nuevaCancion){
        this.canciones.add(nuevaCancion);
        System.out.println("Canción agregada");
    }

    public void eliminarCancion(int posicion){
            this.canciones.remove(posicion);
            System.out.println("Última canción eliminada");
    }

    public static void main(String[] args) {
        Persona artista1 = new Persona("Alberto", 40, "X");
        Cancion cancion1 = new Cancion("Bajan", artista1);
        Cancion cancion2 = new Cancion("Salir de la melanconía", artista1);
        CD cd1 = new CD(new ArrayList<Cancion>());
        cd1.agregarCanciones(cancion1);
        cd1.agregarCanciones(cancion2);
        CD bocanada = new CD();

        System.out.println("Número de canciones de cd1: "+cd1.numeroCanciones());
        System.out.println("Número de canciones de bocanada: "+bocanada.numeroCanciones());
        cd1.grabarCancion(1, cancion2);
        cd1.eliminarCancion(1);
        System.out.println(cd1.verCancion(1));
        bocanada.agregarCanciones(cancion1);
        cd1.agregarCanciones(cancion1);
        cd1.agregarCanciones(cancion2);
        bocanada.agregarCanciones(cancion1);
        bocanada.agregarCanciones(cancion2);
        System.out.println("Número de canciones de cd1: "+cd1.numeroCanciones());
        System.out.println("Número de canciones de bocanada: "+bocanada.numeroCanciones());




    }
}
