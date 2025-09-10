package duke.choice.ejercicioFinal;

import java.util.ArrayList;
import java.util.Collections;

public class AppHR {
    public static void main(String[] args) {
        ArrayList<Employee> empleados = new ArrayList<>();
        Departamento d1 = new Departamento("Departamento 1");
        Departamento d2 = new Departamento("Departamento 2");
        
        Employee e1 = new Employee("Julian", 500000);
        Employee e2 = new Employee("Mario", 600000);
        Employee e3 = new Employee("Francesca", 500500);

        Collections.addAll(empleados, e1, e2 ,e3);

        d1.asignarDepartamentoEmpleado(e1);
        d2.asignarDepartamentoEmpleado(e2);
        d1.asignarDepartamentoEmpleado(e3);

        d1.mostrarEmpleadosPorDepartamento();
        d2.mostrarEmpleadosPorDepartamento();

        System.out.println(d1.salarioTotal());
        System.out.println(d2.empleadoPorId(1).getNombre());
        System.out.println(d1.salarioPromedio());
    }
}
