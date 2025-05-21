package Sistemas;

import Entidades.Empleado;
import Utilidad.Llamada;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class SistemaLlamadas {
    private ArrayList<Llamada> llamadas;
    private ArrayList<Empleado> empleados;

    public SistemaLlamadas() {
        this.llamadas = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public ArrayList<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void realizarLlamada(Empleado empleado, int telefono, int tiempo){
        if (this.empleados.contains(empleado)){
            for (Empleado empleadoaux : this.empleados){
                if(empleadoaux.getTelefono()==telefono){
                    if (empleadoaux.getPais()!=empleado.getPais()){
                        this.llamadas.add(new Llamada(empleado, empleadoaux, LocalDate.now(), tiempo, true ));
                        empleado.setTiempoExterior(empleado.getTiempoExterior()+tiempo);
                    }
                    else {
                        this.llamadas.add(new Llamada(empleado, empleadoaux, LocalDate.now(), tiempo, false ));

                    }
                    System.out.println("¡Llamada realizada con éxito!");
                    return;
                }
            }
            System.out.println("Error, ese número no pertenece a ningún empleado");
        } else {
            System.out.println("Error, el empleado no pertenece a la compañía");
        }
    }

    public void llamadasPorEmpleado(Empleado empleado){
        System.out.println("Llamadas del empleado "+empleado.getNombre()+" "+empleado.getApellido());
        int cont=0;
        for (Llamada llamada : this.llamadas){
            if (llamada.getEmpleado_origen().equals(empleado)){
                cont=cont+1;
                System.out.println("Llamada N"+cont+":");
                System.out.println("- Destinatario: "+llamada.getEmpleado_destino().getNombre()+" "+llamada.getEmpleado_destino().getApellido());
                System.out.println("- Duración: "+llamada.getDuracion());
            }
        }
    }

    public void rankingTiempoAlExterior(){
        int cont=0;
        System.out.println("Ranking de horas en el exterior");
        empleados.sort((e1, e2) -> Integer.compare(e2.getTiempoExterior(), e1.getTiempoExterior()));
        for (Empleado empleado : this.empleados){
            cont = cont +1;
            System.out.println("- Empleado N"+cont+": "+empleado.getNombre()+" "+empleado.getApellido());
        }
    }

    public static void main(String[] args) {
        SistemaLlamadas sistema = new SistemaLlamadas();
        Empleado e1 = new Empleado("Tomas", "Garayzar", 17, 48652715, "Argentina", 1);
        Empleado e2 = new Empleado("Ana", "López", 25, 12345678, "Argentina", 2);
        Empleado e3 = new Empleado("Carlos", "Gómez", 30, 87654321, "Brasil", 3);
        Empleado e4 = new Empleado("Luisa", "Martínez", 22, 11223344, "Chile", 4);
        Empleado e5 = new Empleado("Pedro", "Silva", 28, 55667788, "Colombia", 5);
        Empleado e6 = new Empleado("María", "Rodríguez", 19, 99887766, "Perú", 6);
        Empleado e7 = new Empleado("Jorge", "Fernández", 35, 44332211, "Uruguay", 7);
        Empleado e8 = new Empleado("Lucía", "Pérez", 27, 77889900, "Argentina", 8);
        Empleado e9 = new Empleado("Diego", "Hernández", 31, 66554433, "Paraguay", 9);
        Empleado e10 = new Empleado("Valeria", "Díaz", 24, 22334455, "Chile", 10);
        Collections.addAll(sistema.getEmpleados(), e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);

        sistema.realizarLlamada(e1, 2, 90);
        sistema.realizarLlamada(e3, 5, 15);
        sistema.realizarLlamada(e2, 7, 30);
        sistema.realizarLlamada(e4, 10, 45);
        sistema.realizarLlamada(e5, 1, 60);
        sistema.realizarLlamada(e6, 3, 10);
        sistema.realizarLlamada(e8, 4, 25);
        sistema.realizarLlamada(e7, 9, 50);
        sistema.realizarLlamada(e10, 6, 5);
        sistema.realizarLlamada(e9, 8, 120);
        System.out.println(" ");


        sistema.llamadasPorEmpleado(e1);
        System.out.println(" ");
        sistema.rankingTiempoAlExterior();
    }
}
