package Sistema_de_poblacion;

import java.util.HashSet;

public class Barrio extends Lugar{
    private int poblacion;

    public Barrio(String nombre, int codigo, HashSet<Coordenada> coordenadas, int poblacion) {
        super(nombre, codigo, coordenadas);
        this.poblacion = poblacion;
    }

    @Override
    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
}
