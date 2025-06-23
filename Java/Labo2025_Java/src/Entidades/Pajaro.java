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

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    private void restarAlegria(){
        if(this.alegria>1){
            this.alegria-=1;
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
        restarAlegria();
    }

    @Override
    public void alimentar() {
        this.alegria=alegria+1;

    }
}
