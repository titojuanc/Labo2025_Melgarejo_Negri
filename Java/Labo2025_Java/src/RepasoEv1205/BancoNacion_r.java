package RepasoEv1205.Ej2;

import Entidades.Persona;

import java.util.ArrayList;

public class BancoNacion_r {
    private String direccion;
    private ArrayList<Persona> trabajadores;
    private boolean cajeros_automaticos;
    private boolean rampa_discapacitados;

    public BancoNacion_r() {
        this.direccion="";
        this.trabajadores=new ArrayList<>();
        this.cajeros_automaticos=false;
        this.rampa_discapacitados=false;
    }

    public BancoNacion_r(String direccion, ArrayList<Persona> trabajadores, boolean cajeros_automaticos, boolean rampa_discapacitados) {
        this.direccion = direccion;
        this.trabajadores = trabajadores;
        this.cajeros_automaticos = cajeros_automaticos;
        this.rampa_discapacitados = rampa_discapacitados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Persona> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Persona> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public boolean isCajeros_automaticos() {
        return cajeros_automaticos;
    }

    public void setCajeros_automaticos(boolean cajeros_automaticos) {
        this.cajeros_automaticos = cajeros_automaticos;
    }

    public boolean isRampa_discapacitados() {
        return rampa_discapacitados;
    }

    public void setRampa_discapacitados(boolean rampa_discapacitados) {
        this.rampa_discapacitados = rampa_discapacitados;
    }

    public void agregarTrabajador(Persona p){
        if (!this.trabajadores.contains(p)){
            this.trabajadores.add(p);
        }
        else {
            System.out.println("Ya existe");
        }
    }

    public int cantidadTrabajadores(){
        return trabajadores.size();
    }

    public Persona empleadoMayorAntiguedad(){
        Persona p=this.trabajadores.get(0);
        for (Persona persona : this.trabajadores){
            if (persona.getEdad()>p.getEdad()){
                p=persona;
            }
        }
        return p;
    }
}
