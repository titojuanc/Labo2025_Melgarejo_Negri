package Tests;

import Entidades.*;
import Sistemas.SistemaMascotas;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class SistemaMascotasTest {
    private SistemaMascotas sistema;
    private Pez gluglu;
    private Gato silly;
    private Perro dogy;
    private Pajaro pio;
    private Duenio duenio1;
    private Duenio duenio2;

    @Before
    public void setUp(){
        ArrayList<Mascota> mascotas = new ArrayList<>();
        duenio1 = new Duenio("Carlos", "Caserios", 50);
        duenio2 = new Duenio("Lara", "Giménez", 19);
        gluglu= new Pez("Perla", duenio1);
        silly = new Gato("Tom", duenio1);
        dogy = new Perro("Tobi", duenio2);
        pio = new Pajaro("Rio", duenio2, true);
        Collections.addAll(mascotas, gluglu, silly, dogy);
        sistema = new SistemaMascotas(mascotas);
    }

    @Test
    public void TestAlimentar(){
        gluglu.alimentar();
        assertEquals(11, gluglu.getVidas());
        silly.alimentar();
        //*no hace nada*
        dogy.alimentar();
        assertEquals(2, dogy.getAlegria());
        pio.alimentar();
        //*no hace nada*
    }

    @Test
    public void TestSaludar(){
        gluglu.saludar(duenio1);
        assertEquals(9, gluglu.getVidas());
        gluglu.saludar(duenio2);
        assertEquals(0, gluglu.getVidas());
        silly.alimentar();
        silly.alimentar();
        silly.alimentar();
        silly.saludar(duenio1);
        assertEquals(3, silly.getAlegria());
        dogy.alimentar();
        dogy.alimentar();
        dogy.alimentar();
        dogy.saludar(duenio2);
        assertEquals(3, dogy.getAlegria());
        pio.alimentar();
        pio.alimentar();
        pio.alimentar();
        pio.saludar(duenio2);
        assertEquals(3, pio.getAlegria());
    }
}
