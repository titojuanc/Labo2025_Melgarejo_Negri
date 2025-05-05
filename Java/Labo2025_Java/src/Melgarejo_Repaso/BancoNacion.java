package Melgarejo_Repaso;

import java.util.ArrayList;

public class BancoNacion {
    private String direccion;
    private ArrayList<PersonaBanco> trabajadores;
    private boolean b1;
    private boolean b2;

    public BancoNacion(String direccion, boolean b1, boolean b2) {
        this.direccion = direccion;
        this.b1 = b1;
        this.b2 = b2;
        this.trabajadores=new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<PersonaBanco> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<PersonaBanco> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public void agregarTrabajador(PersonaBanco persona){
        this.trabajadores.add(persona);
    }

    public void cantidadTrabajadores(){
        System.out.println(this.trabajadores.size());
    }

    public PersonaBanco empleadoMayorAntiguedad(){
        PersonaBanco empleadoAntiguo = this.trabajadores.getFirst();
        for (PersonaBanco empleado : this.trabajadores){
            if (empleado.antiguedad()>empleadoAntiguo.antiguedad()){
                empleadoAntiguo=empleado;
            }
        }
        return empleadoAntiguo;
    }
}
