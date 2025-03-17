#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

struct Piloto{
    string nombre;
    int num_auto=0;
    string equipo;
    int pos_final=0;
    bool vuelta_rapida;
};

struct Equipo {
    string nombre;
    int puntos=0;
};

int puntos(int posicion){
    if(posicion==1){
        return 25;
    }
    else if (posicion==2){
        return 18;
    }
    else if (posicion==3){
        return 15;
    }
    else if (posicion==4){
        return 12; 
    }
    else if (posicion==5){
        return 10;
    }
    else if (posicion==6){
        return 8;
    }
    else if (posicion==7){
        return 6;
    }
    else if (posicion==8){
        return 4;
    }
    else if (posicion==9){
        return 2;
    }
    else if (posicion==10){
        return 1;
    }
    else{
        return 0;
    }

    
}

void cargar(vector<Piloto>&pilotos, vector<Equipo>&equipos){
    Equipo equipoaux;
    Piloto pilotoaux;
    cout<<"Bienvenido, para empezar, carge los datos de los equipos"<<endl;
    for (int i = 0; i < 10; i++){
        cout<<"Nombre del equipo "<<i+1<<":"<<endl;
        cin>>equipoaux.nombre;
        equipos.push_back(equipoaux);
    }
    cout<<"Ahora, carge los datos de los pilotos"<<endl;
    for (int i = 0; i < 10; i++){
        cout<<"Nombre del piloto "<<i+1<<":"<<endl;
        cin>>pilotoaux.nombre;
        cout<<"Número del auto del piloto "<<i+1<<":"<<endl;
        cin>>pilotoaux.num_auto;
        cout<<"Equipo del auto del piloto "<<i+1<<":"<<endl;
        cin>>pilotoaux.equipo;
        pilotos.push_back(pilotoaux);
    }
    
}

void cargar_datos_carrera(vector<Piloto> &pilotos){
    cout<<"Ingresá los datos de la carrera: "<<endl;
    string rta;
    for (int i = 0; i < pilotos.size(); i++){
        cout<<"Piloto "<<i+1<<":"<<pilotos[i].nombre<<endl;
        cout<<"Posición final de la carrera: "<<i+1<<":"<<endl;
        cin>>pilotos[i].pos_final;
        cout<<"¿Hizo la vuelta rápida? S/N: "<<endl;
        cin>>rta;
        if (rta=="S"){
            pilotos[i].vuelta_rapida=true;
        }
        else{
            pilotos[i].vuelta_rapida=false;
        }
    }
}

void calcular_puntaje_piloto_equipo(vector<Piloto> pilotos, vector<Equipo> &equipos){
    for (int i = 0; i < pilotos.size(); i++){
        for (int j = 0; j < equipos.size(); j++)
        {
            if(pilotos[i].equipo==equipos[j].nombre){
                equipos[j].puntos=+puntos(pilotos[i].pos_final);
                if (pilotos[i].vuelta_rapida && pilotos[i].pos_final>=10)
                {
                    equipos[j].puntos=+1;
                }
                
            }
        }
    }
}

bool comparador(Equipo a, Equipo b){
    return a.puntos > b.puntos;
}

void ordenar_tabla_equipos(vector<Equipo> &equipos){
    Equipo aux;
    for (int i = 0; i < equipos.size(); i++) {
        for (int j = 0; j < equipos.size(); j++) {
            if (equipos[j].puntos < equipos[j + 1].puntos){
                aux=equipos[j+1];
                equipos[j+1]=equipos[j];
                equipos[j]=aux;
            }
        }
    }
}

void mostrar_tabla_equipos(vector<Equipo> equipos){
    for (int i = 0; i < equipos.size(); i++)
    {
        cout<<i+1<<"- |"<<equipos[i].nombre<<" | "<<equipos[i].puntos<<endl;
    }
    
}

int main(){
    vector<Equipo> equipos;
    vector<Piloto> pilotos;
    cargar(pilotos, equipos);

    for (int i = 0; i < 2; i++)
    {
        cargar_datos_carrera(pilotos);
        calcular_puntaje_piloto_equipo(pilotos, equipos);
    }
    
    
    ordenar_tabla_equipos(equipos);
    mostrar_tabla_equipos(equipos);
 }