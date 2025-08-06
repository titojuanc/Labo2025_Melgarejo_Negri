package GestionDeSueldos;

import java.util.HashSet;

public class SistemaGestionDeSueldos {
    private HashSet<Diseniador> diseniadores;

    public SistemaGestionDeSueldos(){
        this.diseniadores=new HashSet<>();
    }

    public HashSet<Diseniador> getDiseniadores() {
        return diseniadores;
    }

    public void agregarDiseniador(Diseniador diseniador){
        this.diseniadores.add(diseniador);
    }

    public static void main(String[] args) {
        SistemaGestionDeSueldos sistema = new SistemaGestionDeSueldos();
        Diseniador d1 = new Diseniador("Juanito", "Carlito", Tipo.UX);
        Diseniador d2 = new Diseniador("Hernan", "Carlito", Tipo.UI);
        Diseniador d3 = new Diseniador("Miguel", "Carlito", Tipo.IT);
        Diseniador d4 = new Diseniador("Palomo", "Carlito", Tipo.UX);

        Proyecto p1 = new Proyecto("Sitio de Non-stop", 18.0);
        Proyecto p2 = new Proyecto("UI de Microsoft", 1.0);
        Proyecto p3 = new Proyecto("Desarrollar ajedrez 2", 40.0);
        Proyecto p4 = new Proyecto("Interfaz de parsec", 20.0);

        d1.agregarProyecto(p1);
        d1.agregarProyecto(p4);
        d2.agregarProyecto(p2);
        d2.agregarProyecto(p3);
        d3.agregarProyecto(p3);
        d4.agregarProyecto(p1);
        d4.agregarProyecto(p4);
        System.out.println("");

        System.out.println("Cantidad de proyectos de "+d1.getNombre()+": "+d1.cantidadProyectos());

        System.out.println("Sueldo del diseniador "+d2.getNombre()+": "+d2.sueldo());

        System.out.println("Dinero que gana "+d3.getNombre()+" sin comisió por el proyecto "+p3.getNombre()+": "+d3.ganadoSinComision(p3));

        System.out.println("");
        System.out.println("Sueldo discriminado del diseniador "+d4.getNombre()+": ");
        System.out.println("");
        d4.mostarSueldoDiscriminado();


    }
}
