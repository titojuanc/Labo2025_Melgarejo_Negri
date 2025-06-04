package Objetos;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean restarStock(int num){
        if (this.stock-num<0){
            System.out.println("Error, no hay suficiente stock");
            return false;
        }
        this.stock=this.stock-num;
        return true;
    }

    public void sumarStock(int num){
        this.stock=+num;
    }
}
