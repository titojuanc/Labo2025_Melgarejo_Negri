package Unidad0;

import java.util.ArrayList;
import java.util.Scanner;

public class IntroducirNumerosAmpliado {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        int num = 0;

        while (num != -1){
            System.out.println("Ingrese num: ");
            num = consola.nextInt();
            if (num!=-1){
                lista.add(num);
            }
        }
        System.out.println("Cantidad de numeros ingresados: "+lista.size());
        int maxnum = lista.getFirst();
        int minum = lista.getFirst();
        int sum = 0;
        int possum=0;
        int negsum= 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > maxnum){
                maxnum=lista.get(i);
            }
            if (lista.get(i) < minum){
                minum=lista.get(i);
            }
            sum =sum + lista.get(i);
            if (lista.get(i) >= 0) {
                possum = possum + lista.get(i);
            }
            else if (lista.get(i)<0){
                negsum = negsum + lista.get(i);
            }
        }
        System.out.println("Número más grande: "+maxnum);
        System.out.println("Número más pequeño: "+minum);
        System.out.println("Suma total: "+sum);
        System.out.println("Suma de positivos: "+possum);
        System.out.println("Suma de negativos: "+negsum);
    }
}
