package controller;

import model.Audio;
import model.Elemento;
import model.Libro;
import model.Video;

import java.util.ArrayList;

public class Coleccion {
    ArrayList<Elemento> coleccion;


    public Coleccion() {
        this.coleccion = new ArrayList<>();
    }

    public void anadirElemento(Elemento elemento) {
        if (coleccion.isEmpty()){
            elemento.setIdentificador(1);
        }else {
            elemento.setIdentificador(coleccion.get(coleccion.size()-1).getIdentificador()+1);
        }
        coleccion.add(elemento);
        System.out.println("Archivo añadido satisfactoriamente");
    }

    public void borrarElemento(int identificador){
        boolean esta = false;
        for (Elemento elemento : coleccion) {
            if (elemento.getIdentificador() == identificador){
                esta = true ;
                coleccion.remove(elemento);
                break;
            }
        }
        if (!esta){
            System.out.println("No existe ningún elemento con ese identificador");
        }
    }

    public void listarElemento(){
        for (Elemento elemento : coleccion) {
            elemento.mostrarDatos();
        }
    }

    public void listarDetalle(int tipo){
        for (Elemento elemento : coleccion) {
            if (tipo==1){
                if (elemento instanceof Libro){
                    elemento.mostrarDatos();
                }
            }
            if (tipo==2){
                if (elemento instanceof Video){
                    elemento.mostrarDatos();
                }
            }
            if (tipo==3){
                if (elemento instanceof Audio){
                    elemento.mostrarDatos();
                }
            }
        }
    }




}
