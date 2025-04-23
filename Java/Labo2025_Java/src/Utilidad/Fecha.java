package Utilidad;

public class Fecha{
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }

    public Fecha(){
        this.dia=9;
        this.mes=12;
        this.anio=2018;
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

    public boolean Valida(){
        if (this.dia<1 || this.dia>31){
            this.setDia(1);
            return false;
        }
        else if (this.mes<1 || this.mes>12) {
            this.setMes(1);
            return false;
        }
        else if (this.anio<0) {
            this.setAnio(1);
            return false;
        }
        else {
            return true;
        }
    }

    public int diasMes(){
        int diasas=0;
        int[]treinta = {4, 6, 9, 11};
        int[]treintayuno= { 1, 3, 5, 7, 8, 10, 12 };
        if(this.mes==2){
            diasas=28;
        }
        else {
            for (int k : treinta) {
                if (k == this.mes) {
                    diasas = 30;
                    break;
                }
            }
            for (int j : treintayuno) {
                if (j == this.mes) {
                    diasas = 31;
                    break;
                }
            }
        }
        return diasas;
    }

    public String corta()
    {
        return this.dia+"-"+this.mes+"-"+this.anio;
    }
    public String larga()
    {
        return "Día de la semana "+this.dia+" del mes "+this.mes+" del año "+this.anio;
    }
    public void diaSiguiente(){
        int[]treinta = {4, 6, 9, 11};
        int[]treintayuno= { 1, 3, 5, 7, 8, 10, 12 };

        for (int s : treinta){
            if (s == this.mes){
                if (this.dia == 30){
                    this.setMes(this.mes+1);
                    this.setDia(1);
                }
                else{
                   this.setDia(this.dia+1);
                }
                break;
            }
        }
        for (int s : treintayuno){
            if (s == this.mes){
                if (this.dia == 31){
                    this.setMes(this.mes+1);
                    this.setDia(1);
                }
                else{
                    this.setDia(this.dia+1);
                }
                break;
            }
        }
        if(this.mes==2){
            if (this.dia==28){
                this.setMes(this.mes+1);
                this.setDia(1);
            }
            else {
                this.setDia(this.dia+1);
            }
        }
    }

    public void diaAnterior(){
        int[]treinta = {4, 6, 9, 11};
        int[]treintayuno= { 1, 3, 5, 7, 8, 10, 12 };

        for (int s : treinta){
            if (s == this.mes && this.mes!=3){
                if (this.dia == 1){
                    this.setMes(this.mes-1);
                    this.setDia(31);
                }
                else{
                    this.setDia(this.dia-1);
                }
                break;
            }
        }
        for (int s : treintayuno){
            if (s == this.mes && this.dia!=3){
                if (this.dia == 1){
                    this.setMes(this.mes-1);
                    this.setDia(1);
                }
                else{
                    this.setDia(this.dia-1);
                }
                break;
            }
        }
        if (this.mes==3){
            if (this.dia==1){
                this.setMes(this.mes-1);
                this.setDia(28);
            }
            else {
                this.setDia(this.dia-1);
            }
        }
    }
    
    public boolean igualQue(Fecha fecha){
        return fecha.getDia() == this.dia && fecha.getMes() == this.mes && fecha.getAnio() == this.anio;
    }

    public boolean menorQue(Fecha fecha){
        if (this.anio<fecha.getAnio()){
            return true;
        }
        else if (this.anio==fecha.getAnio()) {
            if (this.mes<fecha.getMes()) {
                return true;
            }
            else if (this.mes == fecha.getMes()) {
                return this.dia < fecha.getDia();
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public boolean mayorQue(Fecha fecha){
        if (this.anio>fecha.getAnio()){
            return true;
        }
        else if (this.anio==fecha.getAnio()) {
            if (this.mes>fecha.getMes()) {
                return true;
            }
            else if (this.mes == fecha.getMes()) {
                return this.dia > fecha.getDia();
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Fecha fecha1 = new Fecha (1, 12 ,2024);
        if (fecha1.Valida()){
            System.out.println("válida");
        }
        else {
            System.out.println("No válida");
        }
        System.out.println(fecha1.corta());
        System.out.println(fecha1.larga());
        System.out.println(fecha1.diasMes());

        Fecha fecha2 = new Fecha(2, 12, 2024);
        if (fecha1.mayorQue(fecha2)){
            System.out.println("esta mal");
        }
        else {
            System.out.println("mayor");
        }
    }
}