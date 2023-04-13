package CLASES;

public class Lanzamientos {
    public static void lanzamiento() {
        int row = 0;
        int conteo = 0;
        for (char[] chars : Tablero.matriz) {
            int j = 0;
            for (char ignored : chars) {
                Tablero.lanzarHuevo();
                conteo++;
                System.out.println("lanzamiento: "+conteo);
                System.out.println("coordenada por lanzamiento: "+row+", "+j);
                j++;

            }
            row++;
        }
    }
}
