/*Calcular el tiempo de ejecución de peor caso (en notación O grande) de los 
siguientes programas con respecto al tamaño de los secuencias de entrada. 
Recordar que tanto la lectura como la escritura de un elemento en un vector 
tiene tiempo de ejecución perteneciente a O(1).*/
#include <vector>

void f1 (vector &vec) {
    i = vec.size() / 2;                         /*O(1)*/
    while ( i >= 0 ){                           /*O(n/2)*/
        vec [ vec.size () / 2 - i ] = i;
        vec [ vec.size () / 2 + i ] = i;
        i - -;
    }                                           /*Total = O(n)*/
}

void f2 (vector &vec) {
    i = 0;                                      /*O(1)*/ 
    while ( i < 10000){                         /*O(1)*/
        vec [ vec.size() / 2 - i ] = i ;
        vec [ vec.size() / 2 + i ] = i ;
        i ++;
    }                                           /*Total = O(1)*/
}

int f3 (vector &v1, int e) {
    int i = 0;                                  /*O(1)*/
    while ( v1[ i ] != e ){                     /*O(n)*/
        i ++;
    }
    return i;                                   /*O(1)*/
}                                               /*Total = O(n)*/

void f4 (vector &vec) {
    int rec = 0;                                /*O(1)*/
    int max_iter = 1000;                        /*O(1)*/
    if (max_iter > vec.size()) {                /*O(1)*/
        max_iter = vec . size ();               
    }
    for (int i =0; i < max_iter; i++) {         /*O(1)*/
        for(int j =0; j < max_iter ; j++) {
            res += vec [ i ] * vec [ j ];
        }
    }
}                                               /*Total = O(1)*/

void f5 (vector &v1 , vector &v2) {
    vector res ();          
    for (int i =0; i < v1 . size (); i ++){     /*O(n)*/
        res.push_back (v1[ i ]); // O(1)
    }
    for (int i =0; i < v2 . size (); i ++){     /*O(m)*/
        res.push_back (v2[ i ]); // O(1)
    }
    return res ;
}                                               /*O(n+m)*/
