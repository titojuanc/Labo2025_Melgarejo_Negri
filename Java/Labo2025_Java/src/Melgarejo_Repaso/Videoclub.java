package Melgarejo_Repaso;

import Entidades.Persona;

import java.util.ArrayList;

public class Videoclub {
    private int direccion;
    private int codigop;
    private ArrayList<Estanteria> estanterias;

    public Videoclub(ArrayList<Estanteria> estanterias, int direccion, int codigop) {
        this.estanterias = estanterias;
        this.direccion = direccion;
        this.codigop = codigop;
    }

    public Videoclub(ArrayList<Estanteria> estanterias) {
        this.codigop=1419;
        this.direccion=4248;
        this.estanterias = estanterias;
    }

    public Videoclub (){
        this.codigop=1419;
        this.direccion=4248;
        this.estanterias = new ArrayList<>();
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Estanteria> getEstanterias() {
        return estanterias;
    }

    public void setEstanterias(ArrayList<Estanteria> estanterias){
        this.estanterias=estanterias;
    }

    public int getCodigop() {
        return codigop;
    }

    public void setCodigop(int codigop) {
        this.codigop = codigop;
    }

    public int cantPelis(){
        int cant=0;
        for (Estanteria estanteria : this.estanterias){
            cant = cant + estanteria.cantPeliculas();
        }
        return cant;
    }

    public void peliMasLarga(){
        Pelicula pelimayor= this.estanterias.getFirst().getPeli(0);
        int nestanteria=0;
        int estanteriaActual=0;
        for (Estanteria estanteria : this.estanterias){
            nestanteria=nestanteria+1;
            for (Pelicula pelicula : estanteria.getPeliculas()){
                if (pelimayor.getDuracion()<pelicula.getDuracion()){
                    pelimayor=pelicula;
                    estanteriaActual=nestanteria;
                }
            }
        }
        System.out.println("Peli más larga: "+pelimayor.getNombre()+". Estantería N: "+estanteriaActual);
    }

    public void directoresRepetidos(int index){
        ArrayList<Pelicula> estanteria = this.estanterias.get(index).getPeliculas();
        ArrayList<Persona> directores = new ArrayList<>();
        ArrayList<Persona> directoresRepe = new ArrayList<>();
        for (Pelicula pelicula : estanteria){
            for (Persona director : pelicula.getDirectores()){
                directores.add(director);
            }
        }
        for (int i = 0; i < directores.size(); i++) {
            for (int j = i + 1; j < directores.size(); j++) {
                if (directores.get(i).getNombre().equals(directores.get(j).getNombre())) {
                    if (!directoresRepe.contains(directores.get(i))){
                        directoresRepe.add(directores.get(i));
                    }

                }
            }
        }
        for (Persona director : directoresRepe){
            System.out.println(director.getNombre());
        }
    }

    public void pelisCortas(){
        System.out.println("Películas con menos de 90m de duración: ");
        int nestanteria = 0;
        for (Estanteria estanterias : this.estanterias){
            nestanteria = nestanteria + 1;
            int npeli = 0;
            for ( Pelicula pelicula : estanterias.getPeliculas()){
                npeli = npeli + 1;
                if (pelicula.getDuracion()<=90){
                    System.out.println(pelicula.getNombre()+ " Número: "+npeli+ ". Estantería N: "+nestanteria);
                }
            }
        }
    }
}

