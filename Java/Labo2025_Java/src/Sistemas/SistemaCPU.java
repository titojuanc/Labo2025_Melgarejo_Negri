package Sistemas;

import Entidades.Cliente;
import Objetos.Componente;
import Utilidad.Compra;

import java.util.ArrayList;
import java.util.Collections;

/* Se podría haber implementado herencias en clases Salida, Entrada y CPU
    que vengan de Componente */

public class SistemaCPU {
    private ArrayList<Compra> compras;
    private ArrayList<Componente> carrito;
    private ArrayList<Componente> listado;

    public SistemaCPU(){
        this.compras= new ArrayList<>();
        this.carrito= new ArrayList<>();
        this.listado= new ArrayList<>();
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    public ArrayList<Componente> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<Componente> carrito) {
        this.carrito = carrito;
    }

    public ArrayList<Componente> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Componente> listado) {
        this.listado = listado;
    }

    public void mostrarCarrito(){
        for (Componente componente : this.carrito){
            System.out.println("-"+componente.getModelo());
        }
    }

    public void agregarAlCarrito(Componente componente){
        if(this.listado.contains(componente)){
            if (componente.getStock()>0){
                this.carrito.add(componente);
                System.out.println("Componente "+componente.getModelo()+" agregado al carrito.");
            }
            else {
                System.out.println("Lo sentimos, no tenemos stock disponible.");
            }
        }
        else {
            System.out.println("Error, ese producto no está en nuestro listado");
        }
    }

    public void eliminarDelCarrito(Componente componente){
        this.carrito.remove(componente);
        System.out.println("Componente "+componente.getModelo()+" eliminado del carrito.");
    }

    public void comprar(Cliente cliente){
        boolean tieneCPU = false;
        for (Componente componente : this.carrito){
            if (componente.getStock()>0){
                if(componente.getTipo()=="CPU"){
                    tieneCPU=true;
                }
            }
            else {
                System.out.println("Error, el componente "+componente.getModelo()+" no tiene stock.");
                return;
            }
        }
        if (tieneCPU){
            Compra compra = new Compra(cliente);
            for (Componente componente : this.carrito){
                compra.sumarComponente(componente);
                componente.setStock(componente.getStock()-1);
            }
            this.compras.add(compra);
            carrito.clear();
            System.out.println("¡Compra realizada con éxito!");
        }
        else {
            System.out.println("Error, no hay ningún CPU en el carrito");
        }
    }

    public static void main(String[] args) {
        SistemaCPU sistema = new SistemaCPU();
        ArrayList<Componente> componentes = new ArrayList<>();
        Componente c1 = new Componente("HP", "Pavilion 500", 299.99, 10, "Impresora");
        Componente c2 = new Componente("Logitech", "MX Master 3", 89.99, 15, "Mouse");
        Componente c3 = new Componente("Razer", "BlackWidow", 149.99, 8, "Teclado");
        Componente c4 = new Componente("Dell", "UltraSharp 27", 399.99, 0, "Pantalla");  // Stock 0
        Componente c5 = new Componente("Intel", "Core i9-13900K", 549.99, 5, "CPU");
        Componente c6 = new Componente("Epson", "EcoTank ET-3850", 249.99, 7, "Impresora");
        Componente c7 = new Componente("Microsoft", "Surface Mouse", 59.99, 20, "Mouse");
        Componente c8 = new Componente("Corsair", "K95 RGB Platinum", 199.99, 3, "Teclado");
        Componente c9 = new Componente("Samsung", "Odyssey G7", 699.99, 4, "Pantalla");
        Componente c10 = new Componente("AMD", "Ryzen 9 7950X", 499.99, 6, "CPU");
        Collections.addAll(componentes, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10);
        sistema.setListado(componentes);

        Cliente cliente1 = new Cliente("Salvador", "Lopez Calo", 16, "Tarjeta", 1534420897);
        Cliente cliente2 = new Cliente("Gabriel", "Messina", 17, "SUBE", 153428240);
        sistema.agregarAlCarrito(c10);
        sistema.agregarAlCarrito(c1);
        sistema.agregarAlCarrito(c4);
        sistema.agregarAlCarrito(c7);

        sistema.mostrarCarrito();

        sistema.comprar(cliente1);

        sistema.agregarAlCarrito(c9);
        sistema.agregarAlCarrito(c3);
        sistema.agregarAlCarrito(c2);
        sistema.agregarAlCarrito(c1);

        sistema.comprar(cliente2);

        sistema.agregarAlCarrito(c10);

        sistema.comprar(cliente2);

        System.out.println(sistema.getCompras().getFirst().total());

        sistema.getCompras().getFirst().cantidadPerifericos();
    }
}
