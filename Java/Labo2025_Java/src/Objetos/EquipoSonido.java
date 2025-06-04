package Objetos;

public class EquipoSonido extends ProductoMultimedia{
    private boolean bluetooth;

    public EquipoSonido(String nombre, double precio, int stock, boolean bluetooth) {
        super(nombre, precio, stock);
        this.bluetooth=bluetooth;
    }
}
