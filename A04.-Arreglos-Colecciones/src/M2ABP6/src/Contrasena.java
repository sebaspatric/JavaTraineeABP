package M2ABP6.src;

import java.util.Scanner;

public class Contrasena {
    public static void main(String[] args) {
        String contrasena = new String("contrasena");
        String intent;
        Scanner sc;
        sc = new Scanner(System.in);
        int nIntentos = 0;



        do {
            System.out.println("Introduce una contraseña");
            intent = sc.next();
            nIntentos++;

        }while (nIntentos<3 & !intent.equals(contrasena));

        if (intent.equals(contrasena)){
            System.out.println("La clave ingresada es correcta");
        }else {
            System.out.println("La clave no es correcta");
        }
    }
}
