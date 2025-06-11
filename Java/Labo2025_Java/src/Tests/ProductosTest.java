package Tests;
import Enumeraciones.Tecnologia;
import Objetos.Cargador;
import Dispositivos.EquipoSonido;
import Objetos.Producto;
import Dispositivos.Televisor;
import Sistemas.SistemaProductos;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class ProductosTest {
    SistemaProductos sistema = new SistemaProductos();
    Producto p1 = new Televisor("Samsung", 500, 5, Tecnologia.FULLHD);
    Televisor p2 = new Televisor("TVC", 600, 10, Tecnologia.ULTRAHD);
    EquipoSonido p3 = new EquipoSonido("JBL", 200, 4, true);
    Cargador p4 = new Cargador("Motorola", 50, 40, 3);


    @Before
    public void setUp() {
        sistema.agregarProducto(p1);
        sistema.agregarProducto(p2);
        sistema.agregarProducto(p3);
        sistema.agregarProducto(p4);
    }

    @Test
    public void testCantidad(){
        assertEquals(sistema.tamañoCarrito(), 4);
    }

    @Test
    public void TestMayorMenor(){
        assertEquals(p4, sistema.mayorStock());
        assertEquals(p3, sistema.menorStock());
    }
}