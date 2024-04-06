package controller;

import model.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private ArrayList<Persona> listaPersonas;

    public Agenda() {
        this.listaPersonas = new ArrayList<>();
    }

    public void listarPersonas(){
        if (listaPersonas.isEmpty()){
            System.out.println("La agenda está vacía");
        }else {
            for (Persona persona : listaPersonas) {
                persona.mostrarDatos();
            }
        }
    }

    private Persona estaPersona(String dni){
        for (Persona persona : listaPersonas) {
            if (persona.getDni().equalsIgnoreCase(dni)){
                return persona;
            }
        }
        return null;
    }

    public void agregarPersona (Persona persona) {
        if (estaPersona(persona.getDni()) == null) {
            this.listaPersonas.add(persona);
        } else{
            System.out.println("El usuario con este DNI ya está en la agenda");
        }
    }

    public void borrarPersona (String dni){
        if (estaPersona(dni)!=null){
            listaPersonas.remove(estaPersona(dni));
        } else {
            System.out.println("No existe este DNI en la agenda");

        }
    }

    public void editarPersona (String dni){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce nuevo teléfono");
        int telefono = scanner.nextInt();
        System.out.println("Introduce nuevo nombre");
        String nombre= scanner.next();
        if (estaPersona(dni)!=null){
            estaPersona(dni).setNombre(nombre);
            estaPersona(dni).setTelefono(telefono);
        }
    }

    public void buscarPersona (String dni){
        if (estaPersona(dni)==null){
            System.out.println("El DNI no está en la agenda");
        }else {
           estaPersona(dni).mostrarDatos();
        }
    }

}
