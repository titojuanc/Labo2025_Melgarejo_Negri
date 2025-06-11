package Sistemas;

import Enumeraciones.Tecnologia;
import Objetos.Cargador;
import Dispositivos.EquipoSonido;
import Objetos.Producto;
import Dispositivos.Televisor;

import java.util.ArrayList;

public class SistemaProductos {
    private ArrayList<Producto> productos;

    public SistemaProductos(){
       this.productos= new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    public void eliminarProducto(Producto producto){
        this.productos.remove(producto);
    }

    public int tamañoCarrito(){
        return this.productos.size();
    }

    public Producto mayorStock(){
        Producto mayorStock= this.productos.getFirst();
        for (Producto p : this.productos){
            if(p.getStock()>mayorStock.getStock()){
                mayorStock=p;
            }
        }
        return mayorStock;
    }

    public Producto menorStock(){
        Producto menorStock= this.productos.getFirst();
        for (Producto p : this.productos){
            if(p.getStock()<menorStock.getStock()){
                menorStock=p;
            }
        }
        return menorStock;
    }

    public static void main(String[] args) {
        SistemaProductos sistema = new SistemaProductos();
        Televisor p1 = new Televisor("Samsung", 500, 5, Tecnologia.FULLHD);
        Televisor p2= new Televisor("TVC", 600, 10, Tecnologia.ULTRAHD);
        EquipoSonido p3= new EquipoSonido("JBL", 200, 4, true);
        Cargador p4= new Cargador("Motorola", 50, 40, 3);

        sistema.agregarProducto(p1);
        sistema.agregarProducto(p2);
        sistema.agregarProducto(p3);
        sistema.agregarProducto(p4);
        System.out.println(sistema.mayorStock().getNombre());
        System.out.println(sistema.menorStock().getNombre());
    }
}


