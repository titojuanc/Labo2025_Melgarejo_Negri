package Objetos;

import Entidades.Persona;
import Enumeraciones.Editoriales;
import Utilidad.Fecha;

public class Libro {
    private String titulo;
    private Persona autor;
    private int isbn;
    private int paginas;
    private Editoriales editorial;
    private Fecha fecha;

    public Libro(){
        this.titulo="";
        this.autor=new Persona();
        this.isbn=0;
        this.paginas=0;
        this.editorial=Editoriales.SUR;
        this.fecha=new Fecha();
    }

    public Libro(String titulo, Editoriales editorial){
        this.titulo=titulo;
        this.autor=new Persona();
        this.isbn=0;
        this.paginas=0;
        this.editorial=editorial;
        this.fecha=new Fecha();
    }

    public Libro(String titulo, String nombre, int edad, String direccion, int isbn, int paginas, Editoriales editorial, int dia, int mes, int anio) {
        this.titulo = titulo;
        this.autor = new Persona(nombre,edad,direccion);
        this.isbn = isbn;
        this.paginas = paginas;
        this.editorial = editorial;
        this.fecha = new Fecha(dia, mes, anio);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Editoriales getEditorial() {
        return editorial;
    }

    public void setEditorial(Editoriales editorial) {
        this.editorial = editorial;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void mostrarInfo(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Autor Nombre: "+this.autor.getNombre());
        System.out.println("Autor Edad: "+this.autor.getEdad());
        System.out.println("Autor Direccion: "+this.autor.getDireccion());
        System.out.println("ISBN: "+this.isbn);
        System.out.println("Paginas: "+this.paginas);
        System.out.println("Editorial: "+this.editorial.getNombre());
        System.out.println("Utilidad.Fecha Dia: "+this.fecha.getDia());
        System.out.println("Utilidad.Fecha Mes: "+this.fecha.getMes());
        System.out.println("Utilidad.Fecha Año: "+this.fecha.getAnio());
    }

    public boolean compararFecha(Libro libro){
        if (this.fecha.menorQue(libro.fecha)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("Hola", "Juan Cruz", 17, "Casa", 1234, 43, Editoriales.SUDAMERICANA, 1, 12, 2024);
        Libro libro2 = new Libro("Lengua 2", Editoriales.KAPELUSZ);

        libro1.mostrarInfo();
        System.out.println(libro2.compararFecha(libro1));
    }
}
