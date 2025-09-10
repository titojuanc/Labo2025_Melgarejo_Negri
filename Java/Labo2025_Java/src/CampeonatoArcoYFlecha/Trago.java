package CampeonatoArcoYFlecha;

import java.util.HashSet;

public class Trago extends Beneficio{
    private HashSet<String> tragos_incluidos;

    public Trago(String nombre, Creador creador, HashSet<String> tragos_incluidos) {
        super(nombre, creador);
        this.tragos_incluidos = tragos_incluidos;
    }

    public HashSet<String> getTragos_incluidos() {
        return tragos_incluidos;
    }

    public void setTragos_incluidos(HashSet<String> tragos_incluidos) {
        this.tragos_incluidos = tragos_incluidos;
    }
}
