package CampeonatoArcoYFlecha;

import java.util.HashSet;

public class SistemaBares {
    private HashSet<Bar> bares;
    private HashSet<Diana> dianas;
    private HashSet<Beneficio> beneficios;

    public SistemaBares(HashSet<Bar> bares, HashSet<Diana> dianas, HashSet<Beneficio> beneficios) {
        this.bares = bares;
        this.dianas = dianas;
        this.beneficios = beneficios;
    }

    public HashSet<Bar> getBares() {
        return bares;
    }

    public void setBares(HashSet<Bar> bares) {
        this.bares = bares;
    }

    public HashSet<Diana> getDianas() {
        return dianas;
    }

    public void setDianas(HashSet<Diana> dianas) {
        this.dianas = dianas;
    }

    public HashSet<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(HashSet<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    public Diana dianaMayotCantPuntajes(){
        HashSet<FranjaColor> puntaje = new HashSet<>();
        Diana d=new Circular("Demon", 1, Dificultad.MEDIO, puntaje);
        for (Bar b : this.bares){
            d=b.dianaMayorCantPuntajesDeUnBar();
        }
        return d;
    }

    public static void main(String[] args) {
        HashSet<FranjaColor> puntajeC = new HashSet<>();
        puntajeC.add(FranjaColor.BLANCO);
        puntajeC.add(FranjaColor.NEGRO);
        puntajeC.add(FranjaColor.VERDE);
        Circular circular = new Circular("Ojo", 2, Dificultad.DIFICIL, puntajeC);

        HashSet<FranjaColor> puntajeR = new HashSet<>();
        puntajeR.add(FranjaColor.BLANCO);
        puntajeR.add(FranjaColor.NEGRO);
        puntajeR.add(FranjaColor.VERDE);
        puntajeR.add(FranjaColor.ROJO);
        Rectangular rectangular = new Rectangular("Meza", 3, Dificultad.MEDIO, puntajeR, 4, 5);

        HashSet<FranjaColor> puntajeCua = new HashSet<>();
        puntajeCua.add(FranjaColor.BLANCO);
        puntajeCua.add(FranjaColor.NEGRO);
        puntajeCua.add(FranjaColor.VERDE);
        puntajeCua.add(FranjaColor.ROJO);
        puntajeCua.add(FranjaColor.AMARILLO);
        Cuadrada cuadrada = new Cuadrada("Bloque", 4, Dificultad.FACIL, puntajeCua, 6);

        HashSet<Diana> dianas1=new HashSet<>();
        dianas1.add(circular);
        dianas1.add(rectangular);

        HashSet<Diana> dianas2=new HashSet<>();
        dianas2.add(cuadrada);

        Cliente c1=new Cliente("Pepe", "Fernandez", 34);
        Cliente c2=new Cliente("Esteban", "Martinez", 67);
        HashSet<Cliente> clientes=new HashSet<>();
        clientes.add(c1);
        clientes.add(c2);

        HashSet<Beneficio> beneficios1=new HashSet<>();

        HashSet<String> gaseosas=new HashSet<>();
        gaseosas.add("Coca-Cola");
        gaseosas.add("Sprite");
        Creador c = new Creador("Tito", "Hen", 72);
        Gaseosa g = new Gaseosa("Gol", c, gaseosas);

        HashSet<String> comidas=new HashSet<>();
        comidas.add("Fideos");
        comidas.add("Pizza");
        Comida com = new Comida("Papa", c, comidas);

        HashSet<String> tragos=new HashSet<>();
        tragos.add("Vodka-Naranja");
        tragos.add("Destornillador");
        Trago t = new Trago("Cebolla", c, tragos);

        beneficios1.add(g);
        beneficios1.add(com);
        beneficios1.add(t);

        HashSet<BeneficioAcumulable> beneficiosAcumulables = new HashSet<>();
        beneficiosAcumulables.add(g);
        beneficiosAcumulables.add(com);

        Bar b1 = new Bar(dianas1,clientes, 45, beneficios1, beneficiosAcumulables);

        HashSet<Bar> bares = new HashSet<>();
        bares.add(b1);



        SistemaBares s1 = new SistemaBares(bares, dianas1, beneficios1);

        /**/

        System.out.println("Área circular: " + circular.calcularArea());
        System.out.println("Área cuadrada: " + cuadrada.calcularArea());
        System.out.println("Área rectangular: " + rectangular.calcularArea());

        System.out.println("Cantidad de beneficios: " + b1.cantidadBeneficios());

        System.out.println("Diana con mayor puntajes: " + s1.dianaMayotCantPuntajes().getNombre());
    }
}
