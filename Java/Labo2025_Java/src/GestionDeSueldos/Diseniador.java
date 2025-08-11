package GestionDeSueldos;

import Entidades.Persona;

import java.util.HashMap;
import java.util.Map;

public class Diseniador extends Persona {
    private Tipo tipo;
    private HashMap<Proyecto, Double> registro;

    public Double aplicarComision(Double valor){
        return  valor * tipo.getPorcentaje();
    }

    public Diseniador(String nombre, String apellido, Tipo tipo) {
        super(nombre, apellido);
        this.tipo = tipo;
        this.registro = new HashMap<>();
    }









    public void agregarProyecto(Proyecto proyecto){
        registro.put(proyecto, proyecto.getValor());
        System.out.println("Proyecto "+proyecto.getNombre()+" agregado.");
    }

    public int cantidadProyectos(){
        return registro.size();
    }

    public Double sueldo(){
        Double plata=0.0;
        for (Double ganado : registro.values()){
            plata=+ganado;
        }
        return plata+aplicarComision(plata);
    }

    public Double ganadoSinComision(Proyecto proyecto){
        return proyecto.getValor();
    }

    public void mostarSueldoDiscriminado(){
       for (Map.Entry<Proyecto, Double> l : registro.entrySet()){
           System.out.println("Proyecto: "+l.getKey().getNombre());
           System.out.println("Ganado: "+l.getValue());
           System.out.println("Comisión aparte: "+aplicarComision(l.getValue()));
           System.out.println("");
       }
    }


}
