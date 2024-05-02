package model;

import java.util.ArrayList;

public class Pizza {
    private String nombre;
    private double precio;
    private ArrayList<Ingrediente> conjuntoIngredientes;


    public Pizza(String nombre) {
        this.nombre = nombre;
        this.conjuntoIngredientes = new ArrayList<Ingrediente>();
    }


    public void mostrarIngredientes(){
        for (Ingrediente item : conjuntoIngredientes) {
            item.mostrarDatos();
        }
    }
    public double calcularPrecio(){
        for (Ingrediente item : conjuntoIngredientes){
            this.precio += item.getPrecio();
        }
        return precio;
    }

    public void añadirIngrediente(Ingrediente ingrediente){
        conjuntoIngredientes.add(ingrediente);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Ingrediente> getConjuntoIngredientes() {
        return conjuntoIngredientes;
    }

    public void setConjuntoIngredientes(ArrayList<Ingrediente> conjuntoIngredientes) {
        this.conjuntoIngredientes = conjuntoIngredientes;
    }
}
