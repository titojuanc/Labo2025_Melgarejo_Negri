package LaboChef;

public interface PlatoEntradaInterface {
    Plato cocinarEntrada(PlatoEntradaInterface pla)throws PlatoConIngredienteProhibidoException;
    Plato servirEntrada(PlatoEntradaInterface pla)throws PlatoConIngredienteProhibidoException;
}
