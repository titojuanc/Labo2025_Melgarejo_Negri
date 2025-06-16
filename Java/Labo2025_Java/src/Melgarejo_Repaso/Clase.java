package Melgarejo_Repaso;

import Entidades.Director;
import Entidades.Persona;

public class Clase {
    private String nombre;
    private int hora;
    private int cuposMax;
    private Persona entrenador;

    public Clase (String nombre, int hora, int cuposMax){
        this.nombre=nombre;
        this.hora=hora;
        this.cuposMax=cuposMax;
        this.entrenador=new Director();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuposMax() {
        return cuposMax;
    }

    public void setCuposMax(int cuposMax) {
        if (cuposMax<=0){
            this.cuposMax=1;
        }
        else {
            this.cuposMax = cuposMax;
        }

    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora>=23) {
            this.hora=23;
        }
        else if(hora<=0){
            this.hora=0;
        }
        else {
            this.hora = hora;
        }
    }


}
