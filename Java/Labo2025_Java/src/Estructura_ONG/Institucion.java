package Estructura_ONG;

public class Institucion {
    private String nombre;
    private String direccion;

    public Institucion(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}
