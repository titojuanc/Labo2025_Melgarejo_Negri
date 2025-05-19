package Figuras_Geometricas;


public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo() {
        super();
        this.radio = 2;
    }

    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double calcularArea(){
        super.setArea(3.14*(this.radio*this.radio));
        return super.getArea();
    }

    public double calcularPerimetro(){
        return 0;
    }
}

