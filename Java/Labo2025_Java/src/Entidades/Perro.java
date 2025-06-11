package Entidades;

public class Perro extends Mascota{
    int alegria;

    public Perro(String nombre, Persona duenio) {
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
        System.out.println("guau");
    }

    private void  saludarDesconocido(){
        System.out.println("GUAU!");
    }

    private void restarAlegria(){
        if(this.alegria>1){
            this.alegria-=1;
        }
    }

    @Override
    public String queSoy(){
        return "Perro";
    }

    @Override
    public void saludar(Persona persona) {
        for (int i=0;i<alegria;i++){
            if(esDuenio(persona)){
                saludarDuenio();
            }
            else{
                saludarDesconocido();
            }
        }
        restarAlegria();
    }

    @Override
    public void alimentar() {
        this.alegria+=1;
    }
}
