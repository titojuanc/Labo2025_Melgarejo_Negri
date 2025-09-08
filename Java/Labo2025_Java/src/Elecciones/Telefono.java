package Elecciones;

public class Telefono extends Dispositivo{
    private Compania compania;
    private int numero;
    private boolean encendido;
    private double credito;

    public Telefono(Compania compania, int numero){
        this.compania=compania;
        this.numero=numero;
        this.encendido=false;
    }

    public void setCredito(double credito){
        this.credito=credito;
    }

    public void prender(){
        this.encendido=true;
    }

    public void apagar(){
        this.encendido=false;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Conectando con la antena más cercana...");
        if (credito>0 && encendido){
            System.out.println(mensaje);
        }
    }
}
