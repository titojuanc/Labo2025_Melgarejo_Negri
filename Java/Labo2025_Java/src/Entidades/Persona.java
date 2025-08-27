package Entidades;

import java.time.LocalDate;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private int edad;
    private LocalDate fecha_nacimiento;
    private String direccion;
    private String mail;

    public Persona(){
        this.nombre="Pedro";
        this.apellido="x";
        this.edad=15;
    }

    public Persona(String nombre, LocalDate fecha_nacimiento, int dni){
        this.nombre=nombre;
        this.fecha_nacimiento=fecha_nacimiento;
        this.dni=dni;
    }

    public Persona(String nombre, LocalDate fecha_nacimiento, int dni, String mail){
        this.nombre=nombre;
        this.fecha_nacimiento=fecha_nacimiento;
        this.dni=dni;
        this.mail=mail;
    }

    public Persona(String nombre, String apellido, int edad, String direccion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    public Persona( int dni, String apellido, String nombre){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
    }

    public Persona(String nombre, String apellido, String direccion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.direccion=direccion;
    }

    public Persona(String nombre, String apellido, String direccion, int dni){
        this.nombre=nombre;
        this.apellido=apellido;
        this.direccion=direccion;
        this.dni=dni;
    }

    public Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public Persona(String nombre, int edad, String direccion){
        this.nombre=nombre;
        this.edad=edad;
        this.direccion=direccion;
    }

    public Persona(String nombre, String apellido, int edad ){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void imprimirDatos(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+this.apellido);
        System.out.println("Edad: "+this.edad);
    }
}

