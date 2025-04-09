package Unidad1;

public class Circulo {
    private float radio;

    public Circulo() {
        this.radio = 2;
    }

    public Circulo(float radio) {
        this.radio = radio;
    }
    public float getRadio(){
        return radio;
    }
    public void setRadio(float radio){
        this.radio = radio;
    }

    public float getArea(){
        return (float) 3.14*(this.radio*this.radio);
    }

    public float getPerimetro(){
        return (float) 3.14*this.radio*2;
    }

    public static void main(String[] args) {
        Circulo cir1= new Circulo();
        Circulo cir2 = new Circulo((float)4.2);
        System.out.println(cir1.getRadio());
        cir2.setRadio(5);
        System.out.println(cir1.getArea());
        System.out.println(cir2.getPerimetro());
    }
}

