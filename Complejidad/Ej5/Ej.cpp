/*¿Qué tiempo de ejecución de peor caso tiene el programa en función del valor n?*/

int sumarPotenciaHasta (int n) {
    int res = 0;
    int i = 1; 
    while( i < n ) {
        res = res + i; 
        i = i * 2;
    }
    return res;
}   

/*RTA: O(Log2 (n))*/