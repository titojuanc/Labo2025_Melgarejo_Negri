package Ej_Drones;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import Ej_Drones.*;
import Enumeraciones.Estado;
import org.junit.jupiter.api.BeforeEach;

public class SistemaDronesTest {
    private SistemaDrones sistema;
    private DronSeguridad vigilante1;
    private DronCarga transportador1;

    @Before
    public void setUp() {
        sistema = new SistemaDrones();
        vigilante1 = new DronSeguridad("DJI-Mavic-Vigilante", LocalDate.of(2023, 5, 15), 128);
        transportador1 = new DronCarga("DJI-Matrice-600-Pro", LocalDate.of(2021, 8, 22), 5);
        sistema.agregarDron(vigilante1);
        sistema.agregarDron(transportador1);
    }

    @Test
    public void testAgregarDron() {
        DronSeguridad nuevoDron = new DronSeguridad("Nuevo-Modelo", LocalDate.now(), 256);
        sistema.agregarDron(nuevoDron);
        assertEquals(3, sistema.getDrones().size());
    }

    @Test
    public void testEliminarDron() {
        sistema.eliminarDron(vigilante1);
        assertEquals(1, sistema.getDrones().size());
    }

    @Test
    public void testIniciarMision() {
        sistema.empezarMision("DJI-Mavic-Vigilante", -34.577820, -58.502860);
        assertEquals(Estado.EN_VUELO, vigilante1.getEstado());
    }

    @Test
    public void testFinalizarMision() {
        sistema.empezarMision("DJI-Mavic-Vigilante", -34.577820, -58.502860);
        sistema.finalizarMision("DJI-Mavic-Vigilante");
        assertEquals(Estado.INACTIVO, vigilante1.getEstado());
    }

    @Test
    public void testIniciarMantenimiento() {
        sistema.iniciarMantenimiento("DJI-Mavic-Vigilante");
        assertEquals(Estado.MANTENIMIENTO, vigilante1.getEstado());
    }

    @Test
    public void testTerminarMantenimiento() {
        sistema.iniciarMantenimiento("DJI-Mavic-Vigilante");
        sistema.terminarMantenimiento("DJI-Mavic-Vigilante");
        assertEquals(Estado.INACTIVO, vigilante1.getEstado());
    }

    @Test
    public void testRecargarBateria() {
        transportador1.setNivelCarga(30);
        transportador1.recargarBateria();
        assertEquals(40, transportador1.getNivelCarga());

        transportador1.setNivelCarga(15);
        transportador1.recargarBateria();
        assertEquals(100, transportador1.getNivelCarga());

        transportador1.setNivelCarga(95);
        transportador1.recargarBateria();
        assertEquals(100, transportador1.getNivelCarga());
    }

    @Test
    public void testDistanciaEnKm() {
        double distancia = transportador1.distanciaEnKm(-34.573195, -58.504111);
        assertEquals(0.0, distancia, 0.1);

        distancia = transportador1.distanciaEnKm(-34.577820, -58.502860);
        assertTrue(distancia < 1.0);
    }

    @Test
    public void testModificarDron() {
        DronCarga nuevoTransportador = new DronCarga("DJI-Matrice-Nuevo", LocalDate.now(), 10);
        sistema.modificarDron(transportador1, nuevoTransportador);

        boolean encontrado = false;
        for (Dron d : sistema.getDrones()) {
            if (d.getModelo().equals("DJI-Matrice-Nuevo")) {
                encontrado = true;
                break;
            }
        }
        assertTrue(encontrado);
    }
}