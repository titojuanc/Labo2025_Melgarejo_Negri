package Enumeraciones;

public enum Colores {
    ROJO("Rojo", "FF0000"), NEGRO("Negro", "000000"), GRIS("Gris", "808080"), BLANCO("Blanco", "FFFFFF"), AZUL("Azul", "0000FF");
    private String nombre;
    private String hexa;


    private Colores(String nombre, String hexa){
        this.nombre=nombre;
        this.hexa=hexa;
    }
}
