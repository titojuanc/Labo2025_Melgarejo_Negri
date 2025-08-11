package ControlDeCalorías;

import Entidades.Persona;

public class Integrante extends Persona {
    private int calorias;
    public Integrante(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.calorias=0;
    }

    public int getCalorias() {
        return calorias;
    }
    public void setCalorias(int calorias){
        this.calorias=calorias;
    } // por si ya tiene calorías previas consumidas que quiere registrar

    public void consumirCalorias(Plato plato){
        this.calorias=+plato.getCalorias();
    }
}
