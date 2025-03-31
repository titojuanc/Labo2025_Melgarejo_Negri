public class ReemplazarLetra {
    public static void main(String[] args) {
        String texto = "Ayer me compré muñecos de la marca ‘ToyCo’ por internet.";
        String ntexto = "";
        for (int i = 0; i < texto.length() ; i++) {
            if (!(texto.charAt(i)=='e')){
                ntexto = ntexto+texto.charAt(i);
            }
        }
        System.out.println(ntexto);
    }
}
