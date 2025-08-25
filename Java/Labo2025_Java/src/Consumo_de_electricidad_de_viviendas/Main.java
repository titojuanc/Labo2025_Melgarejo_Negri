package Consumo_de_electricidad_de_viviendas;

import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Duenio d1 =new Duenio(48888888, "Lopez", "Esteban");
        Duenio d2 =new Duenio(47777777, "Noble", "Gigante");

        Casa casita = new Casa("Ceretti 1630", 1419, d1, new HashMap<>(), 50, 50);

        Departamento depto = new Departamento("Bulgaria 4185", 1419, d2, new HashMap<>(), 3);

        casita.getConsumo().put(LocalDate.of(2024, 3, 1), 100.0);
        casita.getConsumo().put(LocalDate.of(2025, 3, 1), 90.0);

        depto.getConsumo().put(LocalDate.of(2023, 5, 1), 150.0);
        depto.getConsumo().put(LocalDate.of(2024, 5, 1), 135.0);

        System.out.println(casita.calcularFactura(LocalDate.of(2025, 3, 23)));
        System.out.println(casita.calcularFactura(LocalDate.of(2024, 3, 2)));
        System.out.println(casita.calcularFactura(LocalDate.of(2022, 3
                , 23)));
    }
}
