package BibliotecaViirtual;

import Entidades.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Usuario extends Persona {
    private Membresia membresia;
    private HashSet<Libro> librosPrestados;
    public Usuario(String nombre, LocalDate fecha_nacimiento, int dni, String mail, Membresia membresia){
        super(nombre, fecha_nacimiento, dni, mail);
        this.membresia=membresia;
        this.librosPrestados=new HashSet<>();
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public HashSet<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(HashSet<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
}
