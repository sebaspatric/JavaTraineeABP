package ABP8.src.Curso;

import javax.swing.*;
import java.util.ArrayList;

/***
 * Escribe un programa en Java que solicite
 * el ingreso de nombres de varios alumnos
 * y la calificación en una prueba de cada uno
 * por teclado. No se sabe cuantos alumnos tiene
 * el curso, por lo que el programa debe terminar
 * cuando se ingrese un alumno con nombre igual
 * a “SALIR”. Al suceder lo anterior, se debe
 * desplegar por consola el promedio de curso
 * obtenido, el nombre del alumno con la menor
 * nota y el nombre del alumno con la mayor
 * nota. Es importante validar que se ingrese
 * siempre más de un alumno.
 */

public class Curso {
    public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>();
        ArrayList<Integer> listaNotas = new ArrayList<>();
        agregaAlumnos(listaNombres, listaNotas);
        compruebaMasDeUno(listaNombres, listaNotas);

        // Recorrer una lista
        for (int i = 0; i < listaNotas.size(); i++) {
            //acceder a array subyaacente
            System.out.println("Valor en la posicion " + i + " de la lista: " + listaNotas.get(i));
        }

        // Recorrer una lista
        for (int i = 0; i < listaNombres.size(); i++) {
            //acceder a array subyaacente
            System.out.println("Valor en la posicion " + i + " de la lista: " + listaNombres.get(i));
        }

        //el promedio de curso
        System.out.println("---------PROMEDIO-------------");
        double promedio;
        int count = 0;
        int suma=0;
        // Recorrer una lista
        for (int i = 0; i < listaNotas.size(); i++) {
            //acceder a array subyaacente
            //System.out.println("Valor en la posicion " + i + " de la lista: " + listaNotas.get(i));
            count++;
            suma+= listaNotas.get(i);

        }
        promedio = (double)suma/count;
        System.out.println("el promedio es: "+promedio);

        //--NumMayor-----------------------------------------------
        System.out.println("---------NumMayor-------------");
        int numMayor;
        numMayor = listaNotas.get(0);
        for (int i = 0; i < listaNotas.size(); i++) {
            if (listaNotas.get(i) > numMayor) {
                numMayor = listaNotas.get(i);
            }
        }
        System.out.println("El numero mayor es: " + numMayor);

        //--NumMayor-----------------------------------------------
        System.out.println("---------NumMenor-------------");
        int NumMenor;
        NumMenor = listaNotas.get(0);
        for (int i = 0; i < listaNotas.size(); i++) {
            if (listaNotas.get(i) < NumMenor) {
                NumMenor = listaNotas.get(i);
            }
        }
        System.out.println("El numero menor es: " + NumMenor);





    }

    public static void agregaAlumnos(ArrayList listaNombres, ArrayList listaNotas) {
        //-------------
        String nombre;
        int nota;
        nombre="";
        while (!nombre.equals("salir")){
            nombre = JOptionPane.showInputDialog("Ingresa un nombre");
            if (nombre.equals("salir")){
                break;
            }
            listaNombres.add(nombre);
            nota = Integer.parseInt(JOptionPane.showInputDialog("Ingresa una nota"));
            listaNotas.add(nota);
        }
       // do {
       //     nombre = JOptionPane.showInputDialog("Ingresa un nombre");
       //     listaNombres.add(nombre);
       //     nota = Integer.parseInt(JOptionPane.showInputDialog("Ingresa una nota"));
       //     listaNotas.add(nota);
//
       // } while (!nombre.equals("salir"));

        //--------------
    }

    public static void compruebaMasDeUno(ArrayList listaNombres, ArrayList listaNotas){
        //---------------------
        if (listaNombres.size()<=1){
            agregaAlumnos(listaNombres, listaNotas);
        }
        //------------------
    }

    //comprueba si es numérico
    public static boolean isNumeric(String cadena) {
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }
}
