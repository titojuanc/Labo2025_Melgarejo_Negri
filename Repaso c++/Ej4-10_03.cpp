#include <iostream>
#include <vector>//
using namespace std;
struct  Fecha
{
    int dia;
    int mes;
    int anio;
};

struct Paciente
{
    string nombre;
    int edad;
    int num_clinico;
    Fecha prox_cita;
};

void ingresar_paciente(vector<Paciente> &pacientes, int &num_clinica){
    Paciente paciente;
    cout<<"Ingrese el nombre del paciente"<<endl;
    cin>>paciente.nombre;
    cout<<"Ingrese la edad del paciente"<<endl;
    cin>>paciente.edad;
    paciente.num_clinico=num_clinica+1;
    cout<<"Su número de clínica será "<<num_clinica+1<<endl;
    num_clinica=num_clinica+1;
    cout<<"Año de la fecha de su próxima cita"<<endl;
    cin>>paciente.prox_cita.anio;
    cout<<"Mes de la fecha de su próxima cita"<<endl;
    cin>>paciente.prox_cita.mes;
    cout<<"Día de la fecha de su próxima cita"<<endl;
    cin>>paciente.prox_cita.dia;
    pacientes.push_back(paciente);
    cout<<"Paciente "<<paciente.nombre<<" cargado con éxito"<<endl;
}

void cancelar_cita(vector<Paciente> &pacientes){
    int num;
    cout<<"Por favor, seleccione al paciente al que quiere cancelarle su próxima cita"<<endl;
    cin>>num;
    for (int i = 0; i < pacientes.size(); i++)
    {
        if(pacientes[i].num_clinico==num){
            pacientes[i].prox_cita.anio=0;
            pacientes[i].prox_cita.mes=0;
            pacientes[i].prox_cita.dia=0;
            cout<<"La próxima cita de "<<pacientes[i].nombre<<" se ha seteado a 00/00/0000"<<endl;
            break;
        }
    }
    
}
void fechas(vector<Paciente> &pacientes){
    Fecha fecha_elegida;
    cout<<"Por favor, elija el año de la fecha que quiere revisar"<<endl;
    cin>> fecha_elegida.anio;
    cout<<"Elija el mes de la fecha que quiere revisar"<<endl;
    cin>> fecha_elegida.mes;
    cout<<"Elija el día de la fecha que quiere revisar"<<endl;
    cin>> fecha_elegida.dia;
    bool hay=false;
    for (int i = 0; i < pacientes.size(); i++)
    {
        if (pacientes[i].prox_cita.anio==fecha_elegida.anio 
            and pacientes[i].prox_cita.mes==fecha_elegida.mes 
            and pacientes[i].prox_cita.dia==fecha_elegida.dia)
        {
            cout<<"\nCita detectada para el paciente "<<pacientes[i].nombre<<endl;
            hay=true;
        }
    }
    if (!hay)
    {
        cout<<"No se encontraron citas patra esa fecha"<<endl;
    }
}

void info_paciente(vector<Paciente> pacientes){
    int num;
    cout<<"Por favor, ingrese el número de clínica del paciente que desea ver"<<endl;
    cin>>num;
}

int main(){
    int num_clinica=0;
    vector<Paciente> pacientes;
    cout<<"\n        Bienvenido a la clínica Crobolix."<<endl;
    cout<<""<<endl;
    cout<<"Por favor, elija una opción"<<endl;
    while (true)
    {
        cout<<"\n"<<endl;
        cout<<"1. Ingresar nuevo paciente."<<endl;
        cout<<"2. Cancelar cita"<<endl;
        cout<<"3. Fechas"<<endl;
        cout<<"4. Info. del paciente."<<endl;
        cout<<"5. Salir."<<endl;
        cout<<""<<endl;
        int eleccion;
        cin>>eleccion;
        if (eleccion==1)
        {ingresar_paciente(pacientes, num_clinica);}
        else if(eleccion==2)
        {cancelar_cita(pacientes);}
        else if(eleccion==3)
        {fechas(pacientes);}
        else if(eleccion==4)
        {info_paciente();}
        else if(eleccion==5)
        {cout<<"Gracias por utilizar nuestro sistema.";
         exit(0);}
        else{cout<<"Por favor, ingrese una opción válida\n "<<endl;}
    }
    
}
