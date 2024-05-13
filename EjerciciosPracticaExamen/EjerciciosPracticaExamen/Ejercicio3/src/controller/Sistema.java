package controller;

import model.Usuario;

import java.util.ArrayList;

public class Sistema {
    ArrayList<Usuario> usuarios;

    public Sistema() {
        this.usuarios = new ArrayList<>();
    }

    public Sistema(ArrayList<Usuario> usuarios) {
        this.usuarios = new ArrayList<>();
    }

    public void darAltaUsuraio (Usuario usuario){
        usuarios.add(usuario);
    }

    /*public boolean loginUsuario(Usuario usuario){
       boolean usuarioRegistrado = usuarios.contains(usuario);
       if (usuarioRegistrado){
           System.out.println("El usuario está registrado en el sistema");
       }else {
           System.out.println("El usuario no está registrado en el sistema");
       }
       return usuarioRegistrado;
    }*/
    public boolean loginUsuario(String correo, String contrasena){
       for (Usuario item : usuarios) {
           if (item.getCorreo().equals(correo) && item.getContrasena().equals(contrasena)){
               System.out.println("El usuario está registrado en el sistema, acceso correcto");
               return true;
           }
       }
        System.out.println("El correo o la contraseña no son correctos o no están registrados en el sistema");
       return false;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
