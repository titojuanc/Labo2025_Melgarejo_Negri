package Enumeraciones;

public enum Tecnologia {
    ULTRAHD( 3840, 2160), FULLHD(1920, 1080);
    private int ancho;
    private int alto;

    private Tecnologia( int alto, int ancho){
        this.alto=alto;
        this.ancho=ancho;
    }
}
