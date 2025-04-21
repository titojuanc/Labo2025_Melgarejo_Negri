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

    }
}
