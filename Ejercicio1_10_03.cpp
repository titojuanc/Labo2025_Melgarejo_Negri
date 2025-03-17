#include <iostream>
#include <vector>
using namespace std;

struct Empleado{
    string nombre;
    string apellido;
    string fecha_nacimiento;
    string sexo;
    float salario;
};

Empleado EmpleadoConSueldoMayor(vector<Empleado> empleados, vector<Empleado>& empleados_salario_menor){
    Empleado empleado_mayor_salario;
    float mayor_salario=0;
    for(Empleado empleado_each : empleados){
        if(empleado_each.salario > mayor_salario){
            empleado_mayor_salario.nombre=empleado_each.nombre;     
            empleado_mayor_salario.apellido=empleado_each.apellido;
            empleado_mayor_salario.fecha_nacimiento=empleado_each.fecha_nacimiento;
            empleado_mayor_salario.sexo=empleado_each.sexo;
            empleado_mayor_salario.salario=empleado_each.salario;  
            mayor_salario=empleado_each.salario; 
        }
        else if(empleado_each.salario<=400000){empleados_salario_menor.push_back(empleado_each);}
    }
    return empleado_mayor_salario;
}

int main(){
    Empleado empleado;
    Empleado empleado_mayor_salario;
    vector<Empleado> empleados;
    vector<Empleado> empleados_salario_menor;
    cout<<"\nAñadir Empleados"<<endl;
    while(true){
        char salir='x';
        cout<<"\n¿Salir? [S][N]: ";
        cin>>salir;
        if(salir=='S'){break;}
        cout<<"\nIngrese nombre del empleado: ";
        cin>>empleado.nombre;
        cout<<"\nIngrese apellido del empleado: ";
        cin>>empleado.apellido;
        cout<<"\nIngrese fecha de nacimiento del empleado (dd/mm/yyyy): ";
        cin>> empleado.fecha_nacimiento;
        cout<<"\nIngrese sexo del empleado: ";
        cin>>empleado.sexo;
        cout<<"\nIngrese salario: ";
        cin>>empleado.salario;
        empleados.push_back(empleado);
    }
    
    empleado_mayor_salario=EmpleadoConSueldoMayor(empleados, empleados_salario_menor);

    cout<<"\nEmpleado con mayor salario";
    cout<<"\nNombre: "<<empleado_mayor_salario.nombre;
    cout<<"\nApellido: "<<empleado_mayor_salario.apellido;
    cout<<"\nFecha de nacimiento: "<<empleado_mayor_salario.fecha_nacimiento;
    cout<<"\nSexo: "<<empleado_mayor_salario.sexo;
    cout<<"\nSalario: "<<empleado_mayor_salario.salario<<endl;

    for(Empleado empleado_menor : empleados_salario_menor){
        cout<<"\nEmpleados con salario menor a $400.000";
        cout<<"\nNombre: "<<empleado_menor.nombre;
        cout<<"\nApellido: "<<empleado_menor.apellido<<endl;
    }
}