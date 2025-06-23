package Sistema_de_bebidas;

public class Azucarada extends Bebida{
    private double cantidad_de_azucar;

    public Azucarada(String nombre, double cantidad_de_azucar) {
        super(nombre, 1, cantidad_de_azucar*10);
        this.cantidad_de_azucar = cantidad_de_azucar;
    }

    public double getCantidad_de_azucar() {
        return cantidad_de_azucar;
    }

    public void setCantidad_de_azucar(double cantidad_de_azucar) {
        this.cantidad_de_azucar = cantidad_de_azucar;
    }
}
