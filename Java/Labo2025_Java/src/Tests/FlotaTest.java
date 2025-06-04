package Tests;

import Enumeraciones.Colores;
import Objetos.Camioneta;
import Objetos.Coche;
import Sistemas.FlotaSistema;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Collections;

public class FlotaTest {
    FlotaSistema flota = new FlotaSistema();
    Camioneta cam1, cam2, cam3, cam4, cam5, cam6;
    @Before
    public void setUp() {
        Coche c1 = new Coche("Volkswagen", "Virtus", Colores.GRIS, 4, 2007, "AD 054 PB", false);
        Coche c2 = new Coche("Toyota", "Corolla", Colores.GRIS, 4, 2020, "XY 123 AB", false);
        Coche c3 = new Coche("Ford", "Mustang", Colores.GRIS, 4, 2015, "MT 789 CD", true);  // Descapotable
        Coche c4 = new Coche("Tesla", "Model 3", Colores.GRIS, 4, 2023, "EL 456 TF", false);
        Coche c5 = new Coche("Fiat", "500", Colores.GRIS, 4, 2018, "FI 500 FI", true);  // Descapotable
        Coche c6 = new Coche("BMW", "Serie 5", Colores.GRIS, 4, 2019, "BM 007 WX", false);

        cam1 = new Camioneta("Toyota", "Hilux", Colores.GRIS, 4, 2022, "TR 202 HK", 1000);  // Carga máxima: 1000 kg
        cam2 = new Camioneta("Ford", "Ranger", Colores.GRIS, 4, 2020, "FR 456 LD", 1200);
        cam3 = new Camioneta("Chevrolet", "S10", Colores.GRIS, 4, 2021, "CS 789 SX", 950);
        cam4 = new Camioneta("Nissan", "Frontier", Colores.GRIS, 4, 2019, "NF 321 PT", 1100);
        cam5 = new Camioneta("Volkswagen", "Amarok", Colores.GRIS, 4, 2023, "VA 555 RT", 1300);
        cam6 = new Camioneta("Mitsubishi", "L200", Colores.GRIS, 4, 2018, "ML 200 ST", 800);

        Collections.addAll(flota.getVehiculos(), c1, c2, c3, c4, c5, c6, cam1, cam2, cam3, cam4, cam5, cam6);
    }

        @Test
    public void testVehiculoMasPresente(){
        assertEquals("Hay igual cantidad de camionetas que de coches", flota.vehiculoMasPresente());
    }

        @Test
    public void testCarga(){
            cam1.anadirCarga(500);
            assertEquals(500 ,cam1.getCarga());
            cam1.anadirCarga(9999);
            assertEquals(500, cam1.getCarga());
    }

        @Test
    public void testPorcentaje(){
        assertEquals((double) 1 /3*100, flota.PorcentajeDescapotables(), (double) 1/3);
    }


}



