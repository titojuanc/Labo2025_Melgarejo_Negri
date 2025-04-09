package Unidad0;

import java.util.ArrayList;
import java.util.Scanner;

public class IntroducirNumeros {
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
    }
}
