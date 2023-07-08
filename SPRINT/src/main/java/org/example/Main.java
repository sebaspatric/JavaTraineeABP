package org.example;

import Models.Cliente;
import Models.Usuario;

import static Validation.Validation.dateValidator;

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

        System.out.println("---------------");
        Usuario u3 = new Usuario();
        u3.setFechaNacimiento("11/11/198u6");
        u3.setNombre("ingenie");
        //u3.setNombre("ingenieria en contruccion");
        u3.setRun(2255555);
        System.out.println(dateValidator("11/11/198u6"));
        String u31 = u3.mostrarEdad();
        System.out.println(u1);
        String u21 = u3.analizarUsuario();
        System.out.println(u31);
        System.out.println(u21);


    }
}