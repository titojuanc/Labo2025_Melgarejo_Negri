package BibliotecaViirtual;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Libro> libros;
    private static HashMap<Membresia, Integer> valoresMembresias = new HashMap<>();

    public Sistema(){
        this.libros=new HashSet<>();
    }

    public void tomarPrestado(Usuario usuario, Libro libro) throws BookLoanLimitException, MembershipLimitException{
        if (libro.getVecesPrestado()>=libro.getLimitePrestamo()){
            throw new BookLoanLimitException();
        }
    }
}
