package Sistema_de_poblacion;

import java.util.HashSet;

public class Mundo {
    HashSet<Continente> continentes;

    public Mundo(HashSet<Continente> continentes) {
        this.continentes = continentes;
    }

    public HashSet<Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(HashSet<Continente> continentes) {
        this.continentes = continentes;
    }

    public void agregar(Continente nuevo){
        this.continentes.add(nuevo);
    }

    public void borrar(Continente viejo){
        this.continentes.add(viejo);
    }

    public void modificar(Continente nuevo, Continente viejo){
        this.continentes.remove(viejo);
        this.continentes.add(nuevo);
    }

    public int poblacionCodigo(int codigo){
        int cant = 0;
        for (Continente con : this.continentes){
            if(con.getCodigo() == codigo){
                return con.getPoblacion();
            }
            else{
                cant = con.poblacionCodigo(codigo);
            }
        }
        return cant;
    }

    public int menorCantContinente(){
        Continente aux = new Continente()
        for (Continente con : this.continentes) {

            if (con) {
                return con.getPoblacion();
            }
        }
    }
}
