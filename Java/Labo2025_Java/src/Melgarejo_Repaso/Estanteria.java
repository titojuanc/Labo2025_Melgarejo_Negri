package Melgarejo_Repaso;

import java.util.ArrayList;

public class Estanteria {
    private ArrayList<Pelicula> peliculas;

    public Estanteria(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public Estanteria (){
        ArrayList<Pelicula> p = new ArrayList<>();
        Pelicula p1 = new Pelicula();
        Pelicula p2 = new Pelicula("Peli 1", "Drama");
        this.peliculas = p;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public int cantPeliculas(){
        return this.peliculas.size();
    }

    public void addPeli(Pelicula pelicula){
        this.peliculas.add(pelicula);
    }

    public void borrarPeli(int index){
        System.out.println("Película "+this.peliculas.get(index).getNombre()+" borrada.");
        this.peliculas.remove(index);
    }

    public void modificarPeli(int index, Pelicula pelicula){
        System.out.println("Película "+this.peliculas.get(index).getNombre()+" cambiada por "+pelicula.getNombre());
        this.peliculas.set(index, pelicula);
    }

    public Pelicula getPeli (int index){
        return this.peliculas.get(index);
    }
}



