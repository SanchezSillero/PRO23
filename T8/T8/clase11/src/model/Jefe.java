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
    private Puesto puesto;

    public Jefe(String dni, String nombre, String correo, int salario, int percAcciones, Puesto puesto) {
        super(dni, nombre, correo, salario);
        this.percAcciones = percAcciones;
        this.puesto = puesto;

    }

    @Override
    public void trabajar() {
        System.out.println("El jefe se pone a trabajar");
    }

    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("percAcciones= "+percAcciones);
        System.out.println(puesto.getDescripcion());
    }

    @Override
    public void realizarVotacion() {
        System.out.println("El jefe se dispone a votar");
        int aleatorio = (int) (Math.random()*5/2);
        System.out.println("el voto del Jefe es: "+aleatorio);

    }
}
