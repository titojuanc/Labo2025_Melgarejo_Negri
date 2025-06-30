package RepasoEv0707;

import java.time.LocalDate;

public class TicketHardware extends Ticket{
    private Dispositivo dispositivo;
    public TicketHardware(ClienteTicket cliente, LocalDate fechaCreacion, LocalDate fechaFinalizacion, String descripcion, Dispositivo dispositivo) {
        super(cliente, fechaCreacion, fechaFinalizacion, descripcion);
        this.dispositivo=dispositivo;
    }

    @Override
    public boolean resolucion() {
        if (this.getEstado()==EstadoTicket.EN_PROGRESO){
            if (this.dispositivo.getCantidad()>=1){
                this.dispositivo.setCantidad(this.dispositivo.getCantidad()-1);
                this.setEstado(EstadoTicket.RESUELTO);
                return true;
            }
        }
        return false;
    }
}
