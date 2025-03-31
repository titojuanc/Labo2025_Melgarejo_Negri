#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

const int cantidad_mc_prodcutos=4;
const vector<string> mc_categorias={"Hamburguesa","Bebida","Postre","Ensalada","Veggie","Sin TACC"};

struct MC_Productos{
    string nombre;
    bool promo;
    int cant_ventas=0;
    float precio;
    string categoria;
};

struct Fecha{
    int dia;
    int mes;
    int anio;
};

struct Pedido{
    string nombre_cliente;
    vector<MC_Productos> ped_productos;
    vector<int> cant_ped_productos;
    Fecha fecha;
    float precio_total;
};

void ingresarMC_Productos(vector<MC_Productos>& v_mc_productos,MC_Productos mc_producto){
    cout<<"\n::Ingresar Productos MC::"<<endl;
    for(int i=0;i<cantidad_mc_prodcutos;i++){
        cout<<"\nIngrese el nombre: ";
        cin>>mc_producto.nombre;
        cout<<"\n¿Tiene promo? [S][N]";
        char promo='x';
        while(promo!='S' and promo!='N'){
            cin>>promo;
            if(promo=='S'){mc_producto.promo=true;}
            else if(promo=='N'){mc_producto.promo=false;}
            else{cout<<"\nIngrese un valor correcto"<<endl;}
        }
        cout<<"\nIngrese el precio: ";
        cin>>mc_producto.precio;
        cout<<"\nIngrese la categoría";
        for(int j=0;j<mc_categorias.size();j++){cout<<"\n-"<<mc_categorias[j];}
        cout<<"\n-->";
        cin>>mc_producto.categoria;
        v_mc_productos.push_back(mc_producto);
    }
}

void ingresarPedido(vector<Pedido>& v_pedidos, Pedido pedido, vector<MC_Productos>& v_mc_productos, MC_Productos mc_producto){
    cout<<"\n::Ingresar Pedidos::"<<endl;
    cout<<"\nIngrese nombre del cliente: ";
    cin>>pedido.nombre_cliente;
    char listo_pedir_productos='x';
    cout<<"\n¿Que quiere pedir?";
    string aux_pedir;
    for(MC_Productos aux : v_mc_productos){cout<<"\n-"<<aux.nombre;}
    while(listo_pedir_productos!='S'){
        cout<<"\nPedir: ";
        cin>>aux_pedir;
        for(int i=0;i<v_mc_productos.size();i++){
            if(v_mc_productos[i].nombre==aux_pedir){
                pedido.ped_productos.push_back(v_mc_productos[i]);
            }
        }
        cout<<"\n¿Listo? [S][N]";
        cin>>listo_pedir_productos;
    }
    int aux_cant=0;
    for(int i=0;i<pedido.ped_productos.size();i++){
        cout<<"\n¿Cuantos "<<pedido.ped_productos[i].nombre<<" quiere? ";
        cin>>aux_cant;
        v_mc_productos[i].cant_ventas+=aux_cant;
        pedido.ped_productos[i].cant_ventas=aux_cant;
        pedido.cant_ped_productos.push_back(pedido.ped_productos[i].cant_ventas);
    }
    cout<<"\nIngrese el día del pedido [dd]: ";
    cin>>pedido.fecha.dia;
    cout<<"\nIngrese el mes del pedido [mm]: ";
    cin>>pedido.fecha.mes;
    cout<<"\nIngrese el año del pedido [yyyy]: ";
    cin>>pedido.fecha.anio; 
    pedido.precio_total=0;
    for(int h=0;h<pedido.ped_productos.size();h++){
        if(pedido.ped_productos[h].promo) {
            pedido.precio_total += (pedido.ped_productos[h].precio * pedido.cant_ped_productos[h]) * 0.80;
        } else {
            pedido.precio_total += pedido.ped_productos[h].precio * pedido.cant_ped_productos[h];
        }

    }
    v_pedidos.push_back(pedido);  
}
    
void consultarPedido(vector<Pedido>& v_pedidos, Pedido pedido){
    cout<<"\n::Consultar Pedido::"<<endl;
    cout<<"\nIngrese nombre del cliente que quiere buscar pedido: ";
    string cliente;
    cin>>cliente;
    for(Pedido aux : v_pedidos){
        if(aux.nombre_cliente==cliente){
            cout<<"\nNombre: "<<aux.nombre_cliente;
            cout<<"\nProductos pedidos: ";
            for(int i=0;i<aux.ped_productos.size();i++){
                cout<<"\n-"<<aux.cant_ped_productos[i]<<" "<<aux.ped_productos[i].nombre;
            }
            cout<<"\nPrecio Total: "<<aux.precio_total;
            break;
        }
    }
}

void ordenarPorVentas(vector<MC_Productos> v_mc_productos, MC_Productos mc_producto, Pedido pedido){
    cout<<"\n::Ordenar Por Ventas::"<<endl;
    vector<MC_Productos> aux_ordenar;
    
    for(int i=0;i<aux_ordenar.size();i++){
        for(int j=0;j<aux_ordenar.size()-i-1;j++){
            if(aux_ordenar[j].cant_ventas < aux_ordenar[j+1].cant_ventas){
                MC_Productos temp=aux_ordenar[j];
                aux_ordenar[j]=aux_ordenar[j+1];
                aux_ordenar[j+1]=temp;
            }
        }
    }
    for(MC_Productos aux2 : aux_ordenar){
        cout<<"\nNombre: "<<aux2.nombre<<" Cantidad ventas: "<<aux2.cant_ventas;
    }
}

int menu(int seleccion){
    vector<int> seleccion_array={1,2,3};
    seleccion=70;
    cout<<"\n1-Ingresar Pedido\n2-Consultar Pedido\n3-Ordenar Por Ventas\nIngrese una opción: ";
    while(true){
        cin>>seleccion;
        if(find(seleccion_array.begin(), seleccion_array.end(), seleccion) != seleccion_array.end()){break;}
        else{cout<<"\nElija un número correcto"<<endl;}
    }
    return seleccion;
}

int main(){
    MC_Productos mc_producto;
    Pedido pedido;
    vector<Pedido> v_pedidos;
    vector<MC_Productos> v_mc_productos;
    ingresarMC_Productos(v_mc_productos, mc_producto);
    while(true){
        int seleccion=menu(seleccion);
        switch(seleccion){
        case 1:
            ingresarPedido(v_pedidos, pedido, v_mc_productos, mc_producto);
            break;
        case 2:
            consultarPedido(v_pedidos, pedido);
            break;
        case 3:
            ordenarPorVentas(v_mc_productos, mc_producto, pedido);
        default:
            break;
        }
    }
}
