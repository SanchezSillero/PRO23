package model;

import java.util.ArrayList;

public class EntidadBancaria {
    private String nombre;
    private String cif;
    private ArrayList<Cuenta> listaCuentas;

    public EntidadBancaria(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
        this.listaCuentas = new ArrayList<>();
    }

    public void mostrarDatos() {
        System.out.println("Entidad: " + nombre);
        System.out.println("CIF: " + cif);
        for (Cuenta cuenta : listaCuentas) {
            cuenta.mostrarDatos();
        }
    }

    public Cuenta buscarCuenta(String dni, int pin) {
        for (Cuenta cuenta : listaCuentas) {
            if (cuenta.getDni().equalsIgnoreCase(dni) && cuenta.getPin() == pin) {
                return cuenta;
            }
        }
        return null;
    }

    public ArrayList<Cuenta> cuentasCliente(String dni){
        ArrayList<Cuenta> cuentasCliente = new ArrayList<>();
        for (Cuenta cuenta : listaCuentas){
            if (cuenta.getDni().equalsIgnoreCase(dni)){
                cuentasCliente.add(cuenta);
            }
        }
        return cuentasCliente.isEmpty() ? null : cuentasCliente;
    }


    public void agregarCuenta(Cuenta cuenta) {
        listaCuentas.add(cuenta);
    }

    public void eliminarCuenta(Cuenta cuenta) {
        listaCuentas.remove(cuenta);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }
}
