package Ej_Recetas;

import Enumeraciones.Dificultad;
import Enumeraciones.TemperaturaServido;

import java.util.ArrayList;

public class Entrada extends Platillo{
    private TemperaturaServido temperaturaServido;
    public Entrada(String nombre, Dificultad dificultad, ArrayList<String> receta, TemperaturaServido temperaturaServido) {
        super(nombre, dificultad, receta);
        this.temperaturaServido=temperaturaServido;
    }

    @Override
    public void pasos_a_seguir() {
        if (temperaturaServido.equals(TemperaturaServido.FRIO)){
            mostrar_pasos();
            System.out.println("RECORDAD: guarde el platillo en la heladera");
        }
        else {
            System.out.println("RECORDAD: prenda el horno");
            mostrar_pasos();
        }
    }

    @Override
    String tipo() {
        return "Entrada";
    }
}

