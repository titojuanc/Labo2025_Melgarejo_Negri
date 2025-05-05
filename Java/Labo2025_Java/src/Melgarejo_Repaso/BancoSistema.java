package Melgarejo_Repaso;
import java.time.LocalDate;
import java.util.ArrayList;

public class BancoSistema {
    public static void main(String[] args) {
        PersonaBanco p1 = new PersonaBanco("Miguel", "Lopez", 32987990, LocalDate.of(1985, 10, 12), LocalDate.of(2020, 5, 8));
        PersonaBanco p2 = new PersonaBanco("Juana", "Gomez", 39987990, LocalDate.of(1986, 7, 28));
        PersonaBanco p3 = new PersonaBanco("Candela", "Navarro", 40987990, LocalDate.of(1993, 2, 4), LocalDate.of(2017, 5, 25));

        BancoNacion sucursalUrquiza = new BancoNacion("Av. Triunvirato 3450", true, false);
        BancoNacion sucursalPueyrredon = new BancoNacion("Cochrane 2874", true, true);

        ArrayList<BancoNacion> sucursales = new ArrayList<>();

        sucursales.add(sucursalUrquiza);
        sucursales.add(sucursalPueyrredon);

        sucursalUrquiza.agregarTrabajador(p1);
        sucursalUrquiza.agregarTrabajador(p3);
        sucursalPueyrredon.agregarTrabajador(p2);

        sucursalPueyrredon.cantidadTrabajadores();

        for (BancoNacion b : sucursales) {
            PersonaBanco p = b.empleadoMayorAntiguedad();
            System.out.println(p.getNombre() + " " + p.antiguedad() + " años de antigüedad");
        }
    }
}
