package Enumeraciones;

public enum Color {
    ROJO( "FF0000"), NEGRO( "000000"), GRIS( "808080"), BLANCO( "FFFFFF"), AZUL( "0000FF");
    private String hexa;


    private Color(String hexa){
        this.hexa=hexa;
    }
}
