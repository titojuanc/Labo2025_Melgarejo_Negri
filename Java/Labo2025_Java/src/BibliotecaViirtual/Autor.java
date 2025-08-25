package BibliotecaViirtual;

import Entidades.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Autor extends Persona {
    private HashSet<Libro> bibliografia;

    public Autor (String nombre, LocalDate fecha_nacimiento, int dni){
        super(nombre, fecha_nacimiento, dni);
        this.bibliografia= new HashSet<>();
    }

    public HashSet<Libro> getBibliografia(){
        return this.bibliografia;
    }




}
