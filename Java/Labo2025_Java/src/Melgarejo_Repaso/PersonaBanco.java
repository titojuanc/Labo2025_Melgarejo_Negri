package Melgarejo_Repaso;

import java.time.LocalDate;
import java.time.Period;

public class PersonaBanco {
    private String nombre;
    private String apellido;
    private int codigo;
    private LocalDate nacimiento;
    private LocalDate union;

    public PersonaBanco(String nombre, String apellido, int codigo, LocalDate nacimiento, LocalDate union) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.nacimiento = nacimiento;
        this.union = union;
    }

    public PersonaBanco(String nombre, String apellido, int codigo, LocalDate nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.nacimiento = nacimiento;
        this.union = LocalDate.now();
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public LocalDate getUnion() {
        return union;
    }

    public void setUnion(LocalDate union) {
        this.union = union;
    }

    public int antiguedad(){
        return LocalDate.now().getYear()-this.union.getYear();
    }
}
