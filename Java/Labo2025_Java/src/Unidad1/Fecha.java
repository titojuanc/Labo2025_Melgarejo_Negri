package Unidad1;

public class Fecha{
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }

    public int getAnio() {
        return anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public boolean Valida(Fecha fecha){
        if (fecha.getDia()<1 || fecha.getDia()>31){
            fecha.setDia(1);
            return false;
        }
        else if (fecha.getMes()<1 || fecha.getMes()>12) {
            fecha.setMes(1);
            return false;
        }
        else if (fecha.getAnio()<0) {
            fecha.setAnio(1);
            return false;
        }
        else {
            return true;
        }
    }

    public int diasMes(Fecha fecha){
        int diasas=0;
        int[]treinta = {4, 6, 9, 11};
        int[]treintayuno= { 1, 3, 5, 7, 8, 10, 12 };
        if(fecha.getMes()==2){
            diasas=28;
        }
        else {
            for (int k : treinta) {
                if (k == fecha.getMes()) {
                    diasas = 30;
                    break;
                }
            }
            for (int j : treintayuno) {
                if (j == fecha.getMes()) {
                    diasas = 31;
                    break;
                }
            }
        }
        return diasas;
    }

    public String corta(Fecha fecha){
        return fecha.getDia()+"-"+fecha.getMes()+"-"+fecha.getAnio();
    }
    public String larga(Fecha fecha){
        return "Día de la semana "+fecha.getDia()+" del mes "+fecha.getMes()+" del año "+fecha.getAnio();
    }
    public int diaSiguiente(Fecha fecha){
        int[]treinta = {4, 6, 9, 11};
        int[]treintayuno= { 1, 3, 5, 7, 8, 10, 12 };
        for (int s : treinta){
            if (s == fecha.getMes()){
                if (fecha.getDia())
                    //REANUDAR DESDE ACÁ
            }
        }
    }


}