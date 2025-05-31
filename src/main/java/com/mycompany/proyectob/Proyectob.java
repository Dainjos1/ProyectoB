
package com.mycompany.proyectob;

import java.util.ArrayList;

public class Proyectob {
    public static ArrayList<Direcciones> Direcciones = new ArrayList<>();
   
    public static ArrayList<Venta> ventas = new ArrayList<>();
    
    public static ArrayList<Cupones> cupones = new ArrayList<>();
    
    public static ArrayList<Libros> libros = new ArrayList<>();

    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public static void main(String[]args){
        
        Usuario u = new Usuario ();
        u.setNombre("admin");
        u.setUsuario("admin");
        u.setPassword("admin");
        u.setRol(1);
        
        usuarios.add(u);
        
        Login v = new Login ();
        v.setVisible(true);
    }
}
