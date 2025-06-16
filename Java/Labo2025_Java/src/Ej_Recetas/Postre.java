package Ej_Recetas;

import Enumeraciones.Dificultad;

import java.util.ArrayList;

public class Postre extends Platillo{
    private int temperatura;
    private boolean apto_diabetico;
    public Postre(String nombre, Dificultad dificultad, ArrayList<String> receta, int temperatura, boolean apto_diabetico) {
        super(nombre, dificultad, receta);
        this.temperatura=temperatura;
        this.apto_diabetico=apto_diabetico;
    }

    public boolean SoyEse(String s){
        if(s.equals("Postre")){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void pasos_a_seguir() {
        for (String paso : this.getPasos()){
            System.out.println("RECORDAR: Mantener limpia la cocina y el horno al mínimo");
            System.out.println(paso);
        }
    }

}