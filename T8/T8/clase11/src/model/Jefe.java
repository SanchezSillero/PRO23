package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

public class Jefe extends Trabajador implements Votador{
    private int percAcciones;

    public Jefe(String dni, String nombre, String correo, int salario, int percAcciones) {
        super(dni, nombre, correo, salario);
        this.percAcciones = percAcciones;
    }

    @Override
    public void trabajar() {
        System.out.println("El jefe se pone a trabajar");
    }

    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("percAcciones= "+percAcciones);
    }

    @Override
    public void realizarVotacion() {
        System.out.println("El jefe se dispone a votar");
        int aleatorio = (int) (Math.random()*5/2);
        System.out.println("el voto del Jefe es: "+aleatorio);

    }
}
