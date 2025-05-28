package Utilidad;

import Entidades.Cliente;
import Objetos.Componente;

import java.util.ArrayList;
import java.util.Collections;

public class Compra {
    private ArrayList<Componente> componentes;
    private Cliente cliente;

    public Compra(Cliente cliente){
        this.componentes=new ArrayList<>();
        this.cliente=cliente;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void sumarComponente(Componente componente){
        this.componentes.add(componente);
    }

    public double total(){
        double precioTotal=0;
        for (Componente componente : this.componentes){
            precioTotal=precioTotal+(componente.getPrecio());
        }
        if (this.cliente.getMetodo()=="Tarjeta"){
            return precioTotal*1.05;
        }
        else {
            return precioTotal;
        }

    }

    public void cantidadPerifericos(){
        int cantEntrada=0;
        int cantSalida=0;
        for (Componente componente : this.componentes){
            if (componente.getTipo() == "Teclado" || componente.getTipo()=="Mouse"){
                cantEntrada++;
            }
            else if (componente.getTipo() == "Impresora" || componente.getTipo()=="Pantalla"){
                cantSalida++;
            }
        }
        System.out.println("Cantidad de componentes de entrada: "+cantEntrada);
        System.out.println("Cantidad de componentes de salida: "+cantSalida);
    }

    /* Realmente hacer herencias acá es casi imperceptible.
    Si se quieren agregar nuevos tipos de periféricos,
    se agregan al IF correspondiente
    ya que la distinción entre entrada y salida se ve solo acá. */

}


