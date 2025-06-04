package Enumeraciones;

public enum Tecnologia {
    ULTRAHD("Ultra HD", 3840, 2160), FULLHD("Full HD", 1920, 1080);
    private String nombre;
    private int ancho;
    private int alto;

    private Tecnologia(String nombre, int alto, int ancho){
        this.nombre=nombre;
        this.alto=alto;
        this.ancho=ancho;
    }
}
