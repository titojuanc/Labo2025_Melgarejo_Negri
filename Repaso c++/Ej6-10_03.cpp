#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

struct Fecha
{
    int dia;
    int mes;
    int anio;
};


struct Equipo
{
    string nombre;
    int gf=0;
    int gc=0;
    int victorias=0;
    int empates=0;
    int derrotas=0;
    vector<char> historial;
};

struct Partido
{
    Equipo local;
    Equipo visitante;
    int goles_loc=0;
    int goles_vis=0;
    string estadio;
    Fecha fecha;
};


void ingresar_equipos(vector<Equipo> &equipos){
    if (equipos.size()==20)
    {
        cout<<"Los equipos ya estan cargados."<<endl;
        return;
    }
    else{
        Equipo equipoaux;
        for (int i = 0; i < 20; i++)
        {
            cout<<"Por favor, ingrese el nombre del equipo "<<i+1<<endl;
            cin>>equipoaux.nombre;
            equipoaux.gc=0;
            equipoaux.gf=0;
            equipos.push_back(equipoaux); 
        }
    }
}

void cargar_partido(vector<Partido> &partidos, vector<Equipo> &equipos){
    Partido partido;
    string nombre;
    bool check=false;
    int ind_loc;
    int ind_vis;
    int gol;
    while (true)
    {
        cout<<"Ingrese el equipo local: ";
        cin>>nombre;
        for (int i = 0; i < equipos.size(); i++){
            if (nombre==equipos[i].nombre){
                partido.local=equipos[i];
                ind_loc=i;
                partido.estadio=nombre;
                check=true;
            }        
        }
        if (partido.local.nombre.empty()){
            cout<<"Ese equipo no existe"<<endl;
        }
        else if(check){
            break;
        }
    }
    check=false;

    while(true)
    {
        cout<<"Ingrese el equipo visitante: ";
        cin>>nombre;
        for (int i = 0; i < equipos.size(); i++){
            if (nombre==equipos[i].nombre){
                partido.visitante=equipos[i];
                ind_vis=i;
                check=true;
            }        
        }
        if (partido.visitante.nombre.empty()){
            cout<<"Ese equipo no existe"<<endl;
        }
        else if(check){
            break;
        }
    }
    
    cout<<"Año del partido: "<<endl;
    cin>>partido.fecha.anio;
    cout<<"Mes del partido: "<<endl;
    cin>>partido.fecha.mes;
    cout<<"Día del partido: "<<endl;
    cin>>partido.fecha.dia;
    
    cout<<"Goles del equipo local: ";
    cin>>gol;
    partido.goles_loc=gol;
    equipos[ind_loc].gf+=gol;
    equipos[ind_vis].gc+=gol;

    cout<<"Goles del equipo visitante: ";
    cin>>gol;
    partido.goles_vis=gol;
    equipos[ind_vis].gf+=gol;
    equipos[ind_loc].gc+=gol;

    if(partido.goles_loc>partido.goles_vis){
        equipos[ind_loc].historial.push_back('V');
        equipos[ind_loc].victorias++;
        equipos[ind_vis].historial.push_back('D');
        equipos[ind_vis].derrotas++;
    }
    else if(partido.goles_loc<partido.goles_vis){
        equipos[ind_loc].historial.push_back('D');
        equipos[ind_loc].derrotas++;
        equipos[ind_vis].historial.push_back('V');
        equipos[ind_vis].victorias++;
    }
    else if(partido.goles_loc==partido.goles_vis){
        equipos[ind_loc].historial.push_back('E');
        equipos[ind_loc].empates++;
        equipos[ind_vis].historial.push_back('E');
        equipos[ind_vis].empates++;
    }

    partidos.push_back(partido);
}

void info_partido(vector<Partido> &partidos){
    string local;
    string visitante;
    bool hay=false;
    cout<<"Ingrese el equipo local: ";
    cin>>local;
    cout<<"Ingrese el equipo visitante: ";
    cin>>visitante;

    for (int i = 0; i < partidos.size() ; i++){
        if(partidos[i].local.nombre==local){
            if (partidos[i].visitante.nombre==visitante){
                cout<<"  Partido encontrado  "<<endl;
                cout<<"Fecha: "<<partidos[i].fecha.anio<<"/"<<partidos[i].fecha.mes<<"/"<<partidos[i].fecha.dia<<endl;
                cout<<"Local: "<<local<<endl;
                cout<<"Visitante: "<<visitante<<endl;
                cout<<"Resultado: "<<partidos[i].goles_loc<<":"<<partidos[i].goles_vis<<endl;
                cout<<"Estadio: "<<local<<endl;
                hay=true;
            }
        }
    }
    if (!hay)
    {
        cout<<"No se encontraron partidos."<<endl;
    }   
}

int puntos(Equipo equipo){
    return equipo.victorias*3+equipo.empates;
}


bool comparador(Equipo equipo1, Equipo equipo2){
    if (puntos(equipo1)!=puntos(equipo2))
    {
        return puntos(equipo1)>puntos(equipo2);
    }
    
    return equipo1.gf-equipo1.gc > equipo2.gf-equipo2.gc;
}

void tabla(vector<Equipo> &equipos){
    vector<Equipo> tabla;
    sort(equipos.begin(), equipos.end(), comparador);
    for(int i=0 ; i<equipos.size() ; i++){
        cout<<i<<"- "<<equipos[i].nombre<<"| "<<puntos(equipos[i])<<" | "<<equipos[i].gf-equipos[i].gc<<" |"<<endl;
    }



}

int main(){
    vector<Equipo> equipos;
    vector<Partido> partidos;
    int opcion;
    cout<<"        Bienvenido a la Liga Profesional Argentina        "<<endl;
    
    while (true)
    {
        cout<<"\n"<<endl;
        cout<<" Por favor, elija una opción: "<<endl;
        cout<<" 1. Cargar equipos"<<endl;
        cout<<" 2. Cargar partido"<<endl;
        cout<<" 3. Ver partido"<<endl;
        cout<<" 4. Ver tabla"<<endl;
        cout<<" 5. Salir"<<endl;
        cin>>opcion;
        if (opcion==1)
        {
            ingresar_equipos(equipos);
        }
        else if (opcion==2)
        {
            cargar_partido(partidos, equipos);
        }
        else if (opcion==3)
        {
            info_partido(partidos);
        }
        else if (opcion==4)
        {
            tabla(equipos);
        }
        else if (opcion==5)
        {
            cout<<"Gracias por utilizar nuestro sistema."<<endl;
            exit(0);
        }
        else{
            cout<<"Elija una opción correcta."<<endl;
        }    
    }
}