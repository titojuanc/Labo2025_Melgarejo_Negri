package Consumo_de_electricidad_de_viviendas;

import java.time.LocalDate;
import java.util.HashMap;

public class Casa extends Vivienda{
    private double metros_cubiertos;
    private double metros_descubiertos;
    private static int valor_consumo=100;

    public Casa(String direccion, int codigo_postal, Duenio duenio, HashMap<LocalDate, Double> consumo, double metros_cubiertos, double metros_descubiertos) {
        super(direccion, codigo_postal, duenio, consumo);
        this.metros_cubiertos = metros_cubiertos;
        this.metros_descubiertos = metros_descubiertos;
    }

    public double getMetros_cubiertos() {
        return metros_cubiertos;
    }

    public void setMetros_cubiertos(double metros_cubiertos) {
        this.metros_cubiertos = metros_cubiertos;
    }

    public double getMetros_descubiertos() {
        return metros_descubiertos;
    }

    public void setMetros_descubiertos(double metros_descubiertos) {
        this.metros_descubiertos = metros_descubiertos;
    }

    public static int getValor_consumo() {
        return valor_consumo;
    }

    public static void setValor_consumo(int valor_consumo) {
        Casa.valor_consumo = valor_consumo;
    }

    public double calcularFactura(LocalDate fecha) {
        if (fechaYaCargada(fecha)){
            for(LocalDate l : this.getConsumo().keySet()){
                if(fecha.getMonth() == l.getMonth() && fecha.getYear() == l.getYear()){
                    Double con = this.getConsumo().get(l) * valor_consumo;
                    if (verificarDescuento(l, this.getConsumo().get(l))){
                        return con * 0.95;
                    } else {
                        return con;
                    }
                }
            }

        }
        System.out.println("No hay registro de esa fecha :) ");
        return 0;
    }
}
