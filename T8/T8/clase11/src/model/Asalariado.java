package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Asalariado extends Trabajador{
    private int numeroPagas;

    @Override
    public void trabajar() {
        System.out.println("El asalariado se pone a trabajar");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número de pagas= "+numeroPagas);
    }
}
