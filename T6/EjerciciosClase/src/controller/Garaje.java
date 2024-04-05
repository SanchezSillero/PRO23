package controller;

import model.Coche;

public class Garaje {
    private Coche cocheTratado;
    private String averiaAsociada;
    private int conteoCoches;

    public Garaje() {
    }

    public boolean aceptarCoche (Coche coche, String averiaAsociada){
        if (cocheTratado == null){
            cocheTratado == coche;
            if (averiaAsociada.equalsIgnoreCase("aceite")){
                cocheTratado.getMotor().setLitrosAceite(cocheTratado.getMotor().getLitrosAceite()+10);

            }

        }
    }

}
