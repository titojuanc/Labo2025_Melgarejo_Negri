package ControlDeCalorías;

import java.util.HashSet;

public class Plato {
    private String nombre;
    private HashSet<Ingrediente> ingredientes;

    public Plato(String nombre, HashSet<Ingrediente> ingredientes){
        this.nombre=nombre;
        this.ingredientes=ingredientes;
    }

    public int getCalorias() {
        int suma = 0;
        for (Ingrediente i : this.ingredientes){
            suma += i.getCalorias();
        }
        return suma;
    }

    public HashSet<Ingrediente> getIngredientes(){
        return this.ingredientes;
    }
}
