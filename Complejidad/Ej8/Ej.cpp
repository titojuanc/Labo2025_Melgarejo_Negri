/*
Realizar una función que reciba dos vectores ordenados y devuelva el vector 
resultante de concatenarlos de manera que esté ordenado. Por ejemplo: [1,4,7,10], 
[2,5,6,8] -> [1,2,4,5,6,7,8,10]. Complejidad requerida: O(n1 + n2), siendo ni la 
cantidad de elementos del vector i.
*/

vector<int> ordenar(vector v1, vector v2){
    vector<int> aux;
    int i=0;
    int j=0;

    while (i < v1.size() && j < v2.size()) {
        if (v1[i] < v2[j]) {
            aux.push_back(v1[i]);
            i++;
        } else {
            aux.push_back(v2[j]);
            j++;
        }
    }

    while (i < v1.size()) {
        aux.push_back(v1[i]);
        i++;
    }

    while (j < v2.size()) {
        aux.push_back(v2[j]);
        j++;
    }

    return aux;
}


/*
[1,7,8,9]
[2,3]
*/