package model;

public class Audio extends Elemento{
    private double duracion;
    private String soporte;

    public Audio() {
    }

    public Audio(int identificador, String titulo, Persona autor, double tamaño, String formato, double duracion, String soporte) {
        super(identificador, titulo, autor, tamaño, formato);
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

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
