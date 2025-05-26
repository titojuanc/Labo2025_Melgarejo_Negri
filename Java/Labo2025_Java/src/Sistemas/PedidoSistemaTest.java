package Sistemas;

import Entidades.Alumno;
import Entidades.Profesor;
import Objetos.Plato;
import Utilidad.Pedido;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class PedidoSistemaTest {
    ArrayList<Pedido> pedidos;
    ArrayList<Plato> platos_ofrece, platos1, platos2;
    Alumno alumno;
    Profesor profesor;
    Plato plato1, plato2, plato3, plato4;
    Pedido pedido1, pedido2;
    PedidoSistema sistema;

    @Before
    public void setUp() {
        alumno = new Alumno("Juan Cruz", "Melgarejo", "3C");
        profesor = new Profesor("Franco", "Calippo", 15);

        plato1 = new Plato("Hamburguesa", 8000);
        plato2 = new Plato("Pizza", 12000);
        plato3 = new Plato("Milanesa", 10000);
        plato4 = new Plato("Tarta", 7000);

        platos1 = new ArrayList<>();
        platos1.add(plato1);
        platos1.add(plato2);

        platos2 = new ArrayList<>();
        platos2.add(plato3);
        platos2.add(plato4);

        pedido1 = new Pedido(LocalDate.now(), platos1, alumno, LocalTime.now(), "En Produccion");
        pedido2 = new Pedido(LocalDate.of(2022,2,2), platos2, profesor, LocalTime.now(), "En Produccion");

        pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);

        platos_ofrece = new ArrayList<>();
        Collections.addAll(platos_ofrece, plato1, plato2, plato3, plato4);

        sistema = new PedidoSistema(pedidos, platos_ofrece);
    }

    @Test
    public void testAgregarPlato(){
        int p1_size=pedido1.getPlato().size();
        pedido1.agregarPlato(plato4);
        assertEquals(p1_size+1,pedido1.getPlato().size());
    }
    @Test
    public void testEliminarPlato(){
        pedido1.agregarPlato(plato4);
        assertTrue(pedido1.getPlato().contains(plato4));
        pedido1.eliminarPlato(plato4);
        assertFalse(pedido1.getPlato().contains(plato4));
    }
    @Test
    public void testListaPlatos(){
        ArrayList<Pedido> ped=new ArrayList<>();
        ped=sistema.listaPlatos(LocalDate.now());
        assertEquals(2, ped.getFirst().getPlato().size());
    }
    @Test
    public void testPrecio(){
        double precioA=0, precioP=0;
        for (Plato p:pedido1.getPlato()){
            precioA+=p.getPrecio();
        }
        for (Plato p:pedido2.getPlato()){
            precioP+=p.getPrecio();
        }

        assertEquals(20000,precioA,20000);
        assertEquals(14450,precioP,14450);
    }
    @Test
    public void testTop3Platos() {
        ArrayList<Plato> top3 = sistema.top3Platos();

        assertNotNull(top3);
        assertEquals(3, top3.size());

        for (Plato plato : top3) {
            assertTrue(platos_ofrece.contains(plato));
        }
    }
    @Test
    public void testPorcentajeDescuento() {
        assertEquals(15,profesor.getPorcentaje_descuento(),15);
    }
}
