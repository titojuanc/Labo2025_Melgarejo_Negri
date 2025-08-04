package Vacunatorio;

import java.time.LocalDate;

public class Vacuna {
    private LocalDate fecha_fabricacion;
    private LocalDate fecha_aplicacion;
    private int num_lote;
    private int num_fabricacion;
    private String nombre;

    public Vacuna(String nombre, LocalDate fecha_fabricacion, LocalDate fecha_aplicacion, int num_lote, int num_fabricacion) {
        this.nombre = nombre;
        this.fecha_fabricacion = fecha_fabricacion;
        this.fecha_aplicacion = fecha_aplicacion;
        this.num_lote = num_lote;
        this.num_fabricacion = num_fabricacion;
    }

    public String getNombre() {
        return nombre;
    }
}
