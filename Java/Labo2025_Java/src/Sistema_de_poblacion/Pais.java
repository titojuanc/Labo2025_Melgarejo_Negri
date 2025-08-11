package Sistema_de_poblacion;

import java.util.HashSet;

public class Pais extends Lugar{
    private HashSet<Provincia> provincias;

    public Pais(){
        super();
    }

    public Pais(int codigo, HashSet<Provincia> provincias){
        super(codigo);
        this.provincias = provincias;
    }

    public Pais(String nombre, int codigo, HashSet<Coordenada> coordenadas, HashSet<Provincia> provincias) {
        super(nombre, codigo, coordenadas);
        this.provincias = provincias;
    }

    public HashSet<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(HashSet<Provincia> provincias) {
        this.provincias = provincias;
    }

    public void agregar(Provincia nuevo){
        this.provincias.add(nuevo);
    }

    public void borrar(Provincia viejo){
        this.provincias.add(viejo);
    }

    public void modificar(Provincia nuevo, Provincia viejo){
        this.provincias.remove(viejo);
        this.provincias.add(nuevo);
    }

    @Override
    public int getPoblacion(){
        int cant = 0;
        for(Provincia prov : this.provincias){
            cant += prov.getPoblacion();
        }
        return cant;
    }

    public int poblacionCodigo(int codigo){
        int cant = 0;
        for (Provincia prov : this.provincias){
            if(prov.getCodigo() == codigo){
                return prov.getPoblacion();
            }
            else{
                cant = prov.poblacionCodigo(codigo);
            }
        }
        return cant;
    }
}
