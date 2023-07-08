package org.example;

import Models.Cliente;
import Models.Usuario;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Usuario u = new Usuario();
            u.setFechaNacimiento("11/11/1986");
            u.setNombre("ingenieria en contruccion");
            u.setRun(2255555);
            String u1 = u.mostrarEdad();
            System.out.println(u1);
            String u2 = u.analizarUsuario();
            System.out.println(u2);
            System.out.println(u);

        String  cl1, ca1;
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        cliente1.setComuna("maipu");
        cl1 = cliente1.getComuna();
        System.out.println(cl1);
        String f1, f2, f3, f4;
        cliente1.setNombres("Rodolfo");
        cliente1.setApellidos("Pelluco");
        cliente1.setRUT(11111111);
        f1 = cliente1.obtenerNombre();
        f2 = cliente1.obtenerSistemaSalud();
        System.out.println("El nombre es: "+f1 );
        System.out.println(f2);
        System.out.println(cliente1);
        cliente2.setRUT(55);
        System.out.println(cliente2);
    }
}