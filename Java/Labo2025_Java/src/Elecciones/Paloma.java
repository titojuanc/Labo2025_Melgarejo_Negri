package Elecciones;

public class Paloma extends Ave{
    private boolean mapa;

    public Paloma(String nombre, String color) {
        super(nombre, color);
        this.mapa=false;
    }

    public boolean isMapa() {
        return mapa;
    }

    public void aprenderMapa() {
        this.mapa = true;
    }

    @Override
    public void enviarMensaje() {
        if (mapa){
            System.out.println("Lanzando un papelito que dice: " + mensaje);
        }
    }
}
