package ControlDeCalorías;

import java.util.HashSet;

public class Plato {
    private String nombre;
    private HashSet<String> ingredientes;
    private int calorias;

    public Plato(String nombre, HashSet<String> ingredientes, int calorias){
        this.nombre=nombre;
        this.ingredientes=ingredientes;
        this.calorias=calorias;
    }

    public int getCalorias() {
        return calorias;
    }
}
