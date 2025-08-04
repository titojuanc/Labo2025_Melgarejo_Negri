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
    }

    public void consumirCalorias(int calorias){
        this.calorias=+calorias;
    }
}
