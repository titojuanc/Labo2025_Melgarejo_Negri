package RepasoEv1205;

import java.util.ArrayList;

public class SistemaVideoclubs {
    private ArrayList<Videoclub> videoclubs;

    public SistemaVideoclubs(){
        this.videoclubs=new ArrayList<>();
    }

    public SistemaVideoclubs(ArrayList<Videoclub> videoclubs) {
        this.videoclubs = videoclubs;
    }

    public ArrayList<Videoclub> getVideoclubs() {
        return videoclubs;
    }

    public void setVideoclubs(ArrayList<Videoclub> videoclubs) {
        this.videoclubs = videoclubs;
    }

    public void agregarVideoclub(Videoclub videoclub){
        this.videoclubs.add(videoclub);
    }

    public void borrarVideoclub(Videoclub videoclub){
        this.videoclubs.remove(videoclub);
    }

    public void modificarVideoclub(Videoclub videoclub_viejo, Videoclub videoclub_nuevo){
        for (Videoclub videoclub : this.videoclubs){
            if (videoclub.equals(videoclub_nuevo)){
                agregarVideoclub(videoclub_nuevo);
            }
            else if (videoclub.equals(videoclub_viejo)) {
                borrarVideoclub(videoclub_viejo);
            }
        }
    }


}
