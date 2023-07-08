package Models;

import java.util.Scanner;

public class Principal {
    private Contenedor contenedor;

    public Principal() {
        contenedor = new Contenedor();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenuPrincipal();
            opcion = leerOpcion(scanner);

            switch (opcion) {
                case 1:
                    almacenarCliente(scanner);
                    break;
                case 2:
                    almacenarProfesional(scanner);
                    break;
                case 3:
                    almacenarAdministrativo(scanner);
                    break;
                case 4:
                    almacenarCapacitacion(scanner);
                    break;
                case 5:
                    eliminarUsuario(scanner);
                    break;
                case 6:
                    listarUsuarios();
                    break;
                case 7:
                    listarUsuariosPorTipo(scanner);
                    break;
                case 8:
                    listarCapacitaciones();
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción incorrecta. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 9);

        scanner.close();
    }

    private void mostrarMenuPrincipal() {
        System.out.println("---- Menú Principal ----");
        System.out.println("1. Almacenar Cliente");
        System.out.println("2. Almacenar Profesional");
        System.out.println("3. Almacenar Administrativo");
        System.out.println("4. Almacenar Capacitación");
        System.out.println("5. Eliminar Usuario");
        System.out.println("6. Listar Usuarios");
        System.out.println("7. Listar Usuarios por Tipo");
        System.out.println("8. Listar Capacitaciones");
        System.out.println("9. Salir del Programa");
        System.out.print("Ingrese la opción deseada: ");
    }

    private int leerOpcion(Scanner scanner) {
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el salto de línea

        return opcion;
    }

    private void almacenarCliente(Scanner scanner) {
        // Lógica para almacenar un cliente en el contenedor
        // Puedes solicitar los datos necesarios al usuario y utilizar los métodos del contenedor para agregar el cliente

        System.out.println("Almacenando un nuevo cliente...");
    }

    private void almacenarProfesional(Scanner scanner) {
        // Lógica para almacenar un profesional en el contenedor
        // Puedes solicitar los datos necesarios al usuario y utilizar los métodos del contenedor para agregar el profesional
        System.out.println("Almacenando un nuevo profesional...");
    }

    private void almacenarAdministrativo(Scanner scanner) {
        // Lógica para almacenar un administrativo en el contenedor
        // Puedes solicitar los datos necesarios al usuario y utilizar los métodos del contenedor para agregar el administrativo
        System.out.println("Almacenando un nuevo administrativo...");
    }

    private void almacenarCapacitacion(Scanner scanner) {
        // Lógica para almacenar una capacitación en el contenedor
        // Puedes solicitar los datos necesarios al usuario y utilizar los métodos del contenedor para agregar la capacitación
        System.out.println("Almacenando una nueva capacitación...");
    }

    private void eliminarUsuario(Scanner scanner) {
        // Lógica para eliminar un usuario del contenedor
        // Puedes solicitar el RUN del usuario al usuario y utilizar los métodos del contenedor para eliminarlo
        System.out.println("Eliminando un usuario...");
    }

    private void listarUsuarios() {
        // Lógica para listar todos los usuarios del contenedor
        // Utiliza los métodos del contenedor para obtener la lista de usuarios y mostrar sus datos
        System.out.println("Listando usuarios...");
    }

    private void listarUsuariosPorTipo(Scanner scanner) {
        // Lógica para listar los usuarios por tipo (cliente, profesional o administrativo)
        // Puedes solicitar al usuario el tipo de usuario y utilizar los métodos del contenedor para filtrar y mostrar los usuarios correspondientes
        System.out.println("Listando usuarios por tipo...");
    }

    private void listarCapacitaciones() {
        // Lógica para listar todas las capacitaciones del contenedor
        // Utiliza los métodos del contenedor para obtener la lista de capacitaciones y mostrar sus datos junto con los datos de los clientes asociados
        System.out.println("Listando capacitaciones...");
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
}
