package Elecciones;

import Enumeraciones.Fabricante;

public abstract class Dispositivo implements Mensajero{
    private static String numeroSerie = setNumeroSerie("AA00X1");
    private static Fabricante fabricante = setFabricante(Fabricante.MICROSOFT);
    private static String modelo = setModelo("Microsoft Pixel 8");

    public static String setNumeroSerie(String n){
        Dispositivo.numeroSerie=n;
        return n;
    }

    public static Fabricante setFabricante(Fabricante fabricante){
        Dispositivo.fabricante=fabricante;
        return fabricante;
    }

    public static String setModelo(String m){
        Dispositivo.modelo=m;
        return m;
    }
}
