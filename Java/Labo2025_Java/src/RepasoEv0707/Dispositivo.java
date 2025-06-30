package RepasoEv0707;

public enum Dispositivo {
    CAMARA(1), RADARES(1), CAMIONES(1);
    private int cantidad;


    private Dispositivo(int cantidad){
        this.cantidad=cantidad;
    }

    private void agregarStock(int stock){
        this.cantidad=this.cantidad+stock;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
