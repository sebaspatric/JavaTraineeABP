package CLASES;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* //clase que representa el terreno en el que se
// ubica cada carro y en el cual se sitúan
//proyectiles.
* */

public class Tablero1 {
    //atributos

    //lista de instancias de la clase Carro
    //la primera lista no tendrá más de 18 elementos,
    //private int []arrayUno = new int[18];

    int size = 18;


    //crear una lista de tamaño fijo https://www.techiedelight.com/es/create-fixed-size-list-java/
    private List<Integer> listCarro = new ArrayList<>(Arrays.asList(new Integer[size]));

    //lista de instancias de la clase Huevo
    //no hay límite de instancias a crear
    private List<Huevo> listHuevo =new ArrayList<Huevo>();

    //constructor
    public Tablero1() {
    }

    public Tablero1(int size, List<Integer> listCarro, List<Huevo> listHuevo) {
        this.size = size;
        this.listCarro = listCarro;
        this.listHuevo = listHuevo;
    }

    //METODOS

    public static char[][] matriz = new char[15][15];

    public static void crearCarro() {
         /*
        Crear Carro: crea una subclase de la clase Carro
        y la asigna a la lista respectiva.
        Recuerde que las coordenadas del carro se calculan
        de forma aleatoria, y no se puede traslapar
        un carro con otro.
        *
        * */

        //14 espacios ... lugar de 0 a 13 computacional
        int row, column;
        row = numAleatorio(0, 13);
        column = numAleatorio(0, 13);

        char[] kromi = {'K','K','K'}; // de ben ser 3 kromis
        char[] caguano = {'C','C'};  // de ben ser 5 Caguanos
        char[] trupalla = {'T'}; // de ben ser 10 Trupallas



        System.out.println("\n------------------");
        System.out.println("aleatorios  "+row+" "+column);


        int cantKromis = 0;
        int kromEsperada = 3;
        while (cantKromis<kromEsperada) {
            if (validaColumna(row, column, kromi)) {
                System.out.println(row + " " + column+" vacia");
                rellenaColumna(row, column, kromi);
                cantKromis++;
            } else {
                System.out.println("fila: "+row + " column: " + column+" no puede empezar");
                row = numAleatorio(0, 13);
                column = numAleatorio(0, 13);
            }
        }

        row = numAleatorio(0, 13);
        column = numAleatorio(0, 13);

        int cantCaguanos = 0;
        int caguanosEsperada = 5;
        while (cantCaguanos<caguanosEsperada) {
            if (validaFila(row, column, caguano)) {
                System.out.println(row + " " + column+" vacia");
                rellenaFila(row, column, caguano);
                cantCaguanos++;
            } else {
                System.out.println("fila: "+row + " column: " + column+" no puede empezar");
                row = numAleatorio(0, 13);
                column = numAleatorio(0, 13);
            }
        }

        row = numAleatorio(0, 13);
        column = numAleatorio(0, 13);


        int cantTrupalla = 0;
        int trupallaEsperada = 10;
        while (cantTrupalla<trupallaEsperada) {
            if (validaColumna(row, column, trupalla)) {
                System.out.println(row + " " + column+" vacia");
                rellenaColumna(row, column, trupalla);
                cantTrupalla++;
            } else {
                System.out.println("fila: "+row + " column: " + column+" no puede empezar");
                row = numAleatorio(0, 13);
                column = numAleatorio(0, 13);
            }
        }



        rellenaNulos();

        mostrarMatriz();





    }

    private static void rellenaNulos() {
        int row = 0;
        int column = 0;
        for (char[] c: matriz) {
            for (char c1 : c) {
                if (c1 == '\0') {
                    matriz[row][column] = ' ';
                }
                //if (column == matriz.length) {
                //    break;
                //}
                column++;
            }
            column=0;
            row++;
        }

    }
    //-------------------------------------------------------------------------------------------
    //verifica vacios

    //-------------------------------------------------------------------------------------------

