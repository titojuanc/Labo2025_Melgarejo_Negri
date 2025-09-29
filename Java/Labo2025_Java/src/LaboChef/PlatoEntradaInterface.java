package LaboChef;

public interface PlatoEntradaInterface {
    Plato cocinarEntrada(PlatoEntrada pla)throws PlatoConIngredienteProhibidoException;
    Plato servirEntrada(PlatoEntrada pla);
}
