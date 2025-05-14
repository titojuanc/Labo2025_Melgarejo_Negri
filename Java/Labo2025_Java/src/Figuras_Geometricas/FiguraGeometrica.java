package Figuras_Geometricas;

import java.util.ArrayList;
import java.util.Collections;

public class FiguraGeometrica {
    private double perimetro;
    private double area;

    public FiguraGeometrica(){
        this.perimetro=0;
        this.area=0;
    }

    public FiguraGeometrica(double perimetro, double area) {
        this.perimetro = perimetro;
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double calcularArea(){
        return 0;
    }

    public double calcularPerimetro(){
        return 0;
    }

    public static void main(String[] args) {
        Circulo cir2 = new Circulo(4.2);
        Rectangulo r1 = new Rectangulo(2,2);
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        Collections.addAll(figuras,cir2,r1);
        for (FiguraGeometrica f : figuras){
            System.out.println("Area: " + f.calcularArea());
            System.out.println("Perimetro: " + f.calcularPerimetro());
        }
    }
}
