package Tests;

import Dispositivos.*;
import Sistemas.SistemaAlarmasEdificio;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import static org.junit.Assert.*;

public class SistemaAlarmasEdificioTest {
    DetectorHumo h1,h2,h3;
    SensorPresion p1,p2,p3;
    SensorTemperatura t1,t2,t3;
    SensorCompuesto c1;
    ArrayList<Sensor> sensores1, sistema_s;
    SistemaAlarmasEdificio sistema1;

    @Before
    public void setUp(){
         h1=new DetectorHumo(true,120,100, LocalDate.now());
         h2=new DetectorHumo(true,20,100,LocalDate.now());
         h3=new DetectorHumo(false,120,100,LocalDate.now());

         t1=new SensorTemperatura(true,120,100,LocalDate.now());
         t2=new SensorTemperatura(true,20,100,LocalDate.now());
         t3=new SensorTemperatura(true,140,100,LocalDate.now());

         p1=new SensorPresion(true,120,100,LocalDate.now());
         p2=new SensorPresion(true,20,100,LocalDate.now());
         p3=new SensorPresion(true, 120, 100, LocalDate.now());

         sensores1 = new ArrayList<>();
        Collections.addAll(sensores1, h3,t3,p3,h2);

         c1=new SensorCompuesto(true,120,100,LocalDate.now(),sensores1);

         sistema_s=new ArrayList<>();

        Collections.addAll(sistema_s,h1,t1,p1,t2,p2,c1);

         sistema1=new SistemaAlarmasEdificio(sistema_s);
    }

    @Test
    public void testMedir(){
        assertEquals("Llamando a los Bomberos",h1.imprimirDeteccion());
        assertEquals("¡Cuidado! La temperatura sube", t1.imprimirDeteccion());
        assertEquals("Sensor de presión activado", p1.imprimirDeteccion());

        assertEquals( "Sensor Apagado",h3.imprimirDeteccion());

        assertEquals(6,sistema1.Medir());
    }
}
