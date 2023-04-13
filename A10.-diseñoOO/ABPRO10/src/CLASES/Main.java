package CLASES;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Para efectos de simulación, el lugar de acción se simulará como una
        // matriz compuesta de caracteres con 15 filas y 15 columnas, en los
        // que se dispondrán de forma aleatoria:

        //char[][] matriz = new char[15][15];

        //3 Kromis, donde cada una utiliza tres celdas de la matriz
        // y se ubican siempre de forma vertical. Cada celda ocupada
        // por un vehículo de este tipo se define con una letra “K”.,

        Carro ca = new Carro();
        System.out.println(ca);

        Kromi k = new Kromi();
        System.out.println(k);

        Caguano c = new Caguano();
        System.out.println(c);


        Tablero t = new Tablero();
        System.out.println(t);

        Trupalla tru = new Trupalla(2, "2001","dsad", 2, 3, 3, 5, "asd"  );
        System.out.println(tru);

        //Tablero.crearCarro();


        //-------------------calcula valor entero
        int M, N;
        N= 8;
        M= 0;
        int valorEntero = (int) (Math.floor(Math.random()*(N-M+1)+M));  // Valor entre M y N, ambos incluidos.

        for (int i=0; i<N; i++) {
            valorEntero = Tablero.numAleatorio(8,0); //(int) (Math.floor(Math.random()*(N-M+1)+M));
            //valorEntero = (int) (Math.floor(Math.random()*(N-M+1)+M));
            System.out.println("numero: "+valorEntero);
        }

        //------------------------------------------

        Tablero.crearCarro();
        //Tablero.lanzarHuevo();

       //Tablero nt = new Tablero();
       //Huevo v = new Huevo(1,3,6);
       //nt.addHuevo(v);

        Lanzamientos.lanzamiento();

        /*
        *
        * */
        Tablero.mostrarMatriz();
        Tablero.calcularPuntaje();

        //Tablero.mostrarMatriz();



        //Tablero.mostrarCoord(listCoorK);








    }
}