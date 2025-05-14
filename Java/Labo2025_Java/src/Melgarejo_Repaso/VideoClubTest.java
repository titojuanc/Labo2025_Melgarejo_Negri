package Melgarejo_Repaso;

import Sistemas.VideoclubSistema;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class VideoClubTest {
    Videoclub videoclub = new Videoclub();
    ArrayList<Estanteria> estanterias = new ArrayList<>();
    ArrayList<Videoclub> videoclubs1 = new ArrayList<>();
    VideoclubSistema videoclubs = new VideoclubSistema(videoclubs1);

    @BeforeEach
    public void setUp(){
        estanterias.add(new Estanteria(new ArrayList<>()));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 1", "Accion", 90));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 2", "Drama", 100));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 3", "Sci-fi", 10));
        estanterias.add(new Estanteria(new ArrayList<>()));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 4", "Accion", 500));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 5", "Drama", 10000));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 6", "Sci-fi", 110));
        estanterias.add(new Estanteria(new ArrayList<>()));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 7", "Accion", 10));
        estanterias.getLast().addPeli(new Pelicula("Pelicula 8", "Drama", 100));
        videoclub.setEstanterias(estanterias);
        videoclubs1.add(videoclub);
    }

    @Test
    public void testCantidad(){
        assertEquals(3, estanterias.getFirst().cantPeliculas());
    }

    @Test
    public void testEdadActor(){
        assertEquals("Javier", estanterias.getFirst().getPeli(0).actorMayorEdad().getNombre());
    }

    @Test
    public void testMayorNumeroPelisVC(){
        assertEquals(1419, videoclubs.MayorNumeroPelis().getCodigop());
    }
}

