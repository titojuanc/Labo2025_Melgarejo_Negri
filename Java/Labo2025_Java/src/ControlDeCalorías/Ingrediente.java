package ControlDeCalorías;

public class Ingrediente {
    private String nombre;
    private int calorias;

    public Ingrediente(String nombre, int calorias) {
        this.calorias = calorias;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}
