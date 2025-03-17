#include <iostream>
#include <vector>
#include <algorithm>
#include <utility> 
using namespace std;

//Revisar Agregar pedidos para poner bien el precio total :)

struct Pedido{
    int numero;
    string nombre_cliente;
    vector<string> productos;
    vector<int> cantidades;
    float precio;
};

void agregar_pedido(vector<Pedido>& pedidos, Pedido pedido, vector<string> menu_restaurante, vector<float> menu_restaurante_precios, int numero_pedido_aux){
    char salir='x';
    cout<<"\nAgregar un pedido"<<endl;
    while(true){
        cout<<"\n¿Salir? [S][N]: ";
        cin>>salir;
        if(salir=='S'){break;}
        pedido;
        pedido.numero=numero_pedido_aux;
        cout<<"\nIngrese nombre del cliente: ";
        cin>>pedido.nombre_cliente;
        cout<<"\nMenú: "<<endl;
        for(int i=0;i<menu_restaurante.size();i++){cout<<"\n-"<<menu_restaurante[i]<<" "<<menu_restaurante_precios[i];}
        cout<<"\nIngrese los productos que quiera pedir (ponga \"listo\" cuando queira dejar de pedir) : ";
        while(true){
            string producto;
            cin>>producto;
            if(producto=="listo"){break;}
            else{
                pedido.productos.push_back(producto);
            }
        }
        
        cout<<"\nIngrese las cantidades: ";
        for(int h=0;h<pedido.productos.size();h++){
            int cantidad;
            cout<<"\nCuantas cantidades de "<<pedido.productos[h]<<" quiere: ";
            cin>>cantidad;
            pedido.cantidades.push_back(cantidad);
        }
        pedido.precio=0;
        for(int j=0;j<pedido.productos.size();j++){
            for(int k=0;k<menu_restaurante.size();k++){
                if(pedido.productos[j]==menu_restaurante[k]){pedido.precio+=menu_restaurante_precios[k]*pedido.cantidades[j];}
            }
        }
        pedidos.push_back(pedido);
        numero_pedido_aux+=1;
    }
}

void cancelar_pedido(vector<Pedido>& pedidos, Pedido pedido){
    int num_pedido_a_eliminar;
    cout<<"\nIngrese el número de pedido que queira eliminar: ";
    cin>>num_pedido_a_eliminar;
    for(Pedido pedido_each : pedidos){
        if(pedido_each.numero==num_pedido_a_eliminar){
            pedidos.erase(pedidos.begin() + pedido_each.numero-1);
            break;
        }
    }
}

void mostrar_pedidos_en_curso(vector<Pedido>& pedidos, Pedido pedido){
    for(int i=0;i<pedidos.size();i++){
        cout<<"\nNumero: "<<pedidos[i].numero;
        cout<<"\nNombre: "<<pedidos[i].nombre_cliente;
        cout<<"\nProductos: ";
        for(int j=0;j<pedidos[i].productos.size();j++){
            cout<<"\n-"<<pedidos[i].productos[j]<<" "<<pedidos[i].cantidades[j];
        }
        cout<<"\nPrecio Total: "<<pedidos[i].precio;
    }
}

void mostrar_ingresos(vector<Pedido>& pedidos, Pedido pedido){
    float ingresos_totales=0;
    for(int i=0;i<pedidos.size();i++){
        ingresos_totales+=pedidos[i].precio;
    }
    cout<<"\nEl ingreso total es de: $"<<ingresos_totales<<endl;
}

int main(){
    vector<int> menu_seleccion={1,2,3,4};
    vector<string> menu_restaurante={"Hamburguesa","PapasFritas","Pizza","Agua","CocaCola"};
    vector<float> menu_restaurante_precios={3850.70, 1375.25, 12500.50, 425.00, 500.50};
    Pedido pedido;
    vector<Pedido> pedidos;
    int numero_pedido_aux=1;
    cout<<"\nBienvenido al Restaurante, ¿Que quiere hacer?";
    while(true){
        cout<<"\n1-Agregar pedido\n2-Cancelar Pedido\n3-Mostrar Pedidos\n4-Mostrar Ingresos\n---> ";
        int seleccion=9;
        while(true){
        cin>>seleccion;
            if(find(menu_seleccion.begin(), menu_seleccion.end(), seleccion) != menu_seleccion.end()){
                break;
            }
            else{cout<<"\nElija un número correcto"<<endl;}
        }

        switch (seleccion){
        case 1:
            agregar_pedido(pedidos, pedido, menu_restaurante, menu_restaurante_precios, numero_pedido_aux);
            break;
        case 2:
            cancelar_pedido(pedidos, pedido);
            break;
        case 3:
            mostrar_pedidos_en_curso(pedidos, pedido);
            break;
        case 4:
            mostrar_ingresos(pedidos, pedido);
            break;
        default:
            break;
        }
    }
}