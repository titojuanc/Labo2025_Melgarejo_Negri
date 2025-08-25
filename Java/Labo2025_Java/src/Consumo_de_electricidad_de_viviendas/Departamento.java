package Consumo_de_electricidad_de_viviendas;

import java.time.LocalDate;
import java.util.HashMap;

public class Departamento extends Vivienda{
    private int cant_ambientes;
    private static int valor_consumo=50;

    public Departamento(String direccion, int codigo_postal, Duenio duenio, HashMap<LocalDate, Double> consumo, int cant_ambientes) {
        super(direccion, codigo_postal, duenio, consumo);
        this.cant_ambientes = cant_ambientes;
    }

    public int getCant_ambientes() {
        return cant_ambientes;
    }

    public void setCant_ambientes(int cant_ambientes) {
        this.cant_ambientes = cant_ambientes;
    }

    public static int getValor_consumo() {
        return valor_consumo;
    }

    public static void setValor_consumo(int valor_consumo) {
        Departamento.valor_consumo = valor_consumo;
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
