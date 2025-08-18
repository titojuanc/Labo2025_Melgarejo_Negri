/*package Sistema_de_bebidas;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;

public class SistemaTest {
    private Cliente c1,c2;
    private Bebida n1,n2,al1,al2,az1,az2;
    private Sistema s1;

    @Before
    public void setUp(){
         c1=new Cliente("Franco", "Callipo", 35000000, new ArrayList<Bebida>());
         c2=new Cliente("Mati", "Rui", 48000000, new ArrayList<Bebida>());

         n1=new Neutra("Agua", 20, 0);
         n2=new Neutra("Soda", 15, 0);
         az1=new Azucarada("Coca Cola", 5);
         az2=new Azucarada("Sprite", 6);
         al1=new Alcoholica("Cerveza", 4);
         al2=new Alcoholica("Blue Label", 8);

        ArrayList<Cliente> clientes=new ArrayList<>();
        Collections.addAll(clientes, c1,c2);

        ArrayList<Bebida> bebidas=new ArrayList<>();
        Collections.addAll(bebidas, n1,n2,az1,az2,al1,al2);

        c1.tomar(n1,3);
        c1.tomar(al1,2);

        c2.tomar(al2,1);
        c2.tomar(az2,3);

         s1=new Sistema(clientes,bebidas);

        c1.calcularHidratacion();
        c2.calcularHidratacion();
    }

    @Test
    public void testBeibidasSistema(){
        assertEquals(6,s1.getBebidas_disponibles().size());
    }

    @Test
    public void testMejorHidratacion(){
        assertEquals("Franco", s1.mejorHidratacion());
        assertEquals(-100.0, c1.getHidratacion(), -100.0);
    }

    @Test
    public void testPeorHidratacion(){
        assertEquals("Mati", s1.peorHidratacion());
        assertEquals(-337, c2.getHidratacion(), -337);
    }
}
*/