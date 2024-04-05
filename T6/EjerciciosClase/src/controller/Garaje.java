package controller;

import model.Coche;

public class Garaje {
    private Coche cocheTratado;
    private String averiaAsociada;
    private int conteoCoches;
    private double precioReparacion;
    private double caja;

    public Garaje() {
    }

    public boolean aceptarCoche(Coche coche, String averiaAsociada) {
        if (cocheTratado == null) {
            cocheTratado = coche;
            if (averiaAsociada.equalsIgnoreCase("aceite")) {
                cocheTratado.getMotor().setLitrosAceite(cocheTratado.getMotor().getLitrosAceite() + 10);

            }
            precioReparacion = Math.random() * 300;
            cocheTratado.acumularAveria(precioReparacion);
            conteoCoches++;
            return true;
        }
        return false;
    }

    public void devolverCoche() {
        caja += precioReparacion;
        this.cocheTratado = null;
    }

    public Coche getCocheTratado() {
        return cocheTratado;
    }

    public void setCocheTratado(Coche cocheTratado) {
        this.cocheTratado = cocheTratado;
    }

    public String getAveriaAsociada() {
        return averiaAsociada;
    }

    public void setAveriaAsociada(String averiaAsociada) {
        this.averiaAsociada = averiaAsociada;
    }

    public int getConteoCoches() {
        return conteoCoches;
    }

    public void setConteoCoches(int conteoCoches) {
        this.conteoCoches = conteoCoches;
    }

    public double getPrecioReparacion() {
        return precioReparacion;
    }

    public void setPrecioReparacion(double precioReparacion) {
        this.precioReparacion = precioReparacion;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }
}
