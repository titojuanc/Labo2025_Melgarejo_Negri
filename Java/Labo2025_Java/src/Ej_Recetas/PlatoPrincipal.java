package Ej_Recetas;

import Enumeraciones.Dificultad;

import java.util.ArrayList;

public class PlatoPrincipal extends Platillo{
    private int tiempoCoccion;
    private int comensales;
    public PlatoPrincipal(String nombre, Dificultad dificultad, ArrayList<String> receta, int tiempoCoccion, int comensales) {
        super(nombre, dificultad, receta);
        this.comensales=comensales;
        this.tiempoCoccion=tiempoCoccion;
    }

    public boolean SoyEse(String s){
        if(s.equals("PlatoPrincipal")){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void pasos_a_seguir() {
        System.out.println("Esta receta tarda en cocinarse "+tiempoCoccion+" minutos, " + " y los pasos son:");
        mostrar_pasos();
    }
}
