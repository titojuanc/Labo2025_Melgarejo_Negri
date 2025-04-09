package Unidad1;

public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private float velocidad;

    public Coche(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void Acelerar(float vel){
        this.velocidad=this.velocidad+vel;
    }
    public void Frenar(float fre){
        this.velocidad=this.velocidad-fre;
    }
    public void mostrarVelocidadActual(){
        System.out.println("El auto está yendo a "+this.velocidad+"KM/H");
    }

    public static void main(String[] args) {
        Coche fitito= new Coche("Volskwagen","Virtus","Gris");
        System.out.println(fitito.getMarca());
        System.out.println(fitito.getModelo());
        System.out.println(fitito.getColor());
        fitito.Acelerar((float)37.5);
        fitito.Frenar((float)10);
        fitito.mostrarVelocidadActual();
    }
}