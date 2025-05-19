package Sistemas;

import Entidades.Cliente;
import Objetos.Componente;
import Utilidad.Compra;

import java.util.ArrayList;

public class SistemaCPU {
    private ArrayList<Compra> compras;
    private ArrayList<Componente> carrito;
    private ArrayList<Componente> listado;

    public SistemaCPU(){
        this.compras= new ArrayList<>();
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
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
            compras.add(new Compra(this.carrito, cliente));
            for (Componente componente : this.carrito){
                componente.setStock(componente.getStock()-1);
            }
            carrito.clear();
        }
        else {
            System.out.println("Error, no hay ningún CPU en el carrito");
        }
    }

    public static void main(String[] args) {

    }
}
