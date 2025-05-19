package Utilidad;

import Entidades.Alumno;
import Entidades.Persona;
import Entidades.Profesor;
import Objetos.Plato;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Pedido {
    private LocalDate fecha;
    private ArrayList<Plato> platos;
    private Persona solicitante;
    private LocalTime hora;
    private String estado;

    public Pedido(LocalDate fecha, ArrayList<Plato> platos, Persona solicitante, LocalTime hora, String estado) {
        this.fecha = fecha;
        this.platos = platos;
        this.solicitante = solicitante;
        this.hora = hora;
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Plato> getPlato() {
        return platos;
    }

    public void setPlato(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public Persona getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Persona solicitante) {
        this.solicitante = solicitante;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void nombrePrecioPlato(){
        for (Plato p : platos){
            if (solicitante instanceof Alumno){
                System.out.println("Plato: "+p.getNombre()+ " Precio: "+p.getPrecio());
            }
            else{
                Profesor prof = (Profesor) solicitante;
                double descuento = prof.getPorcentaje_descuento() /100.0;
                System.out.println("Plato: "+p.getNombre()+ " Precio: "+p.getPrecio()*(1-descuento));
            }
        }
    }

    public void sumarVecesPedidas(){
        for (Plato p : this.platos){
            int veces_pedidas = p.getVeces_pedidas();
            p.setVeces_pedidas(veces_pedidas+1);
        }
    }

    public void

    public static void main(String[] args) {
        Alumno alumno = new Alumno("Juan Cruz", "Melgarejo", "3C");
        Profesor profesor = new Profesor("Franco", "Callipo", 15);

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
    }
}
