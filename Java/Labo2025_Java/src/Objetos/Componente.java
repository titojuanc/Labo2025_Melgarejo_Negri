package Objetos;

import Enumeraciones.Fabricante;
import Enumeraciones.TipoDeComponente;

public class Componente {
    private Fabricante fabricante;
    private String modelo;
    private double precio;
    private int stock;
    private TipoDeComponente tipo;

    public Componente(Fabricante fabricante, String modelo, double precio, int stock, TipoDeComponente tipo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
        this.tipo= tipo;
    }

    public Componente(String modelo, int stock, TipoDeComponente tipo){
        this.fabricante = Fabricante.AMD;
        this.modelo = modelo;
        this.precio = 500;
        this.stock = stock;
        this.tipo = tipo;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
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

    public TipoDeComponente getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeComponente tipo) {
        this.tipo = tipo;
    }
}
