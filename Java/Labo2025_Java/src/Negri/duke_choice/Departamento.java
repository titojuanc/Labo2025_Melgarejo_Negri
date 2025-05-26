package Negri.duke_choice;
import java.util.ArrayList;

public class Departamento {

    private String nombre;
    public ArrayList<Employee> employees;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    
    public Departamento(String nombre, ArrayList<Employee> employees) {
        this.nombre = nombre;
        this.employees = employees;
    }
    
    public void asignarDepartamentoEmpleado(Employee empleadoPorAsignar, Departamento departamentoPorAsignar){
        empleadoPorAsignar.setDepartamento(departamentoPorAsignar);
    }
    
    public void mostrarEmpleadosPorDepartamento(){
        for(Employee employee: employees){
            System.out.println(employee.getNombre());
            System.out.println(employee.getDepartamento().getNombre());
            System.out.println("----------");
        }
    }
}
