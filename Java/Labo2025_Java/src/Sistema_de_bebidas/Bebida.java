package Sistema_de_bebidas;

public abstract class Bebida {
    private String nombre;
    private double positividad;
    private double negatividad;

    public Bebida(String nombre, double positividad, double negatividad) {
        this.nombre = nombre;
        this.positividad = positividad;
        this.negatividad = negatividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPositividad() {
        return positividad;
    }

    public void setPositividad(double positividad) {
        this.positividad = positividad;
    }

    public double getNegatividad() {
        return negatividad;
    }

    public void setNegatividad(double negatividad) {
        this.negatividad = negatividad;
    }

}
