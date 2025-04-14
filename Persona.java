public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public Persona(){
        this.nombre="Pedro";
        this.edad=15;
        this.direccion="ElPoli";
    }
    public Persona(String nombre, int edad, String direccion){
        this.nombre=nombre;
        this.edad=edad;
        this.direccion=direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void imprimirDatos(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Direccion: "+this.direccion);
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.imprimirDatos();
    }
}

