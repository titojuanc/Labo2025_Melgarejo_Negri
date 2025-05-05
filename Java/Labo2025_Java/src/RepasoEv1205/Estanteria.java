package RepasoEv1205;

import Entidades.Persona;

import java.util.ArrayList;

public class Estanteria {
    private int numero_estanteria;
    private ArrayList<Pelicula> peliculas;

    public Estanteria() {
        this.numero_estanteria=100;
        this.peliculas=new ArrayList<>();
    }

    public Estanteria(int numero_estanteria, ArrayList<Pelicula> peliculas) {
        this.numero_estanteria = numero_estanteria;
        this.peliculas = peliculas;
    }

    public int getNumero_estanteria() {
        return numero_estanteria;
    }

    public void setNumero_estanteria(int numero_estanteria) {
        this.numero_estanteria = numero_estanteria;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public void agregarPelicula(Pelicula pelicula){
        this.peliculas.add(pelicula);
    }

    public void borrarPelicula(Pelicula pelicula){
        this.peliculas.remove(pelicula);
    }

    public void modificarPelicula(Pelicula pelicula_viejo, Pelicula pelicula_nuevo){
        for (Pelicula pelicula : this.peliculas){
            if (pelicula.equals(pelicula_nuevo)){
                agregarPelicula(pelicula_nuevo);
            }
            else if (pelicula.equals(pelicula_viejo)) {
                borrarPelicula(pelicula_viejo);
            }
        }
    }

    public Pelicula EstanteriaPeliculaMayorDuracion(){
        int mayor_duracion=this.peliculas.get(0).getDuracion();
        Pelicula pelicula_aux=peliculas.get(0);
        for (Pelicula pelicula : this.peliculas){
            if (pelicula.getDuracion() > mayor_duracion){
                pelicula_aux=pelicula;
                mayor_duracion=pelicula.getDuracion();
            }
        }
        return pelicula_aux;
    }

    public ArrayList<Persona> directoresRepetidos(){
        ArrayList<Persona> directores_rep=new ArrayList<>();
        ArrayList<Persona> directores = new ArrayList<>();
        for (Pelicula pelicula_aux : this.peliculas){
            if (!directores.contains(pelicula_aux.getDirector())){
                directores.add(pelicula_aux.getDirector());
            }
        }
        for (Persona persona_aux : directores){
            if (!directores_rep.contains(persona_aux)){
                directores_rep.add(persona_aux);
            }
        }
        return directores_rep;
    }
}
