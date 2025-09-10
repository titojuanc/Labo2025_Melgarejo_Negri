package CampeonatoArcoYFlecha;

import java.util.HashSet;

public class Gaseosa extends Beneficio implements BeneficioAcumulable{
    private HashSet<String> bebidas_incluidas;

    public Gaseosa(String nombre, Creador creador, HashSet<String> bebidas_incluidas) {
        super(nombre, creador);
        this.bebidas_incluidas = bebidas_incluidas;
    }

    public HashSet<String> getBebidas_incluidas() {
        return bebidas_incluidas;
    }

    public void setBebidas_incluidas(HashSet<String> bebidas_incluidas) {
        this.bebidas_incluidas = bebidas_incluidas;
    }

    @Override
    public int aplicarDescuentoExtra() {
        return 1000;
    }
}
