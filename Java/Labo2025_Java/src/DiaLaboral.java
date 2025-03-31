import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        Scanner e= new Scanner(System.in);
        System.out.println("Ingrese un día de la semana, con mayúscula en la primera letra");
        String dia= e.nextLine();
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        boolean laboral = false;
        for (String s : dias) {
            if (s.equals(dia)) {
                System.out.println("El día " + dia + " es un día laboral.");
                laboral = true;
            }
        }
        if (!laboral){
            System.out.println("El día "+dia+" no es laboral.");
        }
    }
}
