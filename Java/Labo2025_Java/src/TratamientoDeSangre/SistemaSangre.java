package TratamientoDeSangre;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class SistemaSangre {
    private HashMap<Modificable, Integer> pacientesTratados;
    private HashSet<Paciente> pacientes;

    public SistemaSangre(){
        this.pacientes=new HashSet<>();
        this.pacientesTratados = new HashMap<>();
    }

    public void tratamientoDiario(){
        for (Modificable m : this.pacientesTratados.keySet()){
            if (m.tratar()){
                this.pacientesTratados.put(m, this.pacientesTratados.get(m) + 1);
            }
        }
    }

    public int pacientesNoTratados(){
        return this.pacientes.size() - this.pacientesTratados.size();
    }

    public static void main(String[] args) {
        SistemaSangre sistema = new SistemaSangre();

        Ninio ninio = new Ninio("Juanito", "López", LocalDate.of(2019, 3, 23), Genero.MASCULINO, TipoSangre.A ,true, 5);

        Joven joven = new Joven("Seba", "Pérez", LocalDate.of(2001, 4, 11), Genero.MASCULINO, TipoSangre.O ,true);

        Adulto adulto = new Adulto("Sofía", "Schneider", LocalDate.of(1981, 12, 20), Genero.FEMENINO, TipoSangre.B ,false);

        Geronte abuelo = new Geronte("Abuelacho", "Fernández", LocalDate.of(1947, 3, 14), Genero.HELICOPTERO_APACHE_DE_COMBATE, TipoSangre.AB ,false);


        sistema.pacientesTratados.put(ninio, 0);
        sistema.pacientesTratados.put(joven, 0);
        Collections.addAll(sistema.pacientes, ninio, joven, adulto, abuelo);

        sistema.tratamientoDiario();
        sistema.tratamientoDiario();
        sistema.tratamientoDiario();

        System.out.println(sistema.pacientesTratados.get(ninio));
        System.out.println(sistema.pacientesTratados.get(joven));
        System.out.println("Cantidad de pacientes no tratados: "+ sistema.pacientesNoTratados());
    }
}
