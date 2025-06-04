package Objetos;

public class Cargador extends ProductoCargador{
    private int cantCargas;

    public Cargador(String nombre, double precio, int stock, int cantCargas) {
        super(nombre, precio, stock);
        this.cantCargas=cantCargas;
    }
}
