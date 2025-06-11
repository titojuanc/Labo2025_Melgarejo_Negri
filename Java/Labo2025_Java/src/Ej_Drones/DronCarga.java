package Ej_Drones;

import java.time.LocalDate;

public class DronCarga extends Dron{
    private int cargaMax;

    public DronCarga(String modelo, LocalDate fechaAdquisicion, int cargaMax) {
        super(modelo, fechaAdquisicion);
        this.cargaMax=cargaMax;
    }

    @Override
    public boolean ejecutarMision(double latitud, double longuitud) {
        double kilometros= distanciaEnKm(latitud, longuitud);
        if (this.getNivelCarga() >= 48){
            if (kilometros<=30){
                this.setNivelCarga(getNivelCarga()-48);
                return true;
            }
        }
        return false;
    }



}
