package ABP9.src;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Escribe un programa que administre almacene
     * una cantidad indeterminada de números enteros
     * en un ArrayList.
     * El programa debe solicitar números hasta que
     * se ingrese el valor 0;
     * una vez que esto pase,
     * se debe desplegar el promedio simple de los números,
     * el menor valor y
     * el mayor de ellos.
     * Una vez realizado lo anterior,
     * debe eliminar de la colección aquellos números que sean pares,
     * y calcular y desplegar nuevamente el
     * promedio, menor y mayor de los valores restantes.
     * Considere que el valor 0 final no debe ser tomado
     * en cuenta en el ArrayList.
     * Además, se debe validar que,
     * al momento de hacer los cálculos,
     * existan al menos tres valores ingresados.
     */

    public static List<Integer> lista =new ArrayList<Integer>();

    public static void main(String[] args) {
        System.out.println("Hello world!");
        agrega(lista);

        recorre(lista);

        //existan al menos tres valores ingresados.
        compruebaMasDe3(lista);

        promedio(lista);

        numMayor(lista);

        numMenor(lista);

        //--remover pares
        removerPares(lista);


        recorre(lista);

        compruebaMasDe3(lista);

        //--- nuevos calculos
        promedio(lista);

        numMayor(lista);

        numMenor(lista);








    }

    private static void compruebaMasDe3(List<Integer> lista) {
        //---------------------
        System.out.println("-------COMPRUEBA LISTA-----------");

        while ((lista.size()<=3)) {
            agrega(lista);
        }
        //if (lista.size()<=3){
        //    agrega(lista);
        //}
        //------------------
    }

    private static void removerPares(List<Integer> lista) {
        System.out.println("-------REMOVER PARES---------");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                lista.remove(lista.get(i));
            }


            //acceder a array subyaacente
            //System.out.println("Valor en la posicion " + i + " de la lista: " + lista.get(i));
        }
    }



    private static void numMenor(List<Integer> lista) {
        System.out.println("---------NUMERO MENOR-------------");
        int NumMenor;
        NumMenor = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) < NumMenor) {
                NumMenor = lista.get(i);
            }
        }
        System.out.println("El numero menor es: " + NumMenor);
    }

    private static void numMayor(List<Integer> lista) {
        //--NumMayor-----------------------------------------------
        System.out.println("---------NUMERO MAYOR-------------");
        int numMayor;
        numMayor = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > numMayor) {
                numMayor = lista.get(i);
            }
        }
        System.out.println("El numero mayor es: " + numMayor);

    }

    private static void recorre(List<Integer> lista) {
        // Recorrer una lista
        System.out.println("-------RECORRE LISTA----------------");
        for (int i = 0; i < lista.size(); i++) {
            //acceder a array subyaacente
            System.out.println("Valor en la posicion " + i + " de la lista: " + lista.get(i));
        }
    }

    public static void agrega(List lista) {
        //-------------
        System.out.println("-------AGREGA VALORES A  LISTA-----------");

        int nota;
        nota= 1;
        while (nota != 0){
            nota = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
            if (nota == 0){
                break;
            }
            lista.add(nota);
            //promedio(lista);
        }
        //--------------
    }

    public static void promedio(List lista) {
        //el promedio de curso
        System.out.println("---------PROMEDIO-------------");
        double promedio;
        int count = 0;
        int suma=0;
        // Recorrer una lista
        for (int i = 0; i < lista.size(); i++) {
            //acceder a array subyaacente
            //System.out.println("Valor en la posicion " + i + " de la lista: " + listaNotas.get(i));
            count++;
            suma+= (int)lista.get(i);
        }
        promedio = (double)suma/count;
        System.out.println("el promedio es: "+promedio);
    }


}