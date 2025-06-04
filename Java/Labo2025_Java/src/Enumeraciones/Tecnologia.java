package Enumeraciones;

public enum Tecnologia {
    ULTRAHD("Ultra HD"), CUATROK("4k"), FULLHD("Full HD");
    private String nombre;

    private Tecnologia(String nombre){
        this.nombre=nombre;
    }
}
