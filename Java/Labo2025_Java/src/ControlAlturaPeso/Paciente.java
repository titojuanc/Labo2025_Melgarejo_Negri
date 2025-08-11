package ControlAlturaPeso;

import Entidades.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Paciente extends Persona {
    private HashMap<LocalDate, Registro> seguimiento;
    public Paciente(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        seguimiento= new HashMap<>();
    }

    public void registrarPeso(double altura, double peso, LocalDate fecha){
        seguimiento.put(fecha, new Registro(altura, peso));
    }

    public void fechaParticular(LocalDate fecha){
            if (this.seguimiento.containsKey(fecha)){
                System.out.println("Altura: "+this.seguimiento.get(fecha).getAltura());
                System.out.println("Peso: "+this.seguimiento.get(fecha).getPeso());
                return;
            }
            System.out.println("No hay registro de esa fecha :(");
        }
    public void promedioAnual(int anio){
        double promAltura = 0;
        double promPeso = 0;
        int cont=0;
        for (LocalDate fecha : this.seguimiento.keySet()){
            if (fecha.getYear() == anio){
                promAltura+=this.seguimiento.get(fecha).getAltura();
                promPeso+=this.seguimiento.get(fecha).getPeso();
                cont++;
            }
        }
        System.out.println("Peso promedio: "+promPeso/cont);
        System.out.println("Altura promedio: "+promAltura/cont);
    }

    public double porcentajeCrecimiento(LocalDate fecha1, LocalDate fecha2){
        double alturaVieja=0;
        double alturaNueva=0;
        boolean f1=false;
        boolean f2=false;
        for (LocalDate fecha: seguimiento.keySet()){
            if (fecha1.equals(fecha)){
                alturaVieja=seguimiento.get(fecha).getAltura();
                f1=true;
            } else if (fecha.equals(fecha2)) {
                alturaNueva=seguimiento.get(fecha).getAltura();
                f2=true;
            }
        }
        if (f1 && f2){
            return ((alturaNueva-alturaVieja))/alturaVieja*100;
        }
        System.out.println("Error: fecha/s no válidas");
        return 0;
    }

    public static void main(String[] args) {
        Paciente p1 = new Paciente("Gabriel", "Messi", 18);
        Paciente p2 = new Paciente("Lionel", "Messi", 18);
        Paciente p3 = new Paciente("Juriel", "Messi", 18);

        p1.registrarPeso(1.80, 65.9, LocalDate.of(2025, 7, 7));
        p1.registrarPeso(1.82, 67.9, LocalDate.of(2025, 8, 7));

        p2.registrarPeso(1.00, 55.8, LocalDate.of(2025, 3, 15));
        p2.registrarPeso(1.80, 60.1, LocalDate.of(2025, 5, 15));

        p3.registrarPeso(1.60, 50.0, LocalDate.of(2025, 6, 21));
        p3.registrarPeso(1.60, 49.8, LocalDate.of(2025, 10, 9));

        p1.fechaParticular(LocalDate.of(2025, 7, 7));
        p2.promedioAnual(2025);
        System.out.println("EL paciente creció un "+p2.porcentajeCrecimiento(LocalDate.of(2025, 3, 15), LocalDate.of(2025, 5, 15))+"% ");
    }

}
