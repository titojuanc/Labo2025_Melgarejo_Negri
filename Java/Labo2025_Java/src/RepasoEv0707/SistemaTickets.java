package RepasoEv0707;

import java.util.ArrayList;

public class SistemaTickets {
    private ArrayList<Desarrollador> desarrolladores;
    private ArrayList<ClienteTicket> clientes;
    private ArrayList<Ticket> tickets;

    public SistemaTickets(){
        this.clientes=new ArrayList<>();
        this.desarrolladores= new ArrayList<>();
        this.tickets = new ArrayList<>();
    }

    public ArrayList<Desarrollador> getDesarrolladores() {
        return desarrolladores;
    }

    public ArrayList<ClienteTicket> getClientes() {
        return clientes;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void agregarTicket(Ticket ticket){
        this.tickets.add(ticket);
    }

    public void agregarDesarrollardor(Desarrollador desarrollador){
        this.desarrolladores.add(desarrollador);
    }

    public void agregarCliente(ClienteTicket cliente){
        this.clientes.add(cliente);
    }

    public static void main(String[] args) {

    }
}
