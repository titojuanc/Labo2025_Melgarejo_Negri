package Ej_Recetas;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SistemaPlatillosTest {
    private SistemaPlatillos sistema;
    private PlatoPrincipal pasta;
    private Postre cheesecake;
    private Entrada bruschetta;

    @Before
    public void setUp() {
        sistema = new SistemaPlatillos();

        pasta = new PlatoPrincipal(
                "Pasta Carbonara",
                Dificultad.NORMAL,
                new ArrayList<>(Arrays.asList(
                        "Hervir la pasta en agua con sal.",
                        "Freír panceta hasta que esté crujiente.",
                        "Mezclar huevos, queso parmesano y pimienta.",
                        "Integrar todo con la pasta caliente."
                )),
                20,
                4
        );

        cheesecake = new Postre(
                "Cheesecake de Frutos Rojos",
                Dificultad.NORMAL,
                new ArrayList<>(Arrays.asList(
                        "Triturar galletas y mezclar con mantequilla derretida.",
                        "Hornear la base por 10 minutos.",
                        "Batir queso crema, azúcar y huevos.",
                        "Verter sobre la base y hornear a baño María.",
                        "Decorar con mermelada de frutos rojos."
                )),
                180,
                false
        );

        bruschetta = new Entrada(
                "Bruschetta de Tomate",
                Dificultad.FACIL,
                new ArrayList<>(Arrays.asList(
                        "Tostar pan baguette.",
                        "Mezclar tomate picado con albahaca, ajo y aceite de oliva.",
                        "Colocar la mezcla sobre el pan.",
                        "Servir inmediatamente."
                )),
                TemperaturaServido.FRIO
        );

        sistema.agregarPlatillo(pasta);
        sistema.agregarPlatillo(cheesecake);
        sistema.agregarPlatillo(bruschetta);
    }

    @Test
    public void testAgregarPlatillo() {
        int cantidadInicial = sistema.cantidadPlatillos();
        PlatoPrincipal nuevoPlato = new PlatoPrincipal(
                "Risotto",
                Dificultad.DIFICL,
                new ArrayList<>(),
                30,
                2
        );

        sistema.agregarPlatillo(nuevoPlato);
        assertEquals(cantidadInicial + 1, sistema.cantidadPlatillos());
    }

    @Test
    public void testEliminarPlatillo() {
        int cantidadInicial = sistema.cantidadPlatillos();
        sistema.eliminarPlatillo(pasta);
        assertEquals(cantidadInicial - 1, sistema.cantidadPlatillos());
    }

    @Test
    public void testModificarPlatillo() {
        PlatoPrincipal nuevaPasta = new PlatoPrincipal(
                "Pasta Alfredo",
                Dificultad.NORMAL,
                new ArrayList<>(),
                25,
                4
        );

        sistema.modificarPlatillo(pasta, nuevaPasta);
        assertTrue(sistema.getPlatillos().contains(nuevaPasta));
        assertFalse(sistema.getPlatillos().contains(pasta));
    }

    @Test
    public void testCantidadPlatillos() {
        assertEquals(3, sistema.cantidadPlatillos());
    }

    @Test
    public void testPlatillosSegunDificultad() {
        // Este test verifica el conteo, ya que System.out no se puede testear directamente
        ArrayList<Platillo> platillosFaciles = new ArrayList<>();
        for (Platillo p : sistema.getPlatillos()) {
            if (p.getDificultad().equals(Dificultad.FACIL)) {
                platillosFaciles.add(p);
            }
        }
        assertEquals(1, platillosFaciles.size());
    }

    @Test
    public void testPlatillosSegunTipo() {
        // Similar al anterior, verificamos el conteo
        ArrayList<Platillo> postres = new ArrayList<>();
        for (Platillo p : sistema.getPlatillos()) {
            if (p.getClass().getSimpleName().equals("Postre")) {
                postres.add(p);
            }
        }
        assertEquals(1, postres.size());
    }

    @Test
    public void testPlatilloMayorPasos() {
        // El cheesecake tiene 5 pasos, la pasta 4 y la bruschetta 4
        assertEquals("Cheesecake de Frutos Rojos", sistema.platilloMayorPasos().getNombre());

        // Agregamos un plato con más pasos
        PlatoPrincipal paella = new PlatoPrincipal(
                "Paella Valenciana",
                Dificultad.DIFICL,
                new ArrayList<>(Arrays.asList(
                        "Paso 1", "Paso 2", "Paso 3", "Paso 4", "Paso 5", "Paso 6"
                )),
                45,
                6
        );
        sistema.agregarPlatillo(paella);
        assertEquals("Paella Valenciana", sistema.platilloMayorPasos().getNombre());
    }

    @Test
    public void testGetSetPlatillos() {
        ArrayList<Platillo> nuevaLista = new ArrayList<>();
        nuevaLista.add(pasta);

        sistema.setPlatillos(nuevaLista);
        assertEquals(1, sistema.getPlatillos().size());
        assertSame(nuevaLista, sistema.getPlatillos());
    }
}