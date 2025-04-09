package Unidad0;

import java.util.Scanner;

public class IngresoDatos {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        int N;
        double A;
        char C;
        int ascii;

        System.out.println("Ingrese el valor de N");
        N = consola.nextInt();
        System.out.println("Ingrese el valor de A");
        A = consola.nextDouble();
        System.out.println("Ingrese el valor de C");
        C = consola.next().charAt(0);
        ascii=(int) C;

        System.out.println("Variable N= "+N);
        System.out.println("Variable A= "+A);
        System.out.println("Variable C= "+C);
        System.out.println("Suma N+A= "+(N+A));
        System.out.println("Diferencia A-N= "+(A-N));
        System.out.println("Valor numerico de C= "+ascii);
    }
}
