package Unidad1;

public class Cafetera {
    private int cantMax;
    private int cantActual;

    public Cafetera(int cantMax, int cantActual) {
        this.cantMax=cantMax;
        if (cantActual>cantMax){
            this.cantActual=cantMax;
        }
        else {
            this.cantActual=cantActual;
        }

    }

    public Cafetera(){
        this.cantMax=1000;
        this.cantActual=0;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }


    public void llenarCafetera(){
        this.cantActual=this.cantMax;
        System.out.println("Se llenó la cafetera");
    }

    public void llenarTaza(int cc){
        if (this.cantActual<cc){
            System.out.println("No hay suficiente café");
            return;
        }
        else {
            this.cantActual=cantActual-cc;
        }
    }

    public void vaciarCafetera(){
        this.cantActual=0;
        System.out.println("Se vació la cafetera");
    }

    public void agregarCafe(int cc){
        if (this.cantActual+cc > this.cantMax){
            System.out.println("El café agregado supera la cantidad máxima");
        }
        else {
            this.cantActual=this.cantActual+cc;
            System.out.println("Se agregó el café");
        }
    }

    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();
        cafetera.llenarCafetera();
        cafetera.llenarTaza(500);
        cafetera.vaciarCafetera();
        cafetera.agregarCafe(700);
    }
}
