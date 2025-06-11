package Ej_Recetas;

import Enumeraciones.Dificultad;
import Enumeraciones.TemperaturaServido;

import java.util.ArrayList;
import java.util.Arrays;

public class SistemaPlatillos {
    private ArrayList<Platillo> platillos;

    public SistemaPlatillos(){
        this.platillos=new ArrayList<>();
    }

    public ArrayList<Platillo> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(ArrayList<Platillo> platillos) {
        this.platillos = platillos;
    }

    public void agregarPlatillo(Platillo p){
        this.platillos.add(p);
    }

    public void eliminarPlatillo(Platillo p){
        this.platillos.remove(p);
    }

    public void modificarPlatillo(Platillo p1, Platillo p2){
        this.platillos.set(platillos.indexOf(p1), p2);
    }

    public void platillosSegunDificultad(Dificultad dificultad){
        System.out.println("Platillos con la dificultad: "+dificultad.name());
        for (Platillo p : this.platillos){
            if (p.getDificultad().equals(dificultad)){
                System.out.println(p.getNombre());
            }
        }
    }

    public void platillosSegunTipo(String tipo){
        System.out.println("Platillos del tipo: "+tipo);
        for (Platillo p : this.platillos){
            if (p.tipo().equals(tipo)){
                System.out.println(p.getNombre());
            }
        }
    }

    public int cantidadPlatillos(){
        return platillos.size();
    }

    public Platillo platilloMayorPasos(){
        Platillo pMax = platillos.getFirst();
        for (Platillo p : platillos){
            if (pMax.getPasos().size()<=p.getPasos().size()){
                pMax=p;
            }
        }
        return pMax;
    }

    public static void main(String[] args) {
        SistemaPlatillos sistema = new SistemaPlatillos();
        PlatoPrincipal pasta = new PlatoPrincipal(
                "Pasta Carbonara",
                Dificultad.NORMAL,
                new ArrayList<>(Arrays.asList(
                        "Hervir la pasta en agua con sal.",
                        "Freír panceta hasta que esté crujiente.",
                        "Mezclar huevos, queso parmesano y pimienta.",
                        "Integrar todo con la pasta caliente."
                )),
                20,
                4
        );

        PlatoPrincipal risotto = new PlatoPrincipal(
                "Risotto de Champiñones",
                Dificultad.DIFICL,
                new ArrayList<>(Arrays.asList(
                        "Sofreír cebolla y champiñones.",
                        "Añadir arroz arbóreo y cocinar con vino blanco.",
                        "Agregar caldo caliente poco a poco hasta que el arroz esté al dente.",
                        "Finalizar con mantequilla y queso parmesano."
                )),
                35,
                2
        );

        PlatoPrincipal paella = new PlatoPrincipal(
                "Paella Valenciana",
                Dificultad.DIFICL,
                new ArrayList<>(Arrays.asList(
                        "Calentar aceite en la paellera.",
                        "Dorar pollo y conejo.",
                        "Añadir verduras (judías, garrofón, tomate).",
                        "Incorporar arroz y mezclar bien.",
                        "Añadir azafrán y pimentón.",
                        "Cubrir con caldo y cocinar a fuego medio.",
                        "Dejar reposar 5 minutos antes de servir.",
                        "Decorar con limones y hierbas frescas.",
                        "Revisar el punto de sal.",
                        "Añadir mariscos si es variante mixta."
                )),
                45,
                6
        );

        Postre cheesecake = new Postre(
                "Cheesecake de Frutos Rojos",
                Dificultad.NORMAL,
                new ArrayList<>(Arrays.asList(
                        "Triturar galletas y mezclar con mantequilla derretida.",
                        "Hornear la base por 10 minutos.",
                        "Batir queso crema, azúcar y huevos.",
                        "Verter sobre la base y hornear a baño María.",
                        "Decorar con mermelada de frutos rojos."
                )),
                180,
                false
        );

        Postre flan = new Postre(
                "Flan de Vainilla",
                Dificultad.FACIL,
                new ArrayList<>(Arrays.asList(
                        "Derretir azúcar para el caramelo.",
                        "Mezclar huevos, leche condensada y esencia de vainilla.",
                        "Hornear a baño María por 1 hora.",
                        "Enfriar en nevera 4 horas antes de desmoldar."
                )),
                160,
                false
        );

        Entrada bruschetta = new Entrada(
                "Bruschetta de Tomate",
                Dificultad.FACIL,
                new ArrayList<>(Arrays.asList(
                        "Tostar pan baguette.",
                        "Mezclar tomate picado con albahaca, ajo y aceite de oliva.",
                        "Colocar la mezcla sobre el pan.",
                        "Servir inmediatamente."
                )),
                TemperaturaServido.FRIO
        );

        Entrada sopa = new Entrada(
                "Sopa de Calabaza",
                Dificultad.NORMAL,
                new ArrayList<>(Arrays.asList(
                        "Asar calabaza con aceite y sal.",
                        "Licuar con caldo de verduras.",
                        "Cocinar a fuego lento 15 minutos.",
                        "Añadir crema y nuez moscada al servir."
                )),
                TemperaturaServido.CALIENTE
        );


        sistema.agregarPlatillo(pasta);
        sistema.agregarPlatillo(cheesecake);
        sistema.agregarPlatillo(bruschetta);
        sistema.agregarPlatillo(risotto);
        sistema.agregarPlatillo(flan);
        sistema.agregarPlatillo(sopa);
        sistema.agregarPlatillo(paella);

        System.out.println(sistema.cantidadPlatillos());
        sistema.platillosSegunDificultad(Dificultad.FACIL);
        sistema.platillosSegunTipo("Postre");
        System.out.println(sistema.platilloMayorPasos().getNombre());
    }
}
