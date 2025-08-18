package Sistema_de_bebidas;

import Entidades.Persona;

import java.util.ArrayList;

public class Cliente extends Persona {
    private ArrayList<Bebida> bebidas;
    private double hidratacion;

    public Cliente(String nombre, String apellido, int DNI, ArrayList<Bebida> bebidas) {
        super(nombre, apellido, DNI);
        this.bebidas = bebidas;
        this.hidratacion=0;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public double getHidratacion() {
        return hidratacion;
    }

    public void setHidratacion(double hidratacion) {
        this.hidratacion = hidratacion;
    }

    public double calcularHidratacion(){
        for(Bebida b : this.bebidas){
            this.hidratacion=this.hidratacion+(b.getPositividad()-b.getNegatividad());
        }
        return this.hidratacion;
    }

    public void tomar(Bebida b, int cant){
        for (int i = 0; i < cant; i++) {
            this.bebidas.add(b);
        }
    }

    public int getDNI(){
        return this.getEdad();
    }
}
