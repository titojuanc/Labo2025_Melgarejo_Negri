package ControlDeCalorías;

import java.util.Collections;
import java.util.HashSet;

public class Familia {
    private String nombre;
    private HashSet<Integrante> integrantes;

    public Familia(String nombre) {
        this.nombre = nombre;
        this.integrantes = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public HashSet<Integrante> getIntegrantes() {
        return integrantes;
    }

    public double promedioFamiliar(){
        int calTotal=0;
        for (Integrante i : integrantes){
            calTotal+=i.consumoTotal();
        }
        return calTotal/integrantes.size();
    }

    public Integrante integranteMasGlorbo(){
        Integrante intMax= null;
        for (Integrante i : integrantes){
            if (intMax == null || i.consumoTotal()>=intMax.consumoTotal()){
                intMax=i;
            }
        }
        return intMax;
    }

    public Integrante integranteMenosGlorbo(){
        Integrante intMax = null;
        for (Integrante i : integrantes){
            if (intMax == null || i.consumoTotal()<=intMax.consumoTotal()){
                intMax=i;
            }
        }
        return intMax;
    }

    public static void main(String[] args) {
        Familia f1 = new Familia("Negri");

        Integrante i1=new Integrante("Fran", "Negri", 18);
        Integrante i2=new Integrante("Cisco", "Negri", 18);
        Integrante i3=new Integrante("Ezequiel", "Negri", 18);

        Collections.addAll(f1.getIntegrantes(), i1, i2, i3);

        Plato p1 = new Plato("Papa", new HashSet<Ingrediente>());
        Plato p2 =new Plato("Asado", new HashSet<>());
        Plato p3 = new Plato("Milanesa", new HashSet<>());


        System.out.println("Promedio de la familia "+f1.getNombre()+": "+f1.promedioFamiliar());

        System.out.println("Integrante que más calorías consumió de la familia "+f1.getNombre()+": "+f1.integranteMasGlorbo().getNombre());

        System.out.println("Integrante que menos calorías consumió de la familiia "+f1.getNombre()+": "+f1.integranteMenosGlorbo().getNombre());


    }


}
