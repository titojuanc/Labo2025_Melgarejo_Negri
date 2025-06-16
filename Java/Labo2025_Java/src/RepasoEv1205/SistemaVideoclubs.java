package RepasoEv1205;

import Entidades.Director;
import Entidades.Persona;

import java.util.ArrayList;

public class SistemaVideoclubs {
    private ArrayList<Videoclub> videoclubs;

    public SistemaVideoclubs(){
        this.videoclubs=new ArrayList<>();
    }

    public SistemaVideoclubs(ArrayList<Videoclub> videoclubs) {
        this.videoclubs = videoclubs;
    }

    public ArrayList<Videoclub> getVideoclubs() {
        return videoclubs;
    }

    public void setVideoclubs(ArrayList<Videoclub> videoclubs) {
        this.videoclubs = videoclubs;
    }

    public void agregarVideoclub(Videoclub videoclub){
        this.videoclubs.add(videoclub);
    }

    public void borrarVideoclub(Videoclub videoclub){
        this.videoclubs.remove(videoclub);
    }

    public void modificarVideoclub(Videoclub videoclub_viejo, Videoclub videoclub_nuevo){
        for (Videoclub videoclub : this.videoclubs){
            if (videoclub.equals(videoclub_nuevo)){
                agregarVideoclub(videoclub_nuevo);
            }
            else if (videoclub.equals(videoclub_viejo)) {
                borrarVideoclub(videoclub_viejo);
            }
        }
    }

    public void estanteriaConPeliculaMayorDuracion(Videoclub videoclub){
        if (this.videoclubs.contains(videoclub)){
            System.out.println(videoclub.mostrarNombreEstanteriaPeliculaMayorDuracion());
        }
    }

    public ArrayList<Persona> actoresMayoresEdad(Pelicula pelicula){
        ArrayList<Persona> persona_ret=new ArrayList<>();
        persona_ret=pelicula.peliculaActoresMayoresEdad();
        return persona_ret;
    }

    public void directoresRepetidosEstanteria(Estanteria estanteria){
        ArrayList<Persona> directores_rep=estanteria.directoresRepetidos();
        for (Persona persona_aux : directores_rep){
            System.out.println("Actores Repetidos: " + persona_aux.getNombre());
        }
    }

    public int comunas(int comuna){
        switch (comuna){
            case 1:
                return (1008);
            case 2:
                return (1114);
            case 3:
                return (1201);
            case 4:
                return (1166);
            case 5:
                return (1107);
            case 6:
                return (1405);
            case 7:
                return (1424);
            case 8:
                return (1437);
            case 9:
                return (1406);
            case 10:
                return (1439);
            case 11:
                return (1419);
            case 12:
                return (1430);
            case 13:
                return (1429);
            case 14:
                return (1414);
            case 15:
                return (1118);
            default:
                return 0;
        }
    }

    public void direccionVideoclubComuna(int comuna){
        int codigo_postal=comunas(comuna);
        for (Videoclub videoclub : this.videoclubs){
            if(videoclub.getCodigo_postal()==codigo_postal){
                System.out.println(videoclub.getDireccion());
            }
        }
    }

    public static void main(String[] args) {
        Persona director1 = new Director("Christopher Nolan", 50, "ahi");
        Persona actor1 = new Director("Leonardo DiCaprio", 40, "ahi");
        Persona director2 = new Director("Steven Spielberg", 30, "ahi");
        Persona actor2 = new Director("Tom Hanks", 35, "ahi");

        ArrayList<Persona> actores1 = new ArrayList<>();
        ArrayList<Persona> actores2 = new ArrayList<>();
        actores1.add(actor1);
        actores2.add(actor2);

        ArrayList<String> idiomas1 = new ArrayList<>();
        idiomas1.add("Inglés");
        idiomas1.add("Español");

        Pelicula pelicula1 = new Pelicula("Inception", "Ciencia ficción", 148, director1, actores1 ,idiomas1);
        Pelicula pelicula2 = new Pelicula("Titanic", "Drama", 195, director2, actores2, idiomas1);
        Pelicula pelicula3 = new Pelicula("Inception2", "Ciencia ficción", 150, director1, actores1 ,idiomas1);

        ArrayList<Pelicula> peliculasEstanteria1 = new ArrayList<>();
        peliculasEstanteria1.add(pelicula1);
        peliculasEstanteria1.add(pelicula3);

        ArrayList<Pelicula> peliculasEstanteria2 = new ArrayList<>();
        peliculasEstanteria2.add(pelicula2);

        Estanteria estanteria1 = new Estanteria(1, peliculasEstanteria1);
        Estanteria estanteria2 = new Estanteria(2, peliculasEstanteria2);

        // Crear videoclub
        ArrayList<Estanteria> estanterias = new ArrayList<>();
        estanterias.add(estanteria1);
        estanterias.add(estanteria2);

        Videoclub videoclub1 = new Videoclub("Calle Falsa 123", 28001, estanterias);

        ArrayList<Videoclub> videoclubs_m = new ArrayList<Videoclub>();

        videoclubs_m.add(videoclub1);

        SistemaVideoclubs s1 = new SistemaVideoclubs(videoclubs_m);

        s1.estanteriaConPeliculaMayorDuracion(videoclub1);
        for (Persona actor_aux : s1.actoresMayoresEdad(pelicula1)){
            System.out.println("Actores mayores de edad: " + actor_aux.getNombre());
        }
        s1.directoresRepetidosEstanteria(estanteria1);
    }
}

