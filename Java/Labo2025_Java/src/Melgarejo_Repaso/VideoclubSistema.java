package Melgarejo_Repaso;

import java.util.ArrayList;

public class VideoclubSistema {
    public static void main(String[] args) {
        Videoclub videoclub = new Videoclub();
        ArrayList<Estanteria> estanterias = new ArrayList<>();

        estanterias.add(new Estanteria(new ArrayList<>()));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 1", "Accion"));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 2", "Drama"));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 3", "Sci-fi"));
        estanterias.getLast().borrarPeli(2);
        estanterias.getLast().modificarPeli(0, new Pelicula());
        estanterias.add(new Estanteria(new ArrayList<>()));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 4", "Accion"));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 5", "Drama"));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 6", "Sci-fi"));
        estanterias.getLast().borrarPeli(2);
        estanterias.getLast().modificarPeli(0, new Pelicula("Peli modificada", "Horror"));
        estanterias.add(new Estanteria(new ArrayList<>()));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 7", "Accion"));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 8", "Drama"));
        estanterias.getLast().borrarPeli(1);
        estanterias.getLast().modificarPeli(0, new Pelicula("Peli modificada", "Horror"));


        estanterias.getFirst().getPeli(0).detalles();
        System.out.println("Cantidad de pelis de e1: "+estanterias.getFirst().cantPeliculas());
        System.out.println("Cantidad de pelis de e3: "+estanterias.getLast().cantPeliculas());
        System.out.println("Actor con mayor edad de "+estanterias.getFirst().getPeli(0).getNombre()+" : "+estanterias.getFirst().getPeli(0).actorMayorEdad().getNombre());

    }
}
