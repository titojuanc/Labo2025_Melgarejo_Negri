/*
Suponer que tenemos tres vectores ordenados y que sabemos que hay un elemento 
en común entre ellos. Programar una función que reciba los tres vectores y retorne 
un vector con los índices donde está dicho elemento. Por ejemplo: [1,3,4], [3,5,7], 
[1,2,3] -> [1,0,2]. Complejidad requerida: O(n1 + n2 + n3), siendo ni la cantidad de 
elementos del vector i.
*/

/*

{1,3,4,6}
{3,5,7,9}
{1,2,3,8}

*/ 


vector<int> elementoComun(vector v1, vector v2, vector v3){
    int i=0, j=0, h=0;
    vector<int> aux;
    while (i < v1.size() && j < v2.size() && h < v3.size()) {
        if (v1[i] == v2[j] && v2[j] == v3[h]) {
            return {i, j, h};  // Encontrado
        }

        if (v1[i] < v2[j] && v1[i] < v3[h]) {
            i++;
        } else if (v2[j] < v1[i] && v2[j] < v3[h]) {
            j++;
        } else {
            h++;
        }
    }
    return {}
}

