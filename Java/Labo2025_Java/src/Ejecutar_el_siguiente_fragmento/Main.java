package Ejecutar_el_siguiente_fragmento;

public class Main {

    public int largoNombre(String nombre)throws NullPointerException{
        return nombre.length();
    }

    public int largoNombrePerso(String nombre) throws NombreNullException {
        if(nombre == null){
            throw new NombreNullException("Poner un nombre válido (Personalizado)");
        }
        return largoNombre(nombre);
    }

    public static void main(String[] args) {
        try{
            String nombre = null;
            System.out.println("El largo del nombre es:" + nombre.length());
        }
        catch (NullPointerException exc){
            System.err.println("Poner un nombre válido (try/catch)");
        }

        try{
            String nombre = null;
            if (nombre == null){
                throw new IllegalArgumentException("Poner un nombre válido (throw)");
            }
            System.out.println("El largo del nombre es:" + nombre.length());
        }
        catch (IllegalArgumentException exc){
            System.err.println(exc);
        }

        try{
            Main m=new Main();
            m.largoNombre(null);
        }
        catch (NullPointerException exc){
            System.err.println("Poner un nombre válido (throws)");
        }

        try{
            String nombre=null;
            Main m=new Main();
            m.largoNombrePerso(nombre);
        }
        catch (NombreNullException exc){
            System.err.println(exc);
        }
    }
}