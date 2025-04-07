package Unidad0;

import java.util.Scanner;

public class PalabrasIguales {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese palabra 1: ");
        String palabra1 = consola.nextLine();
        System.out.println("Ingrese palabra 2: ");
        String palabra2 = consola.nextLine();

        if (palabra1.equals(palabra2)){
            System.out.println("Las palabras son iguales");
        }
        else {
            System.out.println("Las palabras no son iguales");
        }
    }
}

