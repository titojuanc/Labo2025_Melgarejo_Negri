package Elecciones;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Partido p1 = new Partido("LLA", "Av. Constituyentes 6068", 333);
        Partido p2 = new Partido("FDI", "Av. Patricias Argentinas 435", 878);

        Paloma paloma = new Paloma("Clara", "Gris");
        paloma.aprenderMapa();

        Paloma paloma2 = new Paloma("Moni", "Marrón");

        Telefono tel1 = new Telefono(Compania.CLARO, 1172621946);
        tel1.prender();
        tel1.setCredito(5000);

        Telefono tel2 = new Telefono(Compania.MOVISTAR, 1186755504);

        Trabajador tr1 = new Trabajador("Jorge", "Mastil", LocalDate.of(1979, 5, 24), 23498211, "Honorio senet 4332", 1, 50500);
        Trabajador tr2 = new Trabajador("Mauricio", "Mastil", LocalDate.of(1961, 9, 4), 21434211, "Honorio senet 4332", 3, 43900);

        tr1.establecerHorario(7, 12);
        tr2.establecerHorario(15, 20);

        p1.agregarMensajero(paloma);
        p1.agregarMensajero(tel2);
        p1.agregarMensajero(tr1);

        p2.agregarMensajero(paloma2);
        p2.agregarMensajero(tel1);
        p2.agregarMensajero(tr2);

        System.out.println("Campaña de LLA: ");
        p1.hacerCampania("Vote por el partido para un mejor futuro");

        System.out.println("Campaña de FDI: ");
        p2.hacerCampania("Vote por el partido para un mejor futuro");
    }
}
