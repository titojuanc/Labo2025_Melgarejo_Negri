package Vacunatorio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema_vacunas {
    private HashSet<Vacuna> vacunas;
    private HashMap<Ciudadano, HashSet<Vacuna>> listado;

    public Sistema_vacunas() {
        this.listado = new HashMap<>();
        this.vacunas = new HashSet<>();
    }

    public void agregarVacuna(Ciudadano ciudadano, Vacuna vacuna){
        listado.get(ciudadano).add(vacuna);
        System.out.println("Vacuna "+vacuna.getNombre()+" agregada");
    }

    public HashSet<Vacuna> Historial(Ciudadano ciudadano){
        return listado.get(ciudadano);
    }

    public int vacunadosPorProvincia(Provincia provincia){
        int cont=0;
        for (Ciudadano ciudadano : listado.keySet()){
            if (ciudadano.getProvincia().equals(provincia)){
                cont++;
            }
        }
        return cont;
    }

    public HashSet<Ciudadano> ciudadanoPorCantVacunas(int cant){
        HashSet<Ciudadano> ciudadanos = new HashSet<>();
        for (Map.Entry<Ciudadano, HashSet<Vacuna>> l : listado.entrySet() ){
            if (l.getValue().size()==cant){
                ciudadanos.add(l.getKey());
            }
        }
        return ciudadanos;
    }

    public HashSet<Ciudadano> ciudadanosConVacuna(Vacuna vacuna){
        Ciudadano ciudadano;
        HashSet <Vacuna> vacunas;
        HashSet <Ciudadano> ciudadanos = new HashSet<>();
        for (Map.Entry<Ciudadano, HashSet<Vacuna>> l : listado.entrySet() ){
            ciudadano = l.getKey();
            vacunas = l.getValue();
            if (vacunas.contains(vacuna)){
                ciudadanos.add(ciudadano);
            }
        }
        return ciudadanos;
    }
}
