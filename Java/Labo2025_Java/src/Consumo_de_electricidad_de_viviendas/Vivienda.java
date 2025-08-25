package Consumo_de_electricidad_de_viviendas;

import java.time.LocalDate;
import java.util.HashMap;

public abstract class Vivienda {
    private String direccion;
    private int codigo_postal;
    private Duenio duenio;
    private HashMap<LocalDate, Double> consumo;

    public Vivienda(String direccion, int codigo_postal, Duenio duenio, HashMap<LocalDate, Double> consumo) {
        this.direccion = direccion;
        this.codigo_postal = codigo_postal;
        this.duenio = duenio;
        this.consumo = consumo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public HashMap<LocalDate, Double> getConsumo() {
        return consumo;
    }

    public void setConsumo(HashMap<LocalDate, Double> consumo) {
        this.consumo = consumo;
    }

    public void cargarConsumo(LocalDate fecha, double consumo){
        if(!fechaYaCargada(fecha)){
            this.consumo.put(fecha, consumo);
        }
        else{
            System.out.println("esta mal pibe");
        }
    }
    public boolean fechaYaCargada(LocalDate f){
        boolean res = false;
        for(LocalDate l : this.consumo.keySet()){
            if(l.getYear() == f.getYear()){
                if(l.getMonth() == f.getMonth()){
                    res=true;
                }
            }
        }
        return res;
    }

    public double calcularFactura(LocalDate fecha){return 0;}

    public boolean verificarDescuento(LocalDate fecha, Double consumo) {
        for (LocalDate l : this.getConsumo().keySet()) {
            if (fecha.getMonth() == l.getMonth() && fecha.getYear()-1 == l.getYear()) {
                if(consumo <= this.consumo.get(l)*0.90){
                    return true;
                }
                else {
                    break;
                }
            }
        }
        return false;
    }
}
