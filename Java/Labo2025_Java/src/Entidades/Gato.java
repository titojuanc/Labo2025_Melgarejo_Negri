package Entidades;

public class Gato extends Mascota{
    int alegria;

    public Gato(String nombre, Persona duenio) {
        super(nombre, duenio);
        this.alegria=1;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    private void saludarDuenio(){
        System.out.println("miau");
    }

    private void  saludarDesconocido(){
        System.out.println("MIAU!");
    }

    private void restarAlegria(){
        if(this.alegria>1){
            this.alegria-=1;
        }
    }

    @Override
    public String queSoy() {
        return "Gato";
    }

    @Override
    public void saludar(Persona persona) {
        if(esDuenio(persona)){
            saludarDuenio();
        }
        else{
            saludarDesconocido();
        }
        restarAlegria();
    }

    @Override
    public void alimentar() {
        this.alegria+=1;
    }
}
