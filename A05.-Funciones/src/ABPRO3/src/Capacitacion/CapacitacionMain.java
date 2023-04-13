package ABPRO3.src.Capacitacion;

import javax.swing.*;
import java.util.Scanner;

/***
 *Desarrolle un programa en Java que solicite el día, hora, lugar,
 * duración y cantidad de asistentes de una capacitación.
 * Con la cantidad anterior, debe crear un arreglo que tenga
 * dicha cantidad de filas y dos columnas.
 * En cada fila debe ir en la primera columna el nombre del
 * asistente a la capacitación,
 * y en la segunda columna la
 * calificación que el usuario entrega.
 *
 * Para efectos de este problema almacene en la matriz
 * la calificación como un String que representa una nota entre 1 y 7,
 * las calificaciones solo pueden corresponder a valores enteros.
 * Una vez ingresada la última calificación, debe mostrar por consola
 * los datos de la capacitación, el promedio de notas asignada,
 * la calificación mayor y la calificación menor.
 *
 */
public class CapacitacionMain {
    public static void main(String[] args) {
        System.out.println("----------CAPACITACCION-------");
        String dia;
        String hora;
        String lugar;
        String duracion;
        int cantAsistentes;
        int nota = 0; //valor para comprobar nota
        String cadena; // cadena para la nota
        String nombre;
        int f; //valor que toma el indice filas el iterador
        int c; //valor para el indice de columna

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Entregue el día: ");
        dia = sc.next();
        System.out.println("Entregue la hora");
        hora = sc.next();
        System.out.println("Entregue el lugar");
        lugar = sc.next();
        System.out.println("Entregue la duración");
        duracion = sc.next();
        System.out.println("Entregue la cantidad de asistentes");
        cantAsistentes = Integer.parseInt(sc.next());

        String[][] matriz=  new String[cantAsistentes][2];


        //nota = 0;
        cadena= String.valueOf(2);
        compruebaNota(cadena, nota);
        nota = Integer.parseInt(cadena);
        System.out.println(cadena);
        System.out.println(nota);

        System.out.println("--------------------");
        //rellenar matriz
        f = 0; //valor fila
        c = 0; //valor columna
        for (int i=f; i<matriz.length; i++){
            for (int j=c; j<matriz[i].length; j++){
                if (j== (matriz[i].length-1)){
                    continue;
                }
                nombre=JOptionPane.showInputDialog("1.1 Ingresa un nombre ");
                matriz[i][j]=nombre;
                cadena=JOptionPane.showInputDialog("1.1 Ingresa una nota ");
                cadena= compruebaNota(cadena, nota);
                matriz[i][(j+1)]= String.valueOf(cadena);
            }
        }

        System.out.println("-------DATOS CAPACITACION-------------");
        System.out.println("dia: "+dia);
        System.out.println("hora: "+hora);
        System.out.println("lugar: "+lugar);
        System.out.println("duracion: "+duracion);
        System.out.println("cantidad de asistentes: "+cantAsistentes);



        // mostrar valores de matriz

        System.out.println("ASISTENTES"+ "\t"+"NOTAS");
        for (int i=f; i<matriz.length; i++){
            for (int j=c; j<matriz[i].length; j++){
                if (j== (matriz[i].length-1)){
                    continue;
                }
               System.out.println(matriz[i][j]+ "\t"+"\t"+matriz[i][(j+1)]);
            }
        }

        int valor;
        int suma =0;
        int count = 0;
        c = 1;
        System.out.println("--------PROMEDIO------------");
        System.out.println("ID"+ "\t"+"NOTAS");
        // mostrar valores de columna 1 matriz
        for (int i=f; i<matriz.length; i++){
            int j = c;
            count++;
            valor = Integer.parseInt(matriz[i][j]);
            suma+=valor;

            System.out.println(count+"\t"+matriz[i][j]);
        }
        double promedio;
        promedio = suma / count;

        //System.out.println(count);
        System.out.println("el promedio es: "+promedio);


        System.out.println("--------numMayor------------");
        // array
        int[] array = new int[matriz.length];
        int numMayor;
        //rellenar array con valores de columna de la matriz
        for (int i=f; i<matriz.length; i++){
            int j = c;
            valor = Integer.parseInt(matriz[i][j]);
            array[i] = valor;
        }

        //recorrer el array
        numMayor = array[0];
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
            if (array[i]> numMayor){
                numMayor = array[i];
            }
        }
        System.out.println("Numero mayor is: "+numMayor);

        System.out.println("--------numMenor------------");
        int numMenor;
        //recorrer el array
        numMenor = array[0];
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
            if (array[i]< numMenor){
                numMenor = array[i];
            }
        }
        System.out.println("Numero menor is: "+numMenor);


        System.out.println("--------------------");
        // mostrar valores de matriz
        for (int i=f; i<matriz.length; i++){
            for (int j=c; j<matriz[i].length; j++){
                System.out.println(matriz[i][j]);
            }
        }








    }

    //--------------------------------------------------------------------------------------

    //metodos

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

    //comprueba si la nota es numérica y está entre 1 y 7
    public static String compruebaNota(String cadena, int nota) {
        while(!isNumeric(cadena)) {
            cadena=JOptionPane.showInputDialog("1.1 Ingresa nota numero entero: ");
        }
        boolean stop;
        stop = false;
        while(!stop) {
            nota=Integer.parseInt(cadena);
            if(nota > 7 || nota<1) {
                cadena= JOptionPane.showInputDialog("1.2	Ingresa la nota	: ");
                while(!isNumeric(cadena)) {
                    cadena=JOptionPane.showInputDialog("1.3 Ingresa nota numero entero: ");
                }
            }
            else{
                System.out.println("la nota es: "+nota);
                stop = true;}
        }
        nota = Integer.parseInt(cadena);
        return cadena;
    }


}
