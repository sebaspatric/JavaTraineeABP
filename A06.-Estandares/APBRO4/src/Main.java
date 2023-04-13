import javax.swing.*;
import java.util.Arrays;

public class Main {

    /***
     *usuario se necesita saber el nombre (*), fecha de nacimiento y RUN (*).
     * Cliente: dirección (*), teléfono (*), cantidad de empleados
     * → recuerde que un usuario cliente corresponde a una empresa
     * • Profesional: años de experiencia, departamento (*)
     * • Administrativo: función (*), nombre superior
     *
     * Los campos marcados con (*) son campos obligatorios.
     * Considere que los datos de los distintos usuarios están
     * almacenados en una matriz de 100 filas y 10 columnas.
     * Cada fila corresponde a un usuario, y cada columna es
     * uno de los atributos antes mencionados, en el orden en
     * el que se mencionan antes.
     * Además, considere que cada usuario, de acuerdo con su tipo,
     * tendrá rellenados solo los campos comunes y aquellos que le
     * corresponden.
     */
    public static String[][] lista = new String[100][10];

    public static void main(String[] args) {
        System.out.println("Hello world!");
        registroUsuario(lista);
        MostrarUsuarioPrueba.mostrarUsuarios1(lista);

        //Genere las rutinas necesarias para invocar a las dos funciones
        // creadas antes, mostrando por pantalla sus valores de retorno.
        String muestra;
        muestra = mostrarUsuarios(lista);
        System.out.println(muestra);
        //MostrarUsuarioNull.rellenaNulos(lista);
        System.out.println(muestra);
        //mostrarUsuarios(lista);
        //mostrarUsuariosConNull(lista);
        String cuenta;
        cuenta = contarUsuariosPorCategoria(lista);
        System.out.println(cuenta);

        //modificar RUT
        modificarUsuario(lista);

        // verificar cambios
        String muestra2;
        muestra2 = mostrarUsuarios(lista);
        System.out.println(muestra2);

        //eliminar usuario
        eliminarUsuario(lista);

        //verificar cambios
        String muestra3;
        muestra3 = mostrarUsuarios(lista);
        System.out.println(muestra3);

        //verificar con nulos
        MostrarUsuarioNull.mostrarUsuariosConNull(Main.lista);

        //menuPrincipal(lista);

        MenuPrincipal.menuPrincipal(lista);


    }

    private static void menuPrincipal(String[][] lista) {
        /***
         * En el programa principal, debe desplegar un menú con seis opciones:
         * ▪ Registrar usuario
         * ▪ Mostrar usuarios
         * ▪ Contar usuarios por categoría
         * ▪ Modificar usuarios
         * ▪ Eliminar usuario
         * ▪ Salir.
         * • El menú anterior se debe mostrar constantemente, hasta que se seleccione la
         * opción 6. Si se ingresa un número no perteneciente al grupo anterior se debe
         * indicar con un mensaje de error, y solicitar nuevamente el número.
         * • Cada vez que se seleccione una opción correcta, se debe llamar a la función
         * correspondiente.
         */

        //----------------------------------------------------------------
        //codigo



        //---------------------------------------------------------
    }

    protected static void eliminarUsuario(String[][] lista) {
        /***
         * Cree la función “eliminarUsuario”, la cual debe recibir un RUT, y eliminar el
         * usuario desde el arreglo.
         * • Considere que, si se elimina un usuario, la fila que usa en la matriz no puede
         * quedar vacía. Esto significa que, una vez eliminado el usuario, todos los
         * registros ubicados bajo él deben ser desplazados hacia la fila anterior.
         */

        //----------------------------------------------------------------
        //codigo
        String dato;
        JOptionPane JOptionPane;
        JOptionPane = null;
        dato = javax.swing.JOptionPane.showInputDialog("Ingrese un RUT para eliminar");
        int fila = 0;
        int columna = 2;
        String valor;
        for (int i = fila; i < lista.length;i++) {
            //  if (lista)
            valor = lista[i][columna];
            if (valor.equals(dato)){
                String dato2;
                dato2 = javax.swing.JOptionPane.showInputDialog("Rut encontrado listo a eliminar");
                fila = i;
                System.out.println("fila = "+fila);
                break;
            }else {
                System.out.println("rut no encontrado");
            }

        }
        System.out.println("fila = "+fila);

        eliminarFila(fila, lista);


        //---------------------------------------------------------

    }

