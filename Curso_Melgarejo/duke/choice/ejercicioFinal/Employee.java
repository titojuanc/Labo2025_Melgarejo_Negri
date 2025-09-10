package duke.choice.ejercicioFinal;

public class Employee{
    private String nombre;
    private Departamento departamento;
    private double salario;
    private int id;
    private static  int idCount = 0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Employee(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.id= idCount;
        idCount++;
        System.out.println("El empleado " + this.nombre + "posee el id: " + this.id);
    }
  




}