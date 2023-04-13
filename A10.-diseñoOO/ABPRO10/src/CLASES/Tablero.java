package CLASES;

import java.util.ArrayList;
import java.util.List;

/*
* //clase que representa el terreno en el que se
// ubica cada carro y en el cual se sitúan
//proyectiles.
* */

public class Tablero {
    //atributos

    //lista de instancias de la clase Carro
    //la primera lista no tendrá más de 18 elementos,
    //private int []arrayUno = new int[18];

    static int size = 18;


    //crear una lista de tamaño fijo https://www.techiedelight.com/es/create-fixed-size-list-java/
    private static List<Carro> listCarro = new ArrayList<Carro>(size);

    //lista de instancias de la clase Huevo
    //no hay límite de instancias a crear
    private static List<Huevo> listHuevo =new ArrayList<Huevo>();

    //constructor
    public Tablero() {
    }

    public Tablero(int size, List<Carro> listCarro, List<Huevo> listHuevo) {
        Tablero.size = size;
        Tablero.listCarro = listCarro;
        this.listHuevo = listHuevo;
    }

    //METODOS

    public static char[][] matriz = new char[15][15];
    public static int[][] listCoordK = new int[3][2];
    public static int[][] listCoordC = new int[5][2];
    public static int[][] listCoordT = new int[10][2];


    public void addDocumento(Carro d) {
        listCarro.add(d);
    }

    //crear carro-------------------------------------------------------------
    public static void crearCarro() {
         /*
        Crear Carro: crea una subclase de la clase Carro
        y la asigna a la lista respectiva.
        Recuerde que las coordenadas del carro se calculan
        de forma aleatoria, y no se puede traslapar
        un carro con otro.
        *
        * */
        Kromi k1, k2, k3;
        k1= new Kromi(2,"1955", "fach", null, null,3, "china", "toyota");
        k2 = new Kromi();
        k3 = new Kromi();
        listCarro.add(k1);
        listCarro.add(k2);
        listCarro.add(k3);

        Caguano c1, c2, c3, c4, c5;
        c1 = new Caguano();
        c2 = new Caguano();
        c3 = new Caguano();
        c4 = new Caguano();
        c5 = new Caguano();

        listCarro.add(c1);
        listCarro.add(c2);
        listCarro.add(c3);
        listCarro.add(c4);
        listCarro.add(c5);

        Trupalla t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
        t1 = new Trupalla();
        t2 = new Trupalla();
        t3 = new Trupalla();
        t4 = new Trupalla();
        t5 = new Trupalla();
        t6 = new Trupalla();
        t7 = new Trupalla();
        t8 = new Trupalla();
        t9 = new Trupalla();
        t10 = new Trupalla();
        listCarro.add(t1);
        listCarro.add(t2);
        listCarro.add(t3);
        listCarro.add(t4);
        listCarro.add(t5);
        listCarro.add(t6);
        listCarro.add(t7);
        listCarro.add(t8);
        listCarro.add(t9);
        listCarro.add(t10);


        //k = new Kromi();

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
        colocaCarros(cantKromis, kromEsperada, row, column, kromi);


        row = numAleatorio(0, 13);
        column = numAleatorio(0, 13);
        int cantCaguanos = 0;
        int caguanosEsperada = 5;
        colocaCarros(cantCaguanos, caguanosEsperada, row, column, caguano);


        row = numAleatorio(0, 13);
        column = numAleatorio(0, 13);


        int cantTrupalla = 0;
        int trupallaEsperada = 10;

        colocaCarros(cantTrupalla, trupallaEsperada, row, column, trupalla);

        rellenaNulos();



        mostrarCoord(listCoordK);
        mostrarCoord(listCoordC);
        mostrarCoord(listCoordT);

        setCoordenadas();
        System.out.println(k1);
        System.out.println(k2);
        mostrarMatriz();



    }

    //-------------------------------------------------------------------------------------------

    protected static int numAleatorio(int N, int M) {
        /**
         * retorna un numero aleatorio entre N y M
         */
        int valorEntero;  // Valor entre M y N, ambos incluidos.
        valorEntero = (int) (Math.floor(Math.random()*(M-N+1)+N));
        return valorEntero;
    }
    //-------------------------------------------------------------------------------------------

