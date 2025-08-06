package Sistema_de_poblacion;

import java.util.HashSet;

public class Provincia extends Lugar{
    private HashSet<Ciudad> ciudades;

    public Provincia(String nombre, int codigo, HashSet<Coordenada> coordenadas, HashSet<Ciudad> ciudades) {
        super(nombre, codigo, coordenadas);
        this.ciudades = ciudades;
    }

    public HashSet<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public void agregar(Ciudad nuevo){
        this.ciudades.add(nuevo);
    }

    public void borrar(Ciudad viejo){
        this.ciudades.add(viejo);
    }

    public void modificar(Ciudad nuevo, Ciudad viejo){
        this.ciudades.remove(viejo);
        this.ciudades.add(nuevo);
    }

    @Override
    public int getPoblacion(){
        int cant = 0;
        for(Ciudad ciud : this.ciudades){
            cant += ciud.getPoblacion();
        }
        return cant;
    }

    public int poblacionCodigo(int codigo){
        int cant = 0;
        for (Ciudad ciud : this.ciudades){
            if(ciud.getCodigo() == codigo){
                return ciud.getPoblacion();
            }
            else{
                cant = ciud.poblacionCodigo(codigo);
            }
        }
        return cant;
    }
}
