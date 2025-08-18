package BibliotecaViirtual;

public class Libro {
    private String titulo;
    private String nombrePdf;
    private Genero genero;
    private Autor autor;
    private int limitePrestamo = 145;
    private int vecesPrestado=0;

    public Libro(String titulo, String nombrePdf, Genero genero, Autor autor) {
        this.titulo = titulo;
        this.nombrePdf = nombrePdf;
        this.genero = genero;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombrePdf() {
        return nombrePdf;
    }

    public void setNombrePdf(String nombrePdf) {
        this.nombrePdf = nombrePdf;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getLimitePrestamo() {
        return limitePrestamo;
    }

    public void setLimitePrestamo(int limitePrestamo) {
        this.limitePrestamo = limitePrestamo;
    }

    public int getVecesPrestado() {
        return vecesPrestado;
    }

    public void setVecesPrestado(int vecesPrestado) {
        this.vecesPrestado = vecesPrestado;
    }
}
