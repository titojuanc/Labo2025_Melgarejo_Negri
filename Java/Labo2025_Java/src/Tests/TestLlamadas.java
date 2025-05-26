package Tests;

import Entidades.Empleado;
import Sistemas.SistemaLlamadas;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class TestLlamadas {
    private SistemaLlamadas sistema;
    private Empleado e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;
    @Before
            public void setUp(){
        sistema = new SistemaLlamadas();
         e1 = new Empleado("Tomas", "Garayzar", 17, 48652715, "Argentina", 1);
         e2 = new Empleado("Ana", "López", 25, 12345678, "Argentina", 2);
         e3 = new Empleado("Carlos", "Gómez", 30, 87654321, "Brasil", 3);
         e4 = new Empleado("Luisa", "Martínez", 22, 11223344, "Chile", 4);
         e5 = new Empleado("Pedro", "Silva", 28, 55667788, "Colombia", 5);
         e6 = new Empleado("María", "Rodríguez", 19, 99887766, "Perú", 6);
         e7 = new Empleado("Jorge", "Fernández", 35, 44332211, "Uruguay", 7);
         e8 = new Empleado("Lucía", "Pérez", 27, 77889900, "Argentina", 8);
         e9 = new Empleado("Diego", "Hernández", 31, 66554433, "Paraguay", 9);
         e10 = new Empleado("Valeria", "Díaz", 24, 22334455, "Chile", 10);
        Collections.addAll(sistema.getEmpleados(), e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);
    }

    @Test
            public void testRegistroLlamadas(){
        sistema.realizarLlamada(e1, 2, 90);
        assertEquals(1, sistema.getLlamadas().size());
        sistema.realizarLlamada(e3, 5, 15);
        assertEquals(2, sistema.getLlamadas().size());
        sistema.realizarLlamada(e2, 7, 30);
        assertEquals(3, sistema.getLlamadas().size());
        sistema.realizarLlamada(e4, 10, 45);
        assertEquals(4, sistema.getLlamadas().size());
        sistema.realizarLlamada(e5, 1, 60);
        assertEquals(5, sistema.getLlamadas().size());
        sistema.realizarLlamada(e6, 3, 10);
        assertEquals(6, sistema.getLlamadas().size());
        sistema.realizarLlamada(e8, 4, 25);
        assertEquals(7, sistema.getLlamadas().size());
        sistema.realizarLlamada(e7, 9, 50);
        assertEquals(8, sistema.getLlamadas().size());
        sistema.realizarLlamada(e10, 6, 5);
        assertEquals(9, sistema.getLlamadas().size());
        sistema.realizarLlamada(e9, 8, 120);
        assertEquals(10, sistema.getLlamadas().size());
        assertEquals(1, sistema.numeroLlamadasPorEmpleado(e1));
    }
}

