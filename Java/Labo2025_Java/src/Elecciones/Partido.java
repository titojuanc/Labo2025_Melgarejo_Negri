package Elecciones;

import java.util.HashSet;

public class Partido {
    private String nombre;
    private String direccion;
    private int cantAfiliados;
    private HashSet<Mensajero> mensajeros;

    public Partido(String nombre, String direccion, int cantAfiliados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantAfiliados = cantAfiliados;
        this.mensajeros= new HashSet<>();
    }

    public void agregarMensajero(Mensajero m){
        this.mensajeros.add(m);
    }

    public void hacerCampania(){
        for (Mensajero m : this.mensajeros){
            m.enviarMensaje();
        }
    }


}
