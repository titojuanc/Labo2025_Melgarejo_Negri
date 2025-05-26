package Sistemas;

import Entidades.Alumno;
import Entidades.Persona;
import Entidades.Profesor;
import Objetos.Plato;
import Utilidad.Pedido;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

public class PedidoSistema {
    private ArrayList<Pedido> pedidos;
    private ArrayList<Plato> platos_ofrece;

    public PedidoSistema(ArrayList<Pedido> pedidos, ArrayList<Plato> platos_ofrece) {
        this.pedidos = pedidos;
        this.platos_ofrece=platos_ofrece;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Plato> getPlatos_ofrece() {
        return platos_ofrece;
    }

    public void setPlatos_ofrece(ArrayList<Plato> platos_ofrece) {
        this.platos_ofrece = platos_ofrece;
    }

    public void agregarPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }

    public void eliminarPedido(Pedido pedido){
        this.pedidos.remove(pedido);
    }

    public void modificarPedido(Pedido pedido_viejo, Pedido pedido_nuevo){
        this.pedidos.remove(pedido_viejo);
        this.pedidos.add(pedido_nuevo);
    }

    public ArrayList<Pedido> listaPlatos(LocalDate fecha){
        ArrayList<Pedido> ped=new ArrayList<>();
        for (Pedido p : this.pedidos){
            if (p.getFecha().equals(fecha)){
                p.nombrePrecioPlato();
                ped.add(p);
            }
        }
        return ped;
    }

    public ArrayList<Plato> top3Platos(){
        ArrayList<Plato> top3platos = new ArrayList<>();
        for (Pedido p : pedidos){
            p.sumarVecesPedidas();
        }
        for (int i = 0; i < this.platos_ofrece.size() - 1; i++) {
            for (int j = 0; j < this.platos_ofrece.size() - i - 1; j++) {
                if (this.platos_ofrece.get(j).getVeces_pedidas() < this.platos_ofrece.get(j + 1).getVeces_pedidas()) {
                    Plato temp = this.platos_ofrece.get(j);
                    this.platos_ofrece.set(j, this.platos_ofrece.get(j + 1));
                    this.platos_ofrece.set(j + 1, temp);
                }
            }
        }
        for (int i=0 ; i<this.platos_ofrece.size() - 1; i++){
            if(i<3){
                top3platos.add(this.platos_ofrece.get(i));
            }
        }
        return top3platos;
    }

    public static void main(String[] args) {
        Alumno alumno = new Alumno("Juan Cruz", "Melgarejo", "3C");
        Profesor profesor = new Profesor("Franco", "Calippo", 15);

        Plato plato1 = new Plato("Hamburguesa", 8000);
        Plato plato2 = new Plato("Pizza", 12000);
        Plato plato3 = new Plato("Milanesa", 10000);
        Plato plato4 = new Plato("Tarta", 7000);

        ArrayList<Plato> platos1 = new ArrayList<>();
        platos1.add(plato1);
        platos1.add(plato2);

        ArrayList<Plato> platos2 = new ArrayList<>();
        platos2.add(plato3);
        platos2.add(plato4);

        Pedido pedido1=new Pedido(LocalDate.now(), platos1, alumno, LocalTime.now(),"En Produccion");
        Pedido pedido2=new Pedido(LocalDate.of(2022,2,2), platos2, profesor, LocalTime.now(), "En Produccion");

        ArrayList<Pedido> pedidos= new ArrayList<>();

        pedidos.add(pedido1);
        pedidos.add(pedido2);

        ArrayList<Plato> platos_ofrece = new ArrayList<>();
        Collections.addAll(platos_ofrece, plato1, plato2, plato3, plato4);

        PedidoSistema sistema=new PedidoSistema(pedidos, platos_ofrece);
        ArrayList<Pedido> ped=sistema.listaPlatos(LocalDate.now());
        ArrayList<Plato> top=new ArrayList<>();
        top=sistema.top3Platos();
        for (int i=0 ; i<top.size() ; i++){
            System.out.println(i+1+"- Nombre Plato: "+top.get(i).getNombre());
        }
    }
}
