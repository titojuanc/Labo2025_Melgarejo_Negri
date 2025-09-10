package duke.choice.ejercicioFinal;

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
    
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.employees = new ArrayList<>();
    }
    
    public void asignarDepartamentoEmpleado(Employee empleadoPorAsignar){
        empleadoPorAsignar.setDepartamento(this);
    }
    
    public void mostrarEmpleadosPorDepartamento(){
        System.out.println("Departamento "+ this.nombre + ": ");
        for(Employee employee: employees){
            System.out.println(employee.getNombre());
        }
    }

    public Employee empleadoPorId(int id) throws EmployeeNotInDeptException {
        for (Employee employee : this.employees){
            if (employee.getId() == id){
                return employee;
            }
        }
        throw new EmployeeNotInDeptException("El empleado no se encuentra en este departamento");
    }

    public double salarioTotal(){
        double salarioTotal=0;
        for (Employee e : this.employees){
            salarioTotal += e.getSalario();
        }
        return salarioTotal;
    }

    public double salarioPromedio(){
        return this.salarioTotal()/this.employees.size();
    }

}
