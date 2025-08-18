package ControlDeCalorías;

import Entidades.Persona;
import org.hamcrest.core.SubstringMatcher;

import java.util.HashMap;
import java.util.Map;

public class Integrante extends Persona {
    private HashMap<Plato, Integer> platos;
    public Integrante(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad); // Al no usarse la fecha de nacimiento, usamos edad para hacer más simple.
        this.platos=new HashMap<>();
    }

    public int consumoTotal(){
        int suma=0;
        for (Map.Entry<Plato, Integer> l : this.platos.entrySet()){
            suma += l.getKey().getCalorias()*l.getValue();
        }
        return suma;
    }
}
