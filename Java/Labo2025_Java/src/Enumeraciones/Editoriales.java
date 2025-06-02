package Enumeraciones;

public enum Editoriales {
    KAPELUSZ("Kapelusz"), SUDAMERICANA("Sudamericana"), ATLANTIDA("Atlántida"), ELATENEO("El Ateneo"), INTERZONA("Interzona"), SUR("Sur"), ALIANZA("Alianza");
    private String nombre;

    private Editoriales(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }
}
