package Objetos;

import Enumeraciones.Tecnologia;

public class Televisor extends ProductoMultimedia{
    private Tecnologia tecnologia;


    public Televisor(String nombre, double precio, int stock, Tecnologia tecnologia) {
        super(nombre, precio, stock);
        this.tecnologia=tecnologia;
    }

}
