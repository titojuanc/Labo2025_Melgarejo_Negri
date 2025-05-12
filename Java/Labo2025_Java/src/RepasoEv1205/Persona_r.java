/*package RepasoEv1205.Ej2;

import java.time.LocalDate;
import java.time.Period;

public class Persona_r {
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fecha_nacimiento;
    private LocalDate fecha_ingreso;

    public Persona_r(){
        this.nombre="";
        this.apellido="";
        this.edad=0;
        this.fecha_nacimiento=LocalDate.now();
        this.fecha_ingreso=LocalDate.now();
    }

    public Persona_r(String nombre, String apellido, int edad, LocalDate fecha_nacimiento, LocalDate fecha_ingreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public LocalDate getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(LocalDate fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Period antiguedad(){
        return Period.between(fecha_ingreso,LocalDate.now());
    }
}
*/