    //coloca carro en matriz-----------------------------------------------------------------------
    private static void colocaCarros(int cant, int cantEsperada, int row, int column, char[] carro) {
        /***
         * rellena matriz de ubicacion de carros hasta completar la cantidad esperada
         * de acuerdo a las coordenadas obtenidas y al carro indicado
         * si hay espacio, rellena la matriz y agrega coordenadas a la lista
         * si no, se obtiene una nueva columna y fila,
         * y las prueba hasta completar la cantidad
         */
        while (cant<cantEsperada) {
            if (validaEspacio(row, column, carro)) {
                System.out.println(row + " " + column+" vacia");
                rellenaMatriz(row, column, carro);
                agregaCoorList(row, column, carro, cant);
                //listaCoord(row, column);
                cant++;
                //String nombre = String.valueOf(carro[0]+cant);

                //listaCoord(row, column);
            } else {
                System.out.println("fila: "+row + " column: " + column+" no puede empezar");
                row = numAleatorio(0, 13);
                column = numAleatorio(0, 13);
            }
        }


    }
//--------------------------------------------------------------------------------------------

    //-------------------------------------------------------------------------------------------

    private static boolean validaEspacio(int row, int col, char[] kromi) {
        /***
         * //verifica vacios
         * recorre columna o fila según la lista de char ingresada y verifica si '\0'
         * mientras hay char en el array
         * si la condicion char vacio es falsa se termina ciclo break y se retorna falso
         * si la condicion vacia es verdadera se continua el ciclo y retorno true
         * si hay error de extencion de la matriz, se atrapa el error y retorna falso
         */
        boolean b1;
        b1 = false;
        try {
            for (char c : kromi) {
                char c1 = matriz[row][col];
                b1= c1 =='\0';
                if (!b1) {
                    System.out.println("fila: "+row + ", column: " + col+" esta ocupado con: "+c1);
                    System.out.println(c1);
                    break;
                }
                System.out.println("fila: "+row + ", column: " + col);
                System.out.println(c1);
                boolean b2 = c == 'K';
                if (b2) {
                    row++; //aumenta filas... recorre columna
                } else {
                    col++; //acumenta columna... recorre filas
                }
            }

        } catch (Exception e) {
            System.out.println("Extention exception");
            b1 = false;
        }

        System.out.println(b1);
        return b1;
    }
    //-------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------
    private static void rellenaMatriz(int row, int col, char[] usuario) {
        /***
         * mientras haya char en array indicado
         * el valor de la matriz en las coordenadas indicadas será el char
         */
        for (char c : usuario) {
            matriz[row][col] = c;
            boolean b = c == 'K';
            if (b) {
                row++; //aumenta filas... recorre columna
            } else {
                col++; //acumenta columna... recorre filas
            }
        }
    }
    //-------------------------------------------------------------------------------------
    private static void agregaCoorList(int row, int column, char[] carro, int cant) {
        /***
         * agrega valores a matriz de coordenadas según el array de char ingresado
         */
        //int cont = 0;
        if (carro[0] == 'K') {
            System.out.println("KK");
            String nombre = "k"+cant;
            System.out.println(nombre);
            listaCoordK(row, column, cant);

            //k.setColumna(column);
            //k.setFila(row);

        } else if (carro[0] == 'C') {
            System.out.println("CC");
            String nombre = "c"+cant;
            System.out.println(nombre);
            listaCoordC(row, column, cant);
        } else {
            System.out.println("TT");
            String nombre = "t"+cant;
            System.out.println(nombre);
            listaCoordT(row, column, cant);
        }
    }
    //----------------------------------------------------------------------------------
    //agrega coordenadas a matrices en fila correspondiente-----------------------------
    private static void listaCoordK(int row, int column, int cant) {
        listCoordK[cant][0] = row;
        listCoordK[cant][1] = column;
    }
    private static void listaCoordC(int row, int column, int cant) {
        listCoordC[cant][0] = row;
        listCoordC[cant][1] = column;
    }
    private static void listaCoordT(int row, int column, int cant) {
        listCoordT[cant][0] = row;
        listCoordT[cant][1] = column;
    }

    //----------------------------------------------------------------------------------
    private static void setCoordenadas() {
        /***
         * seteo posicion de los objetos de lista según las listas de coordenadas
         */
        int l = listCoordK.length;
        int l2 = l+listCoordC.length;
        int l3 = l2+ listCoordT.length;
        for (int i = 0; i < listCarro.size(); i++) {
                int row = 0;
                int col = 0;
                int j;
                Carro d = listCarro.get(i);

                if (i < l) {
                    row = listCoordK[i][0];
                    col = listCoordK[i][1];
                    d.setFila(row);
                    d.setColumna(col);
                } else if (i < l2) {
                    j = i-l;
                    row = listCoordC[j][0];
                    col = listCoordC[j][1];
                    d.setFila(row);
                    d.setColumna(col);
                } else {
                    j = i-l2;
                    row = listCoordT[j][0];
                    col = listCoordT[j][1];
                    d.setFila(row);
                    d.setColumna(col);
                }

            //acceder a array subyaacente
                System.out.println("Valor en la posicion " + i + " de la lista: " + listCarro.get(i));
            }

    }

