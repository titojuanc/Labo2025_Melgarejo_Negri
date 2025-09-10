package CampeonatoArcoYFlecha;

public abstract class Beneficio {
    private String nombre;
    private Creador creador;

    public Beneficio(String nombre, Creador creador) {
        this.nombre = nombre;
        this.creador = creador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Creador getCreador() {
        return creador;
    }

    public void setCreador(Creador creador) {
        this.creador = creador;
    }
}
