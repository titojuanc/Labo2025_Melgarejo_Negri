/*
Realizar una función que reciba un vector de números enteros entre 1 y 3 y lo 
devuelva ordenado. Por ejemplo: [1,2,1,1,3,3] -> [1,1,1,2,3,3]. Complejidad 
requerida: O(n), siendo n la cantidad de elementos del vector.
*/

void ordenar(vector &v){
    int i=0, uno=0, dos=0, tres=0;
    while (i<v.size()){
        if(v[i] == 1){
            v[i] = 1;
        }
        else if(v[i] == 2){
            v[i] = 2;
        }
        else{
            v[i] = 3;
        }
        i++;
    }
}