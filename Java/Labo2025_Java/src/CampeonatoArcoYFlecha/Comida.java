package CampeonatoArcoYFlecha;

import java.util.HashSet;

public class Comida extends Beneficio implements BeneficioAcumulable{
    private HashSet<String> comidas_incluidas;

    public Comida(String nombre, Creador creador, HashSet<String> comidas_incluidas) {
        super(nombre, creador);
        this.comidas_incluidas = comidas_incluidas;
    }

    public HashSet<String> getComidas_incluidas() {
        return comidas_incluidas;
    }

    public void setComidas_incluidas(HashSet<String> comidas_incluidas) {
        this.comidas_incluidas = comidas_incluidas;
    }

    @Override
    public int aplicarDescuentoExtra() {
        return 4500;
    }
}