    //------------------------------------------------------------------------------------------
    private static void rellenaNulos() {
        /***
         * rellena valores null '\0' con vacio ' '
         */
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
    //------------------------------------------------------------------------------------------
    public static void mostrarCoord(int[][] listaCoord) {
        /***
         * Mostrar Matriz de coordenadas: muestra la matriz de coordenadas
         * según la matriz indicada
         */
        StringBuilder tabla;
        tabla = new StringBuilder("\n");
        String line = "-------";
        tabla.append("\n").append(line).append("\n");
        for (int[] c : listaCoord) {
            for (int c1 : c) {
                System.out.print(c1);
                tabla.append(c1).append(" | ");
            }
            System.out.println("");
            tabla.append("\n").append(line).append("\n");
        }
        System.out.println(tabla.toString());

    }
        //----------------------------------------------------------------------------------------
    public static void lanzarHuevo() {
        /*
        *
        Lanzar Huevo: crea una instancia de la clase
        * “Huevo”, solicita la coordenada de
        * lanzamiento, asigna el puntaje al movimiento
        * y la almacena en el listado correspondiente.
        * */
        // coodenadas
        int row, column;
        int puntaje = 0;
        row = numAleatorio(0, 13);
        column = numAleatorio(0, 13);

        //asigna el puntaje al movimiento
        char c = ' ';
        char a, b, d, f = ' ';
        c = matriz[row][column]; //letra del tiro en tablero
        switch (c) {
            case 'K' -> {
                System.out.println("caso 1---------------------------------------");
                matriz[row][column] = 'H'; //cambia por H
                c = 'H';
                puntaje = 3;
                // trata verificar si columna tiene más H
                try {
                    a = matriz[row-2][column];
                    b = matriz[row-1][column];
                    if (a == c && b == c) {
                        puntaje += 10;
                    }
                } catch (Exception e) {
                    //nada
                }
                try {
                    b = matriz[row-1][column];
                    d = matriz[row+1][column];
                    if (d == c && b == c) {
                        puntaje += 10;
                    }
                } catch (Exception e) {
                    //nada
                }
                try {
                    d = matriz[row+1][column];
                    f = matriz[row+2][column];
                    if (d == c && f == c) {
                        puntaje += 10;
                    }
                } catch (Exception e) {
                    //nada
                }
            }
            case 'C' -> {
                System.out.println("caso 2-----------------------------------------");
                puntaje = 2;
                matriz[row][column] = 'H'; //cambia por H
                c = 'H';
                // trata verificar si columna tiene más H
                try {
                    b = matriz[row][column-1];
                    if (b == c) {
                        puntaje += 7;
                    }
                } catch (Exception e) {
                    //nada
                }
                try {
                    d = matriz[row][column+1];
                    if (d == c) {
                        puntaje += 7;
                    }
                } catch (Exception e) {
                    //nada
                }
            }
            case 'T' -> {
                System.out.println("caso 3--------------------------------------");
                matriz[row][column] = 'H'; //cambia por H
                puntaje = 1;
            }
            case 'H' -> {
                System.out.println("caso 4");
                System.out.println("celda ya ha sido atacada");
            }
            default -> System.out.println("caso default");

        }
        System.out.println("coordenadas: "+row+", "+column+", puntaje: "+puntaje);

        //instancia huevo
        Huevo v;
        v = new Huevo(row, column, puntaje);
        listHuevo.add(v);

        //Tablero nt = new Tablero();
        //nt.addHuevo(v);
    }
    //----------------------------------------------------------------------------------------
    public void addHuevo(Huevo h) {
        listHuevo.add(h);
    }
    //-------------------------------------------------------------------------
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


    //----------------------------------------------------------------------------------------


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
        int i;
        int suma = 0;
        for (i = 0; i < listHuevo.size(); i++) {
            int row = 0;
            int col = 0;
            int j;
            Huevo h = listHuevo.get(i);
            //h.getColumnaH();
            int punto = h.getPuntajeObtenido();
            suma += punto;
            //acceder a array subyaacente
            System.out.println("Valor en la posicion " + i + " de la lista: " + listHuevo.get(i));
            System.out.println("la suma es: "+suma);
        }
        double promed = (double) suma / i;
        System.out.println("suma: "+suma+", lanzamientos: "+i+", prom: "+promed);
    }

    //----------------------------------------------------------------------------------------

    //getter and setter

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        Tablero.size = size;
    }

    public List<Carro> getListCarro() {
        return listCarro;
    }

    public void setListCarro(List<Carro> listCarro) {
        Tablero.listCarro = listCarro;
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
