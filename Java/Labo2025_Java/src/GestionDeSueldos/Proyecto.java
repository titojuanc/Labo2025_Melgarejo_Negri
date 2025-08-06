package GestionDeSueldos;

public class Proyecto {
    private String nombre;
    private double valor;

    public Proyecto(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }
}
