package GestionDeSueldos;

public class Proyecto {
    private int nombre;
    private double valor;

    public Proyecto(int nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public int getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }
}
