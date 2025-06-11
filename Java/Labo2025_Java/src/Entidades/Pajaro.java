package Entidades;

public class Pajaro extends Mascota{
    int alegria;
    boolean cantor;
    String saludo;

    public Pajaro(String nombre, Persona duenio, boolean cantor) {
        super(nombre, duenio);
        this.alegria = 1;
        this.cantor = cantor;
        if (cantor){
            this.saludo="Franco Callipo";
        }
        else {
            this.saludo="pio";
        }
    }

    @Override
    public String queSoy() {
        return "Pajaro";
    }

    @Override
    public void saludar(Persona persona) {
        if(esDuenio(persona)){
            System.out.println(this.saludo);
        }
    }

    @Override
    public void alimentar() {

    }
}
