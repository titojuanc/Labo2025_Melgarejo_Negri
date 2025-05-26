package Negri.duke_choice;

public class Employee{

    private String nombre;
    private Departamento departamento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Employee(String nombre, Departamento departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }
  




}