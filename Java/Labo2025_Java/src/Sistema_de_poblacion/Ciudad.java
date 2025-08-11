package Sistema_de_poblacion;

import java.util.HashSet;

public class Ciudad extends Lugar{
    private HashSet<Barrio> barrios;

    public Ciudad(int codigo, HashSet<Barrio> barrios){
        super(codigo);
        this.barrios = barrios;
    }

    public Ciudad(String nombre, int codigo, HashSet<Coordenada> coordenadas, HashSet<Barrio> barrios) {
        super(nombre, codigo, coordenadas);
        this.barrios = barrios;
    }

    public HashSet<Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(HashSet<Barrio> barrios) {
        this.barrios = barrios;
    }

    public void agregar(Barrio nuevo){
        this.barrios.add(nuevo);
    }

    public void borrar(Barrio viejo){
        this.barrios.add(viejo);
    }

    public void modificar(Barrio nuevo, Barrio viejo){
        this.barrios.remove(viejo);
        this.barrios.add(nuevo);
    }

    @Override
    public int getPoblacion(){
        int cant = 0;
        for(Barrio barr : this.barrios){
            cant += barr.getPoblacion();
        }
        return cant;
    }

    public int poblacionCodigo(int codigo){
        int cant = 0;
        for (Barrio barr : this.barrios){
            if(barr.getCodigo() == codigo){
                return barr.getPoblacion();
            }
        }
        return cant;
    }
}
