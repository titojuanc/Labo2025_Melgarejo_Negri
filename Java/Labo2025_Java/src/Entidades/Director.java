package Entidades;

public class Director extends Persona{
    public Director(String nombre, int edad, String direccion){
        super(nombre, edad, direccion);
    }
    public Director(String nombre, String apellido, String direccion){
        super(nombre, apellido, direccion);
    }
    public Director(){
        super();
    }public Director(String nombre, String apellido){}
}
