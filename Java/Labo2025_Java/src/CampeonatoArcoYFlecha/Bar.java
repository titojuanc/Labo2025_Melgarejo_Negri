package CampeonatoArcoYFlecha;

import java.util.HashSet;

public class Bar {
    private HashSet<Diana> dianas;
    private HashSet<Cliente> clientes;
    private double dinero_recaudado;
    private HashSet<Beneficio> beneficios;
    private HashSet<BeneficioAcumulable> beneficios_acumulables;

    public Bar(HashSet<Diana> dianas, HashSet<Cliente> clientes, double dinero_recaudado, HashSet<Beneficio> beneficios, HashSet<BeneficioAcumulable> beneficios_acumulables) {
        this.dianas = dianas;
        this.clientes = clientes;
        this.dinero_recaudado = dinero_recaudado;
        this.beneficios = beneficios;
        this.beneficios_acumulables = beneficios_acumulables;
    }

    public HashSet<Diana> getDianas() {
        return dianas;
    }

    public void setDianas(HashSet<Diana> dianas) {
        this.dianas = dianas;
    }

    public HashSet<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(HashSet<Cliente> clientes) {
        this.clientes = clientes;
    }

    public double getDinero_recaudado() {
        return dinero_recaudado;
    }

    public void setDinero_recaudado(double dinero_recaudado) {
        this.dinero_recaudado = dinero_recaudado;
    }

    public HashSet<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(HashSet<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    public HashSet<BeneficioAcumulable> getBeneficios_acumulables() {
        return beneficios_acumulables;
    }

    public void setBeneficios_acumulables(HashSet<BeneficioAcumulable> beneficios_acumulables) {
        this.beneficios_acumulables = beneficios_acumulables;
    }

    public int cantidadBeneficios(){
        return this.beneficios.size();
    }

    public Diana dianaMayorCantPuntajesDeUnBar(){
        HashSet<FranjaColor> puntaje = new HashSet<>();
        Diana d=new Circular("Demon", 1, Dificultad.MEDIO, puntaje);
        for (Diana dia : this.dianas){
            if(dia.getPuntajes().size()>d.getPuntajes().size()){
                d=dia;
            }
        }
        return d;
    }
}
