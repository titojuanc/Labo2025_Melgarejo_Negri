package Entidades;

public class Cliente extends Persona {
    private int celular;
    private String metodo;

    public Cliente(String nombre, String apellido, int edad, String metodo, int celular) {
        super(nombre, apellido, edad);
        this.metodo = metodo;
        this.celular = celular;
    }

    public Cliente() {
        super("Carlos", "Jonte", 45);
        this.metodo = "Tarjeta";
        this.celular = 23548754;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
}

