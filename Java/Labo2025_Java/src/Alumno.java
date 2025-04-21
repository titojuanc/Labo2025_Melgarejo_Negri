import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Alumno {
    private String nombre;
    private String apelido;
    private Fecha fechaNacimiento;
    private ArrayList<Integer> listaDeNotas;
    private ArrayList<Materia> materias;

    public Alumno(){
        this.nombre="";
        this.apelido="";
        this.materias = new ArrayList<Materia>();
        this.fechaNacimiento=new Fecha(0,0,0);
        this.listaDeNotas=new ArrayList<>();
    }

    public Alumno(String nombre, String apelido, Fecha fechaNacimiento, ArrayList<Integer> listaDeNotas, ArrayList<Materia> materias) {
        this.nombre = nombre;
        this.apelido = apelido;
        this.fechaNacimiento = fechaNacimiento;
        this.listaDeNotas = listaDeNotas;
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
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

    public void agregarMateria(Materia materia){
        this.materias.add(materia);
        System.out.println("Materia "+materia.getNombre()+" agregada.");
    }

    public double promedioNotaAlumno(){
        double prom = 0;
        for (int nota : this.listaDeNotas ){
            prom += nota;
        }
        prom = prom/this.listaDeNotas.size();
        return prom;
    }

    public static void main(String[] args) {
        Materia m1 = new Materia();
        Alumno a1= new Alumno();

        a1.agregarMateria(m1);
        System.out.println(m1.promedioEdadAlumnos());
        System.out.println(a1.promedioNotaAlumno());
    }
}


