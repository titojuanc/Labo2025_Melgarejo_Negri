package ControlAlturaPeso;

import Entidades.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Paciente extends Persona {
    private HashMap<Registro, LocalDate> seguimiento;
    public Paciente(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        seguimiento= new HashMap<>();
    }

    public void registrarPeso(double altura, double peso, LocalDate fecha){
        seguimiento.put(new Registro(altura, peso), fecha);
    }

    public void fechaParticular(LocalDate fecha){
        for (Map.Entry<Registro, LocalDate> l : seguimiento.entrySet()){
            if (l.getValue().equals(fecha)){
                System.out.println("Altura: "+l.getKey().getAltura());
                System.out.println("Peso: "+l.getKey().getPeso());
                return;
            }
        }
        System.out.println("No hay registro de esa fecha :(");
    }

    public void promedioAnual(){
        double promAltura = 0;
        double promPeso = 0;
        int cont=0;
        for (Map.Entry<Registro, LocalDate> l : seguimiento.entrySet()){
            if (l.getValue().getYear()==LocalDate.now().getYear()){
                promAltura+=l.getKey().getAltura();
                promPeso+=l.getKey().getPeso();
                cont++;
            }
        }
        System.out.println("Peso promedio: "+promPeso/cont);
        System.out.println("Altura promedio: "+promAltura/cont);
    }

    public double porcentajeCrecimiento(LocalDate fecha1, LocalDate fecha2){
        double alturaVieja=0;
        double alturaNueva=0;
        for (Map.Entry<Registro, LocalDate> l : seguimiento.entrySet()){
            if (l.getValue().equals(fecha1)){
                alturaVieja=l.getKey().getAltura();
            } else if (l.getValue().equals(fecha2)) {
                alturaNueva=l.getKey().getAltura();
            }
        }
        return ((alturaNueva-alturaVieja))/alturaVieja;
    }

    public static void main(String[] args) {
        Paciente p1 = new Paciente("Gabriel", "Messi", 18);
        Paciente p2 = new Paciente("Lionel", "Messi", 18);
        Paciente p3 = new Paciente("Juriel", "Messi", 18);

        p1.registrarPeso(1.80, 65.9, LocalDate.of(2025, 7, 7));
        p1.registrarPeso(1.82, 67.9, LocalDate.of(2025, 8, 7));

        p2.registrarPeso(1.70, 55.8, LocalDate.of(2025, 3, 15));
        p2.registrarPeso(1.80, 60.1, LocalDate.of(2025, 5, 15));

        p3.registrarPeso(1.60, 50.0, LocalDate.of(2025, 6, 21));
        p3.registrarPeso(1.60, 49.8, LocalDate.of(2025, 10, 9));

        p1.fechaParticular(LocalDate.of(2025, 7, 7));
        p2.promedioAnual();
        System.out.println(p2.porcentajeCrecimiento(LocalDate.of(2025, 3, 15), LocalDate.of(2025, 5, 15)));
    }

}
