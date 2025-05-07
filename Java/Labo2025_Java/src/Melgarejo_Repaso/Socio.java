package Melgarejo_Repaso;

public class Socio {
    private String nombre;
    private int edad;
    private int id;
    private boolean activo;

    public Socio(String nombre, int edad, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = 5;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
