package Tests;


import Entidades.Cliente;
import Objetos.Componente;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class TestCPU {
    private ArrayList<Compra> compras;
    private ArrayList<Componente> carrito;
    private ArrayList<Componente> listado;
    private SistemaCPU sistema;
    private Componente c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    @Before
    public void setUp() {
        sistema = new SistemaCPU();
        ArrayList<Componente> componentes = new ArrayList<>();
        c1 = new Componente("HP", "Pavilion 500", 299.99, 10, "Impresora");
        c2 = new Componente("Logitech", "MX Master 3", 89.99, 15, "Mouse");
          c3 = new Componente("Razer", "BlackWidow", 149.99, 8, "Teclado");
          c4 = new Componente("Dell", "UltraSharp 27", 399.99, 0, "Pantalla");  // Stock 0
          c5 = new Componente("Intel", "Core i9-13900K", 549.99, 5, "CPU");
          c6 = new Componente("Epson", "EcoTank ET-3850", 249.99, 7, "Impresora");
          c7 = new Componente("Microsoft", "Surface Mouse", 59.99, 20, "Mouse");
          c8 = new Componente("Corsair", "K95 RGB Platinum", 199.99, 3, "Teclado");
          c9 = new Componente("Samsung", "Odyssey G7", 699.99, 4, "Pantalla");
          c10 = new Componente("AMD", "Ryzen 9 7950X", 499.99, 6, "CPU");
        Collections.addAll(componentes, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10);
        sistema.setListado(componentes);
        Cliente cliente2 = new Cliente("Gabriel", "Messina", 17, "SUBE", 153428240);
    }

    @Test
    public void comprar(){
        Cliente cliente1 = new Cliente("Salvador", "Lopez Calo", 16, "Tarjeta", 1534420897);
        sistema.agregarAlCarrito(c10);
        assertEquals(1, sistema.getCarrito().size());
        sistema.agregarAlCarrito(c1);
        assertEquals(2, sistema.getCarrito().size());
        sistema.agregarAlCarrito(c4);
        assertEquals(2, sistema.getCarrito().size());
        sistema.agregarAlCarrito(c7);
        assertEquals(3, sistema.getCarrito().size());
        sistema.comprar(cliente1);
        assertEquals(1, sistema.getCompras().size());
        assertEquals(902.9685000000001, sistema.getCompras().getFirst().total(),902.9685000000001 );
        assertEquals("Salvador", sistema.getCompras().getFirst().getCliente().getNombre());
    }
}

