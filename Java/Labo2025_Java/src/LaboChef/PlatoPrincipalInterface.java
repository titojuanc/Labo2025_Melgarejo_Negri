package LaboChef;

public class PlatoPrincipalInterface {
    Plato cocinarPrincipal(PlatoPrincipal pla) throws IngredientesInsuficientesException;
    Plato servirPrincipal(PlatoPrincipal pla) throws IngredientesInsuficientesException;
}
