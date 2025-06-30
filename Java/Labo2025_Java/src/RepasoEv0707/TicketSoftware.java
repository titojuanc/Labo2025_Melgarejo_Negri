package RepasoEv0707;

import java.time.LocalDate;

public class TicketSoftware extends Ticket{
    private int intentos;
    private Software software;
    public TicketSoftware(ClienteTicket cliente, LocalDate fechaCreacion, LocalDate fechaFinalizacion, String descripcion, Software software) {
        super(cliente, fechaCreacion, fechaFinalizacion, descripcion);
        this.software=software;
        this.intentos=3;
    }

    @Override
    public boolean resolucion() {
        if (this.getEstado() == EstadoTicket.EN_PROGRESO && this.intentos >= 1 && this.software.isParche()) {
            this.setEstado(EstadoTicket.RESUELTO);
            return true;
        }
        if (intentos-1==0){
            this.setEstado(EstadoTicket.CERRADO);
            return false;
        }
        this.intentos=this.intentos-1;
        return false;
    }
}
