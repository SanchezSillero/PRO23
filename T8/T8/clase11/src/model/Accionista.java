package model;

public class Accionista extends Persona implements Votador{

    public Accionista(String dni, String nombre, String correo) {
        super(dni, nombre, correo);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }

    @Override
    public void realizarVotacion() {
        System.out.println("El accionista he entrado en escena y votara");
        int aleatorio = (int)(Math.random()*10/2);
        System.out.println("El voto supremo del accionista es "+aleatorio);
    }
}
