package SinClasificar;

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

    public void ordenarEquipos(ArrayList<Equipo> Pequipos = new ArrayList<Equipo>()){
        for (int i = 0; i<Pequipos.size(); i+=2){
            if (i+1<Pequipos.size()){
                this.fixture.add(Pequipos.get(i),Pequipos.get(i+1));
            }
            else {
                System.out.println("El equipo " + Pequipos.get(i) + " queda afuera por imparidad");
            }
        }
    }

    public void generarFixture(){
        ArrayList<Equipo> equiposMañana = new ArrayList<Equipo>();
        ArrayList<Equipo> equiposTarde = new ArrayList<Equipo>();
        ArrayList<Equipo> equiposNoche = new ArrayList<Equipo>();

        if(equipos.isEmpty()){
            System.out.println("Falta llenar equipos");
        }
        else{
            for (int i=0;i<this.equipos.size();i++){
                switch (equipos.get(i).getDisponibilidad().toLowerCase()) {
                    case "mañana":
                        equiposMañana.add(equipos.get(i));
                        break;
                    case "tarde":
                        equiposTarde.add(equipos.get(i));
                        break;
                    case "noche":
                        equiposNoche.add(equipos.get(i));
                        break;
                }
            }
        }
        ordenarEquipos(equiposMañana);
        ordenarEquipos(equiposTarde);
        ordenarEquipos(equiposNoche);
    }
}
