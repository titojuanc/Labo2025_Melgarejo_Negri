package TratamientoDeSangre;

import java.time.LocalDate;
import java.util.HashSet;

public class Joven extends Paciente implements Modificable{
    private static int edadMinima = 20;
    private static int edadMaxima = 30;
    private HashSet<String> actividades;

    public Joven(String nombre, String apellido, LocalDate fecha, Genero genero, TipoSangre tipoSangre, boolean factorRH) {
        super(nombre, apellido, fecha, genero, tipoSangre, factorRH);
        this.actividades=new HashSet<>();
    }


    @Override
    public boolean tratar() {
        if ((actividades.size() % 2 == 1) &&  Joven.edadMaxima-this.calcularEdad() <= 2){
            System.out.println("Lamentamos comunicarte que tu sangre aún no va a poder ser modificada.");
            return false;
        } else {
            System.out.println("Será un tratamiento costoso, pero lo vamos a lograr.");
            return true;
        }
    }

    @Override
    public int precioTratamiento() {
        if (this.getFecha_nacimiento().getYear() % 2 == 1){
            return this.getFecha_nacimiento().getMonthValue()*760000;
        } else {
            return this.getFecha_nacimiento().getDayOfMonth()*145400 ;
        }
    }




}
