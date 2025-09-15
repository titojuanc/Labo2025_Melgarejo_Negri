/*Contar la cantidad de operaciones elementales que realizan los siguientes 
programas.*/
#include <vector>

int ultimo1 (vector v) { 
    return v[ v.size() - 1 ]; /*4*/  /*Total = 4*/
}        

int ultimo2 (vector v) { 
    int i = v.size();         /*2*/
    return v[ i - 1 ];        /*3*/  /*Total = 5*/
}

int ultimo3 (vector v) { 
    int i = 0;                /*1*/  
    while ( i < v.size() ) {  /*3n*/
        i ++;
    }
    return v[ i - 1 ];        /*3*/  /*Total = 4+3n*/  
}
