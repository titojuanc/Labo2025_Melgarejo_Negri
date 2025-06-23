package Sistema_de_bebidas;

public class Alcoholica extends Bebida{
    private double cantidad_de_alcohol;

    public Alcoholica(String nombre, double cantidad_de_alcohol) {
        super(nombre, 0, cantidad_de_alcohol*20);
        this.cantidad_de_alcohol = cantidad_de_alcohol;
    }

    public double getCantidad_de_alcohol() {
        return cantidad_de_alcohol;
    }

    public void setCantidad_de_alcohol(double cantidad_de_alcohol) {
        this.cantidad_de_alcohol = cantidad_de_alcohol;
    }

}
