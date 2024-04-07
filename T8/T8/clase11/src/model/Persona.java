package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public abstract class Persona {
     private String dni, nombre, correo;

     public void mostrarDatos(){
          System.out.println("DNI = " + dni);
          System.out.println("nombre = " + nombre);
          System.out.println("correo = " +correo);
     }
}