    private static void eliminarFila(int fila, String[][] lista) {
        // modificado de
        // https://es.stackoverflow.com/questions/215943/eliminar-una-fila-de-un-array-bidimensional-en-java
        for (int i = fila; i < lista.length; i++) {
            if (lista.length - 1 == i) {
                break;
            }
            lista[i] = lista[(i+1)];
        }
        //lista[lista.length - 1] =null;
    }

    protected static void modificarUsuario(String[][] lista) {
        /***
         * Cree la función “modificarUsuario”, la cual debe recibir un RUT de usuario.
         * Siempre que el usuario exista, debe pedir nuevamente sus datos, y actualizar
         * la posición correspondiente en el arreglo.
         */
        //----------------------------------------------------------------
        //codigo
        String dato;
        JOptionPane JOptionPane;
        JOptionPane = null;
        dato = javax.swing.JOptionPane.showInputDialog("Ingrese un RUT para modificar");
        int fila = 0;
        int columna = 2;
        String valor;
        for (int i = fila; i < lista.length;i++) {
          //  if (lista)
            valor = lista[i][columna];
            if (valor.equals(dato)){
                dato = javax.swing.JOptionPane.showInputDialog("Rut encontrado Ingrese un nuevo RUT");
                lista[i][columna] = dato;
                break;
            }else {
                System.out.println("rut no encontrado");
            }
        }
        //---------------------------------------------------------
    }

    protected static String contarUsuariosPorCategoria(String[][] lista) {
        //Main.lista = lista;
        /***
         * Cree la función “contarUsuariosPorCategoria”, la que entrega un
         * resumen indicando el tipo de usuario y la cantidad asociada a cada uno.
         * Considere que los tipos son fijos, y que solo cuentan las filas con datos
         * ingresados.
         */
        int countUsers;
        int fila;
        int columna;
        int countClientes;
        int countProfesional;
        int countAdm;
        fila = 0;
        columna = 0;
        countUsers = 0;
        countUsers = countUsuario(fila, columna, countUsers, lista);

        System.out.println("cantidad de Usuarios: "+countUsers);

        //---------------------------------------------------------------------------
        //fila = 0;
        columna = 3;
        countClientes = 0;
        countClientes = countUsuario(fila, columna, countClientes, lista);


        System.out.println("cantidad de clientes: "+countClientes);

        //---------------------------------------------------------------------------
        //fila = 0;
        columna = 6;
        countProfesional = 0;
        countProfesional = countUsuario(fila, columna,countProfesional, lista);


        System.out.println("cantidad de Profesional: "+countProfesional);

        //---------------------------------------------------------------------------
        //fila = 0;
        columna = 8;
        countAdm = 0;
        countAdm = countUsuario(fila, columna, countAdm, lista);

        System.out.println("cantidad de Adm: "+countAdm);
        String line = "---------------------------------------" + "-----------------------------------------------------";

        StringBuilder result = new StringBuilder();
        result.append("\n").append(line).append("\n");
        result.append("cantidad de Usuarios: ").append(countUsers).append("\n");
        result.append("cantidad de clientes: ").append(countClientes).append("\n");
        result.append("cantidad de Profesional: ").append(countProfesional).append("\n");
        result.append("cantidad de Adm: ").append(countAdm).append("\n");

        return result.toString();
    }
//---------------------------------------------------------------------------------------------------------------------
    private static int countUsuario(int fila, int columna, int countUsers, String[][] lista) {
        for (String[] strings : lista) {
            try {
                //trata array sea nulo
                boolean b = strings == null || Arrays.stream(strings).findAny().isEmpty();
                if (!b) { //niega nulidad
                    boolean b1 = lista[fila][columna] == null;
                    if (!b1) {
                        countUsers++;
                    }
                    fila++;

                    // System.out.println("\n---------------------------------------" +"-----------------------------------------------------");
                }
            }catch (Exception e){;
                //System.out.println("el arraylist no tiene valor");
            }
        }

        return countUsers;
    }


