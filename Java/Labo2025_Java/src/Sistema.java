import java.util.ArrayList;

public class Sistema {
    private ArrayList<Equipo> equipos;
    private ArrayList<ArrayList<Partido>> fixture;

    public Sistema(){
        this.equipos=new ArrayList<>();
    }

    public Sistema(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public void generarFixture(){
        ArrayList<Equipo> equiposMañana = new ArrayList<Equipo>();
        ArrayList<Equipo> equiposTarde = new ArrayList<Equipo>();
        ArrayList<Equipo> equiposNoche = new ArrayList<Equipo>();
        if(equipos.isEmpty()){
            System.out.println("Falta llenar equipos");
        }
        else{
            for (int i=0;i<equipos.size();i++){
                switch (equipos.get(i).getDisponibilidad().toLowerCase()) {
                    case "mañana":

                }
            }
        }
    }
}
