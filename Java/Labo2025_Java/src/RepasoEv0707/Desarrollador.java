package RepasoEv0707;

import Entidades.Persona;

public class Desarrollador extends Persona {
    public Desarrollador(String nombre, String apellido){
        super(nombre, apellido);
    }

    public void hacerseCargo(Ticket ticket){
        ticket.agregarDesarrollador(this);
    }
}
