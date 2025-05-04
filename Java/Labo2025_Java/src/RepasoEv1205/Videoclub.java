package RepasoEv1205;

import java.util.ArrayList;

public class Videoclub {
    private String direccion;
    private int codigo_postal;
    private ArrayList<Estanteria> estanterias;

    public Videoclub(){
        this.direccion="Poli";
        this.codigo_postal=1431;
        this.estanterias=new ArrayList<>();
    }

    public Videoclub(String direccion, int codigo_postal, ArrayList<Estanteria> estanterias) {
        this.direccion = direccion;
        this.codigo_postal = codigo_postal;
        this.estanterias = estanterias;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public ArrayList<Estanteria> getEstanterias() {
        return estanterias;
    }

    public void setEstanterias(ArrayList<Estanteria> estanterias) {
        this.estanterias = estanterias;
    }

    public void agregarEstanteria(Estanteria estanteria){
        this.estanterias.add(estanteria);
    }

    public void borrarEstanteria(Estanteria estanteria){
        this.estanterias.remove(estanteria);
    }

    public void modificarEstanteria(Estanteria estanteria_viejo, Estanteria estanteria_nuevo){
        for (Estanteria estanteria : this.estanterias){
            if (estanteria.equals(estanteria_nuevo)){
                agregarEstanteria(estanteria_nuevo);
            }
            else if (estanteria.equals(estanteria_viejo)) {
                borrarEstanteria(estanteria_viejo);
            }
        }
    }

    public String mostrarNombreEstanteriaPeliculaMayorDuracion(Videoclub videoclub){

        return "";
    }
}
