package Objetos;

public class Componente {
    private String fabricante;
    private String modelo;
    private double precio;
    private int stock;
    private String tipo;

    public Componente(String fabricante, String modelo, double precio, int stock, String tipo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
        this.tipo= tipo;
    }

    public Componente(String modelo, int stock, String tipo){
        this.fabricante = "AMD";
        this.modelo = modelo;
        this.precio = 500;
        this.stock = stock;
        this.tipo = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
