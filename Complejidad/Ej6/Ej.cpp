/*
Dada una secuencia de n números enteros, dar un programa que encuentre la
máxima cantidad de elementos impares consecutivos cuya tiempo de ejecución de
peor caso pertenezca a O(n).
*/

int imparesConsecutivos(vector v){
    int cont_max = 0;                           /*2*/
    int actu = 0;                               /*2*/
    for (int i = 0; i<v.size(); i++){           /*2+4n*/
        while ( i < v.size() && v[i] % 2 != 0){ /*6*/
            actu++;                             /*2*/
            i++;                                /*2*/
        }                                           
        if(actu > cont_max){                    /*1*/
            cont_max = actu;                    /*1*/
            actu=0;                             /*1*/
        }
    }
}

/*6+17n*/