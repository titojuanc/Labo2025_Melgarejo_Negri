package CampeonatoArcoYFlecha;

public enum FranjaColor {
    BLANCO(1),
    NEGRO(3),
    VERDE(5),
    ROJO(7),
    AMARILLO(9);

    private int puntaje;

    FranjaColor(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public String toString() {
        return name() + " (" + puntaje + " puntos)";
    }
}

