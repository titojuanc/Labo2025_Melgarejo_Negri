package Sistemas;

import Objetos.Producto;

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
}
