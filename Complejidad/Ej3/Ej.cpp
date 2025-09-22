/*
a) ¿Qué hace este programa?
b) Calcular el tiempo de ejecución de peor caso de este programa en función
del tamaño del vector.
c) ¿Es posible escribir otro programa que resuelva el problema utilizando solo un
ciclo?
*/

int mesetaMasLarga (vector &v) {
    int inicio= 0;
    int maxMeseta =0; 
    int meseta ;
    while ( inicio< v.size () ) {                           /*O(n)*/
        int fin= inicio+ 1;
        while ( fin< v.size () && v [ inicio] == v [ fin]) {  /*O(n-1)*/
            fin++;
        }
        meseta = fin- inicio;
        inicio= fin;
        if ( meseta > maxMeseta ) {                     /*O(1)*/
            maxMeseta = meseta ;
        }
    }
    return maxMeseta ;
}

/*a) El programa revisa las longitudes de las mesetas dentro del vector y retorna 
la longitud de la meseta mas larga. Ejemplo del vector = [1,1,1,2,2,3,3,3,3], rta = 4*/
/*
[1,1,1,2,2,3,3,3,3]
[1,1,1,1,1,1,1,1,1]
[1,2,3,4,5,6,7,8,9]
*/
/*b) El peor caso es O(n)*/
/*c) Si
int mesetaMasLarga(vector v){
    int maxMeseta = 0;
    int meseta = 0;
    int j=0;
    int i=0;
    while (i<v.size()){
        if(v[i] == v[j]){
            j++
            
        } else {
            meseta = j-i;
            if(meseta > maxMeseta){
                maxMeseta = meseta;
                meseta=0;
            }
            i=j;
        }
        
    }
}
*/