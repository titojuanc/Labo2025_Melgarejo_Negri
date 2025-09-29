package LaboChef;

import ControlDeCalorías.Ingrediente;

import java.time.LocalDate;

public class Experto extends Participante implements PlatoPrincipalInterface, PlatoEntradaInterface{
    private static int limite_tiempo=90;
    private int tiempo_restante;

    public Experto(String nombre, String apellido, LocalDate fechaNacimiento, String localidad, Equipo equipo) {
        super(nombre, apellido, fechaNacimiento, localidad, equipo);
        this.tiempo_restante=limite_tiempo;
    }

    @Override
    public void prepararLugarDeTrabajo(){
        System.out.println("Perdi 5 minutos preparando la mesa por lo que mi tiempo restante es: " + (this.tiempo_restante-=5));
    }

    @Override
    public Plato cocinarEntrada(PlatoEntrada pla) throws TiempoInsuficienteException {
        for (Ingrediente i : pla.getIngredientes_necesarios().keySet()){
            if(pla.getTiempo_preparacion()>this.tiempo_restante){
                throw new TiempoInsuficienteException("No hay suficiente tiempo");
            }
        }
        return servirEntrada(pla);
    }

    @Override
    public Plato servirEntrada(PlatoEntrada pla) {
        return pla;
    }

    @Override
    public Plato cocinarPrincipal(PlatoPrincipal pla) throws TiempoInsuficienteException {
        for (Ingrediente i : pla.getIngredientes_necesarios().keySet()){
            if(pla.getTiempo_preparacion()>this.tiempo_restante){
                throw new TiempoInsuficienteException("No hay suficiente tiempo");
            }
        }
        return servirPrincipal(pla);
    }

    @Override
    public Plato servirPrincipal(PlatoPrincipal pla) {
        return pla;
    }
}
