package Sistema_de_poblacion;

import java.util.HashSet;

public abstract class Lugar {
    private String nombre;
    private int codigo;
    private HashSet<Coordenada> coordenadas;

    public Lugar(){
        this.nombre = "";
        this.codigo = 0;
        this.coordenadas = new HashSet<Coordenada>();
    }

    public Lugar(int codigo){
        this.nombre = "";
        this.codigo = codigo;
        this.coordenadas = new HashSet<Coordenada>();
    }

    public Lugar(String nombre, int codigo, HashSet<Coordenada> coordenadas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.coordenadas = coordenadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public HashSet<Coordenada> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(HashSet<Coordenada> coordenadas) {
        this.coordenadas = coordenadas;
    }

    public abstract int getPoblacion();
}
