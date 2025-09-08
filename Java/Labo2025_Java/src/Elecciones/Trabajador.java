package Elecciones;

import Entidades.Persona;

import java.time.LocalDate;
import java.time.LocalTime;

public class Trabajador extends Persona implements Mensajero {
    private int cuil;
    private double sueldo;
    private int horarioEntrada;
    private int horarioSalida;

    public Trabajador(String nombre, String apellido, LocalDate fecha_nac, int dni, String direccion, int cuil, double sueldo){
        super(nombre, apellido, fecha_nac, dni, direccion);
        this.cuil=cuil;
        this.sueldo=sueldo;
    }

    public void establecerHorario(int entrada, int salida){
        this.horarioEntrada=entrada;
        this.horarioSalida=salida;
    }


    @Override
    public void enviarMensaje() {
        if (LocalTime.now().getHour()<horarioSalida && LocalTime.now().getHour()>horarioEntrada ){
            System.out.println("Yo, " + this.getNombre() + " te invito a " + mensaje);
        }
    }
}
