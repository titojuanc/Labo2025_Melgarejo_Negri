package Melgarejo_Repaso;

import java.time.LocalDate;

public class Reserva {
    private Socio socio;
    private Clase clase;
    private LocalDate fecha;

    public Reserva(Socio socio, Clase clase, LocalDate fecha) {
        this.socio = socio;
        this.clase = clase;
        this.fecha = fecha;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
