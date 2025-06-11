package Entidades;

public class Pez extends Mascota{
    int vidas;

    public Pez(String nombre, Persona duenio) {
        super(nombre, duenio);
        this.vidas = 10;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public boolean verificarMuerte(){
        if (this.vidas<=0){
            return true;
        }
        return false;
    }

    @Override
    public String queSoy() {
        return "Pez";
    }

    @Override
    public void saludar(Persona persona) {
        if (esDuenio(persona)){
            this.vidas-=1;
        }
        else{
            this.vidas=0;
        }
    }

    @Override
    public void alimentar() {
        this.vidas+=1;
    }
}
