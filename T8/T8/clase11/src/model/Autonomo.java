package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Autonomo extends Trabajador{
    private int cuota, seguro;


    public Autonomo(String dni, String nombre, String correo, int salario, int cuota, int seguro) {
        super(dni, nombre, correo, salario);
        this.cuota = cuota;
        this.seguro = seguro;
    }

    @Override
    public void trabajar() {
        System.out.println("El autonomo se pone a trabajar");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cuota= "+cuota);
        System.out.println("Seguro= "+seguro);
    }
}
