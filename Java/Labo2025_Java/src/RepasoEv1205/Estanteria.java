package RepasoEv1205;

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
        int mayor_duracion=this.peliculas.getFirst().getDuracion();
        Pelicula pelicula_aux=new Pelicula();
        for (Pelicula pelicula : this.peliculas){
            if (pelicula.getDuracion() > mayor_duracion){
                pelicula_aux=pelicula;
            }
        }
        return pelicula_aux;
    }
}
