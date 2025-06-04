package Objetos;

import Enumeraciones.Fabricantes;
import Enumeraciones.TiposDeComponente;

public class Componente {
    private Fabricantes fabricante;
    private String modelo;
    private double precio;
    private int stock;
    private TiposDeComponente tipo;

    public Componente(Fabricantes fabricante, String modelo, double precio, int stock, TiposDeComponente tipo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
        this.tipo= tipo;
    }

    public Componente(String modelo, int stock, TiposDeComponente tipo){
        this.fabricante = Fabricantes.AMD;
        this.modelo = modelo;
        this.precio = 500;
        this.stock = stock;
        this.tipo = tipo;
    }

    public Fabricantes getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricantes fabricante) {
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

    public TiposDeComponente getTipo() {
        return tipo;
    }

    public void setTipo(TiposDeComponente tipo) {
        this.tipo = tipo;
    }
}
