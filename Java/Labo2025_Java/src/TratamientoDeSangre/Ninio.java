package TratamientoDeSangre;

import java.time.LocalDate;

public class Ninio extends Paciente implements Modificable{
    private int nivelTolerancia;
    private boolean mayorA3;
    private int precioTratamiento;

    public Ninio(String nombre, String apellido, LocalDate fecha, Genero genero, TipoSangre tipoSangre, boolean factorRH, int nivelTolerancia) {
        super(nombre, apellido, fecha, genero, tipoSangre, factorRH);
        if (nivelTolerancia>=10){
            nivelTolerancia=10;
        } else if (nivelTolerancia<=1) {
            nivelTolerancia=1;
        } else {
            this.nivelTolerancia=nivelTolerancia;
        }

        if (this.calcularEdad()<=3){
            mayorA3=false;
        } else {
            mayorA3=true;
        }
    }



    @Override
    public boolean tratar() {
        if (mayorA3){
            System.out.println("Tu tratamiento tardará esta cantidad de días: " + (nivelTolerancia * 2));
            return true;
        } else {
            System.out.println();
            return false;
        }
    }

    @Override
    public int precioTratamiento() {
        return nivelTolerancia * 450000;
    }
}
