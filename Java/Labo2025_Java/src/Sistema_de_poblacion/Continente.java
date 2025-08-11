package Sistema_de_poblacion;

import java.util.HashSet;

public class Continente extends Lugar{
    private HashSet<Pais> paises;

    public Continente(){
        super();
    }

    public Continente(int codigo, HashSet<Pais> paises){
        super(codigo);
        this.paises = paises;
    }

    public Continente(String nombre, int codigo, HashSet<Coordenada> coordenadas, HashSet<Pais> paises) {
        super(nombre, codigo, coordenadas);
        this.paises = paises;
    }

    public HashSet<Pais> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<Pais> paises) {
        this.paises = paises;
    }

    public void agregar(Pais nuevo){
        this.paises.add(nuevo);
    }

    public void borrar(Pais viejo){
        this.paises.add(viejo);
    }

    public void modificar(Pais nuevo, Pais viejo){
        this.paises.remove(viejo);
        this.paises.add(nuevo);
    }

    @Override
    public int getPoblacion(){
        int cant = 0;
        for(Pais pais : this.paises){
            cant += pais.getPoblacion();
        }
        return cant;
    }

    public int poblacionCodigo(int codigo){
        for (Pais pais : this.paises){
            if(pais.getCodigo() == codigo){
                return pais.getPoblacion();
            }
            else{
                int cant = pais.poblacionCodigo(codigo);
                if(cant != 0){
                    return cant;
                }
            }
        }
        return 0;
    }

    public Pais menorCantPais(Pais p){
        for (Pais pa : this.paises){
            if(p == null || pa.getPoblacion() < p.getPoblacion()){
                p = pa;
            }
        }
        return p;
    }

    public Pais mayorCantPais(Pais p){
        for (Pais pa : this.paises){
            if(p == null || pa.getPoblacion() > p.getPoblacion()){
                p = pa;
            }
        }
        return p;
    }

}
