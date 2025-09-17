/*
Dada una secuencia de n números enteros, dar un programa que encuentre la
máxima cantidad de elementos impares consecutivos cuya tiempo de ejecución de
peor caso pertenezca a O(n).
*/

int imparesConsecutivos(vector v){
    int cont_max = 0;
    int actu = 0;
    for (int i = 0; i<v.size(); i++){
        while ( i < v.size() && v[i] % 2 != 0){
            actu++;
            i++;
        }
        if(actu > cont_max){
            cont_max = actu;
            actu=0;
        }
    }
}