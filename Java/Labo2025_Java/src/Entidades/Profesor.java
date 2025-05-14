package Entidades;

public class Profesor extends Persona{
    private double porcentaje_descuento;

    public Profesor(){
        super();
        this.porcentaje_descuento=0;
    }

    public Profesor(String nombre, String apellido, double porcentaje_descuento){
        super(nombre, apellido);
        this.porcentaje_descuento=porcentaje_descuento;
    }

    public double getPorcentaje_descuento() {
        return porcentaje_descuento;
    }

    public void setPorcentaje_descuento(double porcentaje_descuento) {
        this.porcentaje_descuento = porcentaje_descuento;
    }
}
