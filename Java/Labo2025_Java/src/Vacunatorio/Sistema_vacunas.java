package Vacunatorio;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema_vacunas {
    private HashMap<Ciudadano, HashSet<Vacuna>> listado;

    public Sistema_vacunas() {
        this.listado = new HashMap<>();
    }

    public void agregarVacunaACiudadano(Ciudadano ciudadano, Vacuna vacuna){
        this.listado.get(ciudadano).add(vacuna);
        System.out.println("Vacuna "+vacuna.getNombre()+" agregada");
    }


    public void agregarCiudadano(Ciudadano ciudadano){
        listado.put(ciudadano, new HashSet<>());
    }

    public HashSet<Vacuna> Historial(Ciudadano ciudadano){
        return listado.get(ciudadano);
    }

    public void vacunadosPorProvincia(){
        System.out.println("Vacunados por provinicia: ");
        for (Provincia prov : Provincia.values()){
            int cont=0;
            for (Map.Entry<Ciudadano, HashSet<Vacuna>> l : listado.entrySet()){
                if (l.getKey().getProvincia().equals(prov) && !l.getValue().isEmpty()){
                    cont++;
                }
            }
            System.out.println(prov+": "+cont);
        }
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


    public static void main(String[] args) {
        Sistema_vacunas sistema = new Sistema_vacunas();
        Ciudadano c1 = new Ciudadano("Juan", "Carlos", "Carlos A. López 4248", "12345678", "ipv4@gmail.com", Provincia.CHACO);
        Ciudadano c2 = new Ciudadano("Martin", "Carlos", "Carlos A. López 4248", "12345678", "ipv4@gmail.com", Provincia.BUENOS_AIRES);
        Ciudadano c3 = new Ciudadano("Juliana", "Carlos", "Carlos A. López 4248", "12345678", "ipv4@gmail.com", Provincia.TIERRA_DEL_FUEGO);
        Ciudadano c4 = new Ciudadano("Mateo", "Carlos", "Carlos A. López 4248", "12345678", "ipv4@gmail.com", Provincia.CHACO);

        Vacuna v1 = new Vacuna("Edmontonitis", LocalDate.now(), LocalDate.now(), 1, 1);
        Vacuna v2 = new Vacuna("Jorgitus", LocalDate.now(), LocalDate.now(), 1, 1);
        Vacuna v3 = new Vacuna("Paralytics", LocalDate.now(), LocalDate.now(), 1, 1);
        Vacuna v4 = new Vacuna("Cancer", LocalDate.now(), LocalDate.now(), 1, 1);

        sistema.agregarCiudadano(c1);
        sistema.agregarCiudadano(c2);
        sistema.agregarCiudadano(c3);
        sistema.agregarCiudadano(c4);

        sistema.agregarVacunaACiudadano(c1, v1);
        sistema.agregarVacunaACiudadano(c1, v2);
        sistema.agregarVacunaACiudadano(c2, v2);
        sistema.agregarVacunaACiudadano(c2, v3);
        sistema.agregarVacunaACiudadano(c3, v3);
        sistema.agregarVacunaACiudadano(c4, v4);

        System.out.println("Historial del ciudadano "+c1.getNombre()+":");
        for (Vacuna vacuna : sistema.Historial(c1)){
            System.out.println(vacuna.getNombre());
        }

        sistema.vacunadosPorProvincia();

        System.out.println("Ciudadanos con 2 vacunas:");
        for (Ciudadano ciudadano : sistema.ciudadanoPorCantVacunas(2)){
            System.out.println(ciudadano.getNombre());
        }

        System.out.println("Ciudadanos con la vacuna "+v2.getNombre()+":");
        for (Ciudadano ciudadano : sistema.ciudadanosConVacuna(v2)){
            System.out.println(ciudadano.getNombre());
        }
    }
}
