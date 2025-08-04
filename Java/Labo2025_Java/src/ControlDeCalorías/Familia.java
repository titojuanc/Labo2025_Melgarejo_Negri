package ControlDeCalorías;

import java.util.HashSet;

public class Familia {
    private HashSet<Integrante> integrantes;

    public Familia(HashSet<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    public double promedioFamiliar(){
        int calTotal=0;
        for (Integrante i : integrantes){
            calTotal=+i.getCalorias();
        }
        return calTotal/integrantes.size();
    }

    public Integrante integranteMasGlorbo(){
        Integrante intMax= new Integrante("x", "x", 0);
        for (Integrante i : integrantes){
            if (i.getCalorias()>=intMax.getCalorias()){
                intMax=i;
            }
        }
        return intMax;
    }

    public Integrante integranteMenosGlorbo(){
        Integrante intMax= new Integrante("x", "x", 0);
        intMax.setCalorias(999999999);
        for (Integrante i : integrantes){
            if (i.getCalorias()<=intMax.getCalorias()){
                intMax=i;
            }
        }
        return intMax;
    }


}
