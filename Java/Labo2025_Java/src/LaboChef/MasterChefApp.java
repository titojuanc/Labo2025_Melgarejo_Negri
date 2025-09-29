package LaboChef;

import ControlDeCalorías.Ingrediente;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MasterChefApp {
    private HashSet<Participante> chefs;
    private HashSet<Plato> platos;

    public MasterChefApp(HashSet<Participante> chefs, HashSet<Plato> platos){
        this.chefs=chefs;
        this.platos=platos;
    }

    public HashSet<Participante> getChefs() {
        return chefs;
    }

    public void setChefs(HashSet<Participante> chefs) {
        this.chefs = chefs;
    }

    public HashSet<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(HashSet<Plato> platos) {
        this.platos = platos;
    }

    public static void main(String[] args) throws PlatoConIngredienteProhibidoException {
        MasterChefApp sistema = new MasterChefApp(new HashSet<>(), new HashSet<>());

        Ingrediente lechuga = new Ingrediente("Lechuga", 1);
        Ingrediente tomate = new Ingrediente("Tomate", 1);
        Ingrediente zapallo = new Ingrediente("Zapallo", 1);

        Principiante p1 = new Principiante("Juancito", "Carlos", LocalDate.now(), "acá", Equipo.ROJO, new HashSet<>());
        p1.getIngredientes_prohibidos().add(zapallo);

        Intermedio i1 = new Intermedio("Carlitos", "Balá", LocalDate.now(), "Allá", Equipo.AZUL, new HashMap<>());
        i1.getIngredientes().put(lechuga, 2);
        i1.getIngredientes().put(tomate, 2);
        i1.getIngredientes().put(zapallo, 2);

        Experto e1 = new Experto("Luciana", "Wahi", LocalDate.now(), "Allí", Equipo.VERDE);

        PlatoEntrada plato1 = new PlatoEntrada("Ensalada", new HashMap<>(), 80);
        PlatoPrincipal plato2 = new PlatoPrincipal("Plato prohibido", new HashMap<>(), 100);
        PlatoPrincipal plato3 = new PlatoPrincipal("Zapallo", new HashMap<>(), 20);

        plato1.getIngredientes_necesarios().put(lechuga, 1);
        plato1.getIngredientes_necesarios().put(tomate, 1);
        plato2.getIngredientes_necesarios().put(zapallo, 1);
        plato3.getIngredientes_necesarios().put(zapallo, 3);

        p1.prepararLugarDeTrabajo();
        i1.prepararLugarDeTrabajo();
        e1.prepararLugarDeTrabajo();

        try {
            System.out.println(p1.cocinarEntrada(plato1).getNombre());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(i1.cocinarPrincipal(plato2).getNombre());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(e1.cocinarEntrada(plato1).getNombre());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(e1.cocinarPrincipal(plato2).getNombre());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(i1.cocinarPrincipal(plato3).getNombre());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }






    }
}
