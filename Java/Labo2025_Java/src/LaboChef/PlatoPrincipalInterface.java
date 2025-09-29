package LaboChef;

public interface PlatoPrincipalInterface {
    Plato cocinarPrincipal(PlatoPrincipal pla) throws IngredientesInsuficientesException;
    Plato servirPrincipal(PlatoPrincipal pla);
}
