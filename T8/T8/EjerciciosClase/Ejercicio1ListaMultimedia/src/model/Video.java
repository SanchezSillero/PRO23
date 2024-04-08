package model;

import java.util.ArrayList;

public class Video extends Elemento {
    private Persona director;
    private ArrayList<Persona> actores;

    public Video() {
    }

    public Video(int identificador, String titulo, Persona autor, double tamaño, String formato, Persona director, ArrayList<Persona> actores) {
        super(identificador, titulo, autor, tamaño, formato);
        this.director = director;
        this.actores = actores;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Director: " + director.getNombre());
        System.out.println("Actores: ");
        for (Persona actor : actores) {
            System.out.println(actor.getNombre());
        }
    }

    public Persona getDirector() {
        return director;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }

    public ArrayList<Persona> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Persona> actores) {
        this.actores = actores;
    }
}
