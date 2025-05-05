package Melgarejo_Repaso;

import java.util.ArrayList;

public class VideoclubSistema {
    private ArrayList<Videoclub> videoclubs;

    public VideoclubSistema(ArrayList<Videoclub> videoclubs){
        this.videoclubs = videoclubs;
    }

    public ArrayList<Videoclub> getVideoclubs() {
        return videoclubs;
    }

    public void setVideoclubs(ArrayList<Videoclub> videoclubs) {
        this.videoclubs = videoclubs;
    }

    public Videoclub MayorNumeroPelis(){
        int nvideclub = 0;
        Videoclub vc=this.videoclubs.getFirst();
        for (Videoclub videoclub : this.videoclubs){
            if (vc.cantPelis()<videoclub.cantPelis()){
                vc=videoclub;
            }
        }
        return vc;
    }

    public void PelisPorGenero(String genero){
        int nvideoclub = 0;
        for (Videoclub vc : this.videoclubs){
            nvideoclub = nvideoclub + 1;
            System.out.println("Pelis del género "+genero+" del videoclub  N"+nvideoclub);
            for (Estanteria estanteria : vc.getEstanterias()){
                for (Pelicula pelicula : estanteria.getPeliculas()){
                    if (pelicula.getGenero().equals(genero)){
                        System.out.println(pelicula.getNombre()+" | Videoclub N"+nvideoclub);
                    }
                }
            }
        }
    }

    public void comuna(int cp){
        for (Videoclub vc : this.videoclubs){
            if(vc.getCodigop()==cp){
                System.out.println(vc.getDireccion());
            }
        }
    }

    public void DireccionPorComuna(int comuna){
        switch (comuna){
            case 1:
                comuna(1008);
                break;
            case 2:
                comuna(1114);
                break;
            case 3:
                comuna(1201);
                break;
            case 4:
                comuna(1166);
                break;
            case 5:
                comuna(1107);
                break;
            case 6:
                comuna(1405);
                break;
            case 7:
                comuna(1424);
                break;
            case 8:
                comuna(1437);
                break;
            case 9:
                comuna(1406);
                break;
            case 10:
                comuna(1439);
                break;
            case 11:
                comuna(1419);
                break;
            case 12:
                comuna(1430);
                break;
            case 13:
                comuna(1429);
                break;
            case 14:
                comuna(1414);
                break;
            case 15:
                comuna(1118);
                break;


        }
    }

    public static void main(String[] args) {
        Videoclub videoclub = new Videoclub();
        ArrayList<Estanteria> estanterias = new ArrayList<>();

        estanterias.add(new Estanteria(new ArrayList<>()));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 1", "Accion", 90));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 2", "Drama", 100));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 3", "Sci-fi", 10));
        estanterias.getLast().borrarPeli(2);
        estanterias.getLast().modificarPeli(0, new Pelicula());
        estanterias.add(new Estanteria(new ArrayList<>()));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 4", "Accion", 500));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 5", "Drama", 10000));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 6", "Sci-fi", 110));
        estanterias.getLast().borrarPeli(2);
        estanterias.getLast().modificarPeli(0, new Pelicula("Peli modificada", "Horror", 80));
        estanterias.add(new Estanteria(new ArrayList<>()));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 7", "Accion", 10));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 8", "Drama", 100));
        estanterias.getLast().borrarPeli(1);
        estanterias.getLast().modificarPeli(0, new Pelicula("Peli modificada", "Horror", 230));
        videoclub.setEstanterias(estanterias);

        ArrayList<Videoclub> videoclubs1 = new ArrayList<>();
        videoclubs1.add(videoclub);
        VideoclubSistema videoclubs = new VideoclubSistema(videoclubs1);

        estanterias.getFirst().getPeli(0).detalles();
        System.out.println("Cantidad de pelis de e1: "+estanterias.getFirst().cantPeliculas());
        System.out.println("Cantidad de pelis de e3: "+estanterias.getLast().cantPeliculas());
        System.out.println("Actor con mayor edad de "+estanterias.getFirst().getPeli(0).getNombre()+" : "+estanterias.getFirst().getPeli(0).actorMayorEdad().getNombre());
        videoclubs.getVideoclubs().getFirst().peliMasLarga();
        videoclubs.getVideoclubs().getFirst().directoresRepetidos(0);
        videoclubs.getVideoclubs().getFirst().pelisCortas();
        System.out.println(videoclubs.MayorNumeroPelis().getCodigop());
        videoclubs.PelisPorGenero("Drama");
        videoclubs.DireccionPorComuna(11);

    }
}
