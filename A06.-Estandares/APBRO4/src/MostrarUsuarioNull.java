import java.util.Arrays;

public class MostrarUsuarioNull {
    //-------------------------------------------------------------------------------------------
    static void mostrarUsuariosConNull(String[][] lista) {
        System.out.println("\n--------------TABLA-----------------" +
                "-------------------------------------------------" +
                "------------------------------------------------");
        Encabezado.encabezadoTabla();

        for (String[] strings : lista) {
            //ystem.out.println(" ");
            for (String string : strings) {
                System.out.print(string + " | ");
            }
            System.out.println("\n--------------------------------------" +
                    "-----------------------------------------------------");
        }

    }

    protected static void rellenaNulos(String[][] lista) {
        /***
         * rellena valores null '\0' con vacio ' '
         */
        int row = 0;
        int column = 0;

        for (String[] c: lista) {
            try {
                for (String c1 : c) {
                    if (c1 == null) {
                        lista[row][column] = " ";
                    }
                    //if (column == matriz.length) {
                    //    break;
                    //}
                    column++;
                }

            } catch (Exception e) {
                //nada
            }

            column=0;
            row++;
        }

    }
    //--------------------------------------------------------

    public static void main(String[] args) {
        mostrarUsuariosConNull(Main.lista);
        rellenaNulos(Main.lista);
        mostrarUsuariosConNull(Main.lista);
    }
}
