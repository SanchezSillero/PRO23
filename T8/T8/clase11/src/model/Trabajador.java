package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public abstract class Trabajador extends Persona{
    private int salario;
    public abstract void trabajar();

    public void mostrarDatos(){
      super.mostrarDatos();
        System.out.println("Salario= "+salario);
    }

    public Trabajador(String dni, String nombre, String correo, int salario) {
        super(dni, nombre, correo);
        this.salario = salario;
    }
}
