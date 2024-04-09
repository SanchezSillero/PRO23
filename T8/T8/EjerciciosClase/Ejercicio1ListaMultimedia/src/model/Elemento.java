package model;

public class Elemento {
    private int identificador;
    private String titulo;
    private Persona autor;
    private double tamanio;
    private String formato;

    public Elemento() {
    }

    public Elemento(int identificador, String titulo, Persona autor, double tamaño, String formato) {
        this.identificador = identificador;
        this.titulo = titulo;
        this.autor = autor;
        this.tamanio = tamaño;
        this.formato = formato;
    }

    public void mostrarDatos() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor.getNombre());
        System.out.println("Tamaño: " + tamanio);
        System.out.println("Formato: " + formato);
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public double getTamaño() {
        return tamanio;
    }

    public void setTamaño(double tamaño) {
        this.tamanio = tamaño;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
