package Sistema_de_bebidas;

import Entidades.Persona;

import javax.swing.*;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Sistema {
    private ArrayList<Cliente> clientes;
    private HashMap<Bebida, Integer> bebidas_disponibles;

    public Sistema(ArrayList<Cliente> clientes, HashMap<Bebida, Integer> bebidas_disponibles) {
        this.clientes = clientes;
        this.bebidas_disponibles = bebidas_disponibles;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public HashMap<Bebida, Integer> getBebidas_disponibles() {
        return bebidas_disponibles;
    }

    public void setBebidas_disponibles(HashMap<Bebida, Integer> bebidas_disponibles) {
        this.bebidas_disponibles = bebidas_disponibles;
    }

    public String mejorHidratacion() throws NoHayClientes{
        if(this.clientes.isEmpty()){
            Cliente p=this.clientes.getFirst();
            for (Cliente c : this.clientes){
                if(c.getHidratacion() > p.getHidratacion()){
                    p=c;
                }
            }
            return p.getNombre();
        }
        else {
            throw new NoHayClientes("No hay clientes");
        }
    }

    public String peorHidratacion() throws NoHayClientes{
        if(this.clientes.isEmpty()){
            Cliente p=this.clientes.getFirst();
            for (Cliente c : this.clientes){
                if(p.getHidratacion() > c.getHidratacion()){
                    p=c;
                }
            }
            return p.getNombre();
        }
        else {
            throw new NoHayClientes("No hay clientes");
        }
    }

    public void agregarCliente(Cliente c){
        try {
            if(this.clientes.contains(c.getDNI())){
                throw new PersonaYaExisteException("Esta persona ya fue ingresada: "+c);
            }
            this.clientes.add(c);
        }
        catch (PersonaYaExisteException exc){
            System.err.println(exc);
        }
    }

    public void clienteQuiereTomar(Cliente c, Bebida b, int cant){
        try{
            int cantidad = this.bebidas_disponibles.get(b);
            if(cantidad-cant >= 0){
                this.bebidas_disponibles.put(b, cantidad - cant);
                c.tomar(b, cant);
            }
            else{
                throw new NoHayStockException("No hay suficiente Stock");
            }
        }
        catch (NoHayStockException exc){
            System.err.println(exc);
        }
    }

    public static void main(String[] args) {
        Cliente c1=new Cliente("Franco", "Callipo", 35000000, new ArrayList<Bebida>());
        Cliente c2=new Cliente("Mati", "Rui", 48000000, new ArrayList<Bebida>());

        Neutra n1=new Neutra("Agua", 20, 0);
        Neutra n2=new Neutra("Soda", 15, 0);
        Azucarada az1=new Azucarada("Coca Cola", 5);
        Azucarada az2=new Azucarada("Sprite", 6);
        Alcoholica al1=new Alcoholica("Cerveza", 4);
        Alcoholica al2=new Alcoholica("Blue Label", 8);

        ArrayList<Cliente> clientes=new ArrayList<>();

        HashMap<Bebida, Integer> bebidas=new HashMap<>();
        bebidas.put(n1, 10);
        bebidas.put(n2, 5);
        bebidas.put(az1, 7);
        bebidas.put(az2, 3);
        bebidas.put(al1, 2);
        bebidas.put(al2, 6);

        Sistema s1=new Sistema(clientes,bebidas);

        s1.agregarCliente(c1);
        s1.agregarCliente(c2);

        s1.clienteQuiereTomar(c1,n1,3);
        s1.clienteQuiereTomar(c1,al1,2);

        s1.clienteQuiereTomar(c2,al2,1);
        s1.clienteQuiereTomar(c2,az2,3);

        System.out.println("Cliente 1, Hidratacion: "+c1.calcularHidratacion());
        System.out.println("Cliente 2, Hidratacion: "+c2.calcularHidratacion());
        try {
            System.out.println("Mejor Hidratacion: " + s1.mejorHidratacion());
            System.out.println("Peor Hidratacion: "+s1.peorHidratacion());
        }catch (NoHayClientes exc){
            System.err.println(exc);
        }
    }
}
