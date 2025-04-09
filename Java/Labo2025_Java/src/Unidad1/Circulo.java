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
        circulo= new Circulo();
        circulo2 = new Circulo((float)4.2);
        circulo.getRadio;
        circulo2.setRadio(5);
        circulo.getArea();
        circulo2.getPerimetro();
    }
}