    //-------------------------------------------------------------------------------------------

    private static String encabezadoTabla() {
        String encabezado;
        encabezado = """
                Usuario                        | Cliente                                  | Profesional                  | Administrativo
                Nombre | fechaNacimiento | rUN | direccion | telefono | cantidadEmpleados | experienceYears | department | function| nombreSuperior
                --------------------------------------------------------------------------------------------------------------------------------------"""
        ;
        return encabezado;
    }

    //-------------------------------------------------------------------------------------------
    protected static String mostrarUsuarios(String[][] lista) {
        /**
         Cree la función “mostrarUsuarios”, que despliega el listado completo
         de usuarios registrado en la matriz. Solo debe mostrar las filas
         de la tabla que tienen datos ingresados, las filas “vacías”,
         para estos efectos, no se consideran como válidas
         */
        //titulo
        String titulo = "\n--------------TABLA2-----------------" + "-------------------------------------------------" + "-----------------------------------------------";

        //System.out.println(titulo);
        //muestra encabezado
        String encabezado = encabezadoTabla();
        //System.out.println(encabezado);
        //construyeTabla(lista);
        String tabla;
        tabla = construyeTabla(lista);

        //metodo constructor de String
        /*
        StringBuilder tabla;
        tabla = new StringBuilder("\n");

        String line = "---------------------------------------" + "-----------------------------------------------------";

        //muestra filas no nulas
        for (String[] strings : lista) {
            try {
                boolean b = strings == null || Arrays.stream(strings).findAny().isEmpty();
                if (!b) {
                    //System.out.println("el arraylist tiene valor");
                    for (String string : strings) {
                        System.out.print(string + " | ");
                        tabla.append(string).append(" | ");
                    }
                    System.out.println("\n"+line);
                    tabla.append("\n").append(line).append("\n");
                    //tabla.append(line);
                }
            }catch (Exception e){
                // el arraylist tiene valor
                //continue;
                //System.out.println("el arraylist no tiene valor");
            }

        }
        */
        String information;
        information = titulo+ "\n"+
                encabezado+ tabla
        ;

        return information;
    }
//-------------------------------------------------------------------------------------------------------------------------
    private static String construyeTabla(String[][] lista) {
        Main.lista = lista;
        //metodo constructor de String
        StringBuilder tabla;
        tabla = new StringBuilder("\n"); //empieza con salto de linea

        String line = "---------------------------------------" + "-----------------------------------------------------";
        boolean a;
        for (String[] strings : lista) {
            a = verificaVacio(strings);
            if (a) {
                for (String string : strings) {
                    //System.out.print(string + " | ");
                    tabla.append(string).append(" | ");
                }
                tabla.append("\n").append(line).append("\n");

            }
        }

        //muestra filas no nulas
        //return String.valueOf(tabla);
        return tabla.toString();
    }
    //-------------------------------------------------------------------------------------------
    //verifica vacios
    private static boolean verificaVacio(String[] strings) {
        boolean result = false;
        try {
            boolean b = strings == null || Arrays.stream(strings).findAny().isEmpty();
            if (!b) { //tiene algo
                result = true;
            }
        }catch (Exception e){
            //nada
        }
        return result;
    }
    //-------------------------------------------------------------------------------------------
    static void registroUsuario(String[][] lista) {
        /***
         * Registro de usuarios
         * • Lo primero que se solicita, es crear una función que permita
         * registrar el usuario. No es necesario que retorne nada. No es
         * obligatorio que la función pida los datos a registrar, lo puede
         * hacer dentro de la función misma si lo desea.
         * • Invoque desde el código principal del algoritmo a la función,
         * solicitando crear al menos un usuario de cada tipo.
         *
         */

        //Usuario
        String nombre;
        String fechaNacimiento;
        String rUN;
        //Cliente
        String direccion;
        String telefono;
        String cantidadEmpleados;
        //Profesional
        String experienceYears;
        String department;
        //Administrativo
        String function;
        String nombreSuperior;
        int fila;
        int columna;

        //dato = JOptionPane.showInputDialog("Ingrese Usuario");

        //-------------------------------------------------
        //Usuario1
        nombre = "andres";
        fechaNacimiento = "10/02/2000";
        rUN = String.valueOf(182060602);
        String[] Usuario1 = {nombre, fechaNacimiento, rUN};

        //Cliente
        direccion = "los castaños";
        telefono = String.valueOf(95565654);
        cantidadEmpleados = String.valueOf(25);
        String[] Cliente = {direccion, telefono, cantidadEmpleados};

        //-------------------------------------------------
        //Usuario2
        nombre = "carlos";
        fechaNacimiento = "12/01/2001";
        rUN = String.valueOf(162062602);
        String[] Usuario2 = {nombre, fechaNacimiento, rUN};

        //Profesional
        experienceYears = String.valueOf(16);
        department = "Contabilidad";
        String[] Profesional = {experienceYears,department};

        //-------------------------------------------------
        //Usuario3
        nombre = "gustavo";
        fechaNacimiento = "11/02/2020";
        rUN = String.valueOf(170062602);
        String[] Usuario3 = {nombre, fechaNacimiento, rUN};

        //Administrativo
        function = "Jefe";
        nombreSuperior = "Cristian";
        String[] Administrator = {function, nombreSuperior};
        //-------------------------------------------------

        // rellena matriz Usuario1
        fila = 0;
        columna = 0;
        rellenaMatrizUsuario(fila, columna, Usuario1);

        /*
        for (String s : Usuario1) {
            lista[fila][columna] = s;
            columna++;
        }
        * */

        // rellena matriz Cliente

        columna = 3;
        rellenaMatrizUsuario(fila, columna, Cliente);
        /*
        for (String s : Cliente) {
            lista[fila][columna] = s;
            columna++;
        }
        */

        //-------------------------------------------------
        // rellena matriz Usuario2

        fila = 1;
        columna = 0;
        rellenaMatrizUsuario(fila,columna,Usuario2);
        /*
        for (String s : Usuario2) {
            lista[fila][columna] = s;
            columna++;
        }
        */

        // rellena matriz Profesional
        columna = 6;
        rellenaMatrizUsuario(fila,columna,Profesional);
        /*
        for (String s : Profesional) {
            lista[fila][columna] = s;
            columna++;
        }
        */

        //-------------------------------------------------
        // rellena matriz Usuario3
        fila = 2;
        columna = 0;
        rellenaMatrizUsuario(fila,columna,Usuario3);
        /*
        for (String s : Usuario3) {
            lista[fila][columna] = s;
            columna++;
        }
        */

        // rellena matriz Administrativo
        columna = 8;
        rellenaMatrizUsuario(fila,columna,Administrator);
        /*
        for (String s : Administrator) {
            lista[fila][columna] = s;
            columna++;
        }
        */
        //-------------------------------------------------
    }

    private static void rellenaMatrizUsuario(int fila, int columna, String[] usuario) {
        for (String s : usuario) {
            lista[fila][columna] = s;
            columna++;
        }
    }

//-------------------------------------------------------------------------------------------
}