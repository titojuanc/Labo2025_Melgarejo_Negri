package Elecciones;

public abstract class Ave implements Mensajero{
    private String nombre;
    private String color;
    private static String especie = setEspecie("Columba livia");

    public Ave(String nombre, String color){
        this.color=color;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static String getEspecie() {
        return especie;
    }

    public static String setEspecie(String especie) {
        Ave.especie = especie;
        return especie;
    }
}
