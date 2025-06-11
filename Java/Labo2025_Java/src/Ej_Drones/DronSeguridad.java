package Ej_Drones;

import java.time.LocalDate;

public class DronSeguridad extends Dron{
    private int memoriaSD;

    public DronSeguridad(String modelo, LocalDate fechaAdquisicion, int memoriaSD) {
        super(modelo, fechaAdquisicion);
        this.memoriaSD=memoriaSD;
    }

    @Override
    boolean ejecutarMision(double latitud, double longuitud) {
        double kilometros= distanciaEnKm(latitud, longuitud);
        if (((int) kilometros/2) * 12 <= memoriaSD){
            return true;
        }
        else {
            return false;
        }
    }
}
