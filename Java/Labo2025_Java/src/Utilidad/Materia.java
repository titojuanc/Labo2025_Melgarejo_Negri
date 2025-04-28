package Utilidad;

import Entidades.Alumno;

import java.time.LocalDate;
import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<String> listaDeContenidos;
    private ArrayList<Alumno> listaAlumnos;

    public Materia(String nombre, ArrayList<String> listaDeContenidos, ArrayList<Alumno> listaAlumnos) {
        this.nombre = nombre;
        this.listaDeContenidos = listaDeContenidos;
        this.listaAlumnos = listaAlumnos;
    }

    public Materia() {
        this.nombre="Materia x";
        this.listaDeContenidos = new ArrayList<String>();
        this.listaDeContenidos.add("Contenido1");
        this.listaDeContenidos.add("Contenido2");
        this.listaDeContenidos.add("Contenido3");
        this.listaAlumnos = new ArrayList<Alumno>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public ArrayList<String> getListaDeContenidos() {
        return listaDeContenidos;
    }

    public void setListaDeContenidos(ArrayList<String> listaDeContenidos) {
        this.listaDeContenidos = listaDeContenidos;
    }

    public void agregarAlumno (Alumno alumno){
        this.listaAlumnos.add(alumno);
    }

    public double promedioEdadAlumnos(){
        double prom = 0;
        for (Alumno alumno : this.listaAlumnos){
            prom += LocalDate.now().getYear() - alumno.getFechaNacimiento().getAnio();
        }
        return prom/this.listaAlumnos.size();

    }

}
