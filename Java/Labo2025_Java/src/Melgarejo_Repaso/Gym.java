package Melgarejo_Repaso;

import java.util.ArrayList;

public class Gym {
    private ArrayList<Socio> socios;
    private ArrayList<Clase> clases;
    private ArrayList<Reserva> reservas;

    public Gym() {
        this.socios = new ArrayList<>();
        this.clases = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    public void setSocios(ArrayList<Socio> socios) {
        this.socios = socios;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public int cantReservas(Clase clase){
        int gente=0;
        for (Reserva res : reservas){
            if (res.getClase().equals(clase)){
                gente=gente+1;
            }
        }
        return gente;
    }

    public Clase claseMasReservada(){
        int cant=0;
        Clase claseMasRes = this.clases.getFirst();
        for (Clase clase : clases){
            if(cant<this.cantReservas(clase));
            cant=this.cantReservas(clase);
            claseMasRes=clase;
        }
        return claseMasRes;
    }

    public boolean hayCupos(Clase clase){
        if (cantReservas(clase)>=clase.getCuposMax()){
            return false;
        }
        else {
            return true;
        }
    }

    public void agregarReservas(Reserva reserva){
        if (this.hayCupos(reserva.getClase())){
            if (reserva.getSocio().isActivo()){
                if(this.getReservas().contains(reserva)){
                    this.reservas.add(reserva);
                }
                else {
                    System.out.println("Error, la reserva ya está cargada");
                }
            }
            else {
                System.out.println("Error, el socio no está activo");
            }
        }
        else{
            System.out.println("Error, la clase no tiene más cupos");
        }
    }
}

