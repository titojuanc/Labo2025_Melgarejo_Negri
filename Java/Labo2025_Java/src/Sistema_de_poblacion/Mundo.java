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

    public Continente menorCantContinente(){
        Continente aux = new Continente();
        boolean check = true;
        for (Continente con : this.continentes) {
            if(check){
                aux = con;
                check = false;
            }
            if (con.getPoblacion() < aux.getPoblacion()) {
                aux = con;
            }
        }
        return aux;
    }

    public Continente mayorCantContinente(){
        Continente aux = new Continente();
        boolean check = true;
        for (Continente con : this.continentes) {
            if(check){
                aux = con;
                check = false;
            }
            if (con.getPoblacion() > aux.getPoblacion()) {
                aux = con;
            }
        }
        return aux;
    }

    public Pais menorCantPais(){
        Pais p = new Pais();
        for(Continente con : this.continentes){
            p=con.menorCantPais(p);
        }
        return p;
    }

    public Pais mayorCantPais(){
        Pais p = new Pais();
        for(Continente con : this.continentes){
            p=con.menorCantPais(p);
        }
        return p;
    }

    public static void main(String[] args) {
        Barrio b1 = new Barrio(1000, 1);
        Barrio b2 = new Barrio(2000, 2);
        Barrio b3 = new Barrio(1500, 3);

        HashSet<Barrio> barrios1 = new HashSet<>();
        barrios1.add(b1);
        barrios1.add(b2);

        HashSet<Barrio> barrios2 = new HashSet<>();
        barrios2.add(b3);

        Ciudad c1 = new Ciudad(10, barrios1);
        Ciudad c2 = new Ciudad(20, barrios2);

        HashSet<Ciudad> ciudades1 = new HashSet<>();
        ciudades1.add(c1);

        HashSet<Ciudad> ciudades2 = new HashSet<>();
        ciudades2.add(c2);

        Provincia prov1 = new Provincia(100, ciudades1);
        Provincia prov2 = new Provincia(200, ciudades2);

        HashSet<Provincia> provincias1 = new HashSet<>();
        provincias1.add(prov1);

        HashSet<Provincia> provincias2 = new HashSet<>();
        provincias2.add(prov2);

        Pais pais1 = new Pais(1000, provincias1);
        Pais pais2 = new Pais(2000, provincias2);

        HashSet<Pais> paises1 = new HashSet<>();
        paises1.add(pais1);

        HashSet<Pais> paises2 = new HashSet<>();
        paises2.add(pais2);

        Continente cont1 = new Continente(999, paises1);
        Continente cont2 = new Continente(888, paises2);

        HashSet<Continente> todosLosContinentes = new HashSet<>();
        todosLosContinentes.add(cont1);
        todosLosContinentes.add(cont2);

        Mundo tierra = new Mundo(todosLosContinentes);

        System.out.println("Población por código (Continente 999): " + tierra.poblacionCodigo(999));
        System.out.println("Población por código (País 2000): " + tierra.poblacionCodigo(2000));

        System.out.println("Continente con menor población: Código " + tierra.menorCantContinente().getCodigo());
        System.out.println("Continente con mayor población: Código " + tierra.mayorCantContinente().getCodigo());

        System.out.println("País con menor población: Código " + tierra.menorCantPais().getCodigo());
        System.out.println("País con mayor población: Código " + tierra.mayorCantPais().getCodigo());
    }
}
