package Melgarejo_Repaso;

import java.util.ArrayList;

public class Videoclub {
    private int direccion;
    private int codigop;
    private final ArrayList<Estanteria> estanterias;

    public Videoclub(ArrayList<Estanteria> estanterias, int direccion, int codigop) {
        this.estanterias = estanterias;
        this.direccion = direccion;
        this.codigop = codigop;
    }

    public Videoclub(ArrayList<Estanteria> estanterias) {
        this.codigop=912;
        this.direccion=4248;
        this.estanterias = estanterias;
    }

    public Videoclub (){
        this.codigop=912;
        this.direccion=4248;
        this.estanterias = new ArrayList<>();
    }

    public void peliMasLarga(){
        Pelicula pelimayor= this.estanterias.getFirst().getPeli(0);
        int nestanteria=0;
        for (Estanteria estanteria : this.estanterias){
            nestanteria=+1;
            for (Pelicula pelicula : estanteria.getPeliculas()){
                if (pelimayor.getDuracion()<pelicula.getDuracion()){
                    pelimayor=pelicula;
                    nestanteria=1;
                }
            }
        }
        System.out.println("Peli más larga: "+pelimayor.getNombre()+". Estantería N: "+nestanteria);
    }
}

