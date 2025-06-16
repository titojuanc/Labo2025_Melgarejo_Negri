package Sistemas;

import Entidades.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SistemaMascotas {
    private ArrayList<Mascota> mascotas;

    public SistemaMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public String verificarNombre(String nombre){
        for (Mascota m : mascotas){
            if (m.getNombre().equals(nombre)){
                return "Frank Fabra";
            }
        }
        return nombre;
    }

    public void agregarMascota(Mascota m, String tipo){
        m.setNombre(verificarNombre(m.getNombre()));
        this.mascotas.add(m);
    }

    public void eliminarMascota(Mascota mascota){
        this.mascotas.remove(mascota);
    }

    public void modificarMascota(Mascota nueva, Mascota vieja){
        this.mascotas.add(nueva);
        this.mascotas.remove(vieja);
    }

    public void imprimirMascotas(){
        for (Mascota m : this.mascotas){
            System.out.println(m.getNombre());
        }
    }

    public void saludar(Persona p, Mascota m){
        m.saludar(p);
        if(m.queSoy().toLowerCase().equals("pez")){
            if(m.verificarMuerte()) {
                eliminarMascota(m);
                System.out.println("La palmó el pez");
            }
        }
    }

    public void alimentar(Mascota m){
        for (Mascota masc : this.mascotas){
            if(masc.equals(m)){
                m.alimentar();
            }
        }
    }

    public static void main(String[] args) {
        Persona persona1=new Director("La", "Timba");
        Persona persona2=new Director("Mati","Rui");
        Persona persona3=new Director("Juan Roman", "Riquelme");

        Perro perro1=new Perro("Lanzini", persona1);
        Pez pez1=new Pez("MatiRuiJR", persona2);
        Gato gato1=new Gato("Mauricio", persona3);
        Pajaro pajaro1=new Pajaro("Lanzini", persona2, true);

        ArrayList<Mascota> mascotas=new ArrayList<>();
        SistemaMascotas s1=new SistemaMascotas(mascotas);

        s1.agregarMascota(perro1, perro1.queSoy());
        s1.agregarMascota(pez1, pez1.queSoy());
        s1.agregarMascota(gato1, gato1.queSoy());
        s1.agregarMascota(pajaro1, pajaro1.queSoy());

        s1.imprimirMascotas();
        s1.saludar(persona1, perro1);
        s1.saludar(persona2, gato1);
        s1.saludar(persona2, pez1);
        s1.saludar(persona1, pez1);
        s1.saludar(persona2, pajaro1);

        s1.alimentar(pez1);
        s1.alimentar(perro1);
        s1.saludar(persona1, perro1);
        System.out.println(pez1.getVidas());
    }
}
