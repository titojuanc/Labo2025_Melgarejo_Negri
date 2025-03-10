#include <iostream>
using namespace std;

struct Producto
{
    string nombre;
    int codigo;
    string marca;
    float precio;
    bool vencimiento;
};

Producto gondola[3][4];

void cargar_productos(Producto &p1, Producto &p2, Producto &p3, Producto &p4){
    p1.nombre = "leche";
    p1.codigo = 1;
    p1.marca = "Sancor";
    p1.precio = 1450;
    p1.vencimiento= true;
    p2.nombre = "nesquik";
    p2.codigo = 2;
    p2.marca = "Nestle";
    p2.precio = 2700;
    p2.vencimiento= false;
    p3.nombre = "Traviata";
    p3.codigo = 3;
    p3.marca = "Arcor";
    p3.precio = 3000;
    p3.vencimiento= false;
    p4.nombre = "yogurt";
    p4.codigo = 4;
    p4.marca = "Sancor";
    p4.precio = 900;
    p4.vencimiento= true;
}

void cargar_gondola(Producto &p1, Producto &p2, Producto &p3, Producto &p4){
    gondola[0][0]=p1;
    gondola[0][1]=p2;
    gondola[0][2]=p3;
    gondola[0][3]=p4;
    gondola[1][0]=p2;
    gondola[1][1]=p3;
    gondola[1][2]=p2;
    gondola[1][3]=p2;
    gondola[2][0]=p3;
    gondola[2][1]=p1;
    gondola[2][2]=p4;
    gondola[2][3]=p4;
}

int columnasuma(){
    int columna=0;
    float preciomax=0;
    float preciox=0;
    for (int c = 0; c < 4; c++){
        for (int f = 0; f < 3; f++)
        {
           preciox =+ gondola[f][c].precio; 
        }
        if(preciox>preciomax){
            preciomax=preciox;
            columna=c+1;
        }
        preciox=0;
    }
    return columna;

}

float sumtotal(){
    float suma=0;
    float div=0;
    for(int f=0; f<3;f++){
        for (int c=0; c < 4; c++)
        {
            suma=suma+gondola[f][c].precio;
            div++;
        }   
    }

    return suma/div;
}

int vencimientosum(){
    int sum=0;
    for(int f=0; f<3;f++){
        for (int c = 0; c < 4; c++)
        {
            if(gondola[f][c].vencimiento){
                sum++;
            }
        }   
    }
    return sum;
}

int main (){
    Producto leche;
    Producto nesquik;
    Producto galletitas;
    Producto yogurt;
    cargar_productos(leche, nesquik, galletitas, yogurt);
    cargar_gondola(leche, nesquik, galletitas, yogurt);
    
    cout<<"Columna de la góndola que tiene más valor: "<<columnasuma()<<endl;
    cout<<""<<endl;
    cout<<"Nombre del producto de la fila 2, columna 3 es: "<<gondola[2][3].nombre<<endl;
    cout<<""<<endl;
    cout<<"el valor promedio de todos los productos de la góndola: "<<sumtotal()<<endl;
    cout<<""<<endl;
    cout<<"Cantidad de productos con fecha de vencimiento: "<<vencimientosum()<<endl;
}