package TratamientoDeSangre;

import java.time.LocalDate;
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

        Ninio ninio = new Ninio("Juanito", "López", LocalDate.of(2021, 3, 23), Genero.MASCULINO, TipoSangre.A ,true, 5);

        Joven joven = new Joven("Seba", "Pérez", LocalDate.of(2001, 4, 11), Genero.MASCULINO, TipoSangre.O ,true, );
}
}