    private static boolean validaColumna(int row, int column, char[] kromi) {
        boolean b1;
        b1 = false;
        try {
            for (char c : kromi) {
                char c1 = matriz[row][column];
                b1= c1 =='\0';
                if (!b1) {
                    System.out.println("fila: "+row + ", column: " + column+" esta ocupado con: "+c1);
                    System.out.println(c1);
                    break;
                }
                System.out.println("fila: "+row + ", column: " + column);
                System.out.println(c1);
                row++;
            }

        } catch (Exception e) {
            System.out.println("Extention exception");
            b1 = false;
        }

        System.out.println(b1);
        return b1;
    }
    private static boolean validaFila(int row, int column, char[] caguanos) {
        boolean b1;
        b1 = false;
        try {
            for (char c : caguanos) {
                char c1 = matriz[row][column];
                b1= c1 =='\0';
                if (!b1) {
                    System.out.println("fila: "+row + ", column: " + column+" esta ocupado con: "+c1);
                    System.out.println(c1);
                    break;
                }
                System.out.println("fila: "+row + ", column: " + column);
                System.out.println(c1);
                column++;
            }

        } catch (Exception e) {
            System.out.println("Extention exception");
            b1 = false;
        }

        System.out.println(b1);
        return b1;
    }
    //-------------------------------------------------------------------------------------------

    private static void rellenaColumna(int row, int col, char[] usuario) {
        for (char c : usuario) {
            matriz[row][col] = c;
            row++;
        }
    }
    private static void rellenaFila(int row, int col, char[] usuario) {
        for (char c : usuario) {
            matriz[row][col] = c;
            col++;
        }
    }
    protected static int numAleatorio(int N, int M) {
        int valorEntero;  // Valor entre M y N, ambos incluidos.
        valorEntero = (int) (Math.floor(Math.random()*(M-N+1)+N));
        return valorEntero;
    }

    public static void lanzarHuevo() {
        /*
        *
        Lanzar Huevo: crea una instancia de la clase
        * “Huevo”, solicita la coordenada de
        * lanzamiento, asigna el puntaje al movimiento
        * y la almacena en el listado correspondiente.
        * */


    }

    public static void mostrarMatriz() {
        /***
         * Mostrar Matriz: este método debe mostrar en forma
         *     de matriz cada uno de los carros existentes y los
         *     lanzamientos que se han registrado hasta el momento.
         *     * Recuerde que donde hubo un lanzamiento debe haber
         *     * una letra “H”, independiente de si acierta a un
         *     * carro o no. Una vez que realiza la acción, debe
         *     * calcular el puntaje obtenido hasta el momento.
         *     *
         */
        StringBuilder tabla;
        tabla = new StringBuilder("\n");
        String line = "-----------------------------------------------------------";
        tabla.append("\n").append(line).append("\n");
        for (char[] c : matriz) {
            for (char c1 : c) {
                System.out.print(c1);
                tabla.append(c1).append(" | ");
            }
            System.out.println("");
            tabla.append("\n").append(line).append("\n");
        }
        System.out.println(tabla.toString());

    }

    public static void calcularPuntaje() {
        /***
         *    /*
         *     *
         *     Calcular puntaje: suma los puntajes asignados a cada
         *     * lanzamiento y los entrega como resultado.
         *     * Este método debe ser visible solo dentro de la
         *     * clase, y es utilizado en los métodos de la misma
         *     * clase. Clase “Huevo”: clase que define cada lanzamiento
         *     * realizado dentro del tablero.
         *     *
         */
    }

    //getter and setter

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Integer> getListCarro() {
        return listCarro;
    }

    public void setListCarro(List<Integer> listCarro) {
        this.listCarro = listCarro;
    }

    public List<Huevo> getListHuevo() {
        return listHuevo;
    }

    public void setListHuevo(List<Huevo> listHuevo) {
        this.listHuevo = listHuevo;
    }


    //toString


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tablero{");
        sb.append("size=").append(size);
        sb.append(", list1=").append(listCarro);
        sb.append(", lista=").append(listHuevo);
        sb.append('}');
        return sb.toString();
    }
}
