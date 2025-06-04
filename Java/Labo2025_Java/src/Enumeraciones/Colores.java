package Enumeraciones;

public enum Colores {
    ROJO("Rojo"), NEGRO("Negro"), GRIS("Gris"), BLANCO("Blanco"), AZUL("Azul");
    private String nombre;


    private Colores(String nombre){
        this.nombre=nombre;
    }
}
