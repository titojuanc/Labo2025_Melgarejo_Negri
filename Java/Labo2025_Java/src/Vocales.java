package Unidad0;

public class Vocales {
    public static void main(String[] args) {

        String frase="Ayer me compré muñecos de la marca ‘ToyCo’ por internet.";
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'á' || letra == 'é' || letra == 'í' || letra == 'o' || letra == 'ú'){
                cont++;
            }
        }
        System.out.println("Cantidad Vocales: "+cont);
    }
}
