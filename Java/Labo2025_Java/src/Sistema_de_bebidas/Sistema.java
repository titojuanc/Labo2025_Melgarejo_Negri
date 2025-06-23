package Sistema_de_bebidas;

import Entidades.Persona;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;

public class Sistema {
    private ArrayList<Cliente> clientes;
    private ArrayList<Bebida> bebidas_disponibles;

    public Sistema(ArrayList<Cliente> clientes, ArrayList<Bebida> bebidas_disponibles) {
        this.clientes = clientes;
        this.bebidas_disponibles = bebidas_disponibles;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Bebida> getBebidas_disponibles() {
        return bebidas_disponibles;
    }

    public void setBebidas_disponibles(ArrayList<Bebida> bebidas_disponibles) {
        this.bebidas_disponibles = bebidas_disponibles;
    }

    public String mejorHidratacion(){
        Cliente p=this.clientes.getFirst();
        for (Cliente c : this.clientes){
            if(c.getHidratacion() > p.getHidratacion()){
                p=c;
            }
        }
        return p.getNombre();
    }

    public String peorHidratacion(){
        Cliente p=this.clientes.getFirst();
        for (Cliente c : this.clientes){
            if(p.getHidratacion() > c.getHidratacion()){
                p=c;
            }
        }
        return p.getNombre();
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
        Collections.addAll(clientes, c1,c2);

        ArrayList<Bebida> bebidas=new ArrayList<>();
        Collections.addAll(bebidas, n1,n2,az1,az2,al1,al2);

        Sistema s1=new Sistema(clientes,bebidas);

        c1.tomar(n1,3);
        c1.tomar(al1,2);

        c2.tomar(al2,1);
        c2.tomar(az2,3);

        System.out.println("Cliente 1, Hidratacion: "+c1.calcularHidratacion());
        System.out.println("Cliente 2, Hidratacion: "+c2.calcularHidratacion());
        System.out.println("Mejor Hidratacion: "+s1.mejorHidratacion());
        System.out.println("Peor Hidratacion: "+s1.peorHidratacion());
    }
}
