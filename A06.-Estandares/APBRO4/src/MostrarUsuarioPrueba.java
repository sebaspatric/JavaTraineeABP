import java.util.Arrays;

public class MostrarUsuarioPrueba {
    //-------------------------------------------------------------------------------------------
    static void mostrarUsuarios1(String[][] lista) {
        /***
         * Cree la función “mostrarUsuarios”,
         * que despliega el listado completo de usuarios registrado en la matriz.
         * Solo debe mostrar las filas de la tabla que tienen datos ingresados,
         * las filas “vacías”, para estos efectos, no se consideran como válidas
         */

        System.out.println("\n--------------TABLA1-----------------" +
                "-------------------------------------------------" +

                "-----------------------------------------------");
        Encabezado.encabezadoTabla();
        for (String[] strings : lista)
            try {
                boolean b = strings == null || Arrays.stream(strings).findAny().isEmpty();
                if (!b) {
                    System.out.println("el arraylist tiene valor");
                }
            }catch (Exception e){
                // el arraylist tiene valor
                //continue;
                //System.out.println("el arraylist no tiene valor");
            }
    }
}
