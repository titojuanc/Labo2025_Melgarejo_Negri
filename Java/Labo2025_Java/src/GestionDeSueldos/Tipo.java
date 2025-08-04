package GestionDeSueldos;

public enum Tipo {
    UX(0.08), UI(0.07), IT(0.12);
    private double porcentaje;

    private Tipo(double porcentaje) {
        this.porcentaje=porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }
}
