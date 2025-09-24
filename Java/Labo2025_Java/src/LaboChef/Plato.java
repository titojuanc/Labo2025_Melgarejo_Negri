package LaboChef;

import ControlDeCalorías.Ingrediente;

import java.util.HashMap;

public  class Plato{
    private String nombre;
    private HashMap<Ingrediente, Integer> ingredientes_necesarios;
    private int tiempo_preparacion;

    public Plato(String nombre, HashMap<Ingrediente, Integer> ingredientes_necesarios, int tiempo_preparacion) {
        this.nombre = nombre;
        this.ingredientes_necesarios = ingredientes_necesarios;
        this.tiempo_preparacion = tiempo_preparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<Ingrediente, Integer> getIngredientes_necesarios() {
        return ingredientes_necesarios;
    }

    public void setIngredientes_necesarios(HashMap<Ingrediente, Integer> ingredientes_necesarios) {
        this.ingredientes_necesarios = ingredientes_necesarios;
    }

    public int getTiempo_preparacion() {
        return tiempo_preparacion;
    }

    public void setTiempo_preparacion(int tiempo_preparacion) {
        this.tiempo_preparacion = tiempo_preparacion;
    }

}
