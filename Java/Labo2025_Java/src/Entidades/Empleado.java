package Entidades;

public class Empleado extends Persona{
    private int dni;
    private String pais;
    private int telefono;
    private int tiempoExterior;

    public Empleado(String nombre, String apellido, int edad, int dni, String pais, int telefono){
        super(nombre, apellido, edad);
        this.dni=dni;
        this.pais= pais;
        this.telefono=telefono;
        this.tiempoExterior=0;

    }

    public int getTiempoExterior() {
        return tiempoExterior;
    }

    public void setTiempoExterior(int tiempoExterior) {
        this.tiempoExterior = tiempoExterior;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


}
