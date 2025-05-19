package Utilidad;

import Entidades.Cliente;
import Objetos.Componente;

import java.util.ArrayList;
import java.util.Collections;

public class Compra {
    private ArrayList<Componente> componentes;
    private Cliente cliente;

    public Compra(ArrayList<Componente> componentes, Cliente cliente){
        this.componentes=componentes;
        this.cliente=cliente;
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
}


