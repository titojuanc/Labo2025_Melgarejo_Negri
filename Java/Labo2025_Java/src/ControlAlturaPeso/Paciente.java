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
            if (l.getValue()==fecha){
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
                promAltura=+l.getKey().getAltura();
                promPeso=+l.getKey().getPeso();
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
            if (l.getValue()==fecha1){
                alturaVieja=l.getKey().getAltura();
            } else if (l.getValue()==fecha2) {
                alturaNueva=l.getKey().getAltura();
            }
        }
        return ((alturaNueva-alturaVieja))/alturaVieja;
    }

}
