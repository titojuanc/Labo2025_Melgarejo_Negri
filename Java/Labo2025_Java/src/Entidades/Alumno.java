package Entidades;

import Utilidad.Fecha;
import Utilidad.Materia;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Alumno extends Persona{
    private Fecha fechaNacimiento;
    private ArrayList<Integer> listaDeNotas;
    private ArrayList<Materia> materias;
    private String division;

    public Alumno(){
        super();
        this.materias = new ArrayList<Materia>();
        Materia materia1 = new Materia();
        this.materias.add(materia1);
        this.fechaNacimiento=new Fecha(15,10,2006);
        this.listaDeNotas= new ArrayList<Integer>();
        this.listaDeNotas.add(8);
        this.listaDeNotas.add(10);
        this.division="1";
    }

    public Alumno(String nombre, String apelido, int edad, Fecha fechaNacimiento, ArrayList<Integer> listaDeNotas, ArrayList<Materia> materias, String division) {
        super(nombre,apelido,edad);
        this.fechaNacimiento = fechaNacimiento;
        this.listaDeNotas = listaDeNotas;
        this.materias = materias;
        this.division=division;
    }

    public Alumno(String nombre, String apellido, String division){
        super(nombre,apellido);
        this.division=division;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Integer> getListaDeNotas() {
        return listaDeNotas;
    }

    public void setListaDeNotas(ArrayList<Integer> listaDeNotas) {
        this.listaDeNotas = listaDeNotas;
    }

    public void agregarNota(int nota){
        listaDeNotas.add(nota);
    }

    public int menorNota(){
        return Collections.min(this.listaDeNotas);
    }

    public int mayorNota(){
        return  Collections.max(this.listaDeNotas);
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public void agregarMateria(Materia materia){
        this.materias.add(materia);
        System.out.println("materia "+materia.getNombre()+" agregada.");
    }

    public double promedioNotaAlumno(){
        double prom = 0;
        for (int nota : this.listaDeNotas ){
            prom += nota;
        }
        return prom/this.listaDeNotas.size();

    }

    public static void main(String[] args) {

        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        Alumno a1= new Alumno();
        Alumno a2 = new Alumno();
        alumnos.add(a1);
        alumnos.add(a2);

        ArrayList<String> contenidos = new ArrayList<String>();
        contenidos.add("contenido 1");
        contenidos.add("contenido 2");
        contenidos.add("contenido 3");

        ArrayList<Materia> listaMaterias = new ArrayList<Materia>();
        Materia m1 = new Materia();
        listaMaterias.add(m1);
        Materia m2 = new Materia();
        listaMaterias.add(m2);

        ArrayList<Integer> listaNotas = new ArrayList<Integer>();
        listaNotas.add(5);
        listaNotas.add(10);

        alumnos.getFirst().agregarMateria(m1);
        alumnos.getFirst().agregarMateria(m2);
        alumnos.getLast().agregarMateria(m1);
        alumnos.getLast().agregarMateria(m2);

        alumnos.getFirst().setListaDeNotas(listaNotas);
        alumnos.getLast().setListaDeNotas(listaNotas);

        listaMaterias.getFirst().agregarAlumno(a1);
        listaMaterias.getFirst().agregarAlumno(a2);
        listaMaterias.getLast().agregarAlumno(a1);
        listaMaterias.getLast().agregarAlumno(a2);

        System.out.println(listaMaterias.getFirst().promedioEdadAlumnos());
        System.out.println(alumnos.getFirst().promedioNotaAlumno());

    }
}


