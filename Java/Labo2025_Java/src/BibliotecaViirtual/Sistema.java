package BibliotecaViirtual;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Libro> libros;
    private static HashMap<Membresia, Integer> valoresMembresias = new HashMap<>();

    public Sistema(){
        this.libros=new HashSet<>();
    }

    public static void establecerValores() {
        valoresMembresias.put(Membresia.BRONCE, 5);
        valoresMembresias.put(Membresia.PLATA, 15);
        valoresMembresias.put(Membresia.ORO, 50);

    }

    public Integer valorMembresia (Membresia membresia){
        return valoresMembresias.get(membresia);
    }

    public void tomarPrestado(Usuario usuario, Libro libro) throws BookLoanLimitException, MembershipLimitException, BookAlreadyBorrowedException{
        if (libro.getVecesPrestado()>=libro.getLimitePrestamo()){
            throw new BookLoanLimitException();
        } else if (this.valorMembresia(usuario.getMembresia()) <= usuario.cantidadlibrosprestados()) {
            throw new MembershipLimitException();
        } else if (usuario.getLibrosPrestados().contains(libro)) {
            throw new BookAlreadyBorrowedException();
        } else {
            usuario.getLibrosPrestados().add(libro);
            libro.prestar();
            System.out.println("Libro "+libro.getTitulo()+" prestado exitosamente a "+usuario.getNombre());
        }
    }

    public void devolverLibro(Usuario usuario, Libro libro) throws UnborrowedBookException{
        if (!usuario.getLibrosPrestados().contains(libro)){
            throw new UnborrowedBookException();
        }
        else {
            usuario.getLibrosPrestados().remove(libro);
            libro.devolver();
            System.out.println("Libro "+libro.getTitulo()+" devuelto exitosamente por "+usuario.getNombre());
        }
    }

    public static void main(String[] args) {
        Sistema.establecerValores();
        Sistema sys = new Sistema();

        Autor a1= new Autor("Pacheco", LocalDate.now(), 48888888);
        Autor a2= new Autor("Eufrales", LocalDate.now(), 48777777);

        Libro l1 = new Libro("Kukardos", "kukardos.pdf", Genero.SCI_FI, a1);
        Libro l2 = new Libro("Kukar2", "kukard2.pdf", Genero.SCI_FI, a1);
        Libro l3 = new Libro("Oracle", "oracle.pdf", Genero.SCI_FI, a2);
        Libro l4 = new Libro("Redes", "redes.pdf", Genero.ROMANCE, a2);
        Libro l5 = new Libro("BDD", "bdd.pdf", Genero.ROMANCE, a2);
        Libro l6 = new Libro("Capoeira", "capoeira.pdf", Genero.ROMANCE, a2);

        Usuario u1 = new Usuario("Megacaballero", LocalDate.of(2017, 9, 8), 23907564, "megagay@cr.com", Membresia.BRONCE);
        Usuario u2 = new Usuario("Fran", LocalDate.of(2017, 9, 8), 23907564, "megagay@cr.com", Membresia.BRONCE);
        Usuario u3 = new Usuario("Tincho", LocalDate.of(2017, 9, 8), 23907564, "megagay@cr.com", Membresia.BRONCE);
        Usuario u4 = new Usuario("Maga", LocalDate.of(2017, 9, 8), 23907564, "megagay@cr.com", Membresia.BRONCE);
        Usuario u5 = new Usuario("Marco", LocalDate.of(2017, 9, 8), 23907564, "megagay@cr.com", Membresia.BRONCE);


        sys.tomarPrestado(u1, l1);
        sys.tomarPrestado(u2, l2);
        sys.tomarPrestado(u3, l3);
        sys.tomarPrestado(u4, l4);
        sys.tomarPrestado(u5, l5);

        sys.devolverLibro(u1, l1);

        System.out.println(u1.cantidadlibrosprestados());
    }
}
