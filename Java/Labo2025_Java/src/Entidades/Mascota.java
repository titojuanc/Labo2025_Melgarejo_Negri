package Entidades;

public abstract class Mascota {
    String nombre;
    Persona duenio;

    public Mascota(String nombre, Persona duenio) {
        this.nombre = nombre;
        this.duenio = duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    public boolean esDuenio(Persona persona){
        return persona.equals(this.duenio);
    }

    public void saludar(Persona persona){}

    public void alimentar(){}

    public boolean verificarMuerte(){
        return true;
    }

    public String queSoy(){
        return "";
    }
}
