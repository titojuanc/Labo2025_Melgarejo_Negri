package Objetos;

public class Plato {
    private String nombre;
    private double precio;
    private int veces_pedidas;

    public Plato() {
        this.nombre = "";
        this.precio = 0;
        this.veces_pedidas=0;
    }

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.veces_pedidas=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVeces_pedidas() {
        return veces_pedidas;
    }

    public void setVeces_pedidas(int veces_pedidas) {
        this.veces_pedidas = veces_pedidas;
    }

}
