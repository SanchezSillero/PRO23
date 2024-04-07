package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Accionista extends Persona implements Votador{
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
