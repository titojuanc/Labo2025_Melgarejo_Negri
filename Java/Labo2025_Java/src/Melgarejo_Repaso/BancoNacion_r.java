package Melgarejo_Repaso;

import java.util.ArrayList;

public class BancoNacion_r {
    private String direccion;
    private ArrayList<Persona_r> trabajadores;
    private boolean cajeros_automaticos;
    private boolean rampa_discapacitados;

    public BancoNacion_r() {
        this.direccion="";
        this.trabajadores=new ArrayList<>();
        this.cajeros_automaticos=false;
        this.rampa_discapacitados=false;
    }

    public BancoNacion_r(String direccion, ArrayList<Persona_r> trabajadores, boolean cajeros_automaticos, boolean rampa_discapacitados) {
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

    public ArrayList<Persona_r> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Persona_r> trabajadores) {
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

    public void agregarTrabajador(Persona_r p){
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

    public Persona_r empleadoMayorAntiguedad(){
        Persona_r p=this.trabajadores.get(0);
        for (Persona_r persona : this.trabajadores){
            if (persona.antiguedad().getYear() < p.antiguedad().getYear()){
                if (persona.antiguedad().getMonthValue()<p.antiguedad().getMonthValue()){
                    if (persona.antiguedad().getDayOfMonth() < p.antiguedad().getDayOfMonth()){
                        p=persona;
                    }
                }
            }
        }
        return p;
    }
}
