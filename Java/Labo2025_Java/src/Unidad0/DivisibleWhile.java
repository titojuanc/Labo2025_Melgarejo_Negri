package Unidad0;

public class DivisibleWhile {
    public static void main(String[] args) {

        int i=0;

        while(i<=100){
            if (i%2==0 && i%3==0){
                System.out.println("Numero: "+i);
            }
            i++;
        }
    }
}
