package model;

public class Audio extends Elemento{
    private double duracion;
    private Soporte soporte;

    public Audio() {
    }

    public Audio(int identificador, String titulo, Persona autor, double tamaño, Formato formato, double duracion, Soporte soporte) {
        super(identificador, titulo, autor, tamaño, formato);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    public Audio(String titulo, Persona autor, double tamanio, Formato formato, double duracion, Soporte soporte) {
        super(titulo, autor, tamanio, formato);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Duración: " + duracion);
        System.out.println("Soporte: " + soporte);
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Soporte getSoporte() {
        return soporte;
    }

    public void setSoporte(Soporte soporte) {
        this.soporte = soporte;
    }
}
