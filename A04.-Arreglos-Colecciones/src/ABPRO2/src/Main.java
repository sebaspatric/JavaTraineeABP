package ABPRO2.src;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //----------------------------ASISTENTES----------------------------------------------------------//
        //De acuerdo con la cantidad de asistentes anteriormente ingresada,
        // se debe solicitar y el nombre y edad de los asistentes.
        Scanner entrada = new Scanner(System.in);
        int nIngresos;

        nIngresos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de datos solicitados"));
        char[] letras = new char[nIngresos];
        System.out.println("Digite los ingresos del arreglo");

        for (int i=0; i<nIngresos; i++) {
            System.out.println((i+1)+".- Ingrese un caracter: ");
            letras[i]=entrada.next().charAt(0);
        }

        System.out.println("Los caracteres del arreglo con: ");
        for(int i=0; i<nIngresos; i++) {
            System.out.print(letras[i]+" ");
        }
    }
}